//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.21 at 01:57:40 PM AEST 
//


package com.sungung.edi.binding.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for S503-AlgorithmParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S503-AlgorithmParameter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E0531" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}E0531-AlgorithmParameterQualifier"/&gt;
 *         &lt;element name="E0554" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}E0554-AlgorithmParameterValue"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S503-AlgorithmParameter", propOrder = {
    "e0531",
    "e0554"
})
public class S503AlgorithmParameter {

    @XmlElement(name = "E0531", required = true)
    protected String e0531;
    @XmlElement(name = "E0554", required = true)
    protected String e0554;

    /**
     * Gets the value of the e0531 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE0531() {
        return e0531;
    }

    /**
     * Sets the value of the e0531 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE0531(String value) {
        this.e0531 = value;
    }

    /**
     * Gets the value of the e0554 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE0554() {
        return e0554;
    }

    /**
     * Sets the value of the e0554 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE0554(String value) {
        this.e0554 = value;
    }

    public S503AlgorithmParameter withE0531(String value) {
        setE0531(value);
        return this;
    }

    public S503AlgorithmParameter withE0554(String value) {
        setE0554(value);
        return this;
    }

}