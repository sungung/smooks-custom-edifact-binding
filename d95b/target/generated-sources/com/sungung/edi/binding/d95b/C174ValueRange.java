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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for C174-ValueRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="C174-ValueRange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E6411" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E6411-MeasureUnitQualifier"/&gt;
 *         &lt;element name="E6314" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E6314-MeasurementValue" minOccurs="0"/&gt;
 *         &lt;element name="E6162" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E6162-RangeMinimum" minOccurs="0"/&gt;
 *         &lt;element name="E6152" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E6152-RangeMaximum" minOccurs="0"/&gt;
 *         &lt;element name="E6432" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E6432-SignificantDigits" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "C174-ValueRange", propOrder = {
    "e6411",
    "e6314",
    "e6162",
    "e6152",
    "e6432"
})
public class C174ValueRange {

    @XmlElement(name = "E6411", required = true)
    protected String e6411;
    @XmlElement(name = "E6314")
    protected BigDecimal e6314;
    @XmlElement(name = "E6162")
    protected BigDecimal e6162;
    @XmlElement(name = "E6152")
    protected BigDecimal e6152;
    @XmlElement(name = "E6432")
    protected BigDecimal e6432;

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

    /**
     * Gets the value of the e6314 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getE6314() {
        return e6314;
    }

    /**
     * Sets the value of the e6314 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setE6314(BigDecimal value) {
        this.e6314 = value;
    }

    /**
     * Gets the value of the e6162 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getE6162() {
        return e6162;
    }

    /**
     * Sets the value of the e6162 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setE6162(BigDecimal value) {
        this.e6162 = value;
    }

    /**
     * Gets the value of the e6152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getE6152() {
        return e6152;
    }

    /**
     * Sets the value of the e6152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setE6152(BigDecimal value) {
        this.e6152 = value;
    }

    /**
     * Gets the value of the e6432 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getE6432() {
        return e6432;
    }

    /**
     * Sets the value of the e6432 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setE6432(BigDecimal value) {
        this.e6432 = value;
    }

    public C174ValueRange withE6411(String value) {
        setE6411(value);
        return this;
    }

    public C174ValueRange withE6314(BigDecimal value) {
        setE6314(value);
        return this;
    }

    public C174ValueRange withE6162(BigDecimal value) {
        setE6162(value);
        return this;
    }

    public C174ValueRange withE6152(BigDecimal value) {
        setE6152(value);
        return this;
    }

    public C174ValueRange withE6432(BigDecimal value) {
        setE6432(value);
        return this;
    }

}
