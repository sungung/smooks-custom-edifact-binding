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
 * <p>Java class for BOPINF complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BOPINF"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="BGM" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}BGM-BeginningOfMessage"/&gt;
 *           &lt;element name="DTM" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}DTM-DateTimePeriod" maxOccurs="3"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="SegGrp-1" maxOccurs="2" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="RFF" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}RFF-Reference"/&gt;
 *                     &lt;element name="DTM" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}DTM-DateTimePeriod" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SegGrp-2" maxOccurs="2"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="NAD" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}NAD-NameAndAddress"/&gt;
 *                     &lt;element name="CTA" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}CTA-ContactInformation" minOccurs="0"/&gt;
 *                     &lt;element name="COM" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}COM-CommunicationContact" maxOccurs="5" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SegGrp-3" maxOccurs="999" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="LIN" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}LIN-LineItem"/&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;element name="SegGrp-4" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="RFF" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}RFF-Reference"/&gt;
 *                               &lt;element name="DTM" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}DTM-DateTimePeriod" minOccurs="0"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SegGrp-5" maxOccurs="10"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="RCS" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}RCS-RequirementsAndConditions"/&gt;
 *                               &lt;element name="FTX" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}FTX-FreeText" maxOccurs="10" minOccurs="0"/&gt;
 *                               &lt;element name="MOA" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}MOA-MonetaryAmount" minOccurs="0"/&gt;
 *                               &lt;element name="LOC" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}LOC-PlaceLocationIdentification" maxOccurs="4" minOccurs="0"/&gt;
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
 *         &lt;element name="SegGrp-6" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="AUT" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}AUT-AuthenticationResult"/&gt;
 *                     &lt;element name="DTM" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}DTM-DateTimePeriod" minOccurs="0"/&gt;
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
@XmlType(name = "BOPINF", propOrder = {
    "bgm",
    "dtm",
    "segGrp1",
    "segGrp2",
    "segGrp3",
    "segGrp6"
})
public class BOPINF {

    @XmlElement(name = "BGM", required = true)
    protected BGMBeginningOfMessage bgm;
    @XmlElement(name = "DTM", required = true)
    protected List<DTMDateTimePeriod> dtm;
    @XmlElement(name = "SegGrp-1")
    protected List<BOPINF.SegGrp1> segGrp1;
    @XmlElement(name = "SegGrp-2", required = true)
    protected List<BOPINF.SegGrp2> segGrp2;
    @XmlElement(name = "SegGrp-3")
    protected List<BOPINF.SegGrp3> segGrp3;
    @XmlElement(name = "SegGrp-6")
    protected BOPINF.SegGrp6 segGrp6;

    /**
     * Gets the value of the bgm property.
     * 
     * @return
     *     possible object is
     *     {@link BGMBeginningOfMessage }
     *     
     */
    public BGMBeginningOfMessage getBGM() {
        return bgm;
    }

    /**
     * Sets the value of the bgm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BGMBeginningOfMessage }
     *     
     */
    public void setBGM(BGMBeginningOfMessage value) {
        this.bgm = value;
    }

    /**
     * Gets the value of the dtm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dtm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDTM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTMDateTimePeriod }
     * 
     * 
     */
    public List<DTMDateTimePeriod> getDTM() {
        if (dtm == null) {
            dtm = new ArrayList<DTMDateTimePeriod>();
        }
        return this.dtm;
    }

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
     * {@link BOPINF.SegGrp1 }
     * 
     * 
     */
    public List<BOPINF.SegGrp1> getSegGrp1() {
        if (segGrp1 == null) {
            segGrp1 = new ArrayList<BOPINF.SegGrp1>();
        }
        return this.segGrp1;
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
     * {@link BOPINF.SegGrp2 }
     * 
     * 
     */
    public List<BOPINF.SegGrp2> getSegGrp2() {
        if (segGrp2 == null) {
            segGrp2 = new ArrayList<BOPINF.SegGrp2>();
        }
        return this.segGrp2;
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
     * {@link BOPINF.SegGrp3 }
     * 
     * 
     */
    public List<BOPINF.SegGrp3> getSegGrp3() {
        if (segGrp3 == null) {
            segGrp3 = new ArrayList<BOPINF.SegGrp3>();
        }
        return this.segGrp3;
    }

    /**
     * Gets the value of the segGrp6 property.
     * 
     * @return
     *     possible object is
     *     {@link BOPINF.SegGrp6 }
     *     
     */
    public BOPINF.SegGrp6 getSegGrp6() {
        return segGrp6;
    }

    /**
     * Sets the value of the segGrp6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BOPINF.SegGrp6 }
     *     
     */
    public void setSegGrp6(BOPINF.SegGrp6 value) {
        this.segGrp6 = value;
    }

    public BOPINF withBGM(BGMBeginningOfMessage value) {
        setBGM(value);
        return this;
    }

    public BOPINF withDTM(DTMDateTimePeriod... values) {
        if (values!= null) {
            for (DTMDateTimePeriod value: values) {
                getDTM().add(value);
            }
        }
        return this;
    }

    public BOPINF withDTM(Collection<DTMDateTimePeriod> values) {
        if (values!= null) {
            getDTM().addAll(values);
        }
        return this;
    }

    public BOPINF withSegGrp1(BOPINF.SegGrp1 ... values) {
        if (values!= null) {
            for (BOPINF.SegGrp1 value: values) {
                getSegGrp1().add(value);
            }
        }
        return this;
    }

    public BOPINF withSegGrp1(Collection<BOPINF.SegGrp1> values) {
        if (values!= null) {
            getSegGrp1().addAll(values);
        }
        return this;
    }

    public BOPINF withSegGrp2(BOPINF.SegGrp2 ... values) {
        if (values!= null) {
            for (BOPINF.SegGrp2 value: values) {
                getSegGrp2().add(value);
            }
        }
        return this;
    }

    public BOPINF withSegGrp2(Collection<BOPINF.SegGrp2> values) {
        if (values!= null) {
            getSegGrp2().addAll(values);
        }
        return this;
    }

    public BOPINF withSegGrp3(BOPINF.SegGrp3 ... values) {
        if (values!= null) {
            for (BOPINF.SegGrp3 value: values) {
                getSegGrp3().add(value);
            }
        }
        return this;
    }

    public BOPINF withSegGrp3(Collection<BOPINF.SegGrp3> values) {
        if (values!= null) {
            getSegGrp3().addAll(values);
        }
        return this;
    }

    public BOPINF withSegGrp6(BOPINF.SegGrp6 value) {
        setSegGrp6(value);
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
     *           &lt;element name="RFF" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}RFF-Reference"/&gt;
     *           &lt;element name="DTM" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}DTM-DateTimePeriod" minOccurs="0"/&gt;
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
        "rff",
        "dtm"
    })
    public static class SegGrp1 {

        @XmlElement(name = "RFF", required = true)
        protected RFFReference rff;
        @XmlElement(name = "DTM")
        protected DTMDateTimePeriod dtm;

        /**
         * Gets the value of the rff property.
         * 
         * @return
         *     possible object is
         *     {@link RFFReference }
         *     
         */
        public RFFReference getRFF() {
            return rff;
        }

        /**
         * Sets the value of the rff property.
         * 
         * @param value
         *     allowed object is
         *     {@link RFFReference }
         *     
         */
        public void setRFF(RFFReference value) {
            this.rff = value;
        }

        /**
         * Gets the value of the dtm property.
         * 
         * @return
         *     possible object is
         *     {@link DTMDateTimePeriod }
         *     
         */
        public DTMDateTimePeriod getDTM() {
            return dtm;
        }

        /**
         * Sets the value of the dtm property.
         * 
         * @param value
         *     allowed object is
         *     {@link DTMDateTimePeriod }
         *     
         */
        public void setDTM(DTMDateTimePeriod value) {
            this.dtm = value;
        }

        public BOPINF.SegGrp1 withRFF(RFFReference value) {
            setRFF(value);
            return this;
        }

        public BOPINF.SegGrp1 withDTM(DTMDateTimePeriod value) {
            setDTM(value);
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
     *           &lt;element name="NAD" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}NAD-NameAndAddress"/&gt;
     *           &lt;element name="CTA" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}CTA-ContactInformation" minOccurs="0"/&gt;
     *           &lt;element name="COM" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}COM-CommunicationContact" maxOccurs="5" minOccurs="0"/&gt;
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
        "nad",
        "cta",
        "com"
    })
    public static class SegGrp2 {

        @XmlElement(name = "NAD", required = true)
        protected NADNameAndAddress nad;
        @XmlElement(name = "CTA")
        protected CTAContactInformation cta;
        @XmlElement(name = "COM")
        protected List<COMCommunicationContact> com;

        /**
         * Gets the value of the nad property.
         * 
         * @return
         *     possible object is
         *     {@link NADNameAndAddress }
         *     
         */
        public NADNameAndAddress getNAD() {
            return nad;
        }

        /**
         * Sets the value of the nad property.
         * 
         * @param value
         *     allowed object is
         *     {@link NADNameAndAddress }
         *     
         */
        public void setNAD(NADNameAndAddress value) {
            this.nad = value;
        }

        /**
         * Gets the value of the cta property.
         * 
         * @return
         *     possible object is
         *     {@link CTAContactInformation }
         *     
         */
        public CTAContactInformation getCTA() {
            return cta;
        }

        /**
         * Sets the value of the cta property.
         * 
         * @param value
         *     allowed object is
         *     {@link CTAContactInformation }
         *     
         */
        public void setCTA(CTAContactInformation value) {
            this.cta = value;
        }

        /**
         * Gets the value of the com property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the com property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCOM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link COMCommunicationContact }
         * 
         * 
         */
        public List<COMCommunicationContact> getCOM() {
            if (com == null) {
                com = new ArrayList<COMCommunicationContact>();
            }
            return this.com;
        }

        public BOPINF.SegGrp2 withNAD(NADNameAndAddress value) {
            setNAD(value);
            return this;
        }

        public BOPINF.SegGrp2 withCTA(CTAContactInformation value) {
            setCTA(value);
            return this;
        }

        public BOPINF.SegGrp2 withCOM(COMCommunicationContact... values) {
            if (values!= null) {
                for (COMCommunicationContact value: values) {
                    getCOM().add(value);
                }
            }
            return this;
        }

        public BOPINF.SegGrp2 withCOM(Collection<COMCommunicationContact> values) {
            if (values!= null) {
                getCOM().addAll(values);
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
     *           &lt;element name="LIN" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}LIN-LineItem"/&gt;
     *         &lt;/sequence&gt;
     *         &lt;element name="SegGrp-4" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="RFF" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}RFF-Reference"/&gt;
     *                     &lt;element name="DTM" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}DTM-DateTimePeriod" minOccurs="0"/&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SegGrp-5" maxOccurs="10"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="RCS" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}RCS-RequirementsAndConditions"/&gt;
     *                     &lt;element name="FTX" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}FTX-FreeText" maxOccurs="10" minOccurs="0"/&gt;
     *                     &lt;element name="MOA" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}MOA-MonetaryAmount" minOccurs="0"/&gt;
     *                     &lt;element name="LOC" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}LOC-PlaceLocationIdentification" maxOccurs="4" minOccurs="0"/&gt;
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
        "lin",
        "segGrp4",
        "segGrp5"
    })
    public static class SegGrp3 {

        @XmlElement(name = "LIN", required = true)
        protected LINLineItem lin;
        @XmlElement(name = "SegGrp-4")
        protected BOPINF.SegGrp3 .SegGrp4 segGrp4;
        @XmlElement(name = "SegGrp-5", required = true)
        protected List<BOPINF.SegGrp3 .SegGrp5> segGrp5;

        /**
         * Gets the value of the lin property.
         * 
         * @return
         *     possible object is
         *     {@link LINLineItem }
         *     
         */
        public LINLineItem getLIN() {
            return lin;
        }

        /**
         * Sets the value of the lin property.
         * 
         * @param value
         *     allowed object is
         *     {@link LINLineItem }
         *     
         */
        public void setLIN(LINLineItem value) {
            this.lin = value;
        }

        /**
         * Gets the value of the segGrp4 property.
         * 
         * @return
         *     possible object is
         *     {@link BOPINF.SegGrp3 .SegGrp4 }
         *     
         */
        public BOPINF.SegGrp3 .SegGrp4 getSegGrp4() {
            return segGrp4;
        }

        /**
         * Sets the value of the segGrp4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BOPINF.SegGrp3 .SegGrp4 }
         *     
         */
        public void setSegGrp4(BOPINF.SegGrp3 .SegGrp4 value) {
            this.segGrp4 = value;
        }

        /**
         * Gets the value of the segGrp5 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the segGrp5 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSegGrp5().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BOPINF.SegGrp3 .SegGrp5 }
         * 
         * 
         */
        public List<BOPINF.SegGrp3 .SegGrp5> getSegGrp5() {
            if (segGrp5 == null) {
                segGrp5 = new ArrayList<BOPINF.SegGrp3 .SegGrp5>();
            }
            return this.segGrp5;
        }

        public BOPINF.SegGrp3 withLIN(LINLineItem value) {
            setLIN(value);
            return this;
        }

        public BOPINF.SegGrp3 withSegGrp4(BOPINF.SegGrp3 .SegGrp4 value) {
            setSegGrp4(value);
            return this;
        }

        public BOPINF.SegGrp3 withSegGrp5(BOPINF.SegGrp3 .SegGrp5 ... values) {
            if (values!= null) {
                for (BOPINF.SegGrp3 .SegGrp5 value: values) {
                    getSegGrp5().add(value);
                }
            }
            return this;
        }

        public BOPINF.SegGrp3 withSegGrp5(Collection<BOPINF.SegGrp3 .SegGrp5> values) {
            if (values!= null) {
                getSegGrp5().addAll(values);
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
         *           &lt;element name="RFF" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}RFF-Reference"/&gt;
         *           &lt;element name="DTM" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}DTM-DateTimePeriod" minOccurs="0"/&gt;
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
            "rff",
            "dtm"
        })
        public static class SegGrp4 {

            @XmlElement(name = "RFF", required = true)
            protected RFFReference rff;
            @XmlElement(name = "DTM")
            protected DTMDateTimePeriod dtm;

            /**
             * Gets the value of the rff property.
             * 
             * @return
             *     possible object is
             *     {@link RFFReference }
             *     
             */
            public RFFReference getRFF() {
                return rff;
            }

            /**
             * Sets the value of the rff property.
             * 
             * @param value
             *     allowed object is
             *     {@link RFFReference }
             *     
             */
            public void setRFF(RFFReference value) {
                this.rff = value;
            }

            /**
             * Gets the value of the dtm property.
             * 
             * @return
             *     possible object is
             *     {@link DTMDateTimePeriod }
             *     
             */
            public DTMDateTimePeriod getDTM() {
                return dtm;
            }

            /**
             * Sets the value of the dtm property.
             * 
             * @param value
             *     allowed object is
             *     {@link DTMDateTimePeriod }
             *     
             */
            public void setDTM(DTMDateTimePeriod value) {
                this.dtm = value;
            }

            public BOPINF.SegGrp3 .SegGrp4 withRFF(RFFReference value) {
                setRFF(value);
                return this;
            }

            public BOPINF.SegGrp3 .SegGrp4 withDTM(DTMDateTimePeriod value) {
                setDTM(value);
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
         *           &lt;element name="RCS" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}RCS-RequirementsAndConditions"/&gt;
         *           &lt;element name="FTX" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}FTX-FreeText" maxOccurs="10" minOccurs="0"/&gt;
         *           &lt;element name="MOA" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}MOA-MonetaryAmount" minOccurs="0"/&gt;
         *           &lt;element name="LOC" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}LOC-PlaceLocationIdentification" maxOccurs="4" minOccurs="0"/&gt;
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
            "rcs",
            "ftx",
            "moa",
            "loc"
        })
        public static class SegGrp5 {

            @XmlElement(name = "RCS", required = true)
            protected RCSRequirementsAndConditions rcs;
            @XmlElement(name = "FTX")
            protected List<FTXFreeText> ftx;
            @XmlElement(name = "MOA")
            protected MOAMonetaryAmount moa;
            @XmlElement(name = "LOC")
            protected List<LOCPlaceLocationIdentification> loc;

            /**
             * Gets the value of the rcs property.
             * 
             * @return
             *     possible object is
             *     {@link RCSRequirementsAndConditions }
             *     
             */
            public RCSRequirementsAndConditions getRCS() {
                return rcs;
            }

            /**
             * Sets the value of the rcs property.
             * 
             * @param value
             *     allowed object is
             *     {@link RCSRequirementsAndConditions }
             *     
             */
            public void setRCS(RCSRequirementsAndConditions value) {
                this.rcs = value;
            }

            /**
             * Gets the value of the ftx property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the ftx property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFTX().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FTXFreeText }
             * 
             * 
             */
            public List<FTXFreeText> getFTX() {
                if (ftx == null) {
                    ftx = new ArrayList<FTXFreeText>();
                }
                return this.ftx;
            }

            /**
             * Gets the value of the moa property.
             * 
             * @return
             *     possible object is
             *     {@link MOAMonetaryAmount }
             *     
             */
            public MOAMonetaryAmount getMOA() {
                return moa;
            }

            /**
             * Sets the value of the moa property.
             * 
             * @param value
             *     allowed object is
             *     {@link MOAMonetaryAmount }
             *     
             */
            public void setMOA(MOAMonetaryAmount value) {
                this.moa = value;
            }

            /**
             * Gets the value of the loc property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the loc property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLOC().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link LOCPlaceLocationIdentification }
             * 
             * 
             */
            public List<LOCPlaceLocationIdentification> getLOC() {
                if (loc == null) {
                    loc = new ArrayList<LOCPlaceLocationIdentification>();
                }
                return this.loc;
            }

            public BOPINF.SegGrp3 .SegGrp5 withRCS(RCSRequirementsAndConditions value) {
                setRCS(value);
                return this;
            }

            public BOPINF.SegGrp3 .SegGrp5 withFTX(FTXFreeText... values) {
                if (values!= null) {
                    for (FTXFreeText value: values) {
                        getFTX().add(value);
                    }
                }
                return this;
            }

            public BOPINF.SegGrp3 .SegGrp5 withFTX(Collection<FTXFreeText> values) {
                if (values!= null) {
                    getFTX().addAll(values);
                }
                return this;
            }

            public BOPINF.SegGrp3 .SegGrp5 withMOA(MOAMonetaryAmount value) {
                setMOA(value);
                return this;
            }

            public BOPINF.SegGrp3 .SegGrp5 withLOC(LOCPlaceLocationIdentification... values) {
                if (values!= null) {
                    for (LOCPlaceLocationIdentification value: values) {
                        getLOC().add(value);
                    }
                }
                return this;
            }

            public BOPINF.SegGrp3 .SegGrp5 withLOC(Collection<LOCPlaceLocationIdentification> values) {
                if (values!= null) {
                    getLOC().addAll(values);
                }
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
     *           &lt;element name="AUT" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}AUT-AuthenticationResult"/&gt;
     *           &lt;element name="DTM" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}DTM-DateTimePeriod" minOccurs="0"/&gt;
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
        "aut",
        "dtm"
    })
    public static class SegGrp6 {

        @XmlElement(name = "AUT", required = true)
        protected AUTAuthenticationResult aut;
        @XmlElement(name = "DTM")
        protected DTMDateTimePeriod dtm;

        /**
         * Gets the value of the aut property.
         * 
         * @return
         *     possible object is
         *     {@link AUTAuthenticationResult }
         *     
         */
        public AUTAuthenticationResult getAUT() {
            return aut;
        }

        /**
         * Sets the value of the aut property.
         * 
         * @param value
         *     allowed object is
         *     {@link AUTAuthenticationResult }
         *     
         */
        public void setAUT(AUTAuthenticationResult value) {
            this.aut = value;
        }

        /**
         * Gets the value of the dtm property.
         * 
         * @return
         *     possible object is
         *     {@link DTMDateTimePeriod }
         *     
         */
        public DTMDateTimePeriod getDTM() {
            return dtm;
        }

        /**
         * Sets the value of the dtm property.
         * 
         * @param value
         *     allowed object is
         *     {@link DTMDateTimePeriod }
         *     
         */
        public void setDTM(DTMDateTimePeriod value) {
            this.dtm = value;
        }

        public BOPINF.SegGrp6 withAUT(AUTAuthenticationResult value) {
            setAUT(value);
            return this;
        }

        public BOPINF.SegGrp6 withDTM(DTMDateTimePeriod value) {
            setDTM(value);
            return this;
        }

    }

}