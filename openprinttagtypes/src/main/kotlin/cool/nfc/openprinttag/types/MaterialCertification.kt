// Auto-generated from OpenPrintTag spec/data/material_certifications_enum.yaml
package cool.nfc.openprinttag.types

enum class MaterialCertification(
    val value: Int,
    val certName: String,
    val displayName: String,
) {
    UL_2818(0, "ul_2818", "UL 2818"),
    UL_94_V0(1, "ul_94_v0", "UL 94 V0"),
    UL_2904(2, "ul_2904", "UL 2904");

    companion object {
        fun fromValue(value: Int): MaterialCertification? = entries.find { it.value == value }
    }
}
