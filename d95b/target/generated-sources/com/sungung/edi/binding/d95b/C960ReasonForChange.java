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
 * <p>Java class for C960-ReasonForChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="C960-ReasonForChange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E4295" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E4295-ChangeReasonCoded" minOccurs="0"/&gt;
 *         &lt;element name="E1131" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E1131-CodeListQualifier" minOccurs="0"/&gt;
 *         &lt;element name="E3055" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E3055-CodeListResponsibleAgencyCoded" minOccurs="0"/&gt;
 *         &lt;element name="E4294" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E4294-ChangeReason" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "C960-ReasonForChange", propOrder = {
    "e4295",
    "e1131",
    "e3055",
    "e4294"
})
public class C960ReasonForChange {

    @XmlElement(name = "E4295")
    @XmlSchemaType(name = "string")
    protected E4295ChangeReasonCoded e4295;
    @XmlElement(name = "E1131")
    protected String e1131;
    @XmlElement(name = "E3055")
    protected String e3055;
    @XmlElement(name = "E4294")
    protected String e4294;

    /**
     * Gets the value of the e4295 property.
     * 
     * @return
     *     possible object is
     *     {@link E4295ChangeReasonCoded }
     *     
     */
    public E4295ChangeReasonCoded getE4295() {
        return e4295;
    }

    /**
     * Sets the value of the e4295 property.
     * 
     * @param value
     *     allowed object is
     *     {@link E4295ChangeReasonCoded }
     *     
     */
    public void setE4295(E4295ChangeReasonCoded value) {
        this.e4295 = value;
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
     * Gets the value of the e4294 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE4294() {
        return e4294;
    }

    /**
     * Sets the value of the e4294 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE4294(String value) {
        this.e4294 = value;
    }

    public C960ReasonForChange withE4295(E4295ChangeReasonCoded value) {
        setE4295(value);
        return this;
    }

    public C960ReasonForChange withE1131(String value) {
        setE1131(value);
        return this;
    }

    public C960ReasonForChange withE3055(String value) {
        setE3055(value);
        return this;
    }

    public C960ReasonForChange withE4294(String value) {
        setE4294(value);
        return this;
    }

}