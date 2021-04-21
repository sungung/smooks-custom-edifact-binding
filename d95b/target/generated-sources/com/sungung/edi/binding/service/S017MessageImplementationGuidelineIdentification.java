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
 * <p>Java class for S017-MessageImplementationGuidelineIdentification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S017-MessageImplementationGuidelineIdentification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E0121" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}E0121-MessageImplementationGuidelineIdentification"/&gt;
 *         &lt;element name="E0122" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}E0122-MessageImplementationGuidelineVersionNumber" minOccurs="0"/&gt;
 *         &lt;element name="E0124" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}E0124-MessageImplementationGuidelineReleaseNumber" minOccurs="0"/&gt;
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
@XmlType(name = "S017-MessageImplementationGuidelineIdentification", propOrder = {
    "e0121",
    "e0122",
    "e0124",
    "e0051"
})
public class S017MessageImplementationGuidelineIdentification {

    @XmlElement(name = "E0121", required = true)
    protected String e0121;
    @XmlElement(name = "E0122")
    protected String e0122;
    @XmlElement(name = "E0124")
    protected String e0124;
    @XmlElement(name = "E0051")
    @XmlSchemaType(name = "string")
    protected E0051ControllingAgencyCoded e0051;

    /**
     * Gets the value of the e0121 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE0121() {
        return e0121;
    }

    /**
     * Sets the value of the e0121 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE0121(String value) {
        this.e0121 = value;
    }

    /**
     * Gets the value of the e0122 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE0122() {
        return e0122;
    }

    /**
     * Sets the value of the e0122 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE0122(String value) {
        this.e0122 = value;
    }

    /**
     * Gets the value of the e0124 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE0124() {
        return e0124;
    }

    /**
     * Sets the value of the e0124 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE0124(String value) {
        this.e0124 = value;
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

    public S017MessageImplementationGuidelineIdentification withE0121(String value) {
        setE0121(value);
        return this;
    }

    public S017MessageImplementationGuidelineIdentification withE0122(String value) {
        setE0122(value);
        return this;
    }

    public S017MessageImplementationGuidelineIdentification withE0124(String value) {
        setE0124(value);
        return this;
    }

    public S017MessageImplementationGuidelineIdentification withE0051(E0051ControllingAgencyCoded value) {
        setE0051(value);
        return this;
    }

}
