//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.21 at 01:57:35 PM AEST 
//


package com.sungung.edi.binding.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USE-SecurityMessageRelation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USE-SecurityMessageRelation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E0565" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}E0565-MessageRelationCoded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "USE-SecurityMessageRelation", propOrder = {
    "e0565"
})
public class USESecurityMessageRelation {

    @XmlElement(name = "E0565", required = true)
    protected String e0565;

    /**
     * Gets the value of the e0565 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE0565() {
        return e0565;
    }

    /**
     * Sets the value of the e0565 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE0565(String value) {
        this.e0565 = value;
    }

    public USESecurityMessageRelation withE0565(String value) {
        setE0565(value);
        return this;
    }

}