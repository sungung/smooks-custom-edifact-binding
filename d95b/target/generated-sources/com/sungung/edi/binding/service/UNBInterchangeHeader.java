//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.21 at 01:57:40 PM AEST 
//


package com.sungung.edi.binding.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UNB-InterchangeHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UNB-InterchangeHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="S001" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}S001-SyntaxIdentifier"/&gt;
 *         &lt;element name="S002" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}S002-InterchangeSender"/&gt;
 *         &lt;element name="S003" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}S003-InterchangeRecipient"/&gt;
 *         &lt;element name="S004" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}S004-DateAndTimeOfPreparation"/&gt;
 *         &lt;element name="E0020" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}E0020-InterchangeControlReference"/&gt;
 *         &lt;element name="S005" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}S005-RecipientReferencePasswordDetails" minOccurs="0"/&gt;
 *         &lt;element name="E0026" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}E0026-ApplicationReference" minOccurs="0"/&gt;
 *         &lt;element name="E0029" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}E0029-ProcessingPriorityCode" minOccurs="0"/&gt;
 *         &lt;element name="E0031" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}E0031-AcknowledgementRequest" minOccurs="0"/&gt;
 *         &lt;element name="E0032" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}E0032-InterchangeAgreementIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="E0035" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}E0035-TestIndicator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UNB-InterchangeHeader", propOrder = {
    "s001",
    "s002",
    "s003",
    "s004",
    "e0020",
    "s005",
    "e0026",
    "e0029",
    "e0031",
    "e0032",
    "e0035"
})
public class UNBInterchangeHeader {

    @XmlElement(name = "S001", required = true)
    protected S001SyntaxIdentifier s001;
    @XmlElement(name = "S002", required = true)
    protected S002InterchangeSender s002;
    @XmlElement(name = "S003", required = true)
    protected S003InterchangeRecipient s003;
    @XmlElement(name = "S004", required = true)
    protected S004DateAndTimeOfPreparation s004;
    @XmlElement(name = "E0020", required = true)
    protected String e0020;
    @XmlElement(name = "S005")
    protected S005RecipientReferencePasswordDetails s005;
    @XmlElement(name = "E0026")
    protected String e0026;
    @XmlElement(name = "E0029")
    @XmlSchemaType(name = "string")
    protected E0029ProcessingPriorityCode e0029;
    @XmlElement(name = "E0031")
    protected BigDecimal e0031;
    @XmlElement(name = "E0032")
    protected String e0032;
    @XmlElement(name = "E0035")
    protected BigDecimal e0035;

    /**
     * Gets the value of the s001 property.
     * 
     * @return
     *     possible object is
     *     {@link S001SyntaxIdentifier }
     *     
     */
    public S001SyntaxIdentifier getS001() {
        return s001;
    }

    /**
     * Sets the value of the s001 property.
     * 
     * @param value
     *     allowed object is
     *     {@link S001SyntaxIdentifier }
     *     
     */
    public void setS001(S001SyntaxIdentifier value) {
        this.s001 = value;
    }

    /**
     * Gets the value of the s002 property.
     * 
     * @return
     *     possible object is
     *     {@link S002InterchangeSender }
     *     
     */
    public S002InterchangeSender getS002() {
        return s002;
    }

    /**
     * Sets the value of the s002 property.
     * 
     * @param value
     *     allowed object is
     *     {@link S002InterchangeSender }
     *     
     */
    public void setS002(S002InterchangeSender value) {
        this.s002 = value;
    }

    /**
     * Gets the value of the s003 property.
     * 
     * @return
     *     possible object is
     *     {@link S003InterchangeRecipient }
     *     
     */
    public S003InterchangeRecipient getS003() {
        return s003;
    }

    /**
     * Sets the value of the s003 property.
     * 
     * @param value
     *     allowed object is
     *     {@link S003InterchangeRecipient }
     *     
     */
    public void setS003(S003InterchangeRecipient value) {
        this.s003 = value;
    }

    /**
     * Gets the value of the s004 property.
     * 
     * @return
     *     possible object is
     *     {@link S004DateAndTimeOfPreparation }
     *     
     */
    public S004DateAndTimeOfPreparation getS004() {
        return s004;
    }

    /**
     * Sets the value of the s004 property.
     * 
     * @param value
     *     allowed object is
     *     {@link S004DateAndTimeOfPreparation }
     *     
     */
    public void setS004(S004DateAndTimeOfPreparation value) {
        this.s004 = value;
    }

    /**
     * Gets the value of the e0020 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE0020() {
        return e0020;
    }

    /**
     * Sets the value of the e0020 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE0020(String value) {
        this.e0020 = value;
    }

    /**
     * Gets the value of the s005 property.
     * 
     * @return
     *     possible object is
     *     {@link S005RecipientReferencePasswordDetails }
     *     
     */
    public S005RecipientReferencePasswordDetails getS005() {
        return s005;
    }

    /**
     * Sets the value of the s005 property.
     * 
     * @param value
     *     allowed object is
     *     {@link S005RecipientReferencePasswordDetails }
     *     
     */
    public void setS005(S005RecipientReferencePasswordDetails value) {
        this.s005 = value;
    }

    /**
     * Gets the value of the e0026 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE0026() {
        return e0026;
    }

    /**
     * Sets the value of the e0026 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE0026(String value) {
        this.e0026 = value;
    }

    /**
     * Gets the value of the e0029 property.
     * 
     * @return
     *     possible object is
     *     {@link E0029ProcessingPriorityCode }
     *     
     */
    public E0029ProcessingPriorityCode getE0029() {
        return e0029;
    }

    /**
     * Sets the value of the e0029 property.
     * 
     * @param value
     *     allowed object is
     *     {@link E0029ProcessingPriorityCode }
     *     
     */
    public void setE0029(E0029ProcessingPriorityCode value) {
        this.e0029 = value;
    }

    /**
     * Gets the value of the e0031 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getE0031() {
        return e0031;
    }

    /**
     * Sets the value of the e0031 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setE0031(BigDecimal value) {
        this.e0031 = value;
    }

    /**
     * Gets the value of the e0032 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE0032() {
        return e0032;
    }

    /**
     * Sets the value of the e0032 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE0032(String value) {
        this.e0032 = value;
    }

    /**
     * Gets the value of the e0035 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getE0035() {
        return e0035;
    }

    /**
     * Sets the value of the e0035 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setE0035(BigDecimal value) {
        this.e0035 = value;
    }

    public UNBInterchangeHeader withS001(S001SyntaxIdentifier value) {
        setS001(value);
        return this;
    }

    public UNBInterchangeHeader withS002(S002InterchangeSender value) {
        setS002(value);
        return this;
    }

    public UNBInterchangeHeader withS003(S003InterchangeRecipient value) {
        setS003(value);
        return this;
    }

    public UNBInterchangeHeader withS004(S004DateAndTimeOfPreparation value) {
        setS004(value);
        return this;
    }

    public UNBInterchangeHeader withE0020(String value) {
        setE0020(value);
        return this;
    }

    public UNBInterchangeHeader withS005(S005RecipientReferencePasswordDetails value) {
        setS005(value);
        return this;
    }

    public UNBInterchangeHeader withE0026(String value) {
        setE0026(value);
        return this;
    }

    public UNBInterchangeHeader withE0029(E0029ProcessingPriorityCode value) {
        setE0029(value);
        return this;
    }

    public UNBInterchangeHeader withE0031(BigDecimal value) {
        setE0031(value);
        return this;
    }

    public UNBInterchangeHeader withE0032(String value) {
        setE0032(value);
        return this;
    }

    public UNBInterchangeHeader withE0035(BigDecimal value) {
        setE0035(value);
        return this;
    }

}
