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
 * <p>Java class for E7143-ItemNumberTypeCoded.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="E7143-ItemNumberTypeCoded"&gt;
 *   &lt;restriction base="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}alpha0-3"&gt;
 *     &lt;enumeration value="AA"/&gt;
 *     &lt;enumeration value="AB"/&gt;
 *     &lt;enumeration value="AC"/&gt;
 *     &lt;enumeration value="AD"/&gt;
 *     &lt;enumeration value="AE"/&gt;
 *     &lt;enumeration value="AF"/&gt;
 *     &lt;enumeration value="AG"/&gt;
 *     &lt;enumeration value="AH"/&gt;
 *     &lt;enumeration value="AI"/&gt;
 *     &lt;enumeration value="AJ"/&gt;
 *     &lt;enumeration value="AK"/&gt;
 *     &lt;enumeration value="AL"/&gt;
 *     &lt;enumeration value="AM"/&gt;
 *     &lt;enumeration value="AN"/&gt;
 *     &lt;enumeration value="AO"/&gt;
 *     &lt;enumeration value="BO"/&gt;
 *     &lt;enumeration value="BP"/&gt;
 *     &lt;enumeration value="CC"/&gt;
 *     &lt;enumeration value="CG"/&gt;
 *     &lt;enumeration value="CL"/&gt;
 *     &lt;enumeration value="CR"/&gt;
 *     &lt;enumeration value="CV"/&gt;
 *     &lt;enumeration value="DR"/&gt;
 *     &lt;enumeration value="DW"/&gt;
 *     &lt;enumeration value="EC"/&gt;
 *     &lt;enumeration value="EF"/&gt;
 *     &lt;enumeration value="EN"/&gt;
 *     &lt;enumeration value="GS"/&gt;
 *     &lt;enumeration value="HS"/&gt;
 *     &lt;enumeration value="IB"/&gt;
 *     &lt;enumeration value="IN"/&gt;
 *     &lt;enumeration value="IS"/&gt;
 *     &lt;enumeration value="IT"/&gt;
 *     &lt;enumeration value="IZ"/&gt;
 *     &lt;enumeration value="MA"/&gt;
 *     &lt;enumeration value="MF"/&gt;
 *     &lt;enumeration value="MN"/&gt;
 *     &lt;enumeration value="MP"/&gt;
 *     &lt;enumeration value="NB"/&gt;
 *     &lt;enumeration value="ON"/&gt;
 *     &lt;enumeration value="PD"/&gt;
 *     &lt;enumeration value="PL"/&gt;
 *     &lt;enumeration value="PO"/&gt;
 *     &lt;enumeration value="PV"/&gt;
 *     &lt;enumeration value="QS"/&gt;
 *     &lt;enumeration value="RC"/&gt;
 *     &lt;enumeration value="RN"/&gt;
 *     &lt;enumeration value="RU"/&gt;
 *     &lt;enumeration value="RY"/&gt;
 *     &lt;enumeration value="SA"/&gt;
 *     &lt;enumeration value="SG"/&gt;
 *     &lt;enumeration value="SK"/&gt;
 *     &lt;enumeration value="SN"/&gt;
 *     &lt;enumeration value="SRS"/&gt;
 *     &lt;enumeration value="SS"/&gt;
 *     &lt;enumeration value="ST"/&gt;
 *     &lt;enumeration value="TG"/&gt;
 *     &lt;enumeration value="UA"/&gt;
 *     &lt;enumeration value="UP"/&gt;
 *     &lt;enumeration value="VN"/&gt;
 *     &lt;enumeration value="VP"/&gt;
 *     &lt;enumeration value="VS"/&gt;
 *     &lt;enumeration value="VX"/&gt;
 *     &lt;enumeration value="ZZZ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "E7143-ItemNumberTypeCoded")
@XmlEnum
public enum E7143ItemNumberTypeCoded {

    AA,
    AB,
    AC,
    AD,
    AE,
    AF,
    AG,
    AH,
    AI,
    AJ,
    AK,
    AL,
    AM,
    AN,
    AO,
    BO,
    BP,
    CC,
    CG,
    CL,
    CR,
    CV,
    DR,
    DW,
    EC,
    EF,
    EN,
    GS,
    HS,
    IB,
    IN,
    IS,
    IT,
    IZ,
    MA,
    MF,
    MN,
    MP,
    NB,
    ON,
    PD,
    PL,
    PO,
    PV,
    QS,
    RC,
    RN,
    RU,
    RY,
    SA,
    SG,
    SK,
    SN,
    SRS,
    SS,
    ST,
    TG,
    UA,
    UP,
    VN,
    VP,
    VS,
    VX,
    ZZZ;

    public String value() {
        return name();
    }

    public static E7143ItemNumberTypeCoded fromValue(String v) {
        return valueOf(v);
    }

}
