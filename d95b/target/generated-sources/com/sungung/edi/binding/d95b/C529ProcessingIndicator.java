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
 * <p>Java class for C529-ProcessingIndicator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="C529-ProcessingIndicator"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E7365" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E7365-ProcessingIndicatorCoded"/&gt;
 *         &lt;element name="E1131" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E1131-CodeListQualifier" minOccurs="0"/&gt;
 *         &lt;element name="E3055" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E3055-CodeListResponsibleAgencyCoded" minOccurs="0"/&gt;
 *         &lt;element name="E7187" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E7187-ProcessTypeIdentification" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "C529-ProcessingIndicator", propOrder = {
    "e7365",
    "e1131",
    "e3055",
    "e7187"
})
public class C529ProcessingIndicator {

    @XmlElement(name = "E7365", required = true)
    protected String e7365;
    @XmlElement(name = "E1131")
    protected String e1131;
    @XmlElement(name = "E3055")
    protected String e3055;
    @XmlElement(name = "E7187")
    protected String e7187;

    /**
     * Gets the value of the e7365 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE7365() {
        return e7365;
    }

    /**
     * Sets the value of the e7365 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE7365(String value) {
        this.e7365 = value;
    }

    /**
     * Gets the value of the e1131 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE1131() {
        return e1131;
    }

    /**
     * Sets the value of the e1131 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE1131(String value) {
        this.e1131 = value;
    }

    /**
     * Gets the value of the e3055 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE3055() {
        return e3055;
    }

    /**
     * Sets the value of the e3055 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE3055(String value) {
        this.e3055 = value;
    }

    /**
     * Gets the value of the e7187 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE7187() {
        return e7187;
    }

    /**
     * Sets the value of the e7187 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE7187(String value) {
        this.e7187 = value;
    }

    public C529ProcessingIndicator withE7365(String value) {
        setE7365(value);
        return this;
    }

    public C529ProcessingIndicator withE1131(String value) {
        setE1131(value);
        return this;
    }

    public C529ProcessingIndicator withE3055(String value) {
        setE3055(value);
        return this;
    }

    public C529ProcessingIndicator withE7187(String value) {
        setE7187(value);
        return this;
    }

}
