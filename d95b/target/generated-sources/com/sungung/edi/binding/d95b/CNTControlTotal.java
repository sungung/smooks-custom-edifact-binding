//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.21 at 01:57:40 PM AEST 
//


package com.sungung.edi.binding.d95b;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CNT-ControlTotal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CNT-ControlTotal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="C270" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}C270-Control"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CNT-ControlTotal", propOrder = {
    "c270"
})
public class CNTControlTotal {

    @XmlElement(name = "C270", required = true)
    protected C270Control c270;

    /**
     * Gets the value of the c270 property.
     * 
     * @return
     *     possible object is
     *     {@link C270Control }
     *     
     */
    public C270Control getC270() {
        return c270;
    }

    /**
     * Sets the value of the c270 property.
     * 
     * @param value
     *     allowed object is
     *     {@link C270Control }
     *     
     */
    public void setC270(C270Control value) {
        this.c270 = value;
    }

    public CNTControlTotal withC270(C270Control value) {
        setC270(value);
        return this;
    }

}