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
 * <p>Java class for GDS-NatureOfCargo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GDS-NatureOfCargo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="C703" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}C703-NatureOfCargo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GDS-NatureOfCargo", propOrder = {
    "c703"
})
public class GDSNatureOfCargo {

    @XmlElement(name = "C703")
    protected C703NatureOfCargo c703;

    /**
     * Gets the value of the c703 property.
     * 
     * @return
     *     possible object is
     *     {@link C703NatureOfCargo }
     *     
     */
    public C703NatureOfCargo getC703() {
        return c703;
    }

    /**
     * Sets the value of the c703 property.
     * 
     * @param value
     *     allowed object is
     *     {@link C703NatureOfCargo }
     *     
     */
    public void setC703(C703NatureOfCargo value) {
        this.c703 = value;
    }

    public GDSNatureOfCargo withC703(C703NatureOfCargo value) {
        setC703(value);
        return this;
    }

}