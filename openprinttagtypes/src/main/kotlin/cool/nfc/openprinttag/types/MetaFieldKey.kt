// Auto-generated from OpenPrintTag spec/data/meta_fields.yaml
package cool.nfc.openprinttag.types

enum class MetaFieldKey(
    val rawValue: Long,
    val fieldName: String,
    val isRequired: Boolean,
    val isRecommended: Boolean,
) {
    MAIN_REGION_OFFSET(0, "main_region_offset", isRequired = false, isRecommended = false),
    MAIN_REGION_SIZE(1, "main_region_size", isRequired = false, isRecommended = false),
    AUX_REGION_OFFSET(2, "aux_region_offset", isRequired = false, isRecommended = false),
    AUX_REGION_SIZE(3, "aux_region_size", isRequired = false, isRecommended = false);

    companion object {
        fun fromValue(value: Long): MetaFieldKey? = entries.find { it.rawValue == value }
    }
}
