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
 * <p>Java class for PCD-PercentageDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PCD-PercentageDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="C501" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}C501-PercentageDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PCD-PercentageDetails", propOrder = {
    "c501"
})
public class PCDPercentageDetails {

    @XmlElement(name = "C501", required = true)
    protected C501PercentageDetails c501;

    /**
     * Gets the value of the c501 property.
     * 
     * @return
     *     possible object is
     *     {@link C501PercentageDetails }
     *     
     */
    public C501PercentageDetails getC501() {
        return c501;
    }

    /**
     * Sets the value of the c501 property.
     * 
     * @param value
     *     allowed object is
     *     {@link C501PercentageDetails }
     *     
     */
    public void setC501(C501PercentageDetails value) {
        this.c501 = value;
    }

    public PCDPercentageDetails withC501(C501PercentageDetails value) {
        setC501(value);
        return this;
    }

}
