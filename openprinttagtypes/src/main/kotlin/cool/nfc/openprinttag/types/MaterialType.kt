// Auto-generated from OpenPrintTag spec — do not edit manually
// Regenerate: python3 scripts/generate_types.py

package cool.nfc.openprinttag.types

/** Material type classifications */
enum class MaterialType(
    val value: Int,
    val abbreviation: String,
    val fullName: String,
    val materialClass: MaterialClass
) {
    PLA(0, "PLA", "Polylactic Acid", MaterialClass.FFF),
    PETG(1, "PETG", "Polyethylene Terephthalate Glycol", MaterialClass.FFF),
    TPU(2, "TPU", "Thermoplastic Polyurethane", MaterialClass.FFF),
    ABS(3, "ABS", "Acrylonitrile Butadiene Styrene", MaterialClass.FFF),
    ASA(4, "ASA", "Acrylonitrile Styrene Acrylate", MaterialClass.FFF),
    PC(5, "PC", "Polycarbonate", MaterialClass.FFF),
    PCTG(6, "PCTG", "Polycyclohexylenedimethylene Terephthalate Glycol", MaterialClass.FFF),
    PP(7, "PP", "Polypropylene", MaterialClass.FFF),
    PA6(8, "PA6", "Polyamide 6", MaterialClass.FFF),
    PA11(9, "PA11", "Polyamide 11", MaterialClass.FFF),
    PA12(10, "PA12", "Polyamide 12", MaterialClass.FFF),
    PA66(11, "PA66", "Polyamide 66", MaterialClass.FFF),
    CPE(12, "CPE", "Copolyester", MaterialClass.FFF),
    TPE(13, "TPE", "Thermoplastic Elastomer", MaterialClass.FFF),
    HIPS(14, "HIPS", "High Impact Polystyrene", MaterialClass.FFF),
    PHA(15, "PHA", "Polyhydroxyalkanoate", MaterialClass.FFF),
    PET(16, "PET", "Polyethylene Terephthalate", MaterialClass.FFF),
    PEI(17, "PEI", "Polyetherimide", MaterialClass.FFF),
    PBT(18, "PBT", "Polybutylene Terephthalate", MaterialClass.FFF),
    PVB(19, "PVB", "Polyvinyl Butyral", MaterialClass.FFF),
    PVA(20, "PVA", "Polyvinyl Alcohol", MaterialClass.FFF),
    PEKK(21, "PEKK", "Polyetherketoneketone", MaterialClass.FFF),
    PEEK(22, "PEEK", "Polyether Ether Ketone", MaterialClass.FFF),
    BVOH(23, "BVOH", "Butenediol Vinyl Alcohol Copolymer", MaterialClass.FFF),
    TPC(24, "TPC", "Thermoplastic Copolyester", MaterialClass.FFF),
    PPS(25, "PPS", "Polyphenylene Sulfide", MaterialClass.FFF),
    PPSU(26, "PPSU", "Polyphenylsulfone", MaterialClass.FFF),
    PVC(27, "PVC", "Polyvinyl Chloride", MaterialClass.FFF),
    PEBA(28, "PEBA", "Polyether Block Amide", MaterialClass.FFF),
    PVDF(29, "PVDF", "Polyvinylidene Fluoride", MaterialClass.FFF),
    PPA(30, "PPA", "Polyphthalamide", MaterialClass.FFF),
    PCL(31, "PCL", "Polycaprolactone", MaterialClass.FFF),
    PES(32, "PES", "Polyethersulfone", MaterialClass.FFF),
    PMMA(33, "PMMA", "Polymethyl Methacrylate", MaterialClass.FFF),
    POM(34, "POM", "Polyoxymethylene", MaterialClass.FFF),
    PPE(35, "PPE", "Polyphenylene Ether", MaterialClass.FFF),
    PS(36, "PS", "Polystyrene", MaterialClass.FFF),
    PSU(37, "PSU", "Polysulfone", MaterialClass.FFF),
    TPI(38, "TPI", "Thermoplastic Polyimide", MaterialClass.FFF),
    SBS(39, "SBS", "Styrene-Butadiene-Styrene", MaterialClass.FFF),
    OBC(40, "OBC", "Olefin Block Copolymer", MaterialClass.FFF),
    EVA(41, "EVA", "Ethylene Vinyl Acetate", MaterialClass.FFF);

    companion object {
        fun fromValue(value: Int): MaterialType? = entries.find { it.value == value }
    }
}
