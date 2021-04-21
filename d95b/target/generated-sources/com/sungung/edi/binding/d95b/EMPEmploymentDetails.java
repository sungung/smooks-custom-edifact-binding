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
 * <p>Java class for EMP-EmploymentDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EMP-EmploymentDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E9003" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E9003-EmploymentQualifier"/&gt;
 *         &lt;element name="C948" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}C948-EmploymentCategory" minOccurs="0"/&gt;
 *         &lt;element name="C951" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}C951-Occupation" minOccurs="0"/&gt;
 *         &lt;element name="C950" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}C950-QualificationClassification" minOccurs="0"/&gt;
 *         &lt;element name="E3494" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E3494-JobTitle" minOccurs="0"/&gt;
 *         &lt;element name="E9035" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E9035-QualificationAreaCoded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EMP-EmploymentDetails", propOrder = {
    "e9003",
    "c948",
    "c951",
    "c950",
    "e3494",
    "e9035"
})
public class EMPEmploymentDetails {

    @XmlElement(name = "E9003", required = true)
    protected String e9003;
    @XmlElement(name = "C948")
    protected C948EmploymentCategory c948;
    @XmlElement(name = "C951")
    protected C951Occupation c951;
    @XmlElement(name = "C950")
    protected C950QualificationClassification c950;
    @XmlElement(name = "E3494")
    protected String e3494;
    @XmlElement(name = "E9035")
    protected String e9035;

    /**
     * Gets the value of the e9003 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE9003() {
        return e9003;
    }

    /**
     * Sets the value of the e9003 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE9003(String value) {
        this.e9003 = value;
    }

    /**
     * Gets the value of the c948 property.
     * 
     * @return
     *     possible object is
     *     {@link C948EmploymentCategory }
     *     
     */
    public C948EmploymentCategory getC948() {
        return c948;
    }

    /**
     * Sets the value of the c948 property.
     * 
     * @param value
     *     allowed object is
     *     {@link C948EmploymentCategory }
     *     
     */
    public void setC948(C948EmploymentCategory value) {
        this.c948 = value;
    }

    /**
     * Gets the value of the c951 property.
     * 
     * @return
     *     possible object is
     *     {@link C951Occupation }
     *     
     */
    public C951Occupation getC951() {
        return c951;
    }

    /**
     * Sets the value of the c951 property.
     * 
     * @param value
     *     allowed object is
     *     {@link C951Occupation }
     *     
     */
    public void setC951(C951Occupation value) {
        this.c951 = value;
    }

    /**
     * Gets the value of the c950 property.
     * 
     * @return
     *     possible object is
     *     {@link C950QualificationClassification }
     *     
     */
    public C950QualificationClassification getC950() {
        return c950;
    }

    /**
     * Sets the value of the c950 property.
     * 
     * @param value
     *     allowed object is
     *     {@link C950QualificationClassification }
     *     
     */
    public void setC950(C950QualificationClassification value) {
        this.c950 = value;
    }

    /**
     * Gets the value of the e3494 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE3494() {
        return e3494;
    }

    /**
     * Sets the value of the e3494 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE3494(String value) {
        this.e3494 = value;
    }

    /**
     * Gets the value of the e9035 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE9035() {
        return e9035;
    }

    /**
     * Sets the value of the e9035 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE9035(String value) {
        this.e9035 = value;
    }

    public EMPEmploymentDetails withE9003(String value) {
        setE9003(value);
        return this;
    }

    public EMPEmploymentDetails withC948(C948EmploymentCategory value) {
        setC948(value);
        return this;
    }

    public EMPEmploymentDetails withC951(C951Occupation value) {
        setC951(value);
        return this;
    }

    public EMPEmploymentDetails withC950(C950QualificationClassification value) {
        setC950(value);
        return this;
    }

    public EMPEmploymentDetails withE3494(String value) {
        setE3494(value);
        return this;
    }

    public EMPEmploymentDetails withE9035(String value) {
        setE9035(value);
        return this;
    }

}