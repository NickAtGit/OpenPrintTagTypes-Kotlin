// Auto-generated from OpenPrintTag spec/data/material_type_enum.yaml
package cool.nfc.openprinttag.types

enum class MaterialType(
    val value: Int,
    val typeName: String,
    val abbreviation: String,
    val materialClass: MaterialClass,
) {
    PLA(0, "Polylactic Acid", "PLA", MaterialClass.FFF),
    PETG(1, "Polyethylene Terephthalate Glycol", "PETG", MaterialClass.FFF),
    TPU(2, "Thermoplastic Polyurethane", "TPU", MaterialClass.FFF),
    ABS(3, "Acrylonitrile Butadiene Styrene", "ABS", MaterialClass.FFF),
    ASA(4, "Acrylonitrile Styrene Acrylate", "ASA", MaterialClass.FFF),
    PC(5, "Polycarbonate", "PC", MaterialClass.FFF),
    PCTG(6, "Polycyclohexylenedimethylene Terephthalate Glycol", "PCTG", MaterialClass.FFF),
    PP(7, "Polypropylene", "PP", MaterialClass.FFF),
    PA6(8, "Polyamide 6", "PA6", MaterialClass.FFF),
    PA11(9, "Polyamide 11", "PA11", MaterialClass.FFF),
    PA12(10, "Polyamide 12", "PA12", MaterialClass.FFF),
    PA66(11, "Polyamide 66", "PA66", MaterialClass.FFF),
    CPE(12, "Copolyester", "CPE", MaterialClass.FFF),
    TPE(13, "Thermoplastic Elastomer", "TPE", MaterialClass.FFF),
    HIPS(14, "High Impact Polystyrene", "HIPS", MaterialClass.FFF),
    PHA(15, "Polyhydroxyalkanoate", "PHA", MaterialClass.FFF),
    PET(16, "Polyethylene Terephthalate", "PET", MaterialClass.FFF),
    PEI(17, "Polyetherimide", "PEI", MaterialClass.FFF),
    PBT(18, "Polybutylene Terephthalate", "PBT", MaterialClass.FFF),
    PVB(19, "Polyvinyl Butyral", "PVB", MaterialClass.FFF),
    PVA(20, "Polyvinyl Alcohol", "PVA", MaterialClass.FFF),
    PEKK(21, "Polyetherketoneketone", "PEKK", MaterialClass.FFF),
    PEEK(22, "Polyether Ether Ketone", "PEEK", MaterialClass.FFF),
    BVOH(23, "Butenediol Vinyl Alcohol Copolymer", "BVOH", MaterialClass.FFF),
    TPC(24, "Thermoplastic Copolyester", "TPC", MaterialClass.FFF),
    PPS(25, "Polyphenylene Sulfide", "PPS", MaterialClass.FFF),
    PPSU(26, "Polyphenylsulfone", "PPSU", MaterialClass.FFF),
    PVC(27, "Polyvinyl Chloride", "PVC", MaterialClass.FFF),
    PEBA(28, "Polyether Block Amide", "PEBA", MaterialClass.FFF),
    PVDF(29, "Polyvinylidene Fluoride", "PVDF", MaterialClass.FFF),
    PPA(30, "Polyphthalamide", "PPA", MaterialClass.FFF),
    PCL(31, "Polycaprolactone", "PCL", MaterialClass.FFF),
    PES(32, "Polyethersulfone", "PES", MaterialClass.FFF),
    PMMA(33, "Polymethyl Methacrylate", "PMMA", MaterialClass.FFF),
    POM(34, "Polyoxymethylene", "POM", MaterialClass.FFF),
    PPE(35, "Polyphenylene Ether", "PPE", MaterialClass.FFF),
    PS(36, "Polystyrene", "PS", MaterialClass.FFF),
    PSU(37, "Polysulfone", "PSU", MaterialClass.FFF),
    TPI(38, "Thermoplastic Polyimide", "TPI", MaterialClass.FFF),
    SBS(39, "Styrene-Butadiene-Styrene", "SBS", MaterialClass.FFF),
    OBC(40, "Olefin Block Copolymer", "OBC", MaterialClass.FFF),
    EVA(41, "Ethylene Vinyl Acetate", "EVA", MaterialClass.FFF);

    companion object {
        fun fromValue(value: Int): MaterialType? = entries.find { it.value == value }
    }
}
