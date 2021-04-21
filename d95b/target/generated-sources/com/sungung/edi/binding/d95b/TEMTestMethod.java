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
 * <p>Java class for TEM-TestMethod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TEM-TestMethod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="C244" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}C244-TestMethod" minOccurs="0"/&gt;
 *         &lt;element name="E4419" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E4419-TestRouteOfAdministeringCoded" minOccurs="0"/&gt;
 *         &lt;element name="E3077" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E3077-TestMediaCoded" minOccurs="0"/&gt;
 *         &lt;element name="E6311" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E6311-MeasurementApplicationQualifier" minOccurs="0"/&gt;
 *         &lt;element name="E7188" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E7188-TestRevisionNumber" minOccurs="0"/&gt;
 *         &lt;element name="C515" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}C515-TestReason" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TEM-TestMethod", propOrder = {
    "c244",
    "e4419",
    "e3077",
    "e6311",
    "e7188",
    "c515"
})
public class TEMTestMethod {

    @XmlElement(name = "C244")
    protected C244TestMethod c244;
    @XmlElement(name = "E4419")
    protected String e4419;
    @XmlElement(name = "E3077")
    protected String e3077;
    @XmlElement(name = "E6311")
    @XmlSchemaType(name = "string")
    protected E6311MeasurementApplicationQualifier e6311;
    @XmlElement(name = "E7188")
    protected String e7188;
    @XmlElement(name = "C515")
    protected C515TestReason c515;

    /**
     * Gets the value of the c244 property.
     * 
     * @return
     *     possible object is
     *     {@link C244TestMethod }
     *     
     */
    public C244TestMethod getC244() {
        return c244;
    }

    /**
     * Sets the value of the c244 property.
     * 
     * @param value
     *     allowed object is
     *     {@link C244TestMethod }
     *     
     */
    public void setC244(C244TestMethod value) {
        this.c244 = value;
    }

    /**
     * Gets the value of the e4419 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE4419() {
        return e4419;
    }

    /**
     * Sets the value of the e4419 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE4419(String value) {
        this.e4419 = value;
    }

    /**
     * Gets the value of the e3077 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE3077() {
        return e3077;
    }

    /**
     * Sets the value of the e3077 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE3077(String value) {
        this.e3077 = value;
    }

    /**
     * Gets the value of the e6311 property.
     * 
     * @return
     *     possible object is
     *     {@link E6311MeasurementApplicationQualifier }
     *     
     */
    public E6311MeasurementApplicationQualifier getE6311() {
        return e6311;
    }

    /**
     * Sets the value of the e6311 property.
     * 
     * @param value
     *     allowed object is
     *     {@link E6311MeasurementApplicationQualifier }
     *     
     */
    public void setE6311(E6311MeasurementApplicationQualifier value) {
        this.e6311 = value;
    }

    /**
     * Gets the value of the e7188 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE7188() {
        return e7188;
    }

    /**
     * Sets the value of the e7188 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE7188(String value) {
        this.e7188 = value;
    }

    /**
     * Gets the value of the c515 property.
     * 
     * @return
     *     possible object is
     *     {@link C515TestReason }
     *     
     */
    public C515TestReason getC515() {
        return c515;
    }

    /**
     * Sets the value of the c515 property.
     * 
     * @param value
     *     allowed object is
     *     {@link C515TestReason }
     *     
     */
    public void setC515(C515TestReason value) {
        this.c515 = value;
    }

    public TEMTestMethod withC244(C244TestMethod value) {
        setC244(value);
        return this;
    }

    public TEMTestMethod withE4419(String value) {
        setE4419(value);
        return this;
    }

    public TEMTestMethod withE3077(String value) {
        setE3077(value);
        return this;
    }

    public TEMTestMethod withE6311(E6311MeasurementApplicationQualifier value) {
        setE6311(value);
        return this;
    }

    public TEMTestMethod withE7188(String value) {
        setE7188(value);
        return this;
    }

    public TEMTestMethod withC515(C515TestReason value) {
        setC515(value);
        return this;
    }

}
