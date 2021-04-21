//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.21 at 01:57:40 PM AEST 
//


package com.sungung.edi.binding.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for S003-InterchangeRecipient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S003-InterchangeRecipient"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E0010" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}E0010-InterchangeRecipientIdentification"/&gt;
 *         &lt;element name="E0007" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}E0007-IdentificationCodeQualifier" minOccurs="0"/&gt;
 *         &lt;element name="E0014" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}E0014-InterchangeRecipientInternalIdentification" minOccurs="0"/&gt;
 *         &lt;element name="E0046" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}E0046-InterchangeRecipientInternalSubIdentification" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S003-InterchangeRecipient", propOrder = {
    "e0010",
    "e0007",
    "e0014",
    "e0046"
})
public class S003InterchangeRecipient {

    @XmlElement(name = "E0010", required = true)
    protected String e0010;
    @XmlElement(name = "E0007")
    protected String e0007;
    @XmlElement(name = "E0014")
    protected String e0014;
    @XmlElement(name = "E0046")
    protected String e0046;

    /**
     * Gets the value of the e0010 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE0010() {
        return e0010;
    }

    /**
     * Sets the value of the e0010 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE0010(String value) {
        this.e0010 = value;
    }

    /**
     * Gets the value of the e0007 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE0007() {
        return e0007;
    }

    /**
     * Sets the value of the e0007 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE0007(String value) {
        this.e0007 = value;
    }

    /**
     * Gets the value of the e0014 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE0014() {
        return e0014;
    }

    /**
     * Sets the value of the e0014 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE0014(String value) {
        this.e0014 = value;
    }

    /**
     * Gets the value of the e0046 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE0046() {
        return e0046;
    }

    /**
     * Sets the value of the e0046 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE0046(String value) {
        this.e0046 = value;
    }

    public S003InterchangeRecipient withE0010(String value) {
        setE0010(value);
        return this;
    }

    public S003InterchangeRecipient withE0007(String value) {
        setE0007(value);
        return this;
    }

    public S003InterchangeRecipient withE0014(String value) {
        setE0014(value);
        return this;
    }

    public S003InterchangeRecipient withE0046(String value) {
        setE0046(value);
        return this;
    }

}
