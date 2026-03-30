// Auto-generated from OpenPrintTag spec — do not edit manually
// Regenerate: python3 scripts/generate_types.py

package cool.nfc.openprinttag.types

/** Categories for material property tags */
enum class TagCategory(
    val displayName: String,
    val emoji: String
) {
    BIOLOGICAL("Biological", "🧬"),
    PHYSICAL("Physical", "⚙️"),
    ELECTRICAL("Electrical", "⚡"),
    CHEMICAL("Chemical", "🧪"),
    VISUAL("Visual", "👁️"),
    ADDITIVES_ORGANIC("Organic additives", "🌿"),
    ADDITIVES_METAL("Metal additives", "🔩"),
    ADDITIVES_OTHER("Other additives", "✨"),
    IMITATION("Imitation", "🎭"),
    OTHER("Other", "📦");

    companion object {
        fun fromName(name: String): TagCategory? = entries.find { it.name.equals(name, ignoreCase = true) }
    }
}
