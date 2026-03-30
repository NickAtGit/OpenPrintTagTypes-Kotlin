#!/usr/bin/env python3
"""Generate Kotlin type definitions from OpenPrintTag spec YAML files.

Usage:
    cd spec && git pull origin main && cd ..
    python3 scripts/generate_types.py
"""

import argparse
import os
import sys
import yaml

SCRIPT_DIR = os.path.dirname(os.path.abspath(__file__))
ROOT_DIR = os.path.dirname(SCRIPT_DIR)
SPEC_DIR = os.path.join(ROOT_DIR, "spec", "data")
OUT_DIR = os.path.join(ROOT_DIR, "openprinttagtypes", "src", "main", "kotlin", "cool", "nfc", "openprinttag", "types")

HEADER = "// Auto-generated from OpenPrintTag spec — do not edit manually\n// Regenerate: python3 scripts/generate_types.py\n\npackage cool.nfc.openprinttag.types\n"
SCREAMING = str.maketrans("", "")


def load_yaml(name):
    with open(os.path.join(SPEC_DIR, name), encoding="utf-8") as f:
        return yaml.safe_load(f)


def to_screaming(snake):
    return snake.upper()


def to_camel(snake, upper_first=True):
    parts = snake.split("_")
    if upper_first:
        return "".join(p.capitalize() for p in parts)
    return parts[0] + "".join(p.capitalize() for p in parts[1:])


def generate_field_key_enum(name, yaml_file, kotlin_name):
    fields = load_yaml(yaml_file)
    lines = [HEADER, f"/** Field keys for the {name} section of OpenPrintTag CBOR data */"]
    lines.append(f"enum class {kotlin_name}(")
    lines.append("    val rawValue: Long,")
    lines.append("    val fieldName: String,")
    lines.append("    val isRequired: Boolean = false,")
    lines.append("    val isRecommended: Boolean = false,")
    lines.append("    val isDeprecated: Boolean = false")
    lines.append(") {")

    entries = []
    for f in fields:
        key = f["key"]
        fname = f.get("name") or f"deprecated_{key}"
        deprecated = f.get("deprecated", False)
        required = f.get("required")
        is_required = "true" if required == True or required == "required" else "false"
        is_recommended = "true" if required == "recommended" else "false"
        is_deprecated = "true" if deprecated else "false"
        screaming = to_screaming(fname)

        prefix = '    @Deprecated("Removed from spec")\n' if deprecated else ""
        entry = f'{prefix}    {screaming}({key}, "{fname}", isRequired = {is_required}, isRecommended = {is_recommended}, isDeprecated = {is_deprecated})'
        entries.append(entry)

    lines.append(",\n".join(entries) + ";")

    # companion object
    lines.append("")
    lines.append("    companion object {")
    lines.append(f"        fun fromValue(value: Long): {kotlin_name}? = entries.find {{ it.rawValue == value }}")
    lines.append("    }")

    lines.append("}")
    return "\n".join(lines) + "\n"


def generate_material_class():
    items = load_yaml("material_class_enum.yaml")
    lines = [HEADER, "/** Material class (FFF or SLA) */"]
    lines.append("enum class MaterialClass(val value: Int) {")
    entries = []
    for item in items:
        entries.append(f"    {item['name'].upper()}({item['key']})")
    lines.append(",\n".join(entries) + ";")

    lines.append("")
    lines.append("    companion object {")
    lines.append("        fun fromValue(value: Int): MaterialClass? = entries.find { it.value == value }")
    lines.append("    }")
    lines.append("}")
    return "\n".join(lines) + "\n"


def generate_material_type():
    items = load_yaml("material_type_enum.yaml")
    lines = [HEADER, "/** Material type classifications */"]
    lines.append("enum class MaterialType(")
    lines.append("    val value: Int,")
    lines.append("    val abbreviation: String,")
    lines.append("    val fullName: String,")
    lines.append("    val materialClass: MaterialClass")
    lines.append(") {")

    entries = []
    for item in items:
        abbr = item["abbreviation"]
        screaming = abbr.upper().replace("-", "_").replace("+", "_PLUS").replace(" ", "_")
        name = item.get("name", abbr).replace('"', '\\"')
        cat = item.get("category", "fff")
        mc = "MaterialClass.SLA" if cat == "sla" else "MaterialClass.FFF"
        entries.append(f'    {screaming}({item["key"]}, "{abbr}", "{name}", {mc})')
    lines.append(",\n".join(entries) + ";")

    lines.append("")
    lines.append("    companion object {")
    lines.append("        fun fromValue(value: Int): MaterialType? = entries.find { it.value == value }")
    lines.append("    }")
    lines.append("}")
    return "\n".join(lines) + "\n"


def generate_tag_category():
    categories = load_yaml("tag_categories_enum.yaml")
    lines = [HEADER, "/** Categories for material property tags */"]
    lines.append("enum class TagCategory(")
    lines.append("    val displayName: String,")
    lines.append("    val emoji: String")
    lines.append(") {")

    entries = []
    for cat in categories:
        screaming = cat["name"].upper()
        entries.append(f'    {screaming}("{cat["display_name"]}", "{cat["emoji"]}")')
    lines.append(",\n".join(entries) + ";")

    lines.append("")
    lines.append("    companion object {")
    lines.append('        fun fromName(name: String): TagCategory? = entries.find { it.name.equals(name, ignoreCase = true) }')
    lines.append("    }")
    lines.append("}")
    return "\n".join(lines) + "\n"


def generate_material_property_tag():
    tags = load_yaml("tags_enum.yaml")
    tags = [t for t in tags if not t.get("deprecated", False) and "name" in t]

    lines = [HEADER, "/** Material property tags */"]
    lines.append("enum class MaterialPropertyTag(")
    lines.append("    val id: Int,")
    lines.append("    val displayName: String,")
    lines.append("    val category: TagCategory")
    lines.append(") {")

    entries = []
    for tag in tags:
        screaming = tag["name"].upper()
        display = tag.get("display_name", tag["name"].replace("_", " ").title())
        cat = tag["category"].upper()
        entries.append(f'    {screaming}({tag["key"]}, "{display}", TagCategory.{cat})')
    lines.append(",\n".join(entries) + ";")

    lines.append("")
    lines.append("    companion object {")
    lines.append("        fun fromId(id: Int): MaterialPropertyTag? = entries.find { it.id == id }")
    lines.append("        fun forCategory(category: TagCategory): List<MaterialPropertyTag> = entries.filter { it.category == category }")
    lines.append("    }")
    lines.append("}")
    return "\n".join(lines) + "\n"


def generate_material_certification():
    items = load_yaml("material_certifications_enum.yaml")
    lines = [HEADER, "/** Certifications a material may have */"]
    lines.append("enum class MaterialCertification(")
    lines.append("    val value: Int,")
    lines.append("    val displayName: String")
    lines.append(") {")

    entries = []
    for item in items:
        screaming = item["name"].upper()
        display = item.get("display_name", item["name"])
        entries.append(f'    {screaming}({item["key"]}, "{display}")')
    lines.append(",\n".join(entries) + ";")

    lines.append("")
    lines.append("    companion object {")
    lines.append("        fun fromValue(value: Int): MaterialCertification? = entries.find { it.value == value }")
    lines.append("    }")
    lines.append("}")
    return "\n".join(lines) + "\n"


def generate_write_protection():
    items = load_yaml("write_protection_enum.yaml")
    lines = [HEADER, "/** Write protection levels for NFC tags */"]
    lines.append("enum class WriteProtection(val value: Int) {")
    entries = []
    for item in items:
        screaming = item["name"].upper()
        entries.append(f"    {screaming}({item['key']})")
    lines.append(",\n".join(entries) + ";")

    lines.append("")
    lines.append("    val isWritable: Boolean get() = this == NO")
    lines.append("    val isUnlockable: Boolean get() = this == PROTECT_PAGE_UNLOCKABLE")
    lines.append("")
    lines.append("    companion object {")
    lines.append("        fun fromValue(value: Int): WriteProtection? = entries.find { it.value == value }")
    lines.append("    }")
    lines.append("}")
    return "\n".join(lines) + "\n"


def write_file(filename, content, check=False):
    path = os.path.join(OUT_DIR, filename)
    if check:
        try:
            with open(path, encoding="utf-8") as f:
                existing = f.read()
            if existing != content:
                print(f"  OUTDATED {filename}")
                return False
            print(f"  OK {filename}")
            return True
        except FileNotFoundError:
            print(f"  MISSING {filename}")
            return False
    os.makedirs(os.path.dirname(path), exist_ok=True)
    with open(path, "w", encoding="utf-8") as f:
        f.write(content)
    print(f"  Generated {filename}")


def main():
    parser = argparse.ArgumentParser(description="Generate Kotlin types from OpenPrintTag spec")
    parser.add_argument("--check", action="store_true", help="Verify generated files are up to date (for CI)")
    args = parser.parse_args()

    action = "Checking" if args.check else "Generating"
    print(f"{action} Kotlin types from {SPEC_DIR}...")

    files = [
        ("MainFieldKey.kt", generate_field_key_enum("main", "main_fields.yaml", "MainFieldKey")),
        ("AuxFieldKey.kt", generate_field_key_enum("auxiliary", "aux_fields.yaml", "AuxFieldKey")),
        ("MetaFieldKey.kt", generate_field_key_enum("meta", "meta_fields.yaml", "MetaFieldKey")),
        ("MaterialClass.kt", generate_material_class()),
        ("MaterialType.kt", generate_material_type()),
        ("MaterialPropertyTag.kt", generate_material_property_tag()),
        ("TagCategory.kt", generate_tag_category()),
        ("MaterialCertification.kt", generate_material_certification()),
        ("WriteProtection.kt", generate_write_protection()),
    ]

    all_ok = True
    for filename, content in files:
        result = write_file(filename, content, check=args.check)
        if args.check and result is False:
            all_ok = False

    if args.check:
        if all_ok:
            print("All files up to date.")
        else:
            print("Files are outdated. Run: python3 scripts/generate_types.py")
            sys.exit(1)
    else:
        print("Done!")


if __name__ == "__main__":
    main()
