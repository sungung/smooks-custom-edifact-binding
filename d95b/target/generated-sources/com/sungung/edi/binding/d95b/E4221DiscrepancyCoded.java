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
 * <p>Java class for E4221-DiscrepancyCoded.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="E4221-DiscrepancyCoded"&gt;
 *   &lt;restriction base="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}alpha0-3"&gt;
 *     &lt;enumeration value="AN"/&gt;
 *     &lt;enumeration value="AS"/&gt;
 *     &lt;enumeration value="BK"/&gt;
 *     &lt;enumeration value="BP"/&gt;
 *     &lt;enumeration value="CA"/&gt;
 *     &lt;enumeration value="CC"/&gt;
 *     &lt;enumeration value="CE"/&gt;
 *     &lt;enumeration value="CI"/&gt;
 *     &lt;enumeration value="CK"/&gt;
 *     &lt;enumeration value="CM"/&gt;
 *     &lt;enumeration value="CN"/&gt;
 *     &lt;enumeration value="CO"/&gt;
 *     &lt;enumeration value="CP"/&gt;
 *     &lt;enumeration value="CS"/&gt;
 *     &lt;enumeration value="IC"/&gt;
 *     &lt;enumeration value="IS"/&gt;
 *     &lt;enumeration value="LS"/&gt;
 *     &lt;enumeration value="NF"/&gt;
 *     &lt;enumeration value="NN"/&gt;
 *     &lt;enumeration value="NS"/&gt;
 *     &lt;enumeration value="OF"/&gt;
 *     &lt;enumeration value="OM"/&gt;
 *     &lt;enumeration value="OP"/&gt;
 *     &lt;enumeration value="OS"/&gt;
 *     &lt;enumeration value="OW"/&gt;
 *     &lt;enumeration value="PA"/&gt;
 *     &lt;enumeration value="PD"/&gt;
 *     &lt;enumeration value="PI"/&gt;
 *     &lt;enumeration value="PK"/&gt;
 *     &lt;enumeration value="PN"/&gt;
 *     &lt;enumeration value="PO"/&gt;
 *     &lt;enumeration value="PP"/&gt;
 *     &lt;enumeration value="PS"/&gt;
 *     &lt;enumeration value="RA"/&gt;
 *     &lt;enumeration value="SL"/&gt;
 *     &lt;enumeration value="SP"/&gt;
 *     &lt;enumeration value="SS"/&gt;
 *     &lt;enumeration value="TW"/&gt;
 *     &lt;enumeration value="UR"/&gt;
 *     &lt;enumeration value="ZZZ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "E4221-DiscrepancyCoded")
@XmlEnum
public enum E4221DiscrepancyCoded {

    AN,
    AS,
    BK,
    BP,
    CA,
    CC,
    CE,
    CI,
    CK,
    CM,
    CN,
    CO,
    CP,
    CS,
    IC,
    IS,
    LS,
    NF,
    NN,
    NS,
    OF,
    OM,
    OP,
    OS,
    OW,
    PA,
    PD,
    PI,
    PK,
    PN,
    PO,
    PP,
    PS,
    RA,
    SL,
    SP,
    SS,
    TW,
    UR,
    ZZZ;

    public String value() {
        return name();
    }

    public static E4221DiscrepancyCoded fromValue(String v) {
        return valueOf(v);
    }

}