// Auto-generated from OpenPrintTag spec — do not edit manually
// Regenerate: python3 scripts/generate_types.py

package cool.nfc.openprinttag.types

/** Field keys for the meta section of OpenPrintTag CBOR data */
enum class MetaFieldKey(
    val rawValue: Long,
    val fieldName: String,
    val isRequired: Boolean = false,
    val isRecommended: Boolean = false,
    val isDeprecated: Boolean = false
) {
    MAIN_REGION_OFFSET(0, "main_region_offset", isRequired = false, isRecommended = false, isDeprecated = false),
    MAIN_REGION_SIZE(1, "main_region_size", isRequired = false, isRecommended = false, isDeprecated = false),
    AUX_REGION_OFFSET(2, "aux_region_offset", isRequired = false, isRecommended = false, isDeprecated = false),
    AUX_REGION_SIZE(3, "aux_region_size", isRequired = false, isRecommended = false, isDeprecated = false);

    companion object {
        fun fromValue(value: Long): MetaFieldKey? = entries.find { it.rawValue == value }
    }
}
