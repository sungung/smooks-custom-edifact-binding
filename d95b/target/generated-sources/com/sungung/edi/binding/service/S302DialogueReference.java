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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for S302-DialogueReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S302-DialogueReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E0300" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}E0300-InitiatorControlReference"/&gt;
 *         &lt;element name="E0303" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}E0303-InitiatorReferenceIdentification" minOccurs="0"/&gt;
 *         &lt;element name="E0051" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}E0051-ControllingAgencyCoded" minOccurs="0"/&gt;
 *         &lt;element name="E0304" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}E0304-ResponderControlReference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S302-DialogueReference", propOrder = {
    "e0300",
    "e0303",
    "e0051",
    "e0304"
})
public class S302DialogueReference {

    @XmlElement(name = "E0300", required = true)
    protected String e0300;
    @XmlElement(name = "E0303")
    protected String e0303;
    @XmlElement(name = "E0051")
    @XmlSchemaType(name = "string")
    protected E0051ControllingAgencyCoded e0051;
    @XmlElement(name = "E0304")
    protected String e0304;

    /**
     * Gets the value of the e0300 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE0300() {
        return e0300;
    }

    /**
     * Sets the value of the e0300 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE0300(String value) {
        this.e0300 = value;
    }

    /**
     * Gets the value of the e0303 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE0303() {
        return e0303;
    }

    /**
     * Sets the value of the e0303 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE0303(String value) {
        this.e0303 = value;
    }

    /**
     * Gets the value of the e0051 property.
     * 
     * @return
     *     possible object is
     *     {@link E0051ControllingAgencyCoded }
     *     
     */
    public E0051ControllingAgencyCoded getE0051() {
        return e0051;
    }

    /**
     * Sets the value of the e0051 property.
     * 
     * @param value
     *     allowed object is
     *     {@link E0051ControllingAgencyCoded }
     *     
     */
    public void setE0051(E0051ControllingAgencyCoded value) {
        this.e0051 = value;
    }

    /**
     * Gets the value of the e0304 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE0304() {
        return e0304;
    }

    /**
     * Sets the value of the e0304 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE0304(String value) {
        this.e0304 = value;
    }

    public S302DialogueReference withE0300(String value) {
        setE0300(value);
        return this;
    }

    public S302DialogueReference withE0303(String value) {
        setE0303(value);
        return this;
    }

    public S302DialogueReference withE0051(E0051ControllingAgencyCoded value) {
        setE0051(value);
        return this;
    }

    public S302DialogueReference withE0304(String value) {
        setE0304(value);
        return this;
    }

}
