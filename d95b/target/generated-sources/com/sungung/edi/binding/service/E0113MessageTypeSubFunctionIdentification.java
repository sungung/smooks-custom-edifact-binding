//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.21 at 01:57:40 PM AEST 
//


package com.sungung.edi.binding.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for E0113-MessageTypeSubFunctionIdentification.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="E0113-MessageTypeSubFunctionIdentification"&gt;
 *   &lt;restriction base="{http://www.ibm.com/dfdl/edi/un/service/4.1}alpha0-6"&gt;
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
 *     &lt;enumeration value="AP"/&gt;
 *     &lt;enumeration value="AQ"/&gt;
 *     &lt;enumeration value="AR"/&gt;
 *     &lt;enumeration value="AS"/&gt;
 *     &lt;enumeration value="SECACK"/&gt;
 *     &lt;enumeration value="SECAUT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "E0113-MessageTypeSubFunctionIdentification")
@XmlEnum
public enum E0113MessageTypeSubFunctionIdentification {

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
    AP,
    AQ,
    AR,
    AS,
    SECACK,
    SECAUT;

    public String value() {
        return name();
    }

    public static E0113MessageTypeSubFunctionIdentification fromValue(String v) {
        return valueOf(v);
    }

}
