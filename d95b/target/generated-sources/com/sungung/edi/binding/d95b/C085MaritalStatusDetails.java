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
 * <p>Java class for C085-MaritalStatusDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="C085-MaritalStatusDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E3479" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E3479-MaritalStatusCoded" minOccurs="0"/&gt;
 *         &lt;element name="E1131" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E1131-CodeListQualifier" minOccurs="0"/&gt;
 *         &lt;element name="E3055" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E3055-CodeListResponsibleAgencyCoded" minOccurs="0"/&gt;
 *         &lt;element name="E3478" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}E3478-MaritalStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "C085-MaritalStatusDetails", propOrder = {
    "e3479",
    "e1131",
    "e3055",
    "e3478"
})
public class C085MaritalStatusDetails {

    @XmlElement(name = "E3479")
    protected String e3479;
    @XmlElement(name = "E1131")
    protected String e1131;
    @XmlElement(name = "E3055")
    protected String e3055;
    @XmlElement(name = "E3478")
    protected String e3478;

    /**
     * Gets the value of the e3479 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE3479() {
        return e3479;
    }

    /**
     * Sets the value of the e3479 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE3479(String value) {
        this.e3479 = value;
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
     * Gets the value of the e3478 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE3478() {
        return e3478;
    }

    /**
     * Sets the value of the e3478 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE3478(String value) {
        this.e3478 = value;
    }

    public C085MaritalStatusDetails withE3479(String value) {
        setE3479(value);
        return this;
    }

    public C085MaritalStatusDetails withE1131(String value) {
        setE1131(value);
        return this;
    }

    public C085MaritalStatusDetails withE3055(String value) {
        setE3055(value);
        return this;
    }

    public C085MaritalStatusDetails withE3478(String value) {
        setE3478(value);
        return this;
    }

}
