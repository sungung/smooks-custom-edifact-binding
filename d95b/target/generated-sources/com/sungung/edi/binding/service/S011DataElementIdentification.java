//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.21 at 01:57:40 PM AEST 
//


package com.sungung.edi.binding.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for S011-DataElementIdentification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S011-DataElementIdentification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E0098" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}E0098-ErroneousDataElementPositionInSegment"/&gt;
 *         &lt;element name="E0104" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}E0104-ErroneousComponentDataElementPosition" minOccurs="0"/&gt;
 *         &lt;element name="E0136" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}E0136-ErroneousDataElementOccurrence" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S011-DataElementIdentification", propOrder = {
    "e0098",
    "e0104",
    "e0136"
})
public class S011DataElementIdentification {

    @XmlElement(name = "E0098", required = true)
    protected BigDecimal e0098;
    @XmlElement(name = "E0104")
    protected BigDecimal e0104;
    @XmlElement(name = "E0136")
    protected BigDecimal e0136;

    /**
     * Gets the value of the e0098 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getE0098() {
        return e0098;
    }

    /**
     * Sets the value of the e0098 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setE0098(BigDecimal value) {
        this.e0098 = value;
    }

    /**
     * Gets the value of the e0104 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getE0104() {
        return e0104;
    }

    /**
     * Sets the value of the e0104 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setE0104(BigDecimal value) {
        this.e0104 = value;
    }

    /**
     * Gets the value of the e0136 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getE0136() {
        return e0136;
    }

    /**
     * Sets the value of the e0136 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setE0136(BigDecimal value) {
        this.e0136 = value;
    }

    public S011DataElementIdentification withE0098(BigDecimal value) {
        setE0098(value);
        return this;
    }

    public S011DataElementIdentification withE0104(BigDecimal value) {
        setE0104(value);
        return this;
    }

    public S011DataElementIdentification withE0136(BigDecimal value) {
        setE0136(value);
        return this;
    }

}