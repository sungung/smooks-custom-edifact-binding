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
 * <p>Java class for C785-StatisticalConceptIdentification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="C785-StatisticalConceptIdentification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E6434" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E6434-StatisticalConceptIdentifier"/&gt;
 *         &lt;element name="E7405" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E7405-IdentityNumberQualifier" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "C785-StatisticalConceptIdentification", propOrder = {
    "e6434",
    "e7405"
})
public class C785StatisticalConceptIdentification {

    @XmlElement(name = "E6434", required = true)
    protected String e6434;
    @XmlElement(name = "E7405")
    @XmlSchemaType(name = "string")
    protected E7405IdentityNumberQualifier e7405;

    /**
     * Gets the value of the e6434 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE6434() {
        return e6434;
    }

    /**
     * Sets the value of the e6434 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE6434(String value) {
        this.e6434 = value;
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

    public C785StatisticalConceptIdentification withE6434(String value) {
        setE6434(value);
        return this;
    }

    public C785StatisticalConceptIdentification withE7405(E7405IdentityNumberQualifier value) {
        setE7405(value);
        return this;
    }

}
