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
 * <p>Java class for E0001-SyntaxIdentifier.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="E0001-SyntaxIdentifier"&gt;
 *   &lt;restriction base="{http://www.ibm.com/dfdl/edi/un/service/4.1}alpha4"&gt;
 *     &lt;enumeration value="UNOA"/&gt;
 *     &lt;enumeration value="UNOB"/&gt;
 *     &lt;enumeration value="UNOC"/&gt;
 *     &lt;enumeration value="UNOD"/&gt;
 *     &lt;enumeration value="UNOE"/&gt;
 *     &lt;enumeration value="UNOF"/&gt;
 *     &lt;enumeration value="UNOG"/&gt;
 *     &lt;enumeration value="UNOH"/&gt;
 *     &lt;enumeration value="UNOI"/&gt;
 *     &lt;enumeration value="UNOJ"/&gt;
 *     &lt;enumeration value="UNOK"/&gt;
 *     &lt;enumeration value="UNOL"/&gt;
 *     &lt;enumeration value="UNOW"/&gt;
 *     &lt;enumeration value="UNOX"/&gt;
 *     &lt;enumeration value="UNOY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "E0001-SyntaxIdentifier")
@XmlEnum
public enum E0001SyntaxIdentifier {

    UNOA,
    UNOB,
    UNOC,
    UNOD,
    UNOE,
    UNOF,
    UNOG,
    UNOH,
    UNOI,
    UNOJ,
    UNOK,
    UNOL,
    UNOW,
    UNOX,
    UNOY;

    public String value() {
        return name();
    }

    public static E0001SyntaxIdentifier fromValue(String v) {
        return valueOf(v);
    }

}