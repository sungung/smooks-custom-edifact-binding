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
 * <p>Java class for E5213-SubLinePriceChangeCoded.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="E5213-SubLinePriceChangeCoded"&gt;
 *   &lt;restriction base="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}alpha0-3"&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="I"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "E5213-SubLinePriceChangeCoded")
@XmlEnum
public enum E5213SubLinePriceChangeCoded {

    A,
    I,
    S;

    public String value() {
        return name();
    }

    public static E5213SubLinePriceChangeCoded fromValue(String v) {
        return valueOf(v);
    }

}
