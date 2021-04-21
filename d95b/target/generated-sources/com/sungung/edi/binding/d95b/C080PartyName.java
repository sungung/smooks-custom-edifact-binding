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
 * <p>Java class for C080-PartyName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="C080-PartyName"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E3036" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E3036-PartyName" maxOccurs="5"/&gt;
 *         &lt;element name="E3045" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E3045-PartyNameFormatCoded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "C080-PartyName", propOrder = {
    "e3036",
    "e3045"
})
public class C080PartyName {

    @XmlElement(name = "E3036", required = true)
    protected List<String> e3036;
    @XmlElement(name = "E3045")
    protected String e3045;

    /**
     * Gets the value of the e3036 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e3036 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE3036().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getE3036() {
        if (e3036 == null) {
            e3036 = new ArrayList<String>();
        }
        return this.e3036;
    }

    /**
     * Gets the value of the e3045 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE3045() {
        return e3045;
    }

    /**
     * Sets the value of the e3045 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE3045(String value) {
        this.e3045 = value;
    }

    public C080PartyName withE3036(String... values) {
        if (values!= null) {
            for (String value: values) {
                getE3036().add(value);
            }
        }
        return this;
    }

    public C080PartyName withE3036(Collection<String> values) {
        if (values!= null) {
            getE3036().addAll(values);
        }
        return this;
    }

    public C080PartyName withE3045(String value) {
        setE3045(value);
        return this;
    }

}