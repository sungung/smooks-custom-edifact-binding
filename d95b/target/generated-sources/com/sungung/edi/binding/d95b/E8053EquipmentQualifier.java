//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.21 at 01:57:40 PM AEST 
//


package com.sungung.edi.binding.d95b;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for E8053-EquipmentQualifier.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="E8053-EquipmentQualifier"&gt;
 *   &lt;restriction base="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}alpha0-3"&gt;
 *     &lt;enumeration value="AA"/&gt;
 *     &lt;enumeration value="AB"/&gt;
 *     &lt;enumeration value="AD"/&gt;
 *     &lt;enumeration value="AE"/&gt;
 *     &lt;enumeration value="BL"/&gt;
 *     &lt;enumeration value="BPN"/&gt;
 *     &lt;enumeration value="BPY"/&gt;
 *     &lt;enumeration value="BR"/&gt;
 *     &lt;enumeration value="BX"/&gt;
 *     &lt;enumeration value="CH"/&gt;
 *     &lt;enumeration value="CN"/&gt;
 *     &lt;enumeration value="DPA"/&gt;
 *     &lt;enumeration value="EFP"/&gt;
 *     &lt;enumeration value="EYP"/&gt;
 *     &lt;enumeration value="FPN"/&gt;
 *     &lt;enumeration value="FPR"/&gt;
 *     &lt;enumeration value="FSU"/&gt;
 *     &lt;enumeration value="LAR"/&gt;
 *     &lt;enumeration value="LU"/&gt;
 *     &lt;enumeration value="MPA"/&gt;
 *     &lt;enumeration value="PA"/&gt;
 *     &lt;enumeration value="PBP"/&gt;
 *     &lt;enumeration value="PFP"/&gt;
 *     &lt;enumeration value="PL"/&gt;
 *     &lt;enumeration value="PPA"/&gt;
 *     &lt;enumeration value="PST"/&gt;
 *     &lt;enumeration value="RF"/&gt;
 *     &lt;enumeration value="RG"/&gt;
 *     &lt;enumeration value="RGF"/&gt;
 *     &lt;enumeration value="RO"/&gt;
 *     &lt;enumeration value="RR"/&gt;
 *     &lt;enumeration value="SCA"/&gt;
 *     &lt;enumeration value="SCB"/&gt;
 *     &lt;enumeration value="SCC"/&gt;
 *     &lt;enumeration value="SFA"/&gt;
 *     &lt;enumeration value="SPP"/&gt;
 *     &lt;enumeration value="STR"/&gt;
 *     &lt;enumeration value="SW"/&gt;
 *     &lt;enumeration value="TE"/&gt;
 *     &lt;enumeration value="TP"/&gt;
 *     &lt;enumeration value="TS"/&gt;
 *     &lt;enumeration value="TSU"/&gt;
 *     &lt;enumeration value="UL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "E8053-EquipmentQualifier")
@XmlEnum
public enum E8053EquipmentQualifier {

    AA,
    AB,
    AD,
    AE,
    BL,
    BPN,
    BPY,
    BR,
    BX,
    CH,
    CN,
    DPA,
    EFP,
    EYP,
    FPN,
    FPR,
    FSU,
    LAR,
    LU,
    MPA,
    PA,
    PBP,
    PFP,
    PL,
    PPA,
    PST,
    RF,
    RG,
    RGF,
    RO,
    RR,
    SCA,
    SCB,
    SCC,
    SFA,
    SPP,
    STR,
    SW,
    TE,
    TP,
    TS,
    TSU,
    UL;

    public String value() {
        return name();
    }

    public static E8053EquipmentQualifier fromValue(String v) {
        return valueOf(v);
    }

}
