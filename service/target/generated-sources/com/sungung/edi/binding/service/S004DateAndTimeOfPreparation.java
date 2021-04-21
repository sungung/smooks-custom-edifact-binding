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
 * <p>Java class for S004-DateAndTimeOfPreparation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S004-DateAndTimeOfPreparation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E0017" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}E0017-Date"/&gt;
 *         &lt;element name="E0019" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}E0019-Time"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S004-DateAndTimeOfPreparation", propOrder = {
    "e0017",
    "e0019"
})
public class S004DateAndTimeOfPreparation {

    @XmlElement(name = "E0017", required = true)
    protected BigDecimal e0017;
    @XmlElement(name = "E0019", required = true)
    protected BigDecimal e0019;

    /**
     * Gets the value of the e0017 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getE0017() {
        return e0017;
    }

    /**
     * Sets the value of the e0017 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setE0017(BigDecimal value) {
        this.e0017 = value;
    }

    /**
     * Gets the value of the e0019 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getE0019() {
        return e0019;
    }

    /**
     * Sets the value of the e0019 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setE0019(BigDecimal value) {
        this.e0019 = value;
    }

    public S004DateAndTimeOfPreparation withE0017(BigDecimal value) {
        setE0017(value);
        return this;
    }

    public S004DateAndTimeOfPreparation withE0019(BigDecimal value) {
        setE0019(value);
        return this;
    }

}