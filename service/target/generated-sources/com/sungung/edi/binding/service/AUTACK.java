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
 * <p>Java class for AUTACK complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AUTACK"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SegGrp-1" maxOccurs="99"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="USH" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}USH-SecurityHeader"/&gt;
 *                     &lt;element name="USA" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}USA-SecurityAlgorithm" maxOccurs="3" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;element name="SegGrp-2" maxOccurs="2" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="USC" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}USC-Certificate"/&gt;
 *                               &lt;element name="USA" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}USA-SecurityAlgorithm" maxOccurs="3" minOccurs="0"/&gt;
 *                               &lt;element name="USR" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}USR-SecurityResult" minOccurs="0"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="USB" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}USB-SecuredDataIdentification"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="SegGrp-3" maxOccurs="9999"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="USX" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}USX-SecurityReferences"/&gt;
 *                     &lt;element name="USY" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}USY-SecurityOnReferences" maxOccurs="9"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SegGrp-4" maxOccurs="99"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="UST" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}UST-SecurityTrailer"/&gt;
 *                     &lt;element name="USR" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}USR-SecurityResult" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AUTACK", propOrder = {
    "segGrp1",
    "usb",
    "segGrp3",
    "segGrp4"
})
public class AUTACK {

    @XmlElement(name = "SegGrp-1", required = true)
    protected List<AUTACK.SegGrp1> segGrp1;
    @XmlElement(name = "USB", required = true)
    protected USBSecuredDataIdentification usb;
    @XmlElement(name = "SegGrp-3", required = true)
    protected List<AUTACK.SegGrp3> segGrp3;
    @XmlElement(name = "SegGrp-4", required = true)
    protected List<AUTACK.SegGrp4> segGrp4;

    /**
     * Gets the value of the segGrp1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segGrp1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegGrp1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AUTACK.SegGrp1 }
     * 
     * 
     */
    public List<AUTACK.SegGrp1> getSegGrp1() {
        if (segGrp1 == null) {
            segGrp1 = new ArrayList<AUTACK.SegGrp1>();
        }
        return this.segGrp1;
    }

    /**
     * Gets the value of the usb property.
     * 
     * @return
     *     possible object is
     *     {@link USBSecuredDataIdentification }
     *     
     */
    public USBSecuredDataIdentification getUSB() {
        return usb;
    }

    /**
     * Sets the value of the usb property.
     * 
     * @param value
     *     allowed object is
     *     {@link USBSecuredDataIdentification }
     *     
     */
    public void setUSB(USBSecuredDataIdentification value) {
        this.usb = value;
    }

    /**
     * Gets the value of the segGrp3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segGrp3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegGrp3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AUTACK.SegGrp3 }
     * 
     * 
     */
    public List<AUTACK.SegGrp3> getSegGrp3() {
        if (segGrp3 == null) {
            segGrp3 = new ArrayList<AUTACK.SegGrp3>();
        }
        return this.segGrp3;
    }

    /**
     * Gets the value of the segGrp4 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segGrp4 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegGrp4().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AUTACK.SegGrp4 }
     * 
     * 
     */
    public List<AUTACK.SegGrp4> getSegGrp4() {
        if (segGrp4 == null) {
            segGrp4 = new ArrayList<AUTACK.SegGrp4>();
        }
        return this.segGrp4;
    }

    public AUTACK withSegGrp1(AUTACK.SegGrp1 ... values) {
        if (values!= null) {
            for (AUTACK.SegGrp1 value: values) {
                getSegGrp1().add(value);
            }
        }
        return this;
    }

    public AUTACK withSegGrp1(Collection<AUTACK.SegGrp1> values) {
        if (values!= null) {
            getSegGrp1().addAll(values);
        }
        return this;
    }

    public AUTACK withUSB(USBSecuredDataIdentification value) {
        setUSB(value);
        return this;
    }

    public AUTACK withSegGrp3(AUTACK.SegGrp3 ... values) {
        if (values!= null) {
            for (AUTACK.SegGrp3 value: values) {
                getSegGrp3().add(value);
            }
        }
        return this;
    }

    public AUTACK withSegGrp3(Collection<AUTACK.SegGrp3> values) {
        if (values!= null) {
            getSegGrp3().addAll(values);
        }
        return this;
    }

    public AUTACK withSegGrp4(AUTACK.SegGrp4 ... values) {
        if (values!= null) {
            for (AUTACK.SegGrp4 value: values) {
                getSegGrp4().add(value);
            }
        }
        return this;
    }

    public AUTACK withSegGrp4(Collection<AUTACK.SegGrp4> values) {
        if (values!= null) {
            getSegGrp4().addAll(values);
        }
        return this;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;sequence&gt;
     *           &lt;element name="USH" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}USH-SecurityHeader"/&gt;
     *           &lt;element name="USA" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}USA-SecurityAlgorithm" maxOccurs="3" minOccurs="0"/&gt;
     *         &lt;/sequence&gt;
     *         &lt;element name="SegGrp-2" maxOccurs="2" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="USC" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}USC-Certificate"/&gt;
     *                     &lt;element name="USA" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}USA-SecurityAlgorithm" maxOccurs="3" minOccurs="0"/&gt;
     *                     &lt;element name="USR" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}USR-SecurityResult" minOccurs="0"/&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ush",
        "usa",
        "segGrp2"
    })
    public static class SegGrp1 {

        @XmlElement(name = "USH", required = true)
        protected USHSecurityHeader ush;
        @XmlElement(name = "USA")
        protected List<USASecurityAlgorithm> usa;
        @XmlElement(name = "SegGrp-2")
        protected List<AUTACK.SegGrp1 .SegGrp2> segGrp2;

        /**
         * Gets the value of the ush property.
         * 
         * @return
         *     possible object is
         *     {@link USHSecurityHeader }
         *     
         */
        public USHSecurityHeader getUSH() {
            return ush;
        }

        /**
         * Sets the value of the ush property.
         * 
         * @param value
         *     allowed object is
         *     {@link USHSecurityHeader }
         *     
         */
        public void setUSH(USHSecurityHeader value) {
            this.ush = value;
        }

        /**
         * Gets the value of the usa property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the usa property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUSA().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link USASecurityAlgorithm }
         * 
         * 
         */
        public List<USASecurityAlgorithm> getUSA() {
            if (usa == null) {
                usa = new ArrayList<USASecurityAlgorithm>();
            }
            return this.usa;
        }

        /**
         * Gets the value of the segGrp2 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the segGrp2 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSegGrp2().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AUTACK.SegGrp1 .SegGrp2 }
         * 
         * 
         */
        public List<AUTACK.SegGrp1 .SegGrp2> getSegGrp2() {
            if (segGrp2 == null) {
                segGrp2 = new ArrayList<AUTACK.SegGrp1 .SegGrp2>();
            }
            return this.segGrp2;
        }

        public AUTACK.SegGrp1 withUSH(USHSecurityHeader value) {
            setUSH(value);
            return this;
        }

        public AUTACK.SegGrp1 withUSA(USASecurityAlgorithm... values) {
            if (values!= null) {
                for (USASecurityAlgorithm value: values) {
                    getUSA().add(value);
                }
            }
            return this;
        }

        public AUTACK.SegGrp1 withUSA(Collection<USASecurityAlgorithm> values) {
            if (values!= null) {
                getUSA().addAll(values);
            }
            return this;
        }

        public AUTACK.SegGrp1 withSegGrp2(AUTACK.SegGrp1 .SegGrp2 ... values) {
            if (values!= null) {
                for (AUTACK.SegGrp1 .SegGrp2 value: values) {
                    getSegGrp2().add(value);
                }
            }
            return this;
        }

        public AUTACK.SegGrp1 withSegGrp2(Collection<AUTACK.SegGrp1 .SegGrp2> values) {
            if (values!= null) {
                getSegGrp2().addAll(values);
            }
            return this;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;sequence&gt;
         *           &lt;element name="USC" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}USC-Certificate"/&gt;
         *           &lt;element name="USA" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}USA-SecurityAlgorithm" maxOccurs="3" minOccurs="0"/&gt;
         *           &lt;element name="USR" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}USR-SecurityResult" minOccurs="0"/&gt;
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
        @XmlType(name = "", propOrder = {
            "usc",
            "usa",
            "usr"
        })
        public static class SegGrp2 {

            @XmlElement(name = "USC", required = true)
            protected USCCertificate usc;
            @XmlElement(name = "USA")
            protected List<USASecurityAlgorithm> usa;
            @XmlElement(name = "USR")
            protected USRSecurityResult usr;

            /**
             * Gets the value of the usc property.
             * 
             * @return
             *     possible object is
             *     {@link USCCertificate }
             *     
             */
            public USCCertificate getUSC() {
                return usc;
            }

            /**
             * Sets the value of the usc property.
             * 
             * @param value
             *     allowed object is
             *     {@link USCCertificate }
             *     
             */
            public void setUSC(USCCertificate value) {
                this.usc = value;
            }

            /**
             * Gets the value of the usa property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the usa property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getUSA().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link USASecurityAlgorithm }
             * 
             * 
             */
            public List<USASecurityAlgorithm> getUSA() {
                if (usa == null) {
                    usa = new ArrayList<USASecurityAlgorithm>();
                }
                return this.usa;
            }

            /**
             * Gets the value of the usr property.
             * 
             * @return
             *     possible object is
             *     {@link USRSecurityResult }
             *     
             */
            public USRSecurityResult getUSR() {
                return usr;
            }

            /**
             * Sets the value of the usr property.
             * 
             * @param value
             *     allowed object is
             *     {@link USRSecurityResult }
             *     
             */
            public void setUSR(USRSecurityResult value) {
                this.usr = value;
            }

            public AUTACK.SegGrp1 .SegGrp2 withUSC(USCCertificate value) {
                setUSC(value);
                return this;
            }

            public AUTACK.SegGrp1 .SegGrp2 withUSA(USASecurityAlgorithm... values) {
                if (values!= null) {
                    for (USASecurityAlgorithm value: values) {
                        getUSA().add(value);
                    }
                }
                return this;
            }

            public AUTACK.SegGrp1 .SegGrp2 withUSA(Collection<USASecurityAlgorithm> values) {
                if (values!= null) {
                    getUSA().addAll(values);
                }
                return this;
            }

            public AUTACK.SegGrp1 .SegGrp2 withUSR(USRSecurityResult value) {
                setUSR(value);
                return this;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;sequence&gt;
     *           &lt;element name="USX" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}USX-SecurityReferences"/&gt;
     *           &lt;element name="USY" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}USY-SecurityOnReferences" maxOccurs="9"/&gt;
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
    @XmlType(name = "", propOrder = {
        "usx",
        "usy"
    })
    public static class SegGrp3 {

        @XmlElement(name = "USX", required = true)
        protected USXSecurityReferences usx;
        @XmlElement(name = "USY", required = true)
        protected List<USYSecurityOnReferences> usy;

        /**
         * Gets the value of the usx property.
         * 
         * @return
         *     possible object is
         *     {@link USXSecurityReferences }
         *     
         */
        public USXSecurityReferences getUSX() {
            return usx;
        }

        /**
         * Sets the value of the usx property.
         * 
         * @param value
         *     allowed object is
         *     {@link USXSecurityReferences }
         *     
         */
        public void setUSX(USXSecurityReferences value) {
            this.usx = value;
        }

        /**
         * Gets the value of the usy property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the usy property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUSY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link USYSecurityOnReferences }
         * 
         * 
         */
        public List<USYSecurityOnReferences> getUSY() {
            if (usy == null) {
                usy = new ArrayList<USYSecurityOnReferences>();
            }
            return this.usy;
        }

        public AUTACK.SegGrp3 withUSX(USXSecurityReferences value) {
            setUSX(value);
            return this;
        }

        public AUTACK.SegGrp3 withUSY(USYSecurityOnReferences... values) {
            if (values!= null) {
                for (USYSecurityOnReferences value: values) {
                    getUSY().add(value);
                }
            }
            return this;
        }

        public AUTACK.SegGrp3 withUSY(Collection<USYSecurityOnReferences> values) {
            if (values!= null) {
                getUSY().addAll(values);
            }
            return this;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;sequence&gt;
     *           &lt;element name="UST" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}UST-SecurityTrailer"/&gt;
     *           &lt;element name="USR" type="{http://www.ibm.com/dfdl/edi/un/service/4.1}USR-SecurityResult" minOccurs="0"/&gt;
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
    @XmlType(name = "", propOrder = {
        "ust",
        "usr"
    })
    public static class SegGrp4 {

        @XmlElement(name = "UST", required = true)
        protected USTSecurityTrailer ust;
        @XmlElement(name = "USR")
        protected USRSecurityResult usr;

        /**
         * Gets the value of the ust property.
         * 
         * @return
         *     possible object is
         *     {@link USTSecurityTrailer }
         *     
         */
        public USTSecurityTrailer getUST() {
            return ust;
        }

        /**
         * Sets the value of the ust property.
         * 
         * @param value
         *     allowed object is
         *     {@link USTSecurityTrailer }
         *     
         */
        public void setUST(USTSecurityTrailer value) {
            this.ust = value;
        }

        /**
         * Gets the value of the usr property.
         * 
         * @return
         *     possible object is
         *     {@link USRSecurityResult }
         *     
         */
        public USRSecurityResult getUSR() {
            return usr;
        }

        /**
         * Sets the value of the usr property.
         * 
         * @param value
         *     allowed object is
         *     {@link USRSecurityResult }
         *     
         */
        public void setUSR(USRSecurityResult value) {
            this.usr = value;
        }

        public AUTACK.SegGrp4 withUST(USTSecurityTrailer value) {
            setUST(value);
            return this;
        }

        public AUTACK.SegGrp4 withUSR(USRSecurityResult value) {
            setUSR(value);
            return this;
        }

    }

}