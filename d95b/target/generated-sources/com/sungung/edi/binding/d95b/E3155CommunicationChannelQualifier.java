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
 * <p>Java class for E3155-CommunicationChannelQualifier.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="E3155-CommunicationChannelQualifier"&gt;
 *   &lt;restriction base="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}alpha0-3"&gt;
 *     &lt;enumeration value="AA"/&gt;
 *     &lt;enumeration value="AB"/&gt;
 *     &lt;enumeration value="AC"/&gt;
 *     &lt;enumeration value="AD"/&gt;
 *     &lt;enumeration value="AE"/&gt;
 *     &lt;enumeration value="CA"/&gt;
 *     &lt;enumeration value="EI"/&gt;
 *     &lt;enumeration value="EM"/&gt;
 *     &lt;enumeration value="EX"/&gt;
 *     &lt;enumeration value="FT"/&gt;
 *     &lt;enumeration value="FX"/&gt;
 *     &lt;enumeration value="GM"/&gt;
 *     &lt;enumeration value="IE"/&gt;
 *     &lt;enumeration value="IM"/&gt;
 *     &lt;enumeration value="MA"/&gt;
 *     &lt;enumeration value="PB"/&gt;
 *     &lt;enumeration value="PS"/&gt;
 *     &lt;enumeration value="SW"/&gt;
 *     &lt;enumeration value="TE"/&gt;
 *     &lt;enumeration value="TG"/&gt;
 *     &lt;enumeration value="TL"/&gt;
 *     &lt;enumeration value="TM"/&gt;
 *     &lt;enumeration value="TT"/&gt;
 *     &lt;enumeration value="TX"/&gt;
 *     &lt;enumeration value="XF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "E3155-CommunicationChannelQualifier")
@XmlEnum
public enum E3155CommunicationChannelQualifier {

    AA,
    AB,
    AC,
    AD,
    AE,
    CA,
    EI,
    EM,
    EX,
    FT,
    FX,
    GM,
    IE,
    IM,
    MA,
    PB,
    PS,
    SW,
    TE,
    TG,
    TL,
    TM,
    TT,
    TX,
    XF;

    public String value() {
        return name();
    }

    public static E3155CommunicationChannelQualifier fromValue(String v) {
        return valueOf(v);
    }

}