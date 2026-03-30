// Auto-generated from OpenPrintTag spec — do not edit manually
// Regenerate: python3 scripts/generate_types.py

package cool.nfc.openprinttag.types

/** Material class (FFF or SLA) */
enum class MaterialClass(val value: Int) {
    FFF(0),
    SLA(1);

    companion object {
        fun fromValue(value: Int): MaterialClass? = entries.find { it.value == value }
    }
}
