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
 * <p>Java class for C948-EmploymentCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="C948-EmploymentCategory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E9005" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E9005-EmploymentCategoryCoded" minOccurs="0"/&gt;
 *         &lt;element name="E1131" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E1131-CodeListQualifier" minOccurs="0"/&gt;
 *         &lt;element name="E3055" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E3055-CodeListResponsibleAgencyCoded" minOccurs="0"/&gt;
 *         &lt;element name="E9004" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E9004-EmploymentCategory" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "C948-EmploymentCategory", propOrder = {
    "e9005",
    "e1131",
    "e3055",
    "e9004"
})
public class C948EmploymentCategory {

    @XmlElement(name = "E9005")
    protected String e9005;
    @XmlElement(name = "E1131")
    protected String e1131;
    @XmlElement(name = "E3055")
    protected String e3055;
    @XmlElement(name = "E9004")
    protected String e9004;

    /**
     * Gets the value of the e9005 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE9005() {
        return e9005;
    }

    /**
     * Sets the value of the e9005 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE9005(String value) {
        this.e9005 = value;
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
     * Gets the value of the e9004 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE9004() {
        return e9004;
    }

    /**
     * Sets the value of the e9004 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE9004(String value) {
        this.e9004 = value;
    }

    public C948EmploymentCategory withE9005(String value) {
        setE9005(value);
        return this;
    }

    public C948EmploymentCategory withE1131(String value) {
        setE1131(value);
        return this;
    }

    public C948EmploymentCategory withE3055(String value) {
        setE3055(value);
        return this;
    }

    public C948EmploymentCategory withE9004(String value) {
        setE9004(value);
        return this;
    }

}
