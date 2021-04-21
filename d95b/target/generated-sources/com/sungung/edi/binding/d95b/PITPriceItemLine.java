//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.21 at 01:57:40 PM AEST 
//


package com.sungung.edi.binding.d95b;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PIT-PriceItemLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PIT-PriceItemLine"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E1082" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E1082-LineItemNumber" minOccurs="0"/&gt;
 *         &lt;element name="E1229" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E1229-ActionRequestNotificationCoded" minOccurs="0"/&gt;
 *         &lt;element name="C292" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}C292-PriceChangeInformation" minOccurs="0"/&gt;
 *         &lt;element name="E7011" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E7011-ArticleAvailabilityCoded" minOccurs="0"/&gt;
 *         &lt;element name="E5495" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E5495-SubLineIndicatorCoded" minOccurs="0"/&gt;
 *         &lt;element name="E1222" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E1222-ConfigurationLevel" minOccurs="0"/&gt;
 *         &lt;element name="E7083" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E7083-ConfigurationCoded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PIT-PriceItemLine", propOrder = {
    "e1082",
    "e1229",
    "c292",
    "e7011",
    "e5495",
    "e1222",
    "e7083"
})
public class PITPriceItemLine {

    @XmlElement(name = "E1082")
    protected BigDecimal e1082;
    @XmlElement(name = "E1229")
    protected String e1229;
    @XmlElement(name = "C292")
    protected C292PriceChangeInformation c292;
    @XmlElement(name = "E7011")
    protected String e7011;
    @XmlElement(name = "E5495")
    protected String e5495;
    @XmlElement(name = "E1222")
    protected BigDecimal e1222;
    @XmlElement(name = "E7083")
    @XmlSchemaType(name = "string")
    protected E7083ConfigurationCoded e7083;

    /**
     * Gets the value of the e1082 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getE1082() {
        return e1082;
    }

    /**
     * Sets the value of the e1082 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setE1082(BigDecimal value) {
        this.e1082 = value;
    }

    /**
     * Gets the value of the e1229 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE1229() {
        return e1229;
    }

    /**
     * Sets the value of the e1229 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE1229(String value) {
        this.e1229 = value;
    }

    /**
     * Gets the value of the c292 property.
     * 
     * @return
     *     possible object is
     *     {@link C292PriceChangeInformation }
     *     
     */
    public C292PriceChangeInformation getC292() {
        return c292;
    }

    /**
     * Sets the value of the c292 property.
     * 
     * @param value
     *     allowed object is
     *     {@link C292PriceChangeInformation }
     *     
     */
    public void setC292(C292PriceChangeInformation value) {
        this.c292 = value;
    }

    /**
     * Gets the value of the e7011 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE7011() {
        return e7011;
    }

    /**
     * Sets the value of the e7011 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE7011(String value) {
        this.e7011 = value;
    }

    /**
     * Gets the value of the e5495 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE5495() {
        return e5495;
    }

    /**
     * Sets the value of the e5495 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE5495(String value) {
        this.e5495 = value;
    }

    /**
     * Gets the value of the e1222 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getE1222() {
        return e1222;
    }

    /**
     * Sets the value of the e1222 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setE1222(BigDecimal value) {
        this.e1222 = value;
    }

    /**
     * Gets the value of the e7083 property.
     * 
     * @return
     *     possible object is
     *     {@link E7083ConfigurationCoded }
     *     
     */
    public E7083ConfigurationCoded getE7083() {
        return e7083;
    }

    /**
     * Sets the value of the e7083 property.
     * 
     * @param value
     *     allowed object is
     *     {@link E7083ConfigurationCoded }
     *     
     */
    public void setE7083(E7083ConfigurationCoded value) {
        this.e7083 = value;
    }

    public PITPriceItemLine withE1082(BigDecimal value) {
        setE1082(value);
        return this;
    }

    public PITPriceItemLine withE1229(String value) {
        setE1229(value);
        return this;
    }

    public PITPriceItemLine withC292(C292PriceChangeInformation value) {
        setC292(value);
        return this;
    }

    public PITPriceItemLine withE7011(String value) {
        setE7011(value);
        return this;
    }

    public PITPriceItemLine withE5495(String value) {
        setE5495(value);
        return this;
    }

    public PITPriceItemLine withE1222(BigDecimal value) {
        setE1222(value);
        return this;
    }

    public PITPriceItemLine withE7083(E7083ConfigurationCoded value) {
        setE7083(value);
        return this;
    }

}
