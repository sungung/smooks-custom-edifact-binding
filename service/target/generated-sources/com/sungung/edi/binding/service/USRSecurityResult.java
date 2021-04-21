//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.21 at 01:57:35 PM AEST 
//


package com.sungung.edi.binding.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USR-SecurityResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USR-SecurityResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="S508" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}S508-ValidationResult" maxOccurs="2"/&gt;
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
@XmlType(name = "USR-SecurityResult", propOrder = {
    "s508"
})
public class USRSecurityResult {

    @XmlElement(name = "S508", required = true)
    protected List<S508ValidationResult> s508;

    /**
     * Gets the value of the s508 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the s508 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getS508().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link S508ValidationResult }
     * 
     * 
     */
    public List<S508ValidationResult> getS508() {
        if (s508 == null) {
            s508 = new ArrayList<S508ValidationResult>();
        }
        return this.s508;
    }

    public USRSecurityResult withS508(S508ValidationResult... values) {
        if (values!= null) {
            for (S508ValidationResult value: values) {
                getS508().add(value);
            }
        }
        return this;
    }

    public USRSecurityResult withS508(Collection<S508ValidationResult> values) {
        if (values!= null) {
            getS508().addAll(values);
        }
        return this;
    }

}
