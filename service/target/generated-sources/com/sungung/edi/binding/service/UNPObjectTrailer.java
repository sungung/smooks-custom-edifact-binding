//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.21 at 01:57:35 PM AEST 
//


package com.sungung.edi.binding.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UNP-ObjectTrailer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UNP-ObjectTrailer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E0810" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}E0810-LengthOfObjectInOctetsOfBits"/&gt;
 *         &lt;element name="E0800" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}E0800-PackageReferenceNumber"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UNP-ObjectTrailer", propOrder = {
    "e0810",
    "e0800"
})
public class UNPObjectTrailer {

    @XmlElement(name = "E0810", required = true)
    protected BigDecimal e0810;
    @XmlElement(name = "E0800", required = true)
    protected String e0800;

    /**
     * Gets the value of the e0810 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getE0810() {
        return e0810;
    }

    /**
     * Sets the value of the e0810 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setE0810(BigDecimal value) {
        this.e0810 = value;
    }

    /**
     * Gets the value of the e0800 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE0800() {
        return e0800;
    }

    /**
     * Sets the value of the e0800 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE0800(String value) {
        this.e0800 = value;
    }

    public UNPObjectTrailer withE0810(BigDecimal value) {
        setE0810(value);
        return this;
    }

    public UNPObjectTrailer withE0800(String value) {
        setE0800(value);
        return this;
    }

}
