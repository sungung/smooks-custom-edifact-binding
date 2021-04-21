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
 * <p>Java class for STA-Statistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="STA-Statistics"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E6331" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E6331-StatisticTypeCoded"/&gt;
 *         &lt;element name="C527" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}C527-StatisticalDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STA-Statistics", propOrder = {
    "e6331",
    "c527"
})
public class STAStatistics {

    @XmlElement(name = "E6331", required = true)
    protected String e6331;
    @XmlElement(name = "C527")
    protected C527StatisticalDetails c527;

    /**
     * Gets the value of the e6331 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE6331() {
        return e6331;
    }

    /**
     * Sets the value of the e6331 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE6331(String value) {
        this.e6331 = value;
    }

    /**
     * Gets the value of the c527 property.
     * 
     * @return
     *     possible object is
     *     {@link C527StatisticalDetails }
     *     
     */
    public C527StatisticalDetails getC527() {
        return c527;
    }

    /**
     * Sets the value of the c527 property.
     * 
     * @param value
     *     allowed object is
     *     {@link C527StatisticalDetails }
     *     
     */
    public void setC527(C527StatisticalDetails value) {
        this.c527 = value;
    }

    public STAStatistics withE6331(String value) {
        setE6331(value);
        return this;
    }

    public STAStatistics withC527(C527StatisticalDetails value) {
        setC527(value);
        return this;
    }

}