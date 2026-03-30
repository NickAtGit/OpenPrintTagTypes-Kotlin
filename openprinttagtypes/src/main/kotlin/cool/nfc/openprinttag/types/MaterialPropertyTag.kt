// Auto-generated from OpenPrintTag spec/data/tags_enum.yaml
package cool.nfc.openprinttag.types

enum class MaterialPropertyTag(
    val id: Int,
    val tagName: String,
    val displayName: String,
    val category: TagCategory,
) {
    // Biological
    FILTRATION_RECOMMENDED(0, "filtration_recommended", "Filtration recommended", TagCategory.BIOLOGICAL),
    BIOCOMPATIBLE(1, "biocompatible", "Biocompatible", TagCategory.BIOLOGICAL),
    ANTIBACTERIAL(2, "antibacterial", "Antibacterial", TagCategory.BIOLOGICAL),
    AIR_FILTERING(3, "air_filtering", "Air filtering", TagCategory.BIOLOGICAL),
    HOME_COMPOSTABLE(61, "home_compostable", "Home compostable", TagCategory.BIOLOGICAL),
    INDUSTRIALLY_COMPOSTABLE(62, "industrially_compostable", "Industrially compostable", TagCategory.BIOLOGICAL),
    BIO_BASED(63, "bio_based", "Bio-based", TagCategory.BIOLOGICAL),

    // Physical
    ABRASIVE(4, "abrasive", "Abrasive", TagCategory.PHYSICAL),
    FOAMING(5, "foaming", "Foaming", TagCategory.PHYSICAL),
    SELF_EXTINGUISHING(6, "self_extinguishing", "Self-extinguishing", TagCategory.PHYSICAL),
    PARAMAGNETIC(7, "paramagnetic", "Paramagnetic", TagCategory.PHYSICAL),
    RADIATION_SHIELDING(8, "radiation_shielding", "Radiation shielding", TagCategory.PHYSICAL),
    HIGH_TEMPERATURE(9, "high_temperature", "High temperature", TagCategory.PHYSICAL),
    CASTABLE(67, "castable", "Castable", TagCategory.PHYSICAL),
    HIGH_SPEED(71, "high_speed", "High speed", TagCategory.PHYSICAL),

    // Electrical
    ESD_SAFE(10, "esd_safe", "ESD safe", TagCategory.ELECTRICAL),
    CONDUCTIVE(11, "conductive", "Conductive", TagCategory.ELECTRICAL),
    EMI_SHIELDING(70, "emi_shielding", "EMI shielding", TagCategory.ELECTRICAL),

    // Chemical
    BLEND(12, "blend", "Blend", TagCategory.CHEMICAL),
    WATER_SOLUBLE(13, "water_soluble", "Water soluble", TagCategory.CHEMICAL),
    IPA_SOLUBLE(14, "ipa_soluble", "IPA soluble", TagCategory.CHEMICAL),
    LIMONENE_SOLUBLE(15, "limonene_soluble", "Limonene soluble", TagCategory.CHEMICAL),
    LOW_OUTGASSING(64, "low_outgassing", "Low outgassing", TagCategory.CHEMICAL),

    // Visual
    MATTE(16, "matte", "Matte", TagCategory.VISUAL),
    SILK(17, "silk", "Silk", TagCategory.VISUAL),
    @Deprecated("Removed from spec")
    DEPRECATED_18(18, "deprecated_18", "Deprecated", TagCategory.VISUAL),
    TRANSLUCENT(19, "translucent", "Translucent", TagCategory.VISUAL),
    TRANSPARENT(20, "transparent", "Transparent", TagCategory.VISUAL),
    IRIDESCENT(21, "iridescent", "Iridescent", TagCategory.VISUAL),
    PEARLESCENT(22, "pearlescent", "Pearlescent", TagCategory.VISUAL),
    GLITTER(23, "glitter", "Glitter", TagCategory.VISUAL),
    GLOW_IN_THE_DARK(24, "glow_in_the_dark", "Glow in the dark", TagCategory.VISUAL),
    NEON(25, "neon", "Neon", TagCategory.VISUAL),
    ILLUMINESCENT_COLOR_CHANGE(26, "illuminescent_color_change", "Illuminescent color change", TagCategory.VISUAL),
    TEMPERATURE_COLOR_CHANGE(27, "temperature_color_change", "Temperature color change", TagCategory.VISUAL),
    GRADUAL_COLOR_CHANGE(28, "gradual_color_change", "Gradual color change", TagCategory.VISUAL),
    COEXTRUDED(29, "coextruded", "Coextruded", TagCategory.VISUAL),
    WITHOUT_PIGMENTS(65, "without_pigments", "Without pigments", TagCategory.VISUAL),

    // Additives - Other
    CONTAINS_CARBON(30, "contains_carbon", "Contains carbon", TagCategory.ADDITIVES_OTHER),
    CONTAINS_CARBON_FIBER(31, "contains_carbon_fiber", "Contains carbon fiber", TagCategory.ADDITIVES_OTHER),
    CONTAINS_CARBON_NANO_TUBES(32, "contains_carbon_nano_tubes", "Contains carbon nano tubes", TagCategory.ADDITIVES_OTHER),
    CONTAINS_GLASS(33, "contains_glass", "Contains glass", TagCategory.ADDITIVES_OTHER),
    CONTAINS_GLASS_FIBER(34, "contains_glass_fiber", "Contains glass fiber", TagCategory.ADDITIVES_OTHER),
    CONTAINS_KEVLAR(35, "contains_kevlar", "Contains Kevlar", TagCategory.ADDITIVES_OTHER),
    CONTAINS_STONE(36, "contains_stone", "Contains stone", TagCategory.ADDITIVES_OTHER),
    CONTAINS_MAGNETITE(37, "contains_magnetite", "Contains magnetite", TagCategory.ADDITIVES_OTHER),
    CONTAINS_CERAMIC(44, "contains_ceramic", "Contains ceramic", TagCategory.ADDITIVES_OTHER),
    CONTAINS_BORON_CARBIDE(45, "contains_boron_carbide", "Contains boron carbide", TagCategory.ADDITIVES_OTHER),
    CONTAINS_PTFE(68, "contains_ptfe", "Contains PTFE", TagCategory.ADDITIVES_OTHER),
    CONTAINS_GRAPHENE(72, "contains_graphene", "Contains graphene", TagCategory.ADDITIVES_OTHER),

    // Additives - Organic
    CONTAINS_ORGANIC_MATERIAL(38, "contains_organic_material", "Contains organic material", TagCategory.ADDITIVES_ORGANIC),
    CONTAINS_CORK(39, "contains_cork", "Contains cork", TagCategory.ADDITIVES_ORGANIC),
    CONTAINS_WAX(40, "contains_wax", "Contains wax", TagCategory.ADDITIVES_ORGANIC),
    CONTAINS_WOOD(41, "contains_wood", "Contains wood", TagCategory.ADDITIVES_ORGANIC),
    CONTAINS_BAMBOO(42, "contains_bamboo", "Contains bamboo", TagCategory.ADDITIVES_ORGANIC),
    CONTAINS_PINE(43, "contains_pine", "Contains pine", TagCategory.ADDITIVES_ORGANIC),
    CONTAINS_ALGAE(66, "contains_algae", "Contains algae", TagCategory.ADDITIVES_ORGANIC),

    // Additives - Metal
    CONTAINS_METAL(46, "contains_metal", "Contains metal", TagCategory.ADDITIVES_METAL),
    CONTAINS_BRONZE(47, "contains_bronze", "Contains bronze", TagCategory.ADDITIVES_METAL),
    CONTAINS_IRON(48, "contains_iron", "Contains iron", TagCategory.ADDITIVES_METAL),
    CONTAINS_STEEL(49, "contains_steel", "Contains steel", TagCategory.ADDITIVES_METAL),
    CONTAINS_SILVER(50, "contains_silver", "Contains silver", TagCategory.ADDITIVES_METAL),
    CONTAINS_COPPER(51, "contains_copper", "Contains copper", TagCategory.ADDITIVES_METAL),
    CONTAINS_ALUMINIUM(52, "contains_aluminium", "Contains aluminium", TagCategory.ADDITIVES_METAL),
    CONTAINS_BRASS(53, "contains_brass", "Contains brass", TagCategory.ADDITIVES_METAL),
    CONTAINS_TUNGSTEN(54, "contains_tungsten", "Contains tungsten", TagCategory.ADDITIVES_METAL),

    // Imitation
    IMITATES_WOOD(55, "imitates_wood", "Imitates wood", TagCategory.IMITATION),
    IMITATES_METAL(56, "imitates_metal", "Imitates metal", TagCategory.IMITATION),
    IMITATES_MARBLE(57, "imitates_marble", "Imitates marble", TagCategory.IMITATION),
    IMITATES_STONE(58, "imitates_stone", "Imitates stone", TagCategory.IMITATION),

    // Other
    LITHOPHANE(59, "lithophane", "Lithophane", TagCategory.OTHER),
    RECYCLED(60, "recycled", "Recycled", TagCategory.OTHER),
    LIMITED_EDITION(69, "limited_edition", "Limited edition", TagCategory.OTHER);

    companion object {
        fun fromValue(value: Int): MaterialPropertyTag? = entries.find { it.id == value }

        fun forCategory(category: TagCategory): List<MaterialPropertyTag> =
            entries.filter { it.category == category }
    }
}
