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
 * <p>Java class for E4455-BackOrderCoded.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="E4455-BackOrderCoded"&gt;
 *   &lt;restriction base="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}alpha0-3"&gt;
 *     &lt;enumeration value="B"/&gt;
 *     &lt;enumeration value="F"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *     &lt;enumeration value="W"/&gt;
 *     &lt;enumeration value="Y"/&gt;
 *     &lt;enumeration value="ZZZ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "E4455-BackOrderCoded")
@XmlEnum
public enum E4455BackOrderCoded {

    B,
    F,
    N,
    W,
    Y,
    ZZZ;

    public String value() {
        return name();
    }

    public static E4455BackOrderCoded fromValue(String v) {
        return valueOf(v);
    }

}