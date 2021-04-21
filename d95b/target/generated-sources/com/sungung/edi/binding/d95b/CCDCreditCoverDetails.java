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
 * <p>Java class for CCD-CreditCoverDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCD-CreditCoverDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E4505" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E4505-CreditCoverRequestCoded" minOccurs="0"/&gt;
 *         &lt;element name="E4507" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E4507-CreditCoverResponseCoded" minOccurs="0"/&gt;
 *         &lt;element name="E4509" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E4509-CreditCoverReasonCoded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCD-CreditCoverDetails", propOrder = {
    "e4505",
    "e4507",
    "e4509"
})
public class CCDCreditCoverDetails {

    @XmlElement(name = "E4505")
    protected String e4505;
    @XmlElement(name = "E4507")
    protected String e4507;
    @XmlElement(name = "E4509")
    protected String e4509;

    /**
     * Gets the value of the e4505 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE4505() {
        return e4505;
    }

    /**
     * Sets the value of the e4505 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE4505(String value) {
        this.e4505 = value;
    }

    /**
     * Gets the value of the e4507 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE4507() {
        return e4507;
    }

    /**
     * Sets the value of the e4507 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE4507(String value) {
        this.e4507 = value;
    }

    /**
     * Gets the value of the e4509 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE4509() {
        return e4509;
    }

    /**
     * Sets the value of the e4509 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE4509(String value) {
        this.e4509 = value;
    }

    public CCDCreditCoverDetails withE4505(String value) {
        setE4505(value);
        return this;
    }

    public CCDCreditCoverDetails withE4507(String value) {
        setE4507(value);
        return this;
    }

    public CCDCreditCoverDetails withE4509(String value) {
        setE4509(value);
        return this;
    }

}