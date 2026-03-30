// Auto-generated from OpenPrintTag spec — do not edit manually
// Regenerate: python3 scripts/generate_types.py

package cool.nfc.openprinttag.types

/** Certifications a material may have */
enum class MaterialCertification(
    val value: Int,
    val displayName: String
) {
    UL_2818(0, "UL 2818"),
    UL_94_V0(1, "UL 94 V0"),
    UL_2904(2, "UL 2904");

    companion object {
        fun fromValue(value: Int): MaterialCertification? = entries.find { it.value == value }
    }
}
