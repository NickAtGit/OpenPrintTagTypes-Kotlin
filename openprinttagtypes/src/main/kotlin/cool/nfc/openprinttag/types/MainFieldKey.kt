// Auto-generated from OpenPrintTag spec — do not edit manually
// Regenerate: python3 scripts/generate_types.py

package cool.nfc.openprinttag.types

/** Field keys for the main section of OpenPrintTag CBOR data */
enum class MainFieldKey(
    val rawValue: Long,
    val fieldName: String,
    val isRequired: Boolean = false,
    val isRecommended: Boolean = false,
    val isDeprecated: Boolean = false
) {
    INSTANCE_UUID(0, "instance_uuid", isRequired = false, isRecommended = false, isDeprecated = false),
    PACKAGE_UUID(1, "package_uuid", isRequired = false, isRecommended = false, isDeprecated = false),
    MATERIAL_UUID(2, "material_uuid", isRequired = false, isRecommended = false, isDeprecated = false),
    BRAND_UUID(3, "brand_uuid", isRequired = false, isRecommended = false, isDeprecated = false),
    GTIN(4, "gtin", isRequired = false, isRecommended = true, isDeprecated = false),
    BRAND_SPECIFIC_INSTANCE_ID(5, "brand_specific_instance_id", isRequired = false, isRecommended = false, isDeprecated = false),
    BRAND_SPECIFIC_PACKAGE_ID(6, "brand_specific_package_id", isRequired = false, isRecommended = false, isDeprecated = false),
    BRAND_SPECIFIC_MATERIAL_ID(7, "brand_specific_material_id", isRequired = false, isRecommended = false, isDeprecated = false),
    MATERIAL_CLASS(8, "material_class", isRequired = true, isRecommended = false, isDeprecated = false),
    MATERIAL_TYPE(9, "material_type", isRequired = false, isRecommended = true, isDeprecated = false),
    MATERIAL_NAME(10, "material_name", isRequired = false, isRecommended = true, isDeprecated = false),
    MATERIAL_ABBREVIATION(52, "material_abbreviation", isRequired = false, isRecommended = false, isDeprecated = false),
    BRAND_NAME(11, "brand_name", isRequired = false, isRecommended = true, isDeprecated = false),
    @Deprecated("Removed from spec")
    DEPRECATED_12(12, "deprecated_12", isRequired = false, isRecommended = false, isDeprecated = true),
    WRITE_PROTECTION(13, "write_protection", isRequired = false, isRecommended = false, isDeprecated = false),
    MANUFACTURED_DATE(14, "manufactured_date", isRequired = false, isRecommended = true, isDeprecated = false),
    COUNTRY_OF_ORIGIN(55, "country_of_origin", isRequired = false, isRecommended = false, isDeprecated = false),
    EXPIRATION_DATE(15, "expiration_date", isRequired = false, isRecommended = false, isDeprecated = false),
    NOMINAL_NETTO_FULL_WEIGHT(16, "nominal_netto_full_weight", isRequired = false, isRecommended = true, isDeprecated = false),
    ACTUAL_NETTO_FULL_WEIGHT(17, "actual_netto_full_weight", isRequired = false, isRecommended = true, isDeprecated = false),
    NOMINAL_FULL_LENGTH(53, "nominal_full_length", isRequired = false, isRecommended = true, isDeprecated = false),
    ACTUAL_FULL_LENGTH(54, "actual_full_length", isRequired = false, isRecommended = true, isDeprecated = false),
    EMPTY_CONTAINER_WEIGHT(18, "empty_container_weight", isRequired = false, isRecommended = true, isDeprecated = false),
    PRIMARY_COLOR(19, "primary_color", isRequired = false, isRecommended = true, isDeprecated = false),
    SECONDARY_COLOR_0(20, "secondary_color_0", isRequired = false, isRecommended = false, isDeprecated = false),
    SECONDARY_COLOR_1(21, "secondary_color_1", isRequired = false, isRecommended = false, isDeprecated = false),
    SECONDARY_COLOR_2(22, "secondary_color_2", isRequired = false, isRecommended = false, isDeprecated = false),
    SECONDARY_COLOR_3(23, "secondary_color_3", isRequired = false, isRecommended = false, isDeprecated = false),
    SECONDARY_COLOR_4(24, "secondary_color_4", isRequired = false, isRecommended = false, isDeprecated = false),
    @Deprecated("Removed from spec")
    DEPRECATED_25(25, "deprecated_25", isRequired = false, isRecommended = false, isDeprecated = true),
    @Deprecated("Removed from spec")
    DEPRECATED_26(26, "deprecated_26", isRequired = false, isRecommended = false, isDeprecated = true),
    TRANSMISSION_DISTANCE(27, "transmission_distance", isRequired = false, isRecommended = false, isDeprecated = false),
    TAGS(28, "tags", isRequired = false, isRecommended = true, isDeprecated = false),
    CERTIFICATIONS(56, "certifications", isRequired = false, isRecommended = false, isDeprecated = false),
    DENSITY(29, "density", isRequired = false, isRecommended = true, isDeprecated = false),
    FILAMENT_DIAMETER(30, "filament_diameter", isRequired = false, isRecommended = false, isDeprecated = false),
    SHORE_HARDNESS_A(31, "shore_hardness_a", isRequired = false, isRecommended = false, isDeprecated = false),
    SHORE_HARDNESS_D(32, "shore_hardness_d", isRequired = false, isRecommended = false, isDeprecated = false),
    MIN_NOZZLE_DIAMETER(33, "min_nozzle_diameter", isRequired = false, isRecommended = false, isDeprecated = false),
    MIN_PRINT_TEMPERATURE(34, "min_print_temperature", isRequired = false, isRecommended = true, isDeprecated = false),
    MAX_PRINT_TEMPERATURE(35, "max_print_temperature", isRequired = false, isRecommended = true, isDeprecated = false),
    PREHEAT_TEMPERATURE(36, "preheat_temperature", isRequired = false, isRecommended = true, isDeprecated = false),
    MIN_BED_TEMPERATURE(37, "min_bed_temperature", isRequired = false, isRecommended = true, isDeprecated = false),
    MAX_BED_TEMPERATURE(38, "max_bed_temperature", isRequired = false, isRecommended = true, isDeprecated = false),
    MIN_CHAMBER_TEMPERATURE(39, "min_chamber_temperature", isRequired = false, isRecommended = false, isDeprecated = false),
    MAX_CHAMBER_TEMPERATURE(40, "max_chamber_temperature", isRequired = false, isRecommended = false, isDeprecated = false),
    CHAMBER_TEMPERATURE(41, "chamber_temperature", isRequired = false, isRecommended = false, isDeprecated = false),
    CONTAINER_WIDTH(42, "container_width", isRequired = false, isRecommended = false, isDeprecated = false),
    CONTAINER_OUTER_DIAMETER(43, "container_outer_diameter", isRequired = false, isRecommended = false, isDeprecated = false),
    CONTAINER_INNER_DIAMETER(44, "container_inner_diameter", isRequired = false, isRecommended = false, isDeprecated = false),
    CONTAINER_HOLE_DIAMETER(45, "container_hole_diameter", isRequired = false, isRecommended = false, isDeprecated = false),
    VISCOSITY_18C(46, "viscosity_18c", isRequired = false, isRecommended = false, isDeprecated = false),
    VISCOSITY_25C(47, "viscosity_25c", isRequired = false, isRecommended = false, isDeprecated = false),
    VISCOSITY_40C(48, "viscosity_40c", isRequired = false, isRecommended = false, isDeprecated = false),
    VISCOSITY_60C(49, "viscosity_60c", isRequired = false, isRecommended = false, isDeprecated = false),
    CONTAINER_VOLUMETRIC_CAPACITY(50, "container_volumetric_capacity", isRequired = false, isRecommended = false, isDeprecated = false),
    CURE_WAVELENGTH(51, "cure_wavelength", isRequired = false, isRecommended = false, isDeprecated = false),
    DRYING_TEMPERATURE(57, "drying_temperature", isRequired = false, isRecommended = false, isDeprecated = false),
    DRYING_TIME(58, "drying_time", isRequired = false, isRecommended = false, isDeprecated = false);

    companion object {
        fun fromValue(value: Long): MainFieldKey? = entries.find { it.rawValue == value }
    }
}
