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
 * <p>Java class for C219-MovementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="C219-MovementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E8335" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E8335-MovementTypeCoded" minOccurs="0"/&gt;
 *         &lt;element name="E8334" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E8334-MovementType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "C219-MovementType", propOrder = {
    "e8335",
    "e8334"
})
public class C219MovementType {

    @XmlElement(name = "E8335")
    protected String e8335;
    @XmlElement(name = "E8334")
    protected String e8334;

    /**
     * Gets the value of the e8335 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE8335() {
        return e8335;
    }

    /**
     * Sets the value of the e8335 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE8335(String value) {
        this.e8335 = value;
    }

    /**
     * Gets the value of the e8334 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE8334() {
        return e8334;
    }

    /**
     * Sets the value of the e8334 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE8334(String value) {
        this.e8334 = value;
    }

    public C219MovementType withE8335(String value) {
        setE8335(value);
        return this;
    }

    public C219MovementType withE8334(String value) {
        setE8334(value);
        return this;
    }

}
