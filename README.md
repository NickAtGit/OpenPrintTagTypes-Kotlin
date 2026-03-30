# OpenPrintTagTypes-Kotlin

Kotlin type definitions for the [OpenPrintTag](https://github.com/prusa3d/OpenPrintTag) specification — a standard for encoding 3D printing material data on NFC tags.

This is the Kotlin equivalent of [OpenPrintTagTypes-Swift](https://github.com/NickAtGit/OpenPrintTagTypes-Swift).

## Package

```
cool.nfc.openprinttag.types
```

## Types

| Type | Description |
|------|-------------|
| `MainFieldKey` | Main data region field keys (0–58), including deprecated keys 12/25/26 |
| `AuxFieldKey` | Auxiliary data region field keys (0–3) |
| `MetaFieldKey` | Meta region field keys (0–3) |
| `MaterialClass` | Material class enum (FFF, SLA) |
| `MaterialType` | Material type enum (~42 polymer types) |
| `MaterialPropertyTag` | Material property tags (70+ tags across 10 categories) |
| `TagCategory` | Tag categories (biological, physical, electrical, etc.) |
| `MaterialCertification` | Material certifications (UL 2818, UL 94 V0, UL 2904) |
| `WriteProtection` | Write protection levels (no, irreversible, unlockable) |

## Usage

```kotlin
import cool.nfc.openprinttag.types.*

// Look up a field key by its CBOR key value
val field = MainFieldKey.fromValue(10) // MATERIAL_NAME

// Get material type info
val pla = MaterialType.PLA
println("${pla.abbreviation}: ${pla.typeName}") // PLA: Polylactic Acid

// Filter tags by category
val visualTags = MaterialPropertyTag.forCategory(TagCategory.VISUAL)
```

## Installation

Add the module to your project via Gradle:

```kotlin
dependencies {
    implementation(project(":openprinttagtypes"))
}
```

## Spec

Types are generated from the [OpenPrintTag spec](https://github.com/prusa3d/OpenPrintTag) YAML files included as a git submodule under `spec/`.

## License

See the [OpenPrintTag specification](https://github.com/prusa3d/OpenPrintTag) for licensing details.
