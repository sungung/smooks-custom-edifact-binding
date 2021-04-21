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
 * <p>Java class for S303-TransactionReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S303-TransactionReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E0306" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}E0306-TransactionControlReference"/&gt;
 *         &lt;element name="E0303" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}E0303-InitiatorReferenceIdentification" minOccurs="0"/&gt;
 *         &lt;element name="E0051" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}E0051-ControllingAgencyCoded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S303-TransactionReference", propOrder = {
    "e0306",
    "e0303",
    "e0051"
})
public class S303TransactionReference {

    @XmlElement(name = "E0306", required = true)
    protected String e0306;
    @XmlElement(name = "E0303")
    protected String e0303;
    @XmlElement(name = "E0051")
    @XmlSchemaType(name = "string")
    protected E0051ControllingAgencyCoded e0051;

    /**
     * Gets the value of the e0306 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE0306() {
        return e0306;
    }

    /**
     * Sets the value of the e0306 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE0306(String value) {
        this.e0306 = value;
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

    public S303TransactionReference withE0306(String value) {
        setE0306(value);
        return this;
    }

    public S303TransactionReference withE0303(String value) {
        setE0303(value);
        return this;
    }

    public S303TransactionReference withE0051(E0051ControllingAgencyCoded value) {
        setE0051(value);
        return this;
    }

}
