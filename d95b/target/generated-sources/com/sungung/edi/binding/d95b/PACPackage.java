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
 * <p>Java class for PAC-Package complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PAC-Package"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E7224" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E7224-NumberOfPackages" minOccurs="0"/&gt;
 *         &lt;element name="C531" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}C531-PackagingDetails" minOccurs="0"/&gt;
 *         &lt;element name="C202" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}C202-PackageType" minOccurs="0"/&gt;
 *         &lt;element name="C402" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}C402-PackageTypeIdentification" minOccurs="0"/&gt;
 *         &lt;element name="C532" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}C532-ReturnablePackageDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PAC-Package", propOrder = {
    "e7224",
    "c531",
    "c202",
    "c402",
    "c532"
})
public class PACPackage {

    @XmlElement(name = "E7224")
    protected BigDecimal e7224;
    @XmlElement(name = "C531")
    protected C531PackagingDetails c531;
    @XmlElement(name = "C202")
    protected C202PackageType c202;
    @XmlElement(name = "C402")
    protected C402PackageTypeIdentification c402;
    @XmlElement(name = "C532")
    protected C532ReturnablePackageDetails c532;

    /**
     * Gets the value of the e7224 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getE7224() {
        return e7224;
    }

    /**
     * Sets the value of the e7224 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setE7224(BigDecimal value) {
        this.e7224 = value;
    }

    /**
     * Gets the value of the c531 property.
     * 
     * @return
     *     possible object is
     *     {@link C531PackagingDetails }
     *     
     */
    public C531PackagingDetails getC531() {
        return c531;
    }

    /**
     * Sets the value of the c531 property.
     * 
     * @param value
     *     allowed object is
     *     {@link C531PackagingDetails }
     *     
     */
    public void setC531(C531PackagingDetails value) {
        this.c531 = value;
    }

    /**
     * Gets the value of the c202 property.
     * 
     * @return
     *     possible object is
     *     {@link C202PackageType }
     *     
     */
    public C202PackageType getC202() {
        return c202;
    }

    /**
     * Sets the value of the c202 property.
     * 
     * @param value
     *     allowed object is
     *     {@link C202PackageType }
     *     
     */
    public void setC202(C202PackageType value) {
        this.c202 = value;
    }

    /**
     * Gets the value of the c402 property.
     * 
     * @return
     *     possible object is
     *     {@link C402PackageTypeIdentification }
     *     
     */
    public C402PackageTypeIdentification getC402() {
        return c402;
    }

    /**
     * Sets the value of the c402 property.
     * 
     * @param value
     *     allowed object is
     *     {@link C402PackageTypeIdentification }
     *     
     */
    public void setC402(C402PackageTypeIdentification value) {
        this.c402 = value;
    }

    /**
     * Gets the value of the c532 property.
     * 
     * @return
     *     possible object is
     *     {@link C532ReturnablePackageDetails }
     *     
     */
    public C532ReturnablePackageDetails getC532() {
        return c532;
    }

    /**
     * Sets the value of the c532 property.
     * 
     * @param value
     *     allowed object is
     *     {@link C532ReturnablePackageDetails }
     *     
     */
    public void setC532(C532ReturnablePackageDetails value) {
        this.c532 = value;
    }

    public PACPackage withE7224(BigDecimal value) {
        setE7224(value);
        return this;
    }

    public PACPackage withC531(C531PackagingDetails value) {
        setC531(value);
        return this;
    }

    public PACPackage withC202(C202PackageType value) {
        setC202(value);
        return this;
    }

    public PACPackage withC402(C402PackageTypeIdentification value) {
        setC402(value);
        return this;
    }

    public PACPackage withC532(C532ReturnablePackageDetails value) {
        setC532(value);
        return this;
    }

}