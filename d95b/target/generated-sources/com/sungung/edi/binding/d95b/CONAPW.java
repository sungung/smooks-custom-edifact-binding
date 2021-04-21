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
 * <p>Java class for CONAPW complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CONAPW"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="BGM" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}BGM-BeginningOfMessage"/&gt;
 *           &lt;element name="RFF" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}RFF-Reference" maxOccurs="9"/&gt;
 *           &lt;element name="DTM" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}DTM-DateTimePeriod" maxOccurs="9"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="SegGrp-1" maxOccurs="3"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="NAD" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}NAD-NameAndAddress"/&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;element name="SegGrp-2" maxOccurs="2" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="CTA" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}CTA-ContactInformation"/&gt;
 *                               &lt;element name="COM" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}COM-CommunicationContact" maxOccurs="3" minOccurs="0"/&gt;
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
 *           &lt;element name="LOC" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}LOC-PlaceLocationIdentification" maxOccurs="99"/&gt;
 *           &lt;element name="FTX" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}FTX-FreeText" maxOccurs="99"/&gt;
 *           &lt;element name="DOC" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}DOC-DocumentMessageDetails" maxOccurs="9" minOccurs="0"/&gt;
 *           &lt;element name="CNT" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}CNT-ControlTotal" maxOccurs="5" minOccurs="0"/&gt;
 *           &lt;element name="AUT" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}AUT-AuthenticationResult" minOccurs="0"/&gt;
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
@XmlType(name = "CONAPW", propOrder = {
    "bgm",
    "rff",
    "dtm",
    "segGrp1",
    "loc",
    "ftx",
    "doc",
    "cnt",
    "aut"
})
public class CONAPW {

    @XmlElement(name = "BGM", required = true)
    protected BGMBeginningOfMessage bgm;
    @XmlElement(name = "RFF", required = true)
    protected List<RFFReference> rff;
    @XmlElement(name = "DTM", required = true)
    protected List<DTMDateTimePeriod> dtm;
    @XmlElement(name = "SegGrp-1", required = true)
    protected List<CONAPW.SegGrp1> segGrp1;
    @XmlElement(name = "LOC", required = true)
    protected List<LOCPlaceLocationIdentification> loc;
    @XmlElement(name = "FTX", required = true)
    protected List<FTXFreeText> ftx;
    @XmlElement(name = "DOC")
    protected List<DOCDocumentMessageDetails> doc;
    @XmlElement(name = "CNT")
    protected List<CNTControlTotal> cnt;
    @XmlElement(name = "AUT")
    protected AUTAuthenticationResult aut;

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
     * Gets the value of the rff property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rff property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRFF().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RFFReference }
     * 
     * 
     */
    public List<RFFReference> getRFF() {
        if (rff == null) {
            rff = new ArrayList<RFFReference>();
        }
        return this.rff;
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
     * {@link CONAPW.SegGrp1 }
     * 
     * 
     */
    public List<CONAPW.SegGrp1> getSegGrp1() {
        if (segGrp1 == null) {
            segGrp1 = new ArrayList<CONAPW.SegGrp1>();
        }
        return this.segGrp1;
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
     * Gets the value of the doc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the doc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDOC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DOCDocumentMessageDetails }
     * 
     * 
     */
    public List<DOCDocumentMessageDetails> getDOC() {
        if (doc == null) {
            doc = new ArrayList<DOCDocumentMessageDetails>();
        }
        return this.doc;
    }

    /**
     * Gets the value of the cnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCNT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CNTControlTotal }
     * 
     * 
     */
    public List<CNTControlTotal> getCNT() {
        if (cnt == null) {
            cnt = new ArrayList<CNTControlTotal>();
        }
        return this.cnt;
    }

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

    public CONAPW withBGM(BGMBeginningOfMessage value) {
        setBGM(value);
        return this;
    }

    public CONAPW withRFF(RFFReference... values) {
        if (values!= null) {
            for (RFFReference value: values) {
                getRFF().add(value);
            }
        }
        return this;
    }

    public CONAPW withRFF(Collection<RFFReference> values) {
        if (values!= null) {
            getRFF().addAll(values);
        }
        return this;
    }

    public CONAPW withDTM(DTMDateTimePeriod... values) {
        if (values!= null) {
            for (DTMDateTimePeriod value: values) {
                getDTM().add(value);
            }
        }
        return this;
    }

    public CONAPW withDTM(Collection<DTMDateTimePeriod> values) {
        if (values!= null) {
            getDTM().addAll(values);
        }
        return this;
    }

    public CONAPW withSegGrp1(CONAPW.SegGrp1 ... values) {
        if (values!= null) {
            for (CONAPW.SegGrp1 value: values) {
                getSegGrp1().add(value);
            }
        }
        return this;
    }

    public CONAPW withSegGrp1(Collection<CONAPW.SegGrp1> values) {
        if (values!= null) {
            getSegGrp1().addAll(values);
        }
        return this;
    }

    public CONAPW withLOC(LOCPlaceLocationIdentification... values) {
        if (values!= null) {
            for (LOCPlaceLocationIdentification value: values) {
                getLOC().add(value);
            }
        }
        return this;
    }

    public CONAPW withLOC(Collection<LOCPlaceLocationIdentification> values) {
        if (values!= null) {
            getLOC().addAll(values);
        }
        return this;
    }

    public CONAPW withFTX(FTXFreeText... values) {
        if (values!= null) {
            for (FTXFreeText value: values) {
                getFTX().add(value);
            }
        }
        return this;
    }

    public CONAPW withFTX(Collection<FTXFreeText> values) {
        if (values!= null) {
            getFTX().addAll(values);
        }
        return this;
    }

    public CONAPW withDOC(DOCDocumentMessageDetails... values) {
        if (values!= null) {
            for (DOCDocumentMessageDetails value: values) {
                getDOC().add(value);
            }
        }
        return this;
    }

    public CONAPW withDOC(Collection<DOCDocumentMessageDetails> values) {
        if (values!= null) {
            getDOC().addAll(values);
        }
        return this;
    }

    public CONAPW withCNT(CNTControlTotal... values) {
        if (values!= null) {
            for (CNTControlTotal value: values) {
                getCNT().add(value);
            }
        }
        return this;
    }

    public CONAPW withCNT(Collection<CNTControlTotal> values) {
        if (values!= null) {
            getCNT().addAll(values);
        }
        return this;
    }

    public CONAPW withAUT(AUTAuthenticationResult value) {
        setAUT(value);
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
     *           &lt;element name="NAD" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}NAD-NameAndAddress"/&gt;
     *         &lt;/sequence&gt;
     *         &lt;element name="SegGrp-2" maxOccurs="2" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="CTA" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}CTA-ContactInformation"/&gt;
     *                     &lt;element name="COM" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}COM-CommunicationContact" maxOccurs="3" minOccurs="0"/&gt;
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
        "nad",
        "segGrp2"
    })
    public static class SegGrp1 {

        @XmlElement(name = "NAD", required = true)
        protected NADNameAndAddress nad;
        @XmlElement(name = "SegGrp-2")
        protected List<CONAPW.SegGrp1 .SegGrp2> segGrp2;

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
         * {@link CONAPW.SegGrp1 .SegGrp2 }
         * 
         * 
         */
        public List<CONAPW.SegGrp1 .SegGrp2> getSegGrp2() {
            if (segGrp2 == null) {
                segGrp2 = new ArrayList<CONAPW.SegGrp1 .SegGrp2>();
            }
            return this.segGrp2;
        }

        public CONAPW.SegGrp1 withNAD(NADNameAndAddress value) {
            setNAD(value);
            return this;
        }

        public CONAPW.SegGrp1 withSegGrp2(CONAPW.SegGrp1 .SegGrp2 ... values) {
            if (values!= null) {
                for (CONAPW.SegGrp1 .SegGrp2 value: values) {
                    getSegGrp2().add(value);
                }
            }
            return this;
        }

        public CONAPW.SegGrp1 withSegGrp2(Collection<CONAPW.SegGrp1 .SegGrp2> values) {
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
         *           &lt;element name="CTA" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}CTA-ContactInformation"/&gt;
         *           &lt;element name="COM" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}COM-CommunicationContact" maxOccurs="3" minOccurs="0"/&gt;
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
            "cta",
            "com"
        })
        public static class SegGrp2 {

            @XmlElement(name = "CTA", required = true)
            protected CTAContactInformation cta;
            @XmlElement(name = "COM")
            protected List<COMCommunicationContact> com;

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

            public CONAPW.SegGrp1 .SegGrp2 withCTA(CTAContactInformation value) {
                setCTA(value);
                return this;
            }

            public CONAPW.SegGrp1 .SegGrp2 withCOM(COMCommunicationContact... values) {
                if (values!= null) {
                    for (COMCommunicationContact value: values) {
                        getCOM().add(value);
                    }
                }
                return this;
            }

            public CONAPW.SegGrp1 .SegGrp2 withCOM(Collection<COMCommunicationContact> values) {
                if (values!= null) {
                    getCOM().addAll(values);
                }
                return this;
            }

        }

    }

}