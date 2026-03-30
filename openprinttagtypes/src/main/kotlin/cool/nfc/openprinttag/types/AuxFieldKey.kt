// Auto-generated from OpenPrintTag spec — do not edit manually
// Regenerate: python3 scripts/generate_types.py

package cool.nfc.openprinttag.types

/** Field keys for the auxiliary section of OpenPrintTag CBOR data */
enum class AuxFieldKey(
    val rawValue: Long,
    val fieldName: String,
    val isRequired: Boolean = false,
    val isRecommended: Boolean = false,
    val isDeprecated: Boolean = false
) {
    CONSUMED_WEIGHT(0, "consumed_weight", isRequired = false, isRecommended = false, isDeprecated = false),
    WORKGROUP(1, "workgroup", isRequired = false, isRecommended = false, isDeprecated = false),
    GENERAL_PURPOSE_RANGE_USER(2, "general_purpose_range_user", isRequired = false, isRecommended = false, isDeprecated = false),
    LAST_STIR_TIME(3, "last_stir_time", isRequired = false, isRecommended = false, isDeprecated = false);

    companion object {
        fun fromValue(value: Long): AuxFieldKey? = entries.find { it.rawValue == value }
    }
}
