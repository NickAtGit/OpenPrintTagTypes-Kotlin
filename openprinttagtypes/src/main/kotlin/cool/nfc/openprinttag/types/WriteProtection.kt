// Auto-generated from OpenPrintTag spec — do not edit manually
// Regenerate: python3 scripts/generate_types.py

package cool.nfc.openprinttag.types

/** Write protection levels for NFC tags */
enum class WriteProtection(val value: Int) {
    NO(0),
    IRREVERSIBLE(1),
    PROTECT_PAGE_UNLOCKABLE(2);

    val isWritable: Boolean get() = this == NO
    val isUnlockable: Boolean get() = this == PROTECT_PAGE_UNLOCKABLE

    companion object {
        fun fromValue(value: Int): WriteProtection? = entries.find { it.value == value }
    }
}
