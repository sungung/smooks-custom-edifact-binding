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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for C206-IdentificationNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="C206-IdentificationNumber"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E7402" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E7402-IdentityNumber"/&gt;
 *         &lt;element name="E7405" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E7405-IdentityNumberQualifier" minOccurs="0"/&gt;
 *         &lt;element name="E4405" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E4405-StatusCoded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "C206-IdentificationNumber", propOrder = {
    "e7402",
    "e7405",
    "e4405"
})
public class C206IdentificationNumber {

    @XmlElement(name = "E7402", required = true)
    protected String e7402;
    @XmlElement(name = "E7405")
    @XmlSchemaType(name = "string")
    protected E7405IdentityNumberQualifier e7405;
    @XmlElement(name = "E4405")
    protected String e4405;

    /**
     * Gets the value of the e7402 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE7402() {
        return e7402;
    }

    /**
     * Sets the value of the e7402 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE7402(String value) {
        this.e7402 = value;
    }

    /**
     * Gets the value of the e7405 property.
     * 
     * @return
     *     possible object is
     *     {@link E7405IdentityNumberQualifier }
     *     
     */
    public E7405IdentityNumberQualifier getE7405() {
        return e7405;
    }

    /**
     * Sets the value of the e7405 property.
     * 
     * @param value
     *     allowed object is
     *     {@link E7405IdentityNumberQualifier }
     *     
     */
    public void setE7405(E7405IdentityNumberQualifier value) {
        this.e7405 = value;
    }

    /**
     * Gets the value of the e4405 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE4405() {
        return e4405;
    }

    /**
     * Sets the value of the e4405 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE4405(String value) {
        this.e4405 = value;
    }

    public C206IdentificationNumber withE7402(String value) {
        setE7402(value);
        return this;
    }

    public C206IdentificationNumber withE7405(E7405IdentityNumberQualifier value) {
        setE7405(value);
        return this;
    }

    public C206IdentificationNumber withE4405(String value) {
        setE4405(value);
        return this;
    }

}
