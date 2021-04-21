//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.21 at 01:57:40 PM AEST 
//


package com.sungung.edi.binding.d95b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for C110-PaymentTerms complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="C110-PaymentTerms"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E4277" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E4277-TermsOfPaymentIdentification"/&gt;
 *         &lt;element name="E1131" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E1131-CodeListQualifier" minOccurs="0"/&gt;
 *         &lt;element name="E3055" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E3055-CodeListResponsibleAgencyCoded" minOccurs="0"/&gt;
 *         &lt;element name="E4276" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E4276-TermsOfPayment" maxOccurs="2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "C110-PaymentTerms", propOrder = {
    "e4277",
    "e1131",
    "e3055",
    "e4276"
})
public class C110PaymentTerms {

    @XmlElement(name = "E4277", required = true)
    protected String e4277;
    @XmlElement(name = "E1131")
    protected String e1131;
    @XmlElement(name = "E3055")
    protected String e3055;
    @XmlElement(name = "E4276")
    protected List<String> e4276;

    /**
     * Gets the value of the e4277 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE4277() {
        return e4277;
    }

    /**
     * Sets the value of the e4277 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE4277(String value) {
        this.e4277 = value;
    }

    /**
     * Gets the value of the e1131 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE1131() {
        return e1131;
    }

    /**
     * Sets the value of the e1131 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE1131(String value) {
        this.e1131 = value;
    }

    /**
     * Gets the value of the e3055 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE3055() {
        return e3055;
    }

    /**
     * Sets the value of the e3055 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE3055(String value) {
        this.e3055 = value;
    }

    /**
     * Gets the value of the e4276 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e4276 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE4276().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getE4276() {
        if (e4276 == null) {
            e4276 = new ArrayList<String>();
        }
        return this.e4276;
    }

    public C110PaymentTerms withE4277(String value) {
        setE4277(value);
        return this;
    }

    public C110PaymentTerms withE1131(String value) {
        setE1131(value);
        return this;
    }

    public C110PaymentTerms withE3055(String value) {
        setE3055(value);
        return this;
    }

    public C110PaymentTerms withE4276(String... values) {
        if (values!= null) {
            for (String value: values) {
                getE4276().add(value);
            }
        }
        return this;
    }

    public C110PaymentTerms withE4276(Collection<String> values) {
        if (values!= null) {
            getE4276().addAll(values);
        }
        return this;
    }

}
