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
 * <p>Java class for C817-AddressUsage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="C817-AddressUsage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E3299" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E3299-AddressPurposeCoded" minOccurs="0"/&gt;
 *         &lt;element name="E3131" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E3131-AddressTypeCoded" minOccurs="0"/&gt;
 *         &lt;element name="E3474" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E3474-AddressStatusCoded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "C817-AddressUsage", propOrder = {
    "e3299",
    "e3131",
    "e3474"
})
public class C817AddressUsage {

    @XmlElement(name = "E3299")
    protected String e3299;
    @XmlElement(name = "E3131")
    protected String e3131;
    @XmlElement(name = "E3474")
    protected String e3474;

    /**
     * Gets the value of the e3299 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE3299() {
        return e3299;
    }

    /**
     * Sets the value of the e3299 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE3299(String value) {
        this.e3299 = value;
    }

    /**
     * Gets the value of the e3131 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE3131() {
        return e3131;
    }

    /**
     * Sets the value of the e3131 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE3131(String value) {
        this.e3131 = value;
    }

    /**
     * Gets the value of the e3474 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE3474() {
        return e3474;
    }

    /**
     * Sets the value of the e3474 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE3474(String value) {
        this.e3474 = value;
    }

    public C817AddressUsage withE3299(String value) {
        setE3299(value);
        return this;
    }

    public C817AddressUsage withE3131(String value) {
        setE3131(value);
        return this;
    }

    public C817AddressUsage withE3474(String value) {
        setE3474(value);
        return this;
    }

}
