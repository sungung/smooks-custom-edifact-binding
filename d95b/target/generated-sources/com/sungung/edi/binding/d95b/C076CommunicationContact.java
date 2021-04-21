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
 * <p>Java class for C076-CommunicationContact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="C076-CommunicationContact"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E3148" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E3148-CommunicationNumber"/&gt;
 *         &lt;element name="E3155" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E3155-CommunicationChannelQualifier"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "C076-CommunicationContact", propOrder = {
    "e3148",
    "e3155"
})
public class C076CommunicationContact {

    @XmlElement(name = "E3148", required = true)
    protected String e3148;
    @XmlElement(name = "E3155", required = true)
    @XmlSchemaType(name = "string")
    protected E3155CommunicationChannelQualifier e3155;

    /**
     * Gets the value of the e3148 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE3148() {
        return e3148;
    }

    /**
     * Sets the value of the e3148 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE3148(String value) {
        this.e3148 = value;
    }

    /**
     * Gets the value of the e3155 property.
     * 
     * @return
     *     possible object is
     *     {@link E3155CommunicationChannelQualifier }
     *     
     */
    public E3155CommunicationChannelQualifier getE3155() {
        return e3155;
    }

    /**
     * Sets the value of the e3155 property.
     * 
     * @param value
     *     allowed object is
     *     {@link E3155CommunicationChannelQualifier }
     *     
     */
    public void setE3155(E3155CommunicationChannelQualifier value) {
        this.e3155 = value;
    }

    public C076CommunicationContact withE3148(String value) {
        setE3148(value);
        return this;
    }

    public C076CommunicationContact withE3155(E3155CommunicationChannelQualifier value) {
        setE3155(value);
        return this;
    }

}
