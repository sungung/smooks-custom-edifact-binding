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
 * <p>Java class for IRQ-InformationRequired complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IRQ-InformationRequired"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="C333" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}C333-InformationRequest"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IRQ-InformationRequired", propOrder = {
    "c333"
})
public class IRQInformationRequired {

    @XmlElement(name = "C333", required = true)
    protected C333InformationRequest c333;

    /**
     * Gets the value of the c333 property.
     * 
     * @return
     *     possible object is
     *     {@link C333InformationRequest }
     *     
     */
    public C333InformationRequest getC333() {
        return c333;
    }

    /**
     * Sets the value of the c333 property.
     * 
     * @param value
     *     allowed object is
     *     {@link C333InformationRequest }
     *     
     */
    public void setC333(C333InformationRequest value) {
        this.c333 = value;
    }

    public IRQInformationRequired withC333(C333InformationRequest value) {
        setC333(value);
        return this;
    }

}
