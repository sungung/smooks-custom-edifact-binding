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
 * <p>Java class for DIM-Dimensions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DIM-Dimensions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E6145" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E6145-DimensionQualifier"/&gt;
 *         &lt;element name="C211" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}C211-Dimensions"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DIM-Dimensions", propOrder = {
    "e6145",
    "c211"
})
public class DIMDimensions {

    @XmlElement(name = "E6145", required = true)
    protected String e6145;
    @XmlElement(name = "C211", required = true)
    protected C211Dimensions c211;

    /**
     * Gets the value of the e6145 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE6145() {
        return e6145;
    }

    /**
     * Sets the value of the e6145 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE6145(String value) {
        this.e6145 = value;
    }

    /**
     * Gets the value of the c211 property.
     * 
     * @return
     *     possible object is
     *     {@link C211Dimensions }
     *     
     */
    public C211Dimensions getC211() {
        return c211;
    }

    /**
     * Sets the value of the c211 property.
     * 
     * @param value
     *     allowed object is
     *     {@link C211Dimensions }
     *     
     */
    public void setC211(C211Dimensions value) {
        this.c211 = value;
    }

    public DIMDimensions withE6145(String value) {
        setE6145(value);
        return this;
    }

    public DIMDimensions withC211(C211Dimensions value) {
        setC211(value);
        return this;
    }

}