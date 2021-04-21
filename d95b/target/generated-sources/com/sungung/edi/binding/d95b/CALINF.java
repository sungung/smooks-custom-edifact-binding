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
 * <p>Java class for CALINF complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CALINF"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="BGM" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}BGM-BeginningOfMessage"/&gt;
 *           &lt;element name="RFF" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}RFF-Reference" maxOccurs="9" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="SegGrp-1" maxOccurs="9"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="NAD" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}NAD-NameAndAddress"/&gt;
 *                     &lt;element name="CTA" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}CTA-ContactInformation" maxOccurs="9" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SegGrp-2"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="TDT" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}TDT-DetailsOfTransport"/&gt;
 *                     &lt;element name="RFF" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}RFF-Reference" maxOccurs="9" minOccurs="0"/&gt;
 *                     &lt;element name="LOC" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}LOC-PlaceLocationIdentification" maxOccurs="9"/&gt;
 *                     &lt;element name="DTM" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}DTM-DateTimePeriod" maxOccurs="9"/&gt;
 *                     &lt;element name="FTX" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}FTX-FreeText" maxOccurs="9" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SegGrp-3" maxOccurs="9" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="QTY" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}QTY-Quantity"/&gt;
 *                     &lt;element name="FTX" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}FTX-FreeText" minOccurs="0"/&gt;
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
@XmlType(name = "CALINF", propOrder = {
    "bgm",
    "rff",
    "segGrp1",
    "segGrp2",
    "segGrp3"
})
public class CALINF {

    @XmlElement(name = "BGM", required = true)
    protected BGMBeginningOfMessage bgm;
    @XmlElement(name = "RFF")
    protected List<RFFReference> rff;
    @XmlElement(name = "SegGrp-1", required = true)
    protected List<CALINF.SegGrp1> segGrp1;
    @XmlElement(name = "SegGrp-2", required = true)
    protected CALINF.SegGrp2 segGrp2;
    @XmlElement(name = "SegGrp-3")
    protected List<CALINF.SegGrp3> segGrp3;

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
     * {@link CALINF.SegGrp1 }
     * 
     * 
     */
    public List<CALINF.SegGrp1> getSegGrp1() {
        if (segGrp1 == null) {
            segGrp1 = new ArrayList<CALINF.SegGrp1>();
        }
        return this.segGrp1;
    }

    /**
     * Gets the value of the segGrp2 property.
     * 
     * @return
     *     possible object is
     *     {@link CALINF.SegGrp2 }
     *     
     */
    public CALINF.SegGrp2 getSegGrp2() {
        return segGrp2;
    }

    /**
     * Sets the value of the segGrp2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CALINF.SegGrp2 }
     *     
     */
    public void setSegGrp2(CALINF.SegGrp2 value) {
        this.segGrp2 = value;
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
     * {@link CALINF.SegGrp3 }
     * 
     * 
     */
    public List<CALINF.SegGrp3> getSegGrp3() {
        if (segGrp3 == null) {
            segGrp3 = new ArrayList<CALINF.SegGrp3>();
        }
        return this.segGrp3;
    }

    public CALINF withBGM(BGMBeginningOfMessage value) {
        setBGM(value);
        return this;
    }

    public CALINF withRFF(RFFReference... values) {
        if (values!= null) {
            for (RFFReference value: values) {
                getRFF().add(value);
            }
        }
        return this;
    }

    public CALINF withRFF(Collection<RFFReference> values) {
        if (values!= null) {
            getRFF().addAll(values);
        }
        return this;
    }

    public CALINF withSegGrp1(CALINF.SegGrp1 ... values) {
        if (values!= null) {
            for (CALINF.SegGrp1 value: values) {
                getSegGrp1().add(value);
            }
        }
        return this;
    }

    public CALINF withSegGrp1(Collection<CALINF.SegGrp1> values) {
        if (values!= null) {
            getSegGrp1().addAll(values);
        }
        return this;
    }

    public CALINF withSegGrp2(CALINF.SegGrp2 value) {
        setSegGrp2(value);
        return this;
    }

    public CALINF withSegGrp3(CALINF.SegGrp3 ... values) {
        if (values!= null) {
            for (CALINF.SegGrp3 value: values) {
                getSegGrp3().add(value);
            }
        }
        return this;
    }

    public CALINF withSegGrp3(Collection<CALINF.SegGrp3> values) {
        if (values!= null) {
            getSegGrp3().addAll(values);
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
     *           &lt;element name="NAD" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}NAD-NameAndAddress"/&gt;
     *           &lt;element name="CTA" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}CTA-ContactInformation" maxOccurs="9" minOccurs="0"/&gt;
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
        "cta"
    })
    public static class SegGrp1 {

        @XmlElement(name = "NAD", required = true)
        protected NADNameAndAddress nad;
        @XmlElement(name = "CTA")
        protected List<CTAContactInformation> cta;

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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cta property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCTA().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CTAContactInformation }
         * 
         * 
         */
        public List<CTAContactInformation> getCTA() {
            if (cta == null) {
                cta = new ArrayList<CTAContactInformation>();
            }
            return this.cta;
        }

        public CALINF.SegGrp1 withNAD(NADNameAndAddress value) {
            setNAD(value);
            return this;
        }

        public CALINF.SegGrp1 withCTA(CTAContactInformation... values) {
            if (values!= null) {
                for (CTAContactInformation value: values) {
                    getCTA().add(value);
                }
            }
            return this;
        }

        public CALINF.SegGrp1 withCTA(Collection<CTAContactInformation> values) {
            if (values!= null) {
                getCTA().addAll(values);
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
     *           &lt;element name="TDT" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}TDT-DetailsOfTransport"/&gt;
     *           &lt;element name="RFF" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}RFF-Reference" maxOccurs="9" minOccurs="0"/&gt;
     *           &lt;element name="LOC" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}LOC-PlaceLocationIdentification" maxOccurs="9"/&gt;
     *           &lt;element name="DTM" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}DTM-DateTimePeriod" maxOccurs="9"/&gt;
     *           &lt;element name="FTX" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}FTX-FreeText" maxOccurs="9" minOccurs="0"/&gt;
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
        "tdt",
        "rff",
        "loc",
        "dtm",
        "ftx"
    })
    public static class SegGrp2 {

        @XmlElement(name = "TDT", required = true)
        protected TDTDetailsOfTransport tdt;
        @XmlElement(name = "RFF")
        protected List<RFFReference> rff;
        @XmlElement(name = "LOC", required = true)
        protected List<LOCPlaceLocationIdentification> loc;
        @XmlElement(name = "DTM", required = true)
        protected List<DTMDateTimePeriod> dtm;
        @XmlElement(name = "FTX")
        protected List<FTXFreeText> ftx;

        /**
         * Gets the value of the tdt property.
         * 
         * @return
         *     possible object is
         *     {@link TDTDetailsOfTransport }
         *     
         */
        public TDTDetailsOfTransport getTDT() {
            return tdt;
        }

        /**
         * Sets the value of the tdt property.
         * 
         * @param value
         *     allowed object is
         *     {@link TDTDetailsOfTransport }
         *     
         */
        public void setTDT(TDTDetailsOfTransport value) {
            this.tdt = value;
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

        public CALINF.SegGrp2 withTDT(TDTDetailsOfTransport value) {
            setTDT(value);
            return this;
        }

        public CALINF.SegGrp2 withRFF(RFFReference... values) {
            if (values!= null) {
                for (RFFReference value: values) {
                    getRFF().add(value);
                }
            }
            return this;
        }

        public CALINF.SegGrp2 withRFF(Collection<RFFReference> values) {
            if (values!= null) {
                getRFF().addAll(values);
            }
            return this;
        }

        public CALINF.SegGrp2 withLOC(LOCPlaceLocationIdentification... values) {
            if (values!= null) {
                for (LOCPlaceLocationIdentification value: values) {
                    getLOC().add(value);
                }
            }
            return this;
        }

        public CALINF.SegGrp2 withLOC(Collection<LOCPlaceLocationIdentification> values) {
            if (values!= null) {
                getLOC().addAll(values);
            }
            return this;
        }

        public CALINF.SegGrp2 withDTM(DTMDateTimePeriod... values) {
            if (values!= null) {
                for (DTMDateTimePeriod value: values) {
                    getDTM().add(value);
                }
            }
            return this;
        }

        public CALINF.SegGrp2 withDTM(Collection<DTMDateTimePeriod> values) {
            if (values!= null) {
                getDTM().addAll(values);
            }
            return this;
        }

        public CALINF.SegGrp2 withFTX(FTXFreeText... values) {
            if (values!= null) {
                for (FTXFreeText value: values) {
                    getFTX().add(value);
                }
            }
            return this;
        }

        public CALINF.SegGrp2 withFTX(Collection<FTXFreeText> values) {
            if (values!= null) {
                getFTX().addAll(values);
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
     *           &lt;element name="QTY" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}QTY-Quantity"/&gt;
     *           &lt;element name="FTX" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}FTX-FreeText" minOccurs="0"/&gt;
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
        "qty",
        "ftx"
    })
    public static class SegGrp3 {

        @XmlElement(name = "QTY", required = true)
        protected QTYQuantity qty;
        @XmlElement(name = "FTX")
        protected FTXFreeText ftx;

        /**
         * Gets the value of the qty property.
         * 
         * @return
         *     possible object is
         *     {@link QTYQuantity }
         *     
         */
        public QTYQuantity getQTY() {
            return qty;
        }

        /**
         * Sets the value of the qty property.
         * 
         * @param value
         *     allowed object is
         *     {@link QTYQuantity }
         *     
         */
        public void setQTY(QTYQuantity value) {
            this.qty = value;
        }

        /**
         * Gets the value of the ftx property.
         * 
         * @return
         *     possible object is
         *     {@link FTXFreeText }
         *     
         */
        public FTXFreeText getFTX() {
            return ftx;
        }

        /**
         * Sets the value of the ftx property.
         * 
         * @param value
         *     allowed object is
         *     {@link FTXFreeText }
         *     
         */
        public void setFTX(FTXFreeText value) {
            this.ftx = value;
        }

        public CALINF.SegGrp3 withQTY(QTYQuantity value) {
            setQTY(value);
            return this;
        }

        public CALINF.SegGrp3 withFTX(FTXFreeText value) {
            setFTX(value);
            return this;
        }

    }

}
