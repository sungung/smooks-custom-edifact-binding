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
 * <p>Java class for C531-PackagingDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="C531-PackagingDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E7075" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E7075-PackagingLevelCoded" minOccurs="0"/&gt;
 *         &lt;element name="E7233" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E7233-PackagingRelatedInformationCoded" minOccurs="0"/&gt;
 *         &lt;element name="E7073" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E7073-PackagingTermsAndConditionsCoded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "C531-PackagingDetails", propOrder = {
    "e7075",
    "e7233",
    "e7073"
})
public class C531PackagingDetails {

    @XmlElement(name = "E7075")
    protected String e7075;
    @XmlElement(name = "E7233")
    protected String e7233;
    @XmlElement(name = "E7073")
    protected String e7073;

    /**
     * Gets the value of the e7075 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE7075() {
        return e7075;
    }

    /**
     * Sets the value of the e7075 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE7075(String value) {
        this.e7075 = value;
    }

    /**
     * Gets the value of the e7233 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE7233() {
        return e7233;
    }

    /**
     * Sets the value of the e7233 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE7233(String value) {
        this.e7233 = value;
    }

    /**
     * Gets the value of the e7073 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE7073() {
        return e7073;
    }

    /**
     * Sets the value of the e7073 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE7073(String value) {
        this.e7073 = value;
    }

    public C531PackagingDetails withE7075(String value) {
        setE7075(value);
        return this;
    }

    public C531PackagingDetails withE7233(String value) {
        setE7233(value);
        return this;
    }

    public C531PackagingDetails withE7073(String value) {
        setE7073(value);
        return this;
    }

}
