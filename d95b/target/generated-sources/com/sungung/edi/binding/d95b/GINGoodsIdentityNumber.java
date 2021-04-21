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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GIN-GoodsIdentityNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GIN-GoodsIdentityNumber"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E7405" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E7405-IdentityNumberQualifier"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="C208" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}C208-IdentityNumberRange" maxOccurs="4"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GIN-GoodsIdentityNumber", propOrder = {
    "e7405",
    "c208"
})
public class GINGoodsIdentityNumber {

    @XmlElement(name = "E7405", required = true)
    @XmlSchemaType(name = "string")
    protected E7405IdentityNumberQualifier e7405;
    @XmlElement(name = "C208", required = true, nillable = true)
    protected List<C208IdentityNumberRange> c208;

    /**
     * Gets the value of the e7405 property.
     * 
     * @return
     *     possible object is
     *     {@link E7405IdentityNumberQualifier }
     *     
     */
    public E7405IdentityNumberQualifier getE7405() {
        return e7405;
    }

    /**
     * Sets the value of the e7405 property.
     * 
     * @param value
     *     allowed object is
     *     {@link E7405IdentityNumberQualifier }
     *     
     */
    public void setE7405(E7405IdentityNumberQualifier value) {
        this.e7405 = value;
    }

    /**
     * Gets the value of the c208 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the c208 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getC208().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link C208IdentityNumberRange }
     * 
     * 
     */
    public List<C208IdentityNumberRange> getC208() {
        if (c208 == null) {
            c208 = new ArrayList<C208IdentityNumberRange>();
        }
        return this.c208;
    }

    public GINGoodsIdentityNumber withE7405(E7405IdentityNumberQualifier value) {
        setE7405(value);
        return this;
    }

    public GINGoodsIdentityNumber withC208(C208IdentityNumberRange... values) {
        if (values!= null) {
            for (C208IdentityNumberRange value: values) {
                getC208().add(value);
            }
        }
        return this;
    }

    public GINGoodsIdentityNumber withC208(Collection<C208IdentityNumberRange> values) {
        if (values!= null) {
            getC208().addAll(values);
        }
        return this;
    }

}