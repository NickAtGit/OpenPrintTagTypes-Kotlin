// Auto-generated from OpenPrintTag spec/data/material_class_enum.yaml
package cool.nfc.openprinttag.types

enum class MaterialClass(val value: Int, val displayName: String) {
    FFF(0, "Filament"),
    SLA(1, "Resin");

    companion object {
        fun fromValue(value: Int): MaterialClass? = entries.find { it.value == value }
    }
}
