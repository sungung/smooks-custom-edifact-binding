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
 * <p>Java class for SAL-RemunerationTypeIdentification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SAL-RemunerationTypeIdentification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="C049" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}C049-RemunerationTypeIdentification" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SAL-RemunerationTypeIdentification", propOrder = {
    "c049"
})
public class SALRemunerationTypeIdentification {

    @XmlElement(name = "C049")
    protected C049RemunerationTypeIdentification c049;

    /**
     * Gets the value of the c049 property.
     * 
     * @return
     *     possible object is
     *     {@link C049RemunerationTypeIdentification }
     *     
     */
    public C049RemunerationTypeIdentification getC049() {
        return c049;
    }

    /**
     * Sets the value of the c049 property.
     * 
     * @param value
     *     allowed object is
     *     {@link C049RemunerationTypeIdentification }
     *     
     */
    public void setC049(C049RemunerationTypeIdentification value) {
        this.c049 = value;
    }

    public SALRemunerationTypeIdentification withC049(C049RemunerationTypeIdentification value) {
        setC049(value);
        return this;
    }

}
