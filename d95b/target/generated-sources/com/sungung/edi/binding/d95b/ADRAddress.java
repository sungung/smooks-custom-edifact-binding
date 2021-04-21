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
 * <p>Java class for ADR-Address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ADR-Address"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="C817" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}C817-AddressUsage" minOccurs="0"/&gt;
 *         &lt;element name="C090" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}C090-AddressDetails" minOccurs="0"/&gt;
 *         &lt;element name="E3164" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E3164-CityName" minOccurs="0"/&gt;
 *         &lt;element name="E3251" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E3251-PostcodeIdentification" minOccurs="0"/&gt;
 *         &lt;element name="E3207" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E3207-CountryCoded" minOccurs="0"/&gt;
 *         &lt;element name="C819" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}C819-CountrySubEntityDetails" minOccurs="0"/&gt;
 *         &lt;element name="C517" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}C517-LocationIdentification" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ADR-Address", propOrder = {
    "c817",
    "c090",
    "e3164",
    "e3251",
    "e3207",
    "c819",
    "c517"
})
public class ADRAddress {

    @XmlElement(name = "C817")
    protected C817AddressUsage c817;
    @XmlElement(name = "C090")
    protected C090AddressDetails c090;
    @XmlElement(name = "E3164")
    protected String e3164;
    @XmlElement(name = "E3251")
    protected String e3251;
    @XmlElement(name = "E3207")
    protected String e3207;
    @XmlElement(name = "C819")
    protected C819CountrySubEntityDetails c819;
    @XmlElement(name = "C517")
    protected C517LocationIdentification c517;

    /**
     * Gets the value of the c817 property.
     * 
     * @return
     *     possible object is
     *     {@link C817AddressUsage }
     *     
     */
    public C817AddressUsage getC817() {
        return c817;
    }

    /**
     * Sets the value of the c817 property.
     * 
     * @param value
     *     allowed object is
     *     {@link C817AddressUsage }
     *     
     */
    public void setC817(C817AddressUsage value) {
        this.c817 = value;
    }

    /**
     * Gets the value of the c090 property.
     * 
     * @return
     *     possible object is
     *     {@link C090AddressDetails }
     *     
     */
    public C090AddressDetails getC090() {
        return c090;
    }

    /**
     * Sets the value of the c090 property.
     * 
     * @param value
     *     allowed object is
     *     {@link C090AddressDetails }
     *     
     */
    public void setC090(C090AddressDetails value) {
        this.c090 = value;
    }

    /**
     * Gets the value of the e3164 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE3164() {
        return e3164;
    }

    /**
     * Sets the value of the e3164 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE3164(String value) {
        this.e3164 = value;
    }

    /**
     * Gets the value of the e3251 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE3251() {
        return e3251;
    }

    /**
     * Sets the value of the e3251 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE3251(String value) {
        this.e3251 = value;
    }

    /**
     * Gets the value of the e3207 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE3207() {
        return e3207;
    }

    /**
     * Sets the value of the e3207 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE3207(String value) {
        this.e3207 = value;
    }

    /**
     * Gets the value of the c819 property.
     * 
     * @return
     *     possible object is
     *     {@link C819CountrySubEntityDetails }
     *     
     */
    public C819CountrySubEntityDetails getC819() {
        return c819;
    }

    /**
     * Sets the value of the c819 property.
     * 
     * @param value
     *     allowed object is
     *     {@link C819CountrySubEntityDetails }
     *     
     */
    public void setC819(C819CountrySubEntityDetails value) {
        this.c819 = value;
    }

    /**
     * Gets the value of the c517 property.
     * 
     * @return
     *     possible object is
     *     {@link C517LocationIdentification }
     *     
     */
    public C517LocationIdentification getC517() {
        return c517;
    }

    /**
     * Sets the value of the c517 property.
     * 
     * @param value
     *     allowed object is
     *     {@link C517LocationIdentification }
     *     
     */
    public void setC517(C517LocationIdentification value) {
        this.c517 = value;
    }

    public ADRAddress withC817(C817AddressUsage value) {
        setC817(value);
        return this;
    }

    public ADRAddress withC090(C090AddressDetails value) {
        setC090(value);
        return this;
    }

    public ADRAddress withE3164(String value) {
        setE3164(value);
        return this;
    }

    public ADRAddress withE3251(String value) {
        setE3251(value);
        return this;
    }

    public ADRAddress withE3207(String value) {
        setE3207(value);
        return this;
    }

    public ADRAddress withC819(C819CountrySubEntityDetails value) {
        setC819(value);
        return this;
    }

    public ADRAddress withC517(C517LocationIdentification value) {
        setC517(value);
        return this;
    }

}
