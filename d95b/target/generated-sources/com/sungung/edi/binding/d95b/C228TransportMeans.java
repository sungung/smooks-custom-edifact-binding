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
 * <p>Java class for C228-TransportMeans complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="C228-TransportMeans"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E8179" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E8179-TypeOfMeansOfTransportIdentification" minOccurs="0"/&gt;
 *         &lt;element name="E8178" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E8178-TypeOfMeansOfTransport" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "C228-TransportMeans", propOrder = {
    "e8179",
    "e8178"
})
public class C228TransportMeans {

    @XmlElement(name = "E8179")
    protected String e8179;
    @XmlElement(name = "E8178")
    protected String e8178;

    /**
     * Gets the value of the e8179 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE8179() {
        return e8179;
    }

    /**
     * Sets the value of the e8179 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE8179(String value) {
        this.e8179 = value;
    }

    /**
     * Gets the value of the e8178 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE8178() {
        return e8178;
    }

    /**
     * Sets the value of the e8178 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE8178(String value) {
        this.e8178 = value;
    }

    public C228TransportMeans withE8179(String value) {
        setE8179(value);
        return this;
    }

    public C228TransportMeans withE8178(String value) {
        setE8178(value);
        return this;
    }

}