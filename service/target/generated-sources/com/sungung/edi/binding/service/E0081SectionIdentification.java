//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.21 at 01:57:35 PM AEST 
//


package com.sungung.edi.binding.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for E0081-SectionIdentification.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="E0081-SectionIdentification"&gt;
 *   &lt;restriction base="{http://www.ibm.com/dfdl/edi/un/service/4.1}alpha1"&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "E0081-SectionIdentification")
@XmlEnum
public enum E0081SectionIdentification {

    D,
    S;

    public String value() {
        return name();
    }

    public static E0081SectionIdentification fromValue(String v) {
        return valueOf(v);
    }

}
