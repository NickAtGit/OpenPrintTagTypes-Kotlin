// Auto-generated from OpenPrintTag spec/data/tag_categories_enum.yaml
package cool.nfc.openprinttag.types

enum class TagCategory(val value: String, val displayName: String, val emoji: String) {
    BIOLOGICAL("biological", "Biological", "\uD83E\uDDEC"),
    PHYSICAL("physical", "Physical", "\u2699\uFE0F"),
    ELECTRICAL("electrical", "Electrical", "\u26A1"),
    CHEMICAL("chemical", "Chemical", "\uD83E\uDDEA"),
    VISUAL("visual", "Visual", "\uD83D\uDC41\uFE0F"),
    ADDITIVES_ORGANIC("additives_organic", "Organic additives", "\uD83C\uDF3F"),
    ADDITIVES_METAL("additives_metal", "Metal additives", "\uD83D\uDD29"),
    ADDITIVES_OTHER("additives_other", "Other additives", "\u2728"),
    IMITATION("imitation", "Imitation", "\uD83C\uDFAD"),
    OTHER("other", "Other", "\uD83D\uDCE6");

    companion object {
        fun fromValue(value: String): TagCategory? = entries.find { it.value == value }
    }
}
