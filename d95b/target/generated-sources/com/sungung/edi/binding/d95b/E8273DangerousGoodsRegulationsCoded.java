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
 * <p>Java class for E8273-DangerousGoodsRegulationsCoded.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="E8273-DangerousGoodsRegulationsCoded"&gt;
 *   &lt;restriction base="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}alpha0-3"&gt;
 *     &lt;enumeration value="ADR"/&gt;
 *     &lt;enumeration value="CFR"/&gt;
 *     &lt;enumeration value="ICA"/&gt;
 *     &lt;enumeration value="IMD"/&gt;
 *     &lt;enumeration value="RID"/&gt;
 *     &lt;enumeration value="TEC"/&gt;
 *     &lt;enumeration value="UI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "E8273-DangerousGoodsRegulationsCoded")
@XmlEnum
public enum E8273DangerousGoodsRegulationsCoded {

    ADR,
    CFR,
    ICA,
    IMD,
    RID,
    TEC,
    UI;

    public String value() {
        return name();
    }

    public static E8273DangerousGoodsRegulationsCoded fromValue(String v) {
        return valueOf(v);
    }

}