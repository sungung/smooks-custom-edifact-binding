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
 * <p>Java class for C545-IndexIdentification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="C545-IndexIdentification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E5013" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E5013-IndexQualifier"/&gt;
 *         &lt;element name="E5027" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E5027-IndexTypeCoded" minOccurs="0"/&gt;
 *         &lt;element name="E1131" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E1131-CodeListQualifier" minOccurs="0"/&gt;
 *         &lt;element name="E3055" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E3055-CodeListResponsibleAgencyCoded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "C545-IndexIdentification", propOrder = {
    "e5013",
    "e5027",
    "e1131",
    "e3055"
})
public class C545IndexIdentification {

    @XmlElement(name = "E5013", required = true)
    protected String e5013;
    @XmlElement(name = "E5027")
    protected String e5027;
    @XmlElement(name = "E1131")
    protected String e1131;
    @XmlElement(name = "E3055")
    protected String e3055;

    /**
     * Gets the value of the e5013 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE5013() {
        return e5013;
    }

    /**
     * Sets the value of the e5013 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE5013(String value) {
        this.e5013 = value;
    }

    /**
     * Gets the value of the e5027 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE5027() {
        return e5027;
    }

    /**
     * Sets the value of the e5027 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE5027(String value) {
        this.e5027 = value;
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

    public C545IndexIdentification withE5013(String value) {
        setE5013(value);
        return this;
    }

    public C545IndexIdentification withE5027(String value) {
        setE5027(value);
        return this;
    }

    public C545IndexIdentification withE1131(String value) {
        setE1131(value);
        return this;
    }

    public C545IndexIdentification withE3055(String value) {
        setE3055(value);
        return this;
    }

}
