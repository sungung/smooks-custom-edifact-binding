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
 * <p>Java class for ATT-Attribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ATT-Attribute"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E9017" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E9017-AttributeFunctionQualifier"/&gt;
 *         &lt;element name="C955" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}C955-AttributeType" minOccurs="0"/&gt;
 *         &lt;element name="C956" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}C956-AttributeDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATT-Attribute", propOrder = {
    "e9017",
    "c955",
    "c956"
})
public class ATTAttribute {

    @XmlElement(name = "E9017", required = true)
    protected String e9017;
    @XmlElement(name = "C955")
    protected C955AttributeType c955;
    @XmlElement(name = "C956")
    protected C956AttributeDetails c956;

    /**
     * Gets the value of the e9017 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE9017() {
        return e9017;
    }

    /**
     * Sets the value of the e9017 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE9017(String value) {
        this.e9017 = value;
    }

    /**
     * Gets the value of the c955 property.
     * 
     * @return
     *     possible object is
     *     {@link C955AttributeType }
     *     
     */
    public C955AttributeType getC955() {
        return c955;
    }

    /**
     * Sets the value of the c955 property.
     * 
     * @param value
     *     allowed object is
     *     {@link C955AttributeType }
     *     
     */
    public void setC955(C955AttributeType value) {
        this.c955 = value;
    }

    /**
     * Gets the value of the c956 property.
     * 
     * @return
     *     possible object is
     *     {@link C956AttributeDetails }
     *     
     */
    public C956AttributeDetails getC956() {
        return c956;
    }

    /**
     * Sets the value of the c956 property.
     * 
     * @param value
     *     allowed object is
     *     {@link C956AttributeDetails }
     *     
     */
    public void setC956(C956AttributeDetails value) {
        this.c956 = value;
    }

    public ATTAttribute withE9017(String value) {
        setE9017(value);
        return this;
    }

    public ATTAttribute withC955(C955AttributeType value) {
        setC955(value);
        return this;
    }

    public ATTAttribute withC956(C956AttributeDetails value) {
        setC956(value);
        return this;
    }

}