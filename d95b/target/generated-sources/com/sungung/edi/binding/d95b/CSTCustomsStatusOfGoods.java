//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.21 at 01:57:40 PM AEST 
//


package com.sungung.edi.binding.d95b;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CST-CustomsStatusOfGoods complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CST-CustomsStatusOfGoods"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E1496" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E1496-GoodsItemNumber" minOccurs="0"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="C246" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}C246-CustomsIdentityCodes" maxOccurs="4" minOccurs="0"/&gt;
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
@XmlType(name = "CST-CustomsStatusOfGoods", propOrder = {
    "e1496",
    "c246"
})
public class CSTCustomsStatusOfGoods {

    @XmlElement(name = "E1496")
    protected BigDecimal e1496;
    @XmlElement(name = "C246", nillable = true)
    protected List<C246CustomsIdentityCodes> c246;

    /**
     * Gets the value of the e1496 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getE1496() {
        return e1496;
    }

    /**
     * Sets the value of the e1496 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setE1496(BigDecimal value) {
        this.e1496 = value;
    }

    /**
     * Gets the value of the c246 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the c246 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getC246().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link C246CustomsIdentityCodes }
     * 
     * 
     */
    public List<C246CustomsIdentityCodes> getC246() {
        if (c246 == null) {
            c246 = new ArrayList<C246CustomsIdentityCodes>();
        }
        return this.c246;
    }

    public CSTCustomsStatusOfGoods withE1496(BigDecimal value) {
        setE1496(value);
        return this;
    }

    public CSTCustomsStatusOfGoods withC246(C246CustomsIdentityCodes... values) {
        if (values!= null) {
            for (C246CustomsIdentityCodes value: values) {
                getC246().add(value);
            }
        }
        return this;
    }

    public CSTCustomsStatusOfGoods withC246(Collection<C246CustomsIdentityCodes> values) {
        if (values!= null) {
            getC246().addAll(values);
        }
        return this;
    }

}
