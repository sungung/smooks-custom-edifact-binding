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
 * <p>Java class for AUT-AuthenticationResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AUT-AuthenticationResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E9280" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E9280-ValidationResult"/&gt;
 *         &lt;element name="E9282" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E9282-ValidationKeyIdentification" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AUT-AuthenticationResult", propOrder = {
    "e9280",
    "e9282"
})
public class AUTAuthenticationResult {

    @XmlElement(name = "E9280", required = true)
    protected String e9280;
    @XmlElement(name = "E9282")
    protected String e9282;

    /**
     * Gets the value of the e9280 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE9280() {
        return e9280;
    }

    /**
     * Sets the value of the e9280 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE9280(String value) {
        this.e9280 = value;
    }

    /**
     * Gets the value of the e9282 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE9282() {
        return e9282;
    }

    /**
     * Sets the value of the e9282 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE9282(String value) {
        this.e9282 = value;
    }

    public AUTAuthenticationResult withE9280(String value) {
        setE9280(value);
        return this;
    }

    public AUTAuthenticationResult withE9282(String value) {
        setE9282(value);
        return this;
    }

}