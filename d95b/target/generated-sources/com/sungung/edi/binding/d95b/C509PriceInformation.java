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
 * <p>Java class for C509-PriceInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="C509-PriceInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E5125" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E5125-PriceQualifier"/&gt;
 *         &lt;element name="E5118" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E5118-Price" minOccurs="0"/&gt;
 *         &lt;element name="E5375" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E5375-PriceTypeCoded" minOccurs="0"/&gt;
 *         &lt;element name="E5387" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E5387-PriceTypeQualifier" minOccurs="0"/&gt;
 *         &lt;element name="E5284" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E5284-UnitPriceBasis" minOccurs="0"/&gt;
 *         &lt;element name="E6411" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E6411-MeasureUnitQualifier" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "C509-PriceInformation", propOrder = {
    "e5125",
    "e5118",
    "e5375",
    "e5387",
    "e5284",
    "e6411"
})
public class C509PriceInformation {

    @XmlElement(name = "E5125", required = true)
    @XmlSchemaType(name = "string")
    protected E5125PriceQualifier e5125;
    @XmlElement(name = "E5118")
    protected BigDecimal e5118;
    @XmlElement(name = "E5375")
    @XmlSchemaType(name = "string")
    protected E5375PriceTypeCoded e5375;
    @XmlElement(name = "E5387")
    @XmlSchemaType(name = "string")
    protected E5387PriceTypeQualifier e5387;
    @XmlElement(name = "E5284")
    protected BigDecimal e5284;
    @XmlElement(name = "E6411")
    protected String e6411;

    /**
     * Gets the value of the e5125 property.
     * 
     * @return
     *     possible object is
     *     {@link E5125PriceQualifier }
     *     
     */
    public E5125PriceQualifier getE5125() {
        return e5125;
    }

    /**
     * Sets the value of the e5125 property.
     * 
     * @param value
     *     allowed object is
     *     {@link E5125PriceQualifier }
     *     
     */
    public void setE5125(E5125PriceQualifier value) {
        this.e5125 = value;
    }

    /**
     * Gets the value of the e5118 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getE5118() {
        return e5118;
    }

    /**
     * Sets the value of the e5118 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setE5118(BigDecimal value) {
        this.e5118 = value;
    }

    /**
     * Gets the value of the e5375 property.
     * 
     * @return
     *     possible object is
     *     {@link E5375PriceTypeCoded }
     *     
     */
    public E5375PriceTypeCoded getE5375() {
        return e5375;
    }

    /**
     * Sets the value of the e5375 property.
     * 
     * @param value
     *     allowed object is
     *     {@link E5375PriceTypeCoded }
     *     
     */
    public void setE5375(E5375PriceTypeCoded value) {
        this.e5375 = value;
    }

    /**
     * Gets the value of the e5387 property.
     * 
     * @return
     *     possible object is
     *     {@link E5387PriceTypeQualifier }
     *     
     */
    public E5387PriceTypeQualifier getE5387() {
        return e5387;
    }

    /**
     * Sets the value of the e5387 property.
     * 
     * @param value
     *     allowed object is
     *     {@link E5387PriceTypeQualifier }
     *     
     */
    public void setE5387(E5387PriceTypeQualifier value) {
        this.e5387 = value;
    }

    /**
     * Gets the value of the e5284 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getE5284() {
        return e5284;
    }

    /**
     * Sets the value of the e5284 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setE5284(BigDecimal value) {
        this.e5284 = value;
    }

    /**
     * Gets the value of the e6411 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE6411() {
        return e6411;
    }

    /**
     * Sets the value of the e6411 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE6411(String value) {
        this.e6411 = value;
    }

    public C509PriceInformation withE5125(E5125PriceQualifier value) {
        setE5125(value);
        return this;
    }

    public C509PriceInformation withE5118(BigDecimal value) {
        setE5118(value);
        return this;
    }

    public C509PriceInformation withE5375(E5375PriceTypeCoded value) {
        setE5375(value);
        return this;
    }

    public C509PriceInformation withE5387(E5387PriceTypeQualifier value) {
        setE5387(value);
        return this;
    }

    public C509PriceInformation withE5284(BigDecimal value) {
        setE5284(value);
        return this;
    }

    public C509PriceInformation withE6411(String value) {
        setE6411(value);
        return this;
    }

}
