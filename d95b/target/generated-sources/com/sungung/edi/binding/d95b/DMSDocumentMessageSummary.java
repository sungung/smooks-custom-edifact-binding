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
 * <p>Java class for DMS-DocumentMessageSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DMS-DocumentMessageSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E1004" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E1004-DocumentMessageNumber" minOccurs="0"/&gt;
 *         &lt;element name="E1001" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E1001-DocumentMessageNameCoded" minOccurs="0"/&gt;
 *         &lt;element name="E7240" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E7240-TotalNumberOfItems" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DMS-DocumentMessageSummary", propOrder = {
    "e1004",
    "e1001",
    "e7240"
})
public class DMSDocumentMessageSummary {

    @XmlElement(name = "E1004")
    protected String e1004;
    @XmlElement(name = "E1001")
    protected String e1001;
    @XmlElement(name = "E7240")
    protected BigDecimal e7240;

    /**
     * Gets the value of the e1004 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE1004() {
        return e1004;
    }

    /**
     * Sets the value of the e1004 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE1004(String value) {
        this.e1004 = value;
    }

    /**
     * Gets the value of the e1001 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE1001() {
        return e1001;
    }

    /**
     * Sets the value of the e1001 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE1001(String value) {
        this.e1001 = value;
    }

    /**
     * Gets the value of the e7240 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getE7240() {
        return e7240;
    }

    /**
     * Sets the value of the e7240 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setE7240(BigDecimal value) {
        this.e7240 = value;
    }

    public DMSDocumentMessageSummary withE1004(String value) {
        setE1004(value);
        return this;
    }

    public DMSDocumentMessageSummary withE1001(String value) {
        setE1001(value);
        return this;
    }

    public DMSDocumentMessageSummary withE7240(BigDecimal value) {
        setE7240(value);
        return this;
    }

}