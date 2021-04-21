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
 * <p>Java class for UST-SecurityTrailer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UST-SecurityTrailer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E0534" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}E0534-SecurityReferenceNumber"/&gt;
 *         &lt;element name="E0588" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}E0588-NumberOfSecuritySegments"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UST-SecurityTrailer", propOrder = {
    "e0534",
    "e0588"
})
public class USTSecurityTrailer {

    @XmlElement(name = "E0534", required = true)
    protected String e0534;
    @XmlElement(name = "E0588", required = true)
    protected BigDecimal e0588;

    /**
     * Gets the value of the e0534 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE0534() {
        return e0534;
    }

    /**
     * Sets the value of the e0534 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE0534(String value) {
        this.e0534 = value;
    }

    /**
     * Gets the value of the e0588 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getE0588() {
        return e0588;
    }

    /**
     * Sets the value of the e0588 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setE0588(BigDecimal value) {
        this.e0588 = value;
    }

    public USTSecurityTrailer withE0534(String value) {
        setE0534(value);
        return this;
    }

    public USTSecurityTrailer withE0588(BigDecimal value) {
        setE0588(value);
        return this;
    }

}
