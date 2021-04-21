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
 * <p>Java class for C506-Reference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="C506-Reference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E1153" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E1153-ReferenceQualifier"/&gt;
 *         &lt;element name="E1154" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E1154-ReferenceNumber" minOccurs="0"/&gt;
 *         &lt;element name="E1156" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E1156-LineNumber" minOccurs="0"/&gt;
 *         &lt;element name="E4000" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E4000-ReferenceVersionNumber" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "C506-Reference", propOrder = {
    "e1153",
    "e1154",
    "e1156",
    "e4000"
})
public class C506Reference {

    @XmlElement(name = "E1153", required = true)
    @XmlSchemaType(name = "string")
    protected E1153ReferenceQualifier e1153;
    @XmlElement(name = "E1154")
    protected String e1154;
    @XmlElement(name = "E1156")
    protected String e1156;
    @XmlElement(name = "E4000")
    protected String e4000;

    /**
     * Gets the value of the e1153 property.
     * 
     * @return
     *     possible object is
     *     {@link E1153ReferenceQualifier }
     *     
     */
    public E1153ReferenceQualifier getE1153() {
        return e1153;
    }

    /**
     * Sets the value of the e1153 property.
     * 
     * @param value
     *     allowed object is
     *     {@link E1153ReferenceQualifier }
     *     
     */
    public void setE1153(E1153ReferenceQualifier value) {
        this.e1153 = value;
    }

    /**
     * Gets the value of the e1154 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE1154() {
        return e1154;
    }

    /**
     * Sets the value of the e1154 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE1154(String value) {
        this.e1154 = value;
    }

    /**
     * Gets the value of the e1156 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE1156() {
        return e1156;
    }

    /**
     * Sets the value of the e1156 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE1156(String value) {
        this.e1156 = value;
    }

    /**
     * Gets the value of the e4000 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE4000() {
        return e4000;
    }

    /**
     * Sets the value of the e4000 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE4000(String value) {
        this.e4000 = value;
    }

    public C506Reference withE1153(E1153ReferenceQualifier value) {
        setE1153(value);
        return this;
    }

    public C506Reference withE1154(String value) {
        setE1154(value);
        return this;
    }

    public C506Reference withE1156(String value) {
        setE1156(value);
        return this;
    }

    public C506Reference withE4000(String value) {
        setE4000(value);
        return this;
    }

}