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
 * <p>Java class for TMP-Temperature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TMP-Temperature"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E6245" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E6245-TemperatureQualifier"/&gt;
 *         &lt;element name="C239" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}C239-TemperatureSetting" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMP-Temperature", propOrder = {
    "e6245",
    "c239"
})
public class TMPTemperature {

    @XmlElement(name = "E6245", required = true)
    protected String e6245;
    @XmlElement(name = "C239")
    protected C239TemperatureSetting c239;

    /**
     * Gets the value of the e6245 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE6245() {
        return e6245;
    }

    /**
     * Sets the value of the e6245 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE6245(String value) {
        this.e6245 = value;
    }

    /**
     * Gets the value of the c239 property.
     * 
     * @return
     *     possible object is
     *     {@link C239TemperatureSetting }
     *     
     */
    public C239TemperatureSetting getC239() {
        return c239;
    }

    /**
     * Sets the value of the c239 property.
     * 
     * @param value
     *     allowed object is
     *     {@link C239TemperatureSetting }
     *     
     */
    public void setC239(C239TemperatureSetting value) {
        this.c239 = value;
    }

    public TMPTemperature withE6245(String value) {
        setE6245(value);
        return this;
    }

    public TMPTemperature withC239(C239TemperatureSetting value) {
        setC239(value);
        return this;
    }

}
