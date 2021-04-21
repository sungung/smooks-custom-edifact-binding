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
 * <p>Java class for FCA-FinancialChargesAllocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FCA-FinancialChargesAllocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E4471" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E4471-SettlementCoded"/&gt;
 *         &lt;element name="C878" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}C878-ChargeAllowanceAccount" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FCA-FinancialChargesAllocation", propOrder = {
    "e4471",
    "c878"
})
public class FCAFinancialChargesAllocation {

    @XmlElement(name = "E4471", required = true)
    protected String e4471;
    @XmlElement(name = "C878")
    protected C878ChargeAllowanceAccount c878;

    /**
     * Gets the value of the e4471 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE4471() {
        return e4471;
    }

    /**
     * Sets the value of the e4471 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE4471(String value) {
        this.e4471 = value;
    }

    /**
     * Gets the value of the c878 property.
     * 
     * @return
     *     possible object is
     *     {@link C878ChargeAllowanceAccount }
     *     
     */
    public C878ChargeAllowanceAccount getC878() {
        return c878;
    }

    /**
     * Sets the value of the c878 property.
     * 
     * @param value
     *     allowed object is
     *     {@link C878ChargeAllowanceAccount }
     *     
     */
    public void setC878(C878ChargeAllowanceAccount value) {
        this.c878 = value;
    }

    public FCAFinancialChargesAllocation withE4471(String value) {
        setE4471(value);
        return this;
    }

    public FCAFinancialChargesAllocation withC878(C878ChargeAllowanceAccount value) {
        setC878(value);
        return this;
    }

}