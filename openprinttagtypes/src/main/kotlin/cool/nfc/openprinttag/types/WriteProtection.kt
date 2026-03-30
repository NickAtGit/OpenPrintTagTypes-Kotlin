// Auto-generated from OpenPrintTag spec/data/write_protection_enum.yaml
package cool.nfc.openprinttag.types

enum class WriteProtection(
    val value: Int,
    val displayName: String,
    val isWritable: Boolean,
    val isUnlockable: Boolean,
) {
    NO(0, "No", isWritable = true, isUnlockable = false),
    IRREVERSIBLE(1, "Irreversible", isWritable = false, isUnlockable = false),
    PROTECT_PAGE_UNLOCKABLE(2, "Protect page unlockable", isWritable = false, isUnlockable = true);

    companion object {
        fun fromValue(value: Int): WriteProtection? = entries.find { it.value == value }
    }
}
