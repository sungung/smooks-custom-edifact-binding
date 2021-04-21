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
 * <p>Java class for C401-ExcessTransportationInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="C401-ExcessTransportationInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E8457" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E8457-ExcessTransportationReasonCoded"/&gt;
 *         &lt;element name="E8459" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E8459-ExcessTransportationResponsibilityCoded"/&gt;
 *         &lt;element name="E7130" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E7130-CustomerAuthorizationNumber" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "C401-ExcessTransportationInformation", propOrder = {
    "e8457",
    "e8459",
    "e7130"
})
public class C401ExcessTransportationInformation {

    @XmlElement(name = "E8457", required = true)
    @XmlSchemaType(name = "string")
    protected E8457ExcessTransportationReasonCoded e8457;
    @XmlElement(name = "E8459", required = true)
    @XmlSchemaType(name = "string")
    protected E8459ExcessTransportationResponsibilityCoded e8459;
    @XmlElement(name = "E7130")
    protected String e7130;

    /**
     * Gets the value of the e8457 property.
     * 
     * @return
     *     possible object is
     *     {@link E8457ExcessTransportationReasonCoded }
     *     
     */
    public E8457ExcessTransportationReasonCoded getE8457() {
        return e8457;
    }

    /**
     * Sets the value of the e8457 property.
     * 
     * @param value
     *     allowed object is
     *     {@link E8457ExcessTransportationReasonCoded }
     *     
     */
    public void setE8457(E8457ExcessTransportationReasonCoded value) {
        this.e8457 = value;
    }

    /**
     * Gets the value of the e8459 property.
     * 
     * @return
     *     possible object is
     *     {@link E8459ExcessTransportationResponsibilityCoded }
     *     
     */
    public E8459ExcessTransportationResponsibilityCoded getE8459() {
        return e8459;
    }

    /**
     * Sets the value of the e8459 property.
     * 
     * @param value
     *     allowed object is
     *     {@link E8459ExcessTransportationResponsibilityCoded }
     *     
     */
    public void setE8459(E8459ExcessTransportationResponsibilityCoded value) {
        this.e8459 = value;
    }

    /**
     * Gets the value of the e7130 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE7130() {
        return e7130;
    }

    /**
     * Sets the value of the e7130 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE7130(String value) {
        this.e7130 = value;
    }

    public C401ExcessTransportationInformation withE8457(E8457ExcessTransportationReasonCoded value) {
        setE8457(value);
        return this;
    }

    public C401ExcessTransportationInformation withE8459(E8459ExcessTransportationResponsibilityCoded value) {
        setE8459(value);
        return this;
    }

    public C401ExcessTransportationInformation withE7130(String value) {
        setE7130(value);
        return this;
    }

}
