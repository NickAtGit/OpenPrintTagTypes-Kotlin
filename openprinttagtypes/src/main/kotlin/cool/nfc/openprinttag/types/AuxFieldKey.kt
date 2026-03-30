// Auto-generated from OpenPrintTag spec/data/aux_fields.yaml
package cool.nfc.openprinttag.types

enum class AuxFieldKey(
    val rawValue: Long,
    val fieldName: String,
    val isRequired: Boolean,
    val isRecommended: Boolean,
) {
    CONSUMED_WEIGHT(0, "consumed_weight", isRequired = false, isRecommended = false),
    WORKGROUP(1, "workgroup", isRequired = false, isRecommended = false),
    GENERAL_PURPOSE_RANGE_USER(2, "general_purpose_range_user", isRequired = false, isRecommended = false),
    LAST_STIR_TIME(3, "last_stir_time", isRequired = false, isRecommended = false);

    companion object {
        fun fromValue(value: Long): AuxFieldKey? = entries.find { it.rawValue == value }
    }
}
