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
 * <p>Java class for USB-SecuredDataIdentification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USB-SecuredDataIdentification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E0503" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}E0503-ResponseTypeCoded"/&gt;
 *         &lt;element name="S501" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}S501-SecurityDateAndTime" minOccurs="0"/&gt;
 *         &lt;element name="S002" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}S002-InterchangeSender"/&gt;
 *         &lt;element name="S003" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}S003-InterchangeRecipient"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "USB-SecuredDataIdentification", propOrder = {
    "e0503",
    "s501",
    "s002",
    "s003"
})
public class USBSecuredDataIdentification {

    @XmlElement(name = "E0503", required = true)
    protected String e0503;
    @XmlElement(name = "S501")
    protected S501SecurityDateAndTime s501;
    @XmlElement(name = "S002", required = true)
    protected S002InterchangeSender s002;
    @XmlElement(name = "S003", required = true)
    protected S003InterchangeRecipient s003;

    /**
     * Gets the value of the e0503 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE0503() {
        return e0503;
    }

    /**
     * Sets the value of the e0503 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE0503(String value) {
        this.e0503 = value;
    }

    /**
     * Gets the value of the s501 property.
     * 
     * @return
     *     possible object is
     *     {@link S501SecurityDateAndTime }
     *     
     */
    public S501SecurityDateAndTime getS501() {
        return s501;
    }

    /**
     * Sets the value of the s501 property.
     * 
     * @param value
     *     allowed object is
     *     {@link S501SecurityDateAndTime }
     *     
     */
    public void setS501(S501SecurityDateAndTime value) {
        this.s501 = value;
    }

    /**
     * Gets the value of the s002 property.
     * 
     * @return
     *     possible object is
     *     {@link S002InterchangeSender }
     *     
     */
    public S002InterchangeSender getS002() {
        return s002;
    }

    /**
     * Sets the value of the s002 property.
     * 
     * @param value
     *     allowed object is
     *     {@link S002InterchangeSender }
     *     
     */
    public void setS002(S002InterchangeSender value) {
        this.s002 = value;
    }

    /**
     * Gets the value of the s003 property.
     * 
     * @return
     *     possible object is
     *     {@link S003InterchangeRecipient }
     *     
     */
    public S003InterchangeRecipient getS003() {
        return s003;
    }

    /**
     * Sets the value of the s003 property.
     * 
     * @param value
     *     allowed object is
     *     {@link S003InterchangeRecipient }
     *     
     */
    public void setS003(S003InterchangeRecipient value) {
        this.s003 = value;
    }

    public USBSecuredDataIdentification withE0503(String value) {
        setE0503(value);
        return this;
    }

    public USBSecuredDataIdentification withS501(S501SecurityDateAndTime value) {
        setS501(value);
        return this;
    }

    public USBSecuredDataIdentification withS002(S002InterchangeSender value) {
        setS002(value);
        return this;
    }

    public USBSecuredDataIdentification withS003(S003InterchangeRecipient value) {
        setS003(value);
        return this;
    }

}