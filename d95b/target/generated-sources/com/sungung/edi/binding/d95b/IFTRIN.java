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
 * <p>Java class for IFTRIN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IFTRIN"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="BGM" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}BGM-BeginningOfMessage"/&gt;
 *           &lt;element name="DTM" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}DTM-DateTimePeriod" maxOccurs="9" minOccurs="0"/&gt;
 *           &lt;element name="FTX" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}FTX-FreeText" maxOccurs="99" minOccurs="0"/&gt;
 *           &lt;element name="RFF" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}RFF-Reference" maxOccurs="9" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="SegGrp-1" maxOccurs="9" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="LOC" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}LOC-PlaceLocationIdentification"/&gt;
 *                     &lt;element name="DTM" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}DTM-DateTimePeriod" maxOccurs="9" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SegGrp-2" maxOccurs="999" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="TDT" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}TDT-DetailsOfTransport"/&gt;
 *                     &lt;element name="DTM" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}DTM-DateTimePeriod" maxOccurs="9" minOccurs="0"/&gt;
 *                     &lt;element name="LOC" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}LOC-PlaceLocationIdentification" maxOccurs="9" minOccurs="0"/&gt;
 *                     &lt;element name="RFF" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}RFF-Reference" maxOccurs="9" minOccurs="0"/&gt;
 *                     &lt;element name="CUX" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}CUX-Currencies" maxOccurs="9" minOccurs="0"/&gt;
 *                     &lt;element name="MEA" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}MEA-Measurements" maxOccurs="9" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;element name="SegGrp-3" maxOccurs="99" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="TCC" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}TCC-TransportChargeRateCalculations"/&gt;
 *                               &lt;element name="EQN" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}EQN-NumberOfUnits" maxOccurs="9" minOccurs="0"/&gt;
 *                               &lt;element name="PCD" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}PCD-PercentageDetails" maxOccurs="9" minOccurs="0"/&gt;
 *                               &lt;element name="QTY" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}QTY-Quantity" maxOccurs="9" minOccurs="0"/&gt;
 *                               &lt;element name="PRI" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}PRI-PriceDetails" maxOccurs="9" minOccurs="0"/&gt;
 *                               &lt;element name="MOA" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}MOA-MonetaryAmount" maxOccurs="9" minOccurs="0"/&gt;
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
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IFTRIN", propOrder = {
    "bgm",
    "dtm",
    "ftx",
    "rff",
    "segGrp1",
    "segGrp2"
})
public class IFTRIN {

    @XmlElement(name = "BGM", required = true)
    protected BGMBeginningOfMessage bgm;
    @XmlElement(name = "DTM")
    protected List<DTMDateTimePeriod> dtm;
    @XmlElement(name = "FTX")
    protected List<FTXFreeText> ftx;
    @XmlElement(name = "RFF")
    protected List<RFFReference> rff;
    @XmlElement(name = "SegGrp-1")
    protected List<IFTRIN.SegGrp1> segGrp1;
    @XmlElement(name = "SegGrp-2")
    protected List<IFTRIN.SegGrp2> segGrp2;

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
     * {@link IFTRIN.SegGrp1 }
     * 
     * 
     */
    public List<IFTRIN.SegGrp1> getSegGrp1() {
        if (segGrp1 == null) {
            segGrp1 = new ArrayList<IFTRIN.SegGrp1>();
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
     * {@link IFTRIN.SegGrp2 }
     * 
     * 
     */
    public List<IFTRIN.SegGrp2> getSegGrp2() {
        if (segGrp2 == null) {
            segGrp2 = new ArrayList<IFTRIN.SegGrp2>();
        }
        return this.segGrp2;
    }

    public IFTRIN withBGM(BGMBeginningOfMessage value) {
        setBGM(value);
        return this;
    }

    public IFTRIN withDTM(DTMDateTimePeriod... values) {
        if (values!= null) {
            for (DTMDateTimePeriod value: values) {
                getDTM().add(value);
            }
        }
        return this;
    }

    public IFTRIN withDTM(Collection<DTMDateTimePeriod> values) {
        if (values!= null) {
            getDTM().addAll(values);
        }
        return this;
    }

    public IFTRIN withFTX(FTXFreeText... values) {
        if (values!= null) {
            for (FTXFreeText value: values) {
                getFTX().add(value);
            }
        }
        return this;
    }

    public IFTRIN withFTX(Collection<FTXFreeText> values) {
        if (values!= null) {
            getFTX().addAll(values);
        }
        return this;
    }

    public IFTRIN withRFF(RFFReference... values) {
        if (values!= null) {
            for (RFFReference value: values) {
                getRFF().add(value);
            }
        }
        return this;
    }

    public IFTRIN withRFF(Collection<RFFReference> values) {
        if (values!= null) {
            getRFF().addAll(values);
        }
        return this;
    }

    public IFTRIN withSegGrp1(IFTRIN.SegGrp1 ... values) {
        if (values!= null) {
            for (IFTRIN.SegGrp1 value: values) {
                getSegGrp1().add(value);
            }
        }
        return this;
    }

    public IFTRIN withSegGrp1(Collection<IFTRIN.SegGrp1> values) {
        if (values!= null) {
            getSegGrp1().addAll(values);
        }
        return this;
    }

    public IFTRIN withSegGrp2(IFTRIN.SegGrp2 ... values) {
        if (values!= null) {
            for (IFTRIN.SegGrp2 value: values) {
                getSegGrp2().add(value);
            }
        }
        return this;
    }

    public IFTRIN withSegGrp2(Collection<IFTRIN.SegGrp2> values) {
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
     *           &lt;element name="LOC" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}LOC-PlaceLocationIdentification"/&gt;
     *           &lt;element name="DTM" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}DTM-DateTimePeriod" maxOccurs="9" minOccurs="0"/&gt;
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
        "loc",
        "dtm"
    })
    public static class SegGrp1 {

        @XmlElement(name = "LOC", required = true)
        protected LOCPlaceLocationIdentification loc;
        @XmlElement(name = "DTM")
        protected List<DTMDateTimePeriod> dtm;

        /**
         * Gets the value of the loc property.
         * 
         * @return
         *     possible object is
         *     {@link LOCPlaceLocationIdentification }
         *     
         */
        public LOCPlaceLocationIdentification getLOC() {
            return loc;
        }

        /**
         * Sets the value of the loc property.
         * 
         * @param value
         *     allowed object is
         *     {@link LOCPlaceLocationIdentification }
         *     
         */
        public void setLOC(LOCPlaceLocationIdentification value) {
            this.loc = value;
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

        public IFTRIN.SegGrp1 withLOC(LOCPlaceLocationIdentification value) {
            setLOC(value);
            return this;
        }

        public IFTRIN.SegGrp1 withDTM(DTMDateTimePeriod... values) {
            if (values!= null) {
                for (DTMDateTimePeriod value: values) {
                    getDTM().add(value);
                }
            }
            return this;
        }

        public IFTRIN.SegGrp1 withDTM(Collection<DTMDateTimePeriod> values) {
            if (values!= null) {
                getDTM().addAll(values);
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
     *           &lt;element name="DTM" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}DTM-DateTimePeriod" maxOccurs="9" minOccurs="0"/&gt;
     *           &lt;element name="LOC" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}LOC-PlaceLocationIdentification" maxOccurs="9" minOccurs="0"/&gt;
     *           &lt;element name="RFF" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}RFF-Reference" maxOccurs="9" minOccurs="0"/&gt;
     *           &lt;element name="CUX" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}CUX-Currencies" maxOccurs="9" minOccurs="0"/&gt;
     *           &lt;element name="MEA" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}MEA-Measurements" maxOccurs="9" minOccurs="0"/&gt;
     *         &lt;/sequence&gt;
     *         &lt;element name="SegGrp-3" maxOccurs="99" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="TCC" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}TCC-TransportChargeRateCalculations"/&gt;
     *                     &lt;element name="EQN" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}EQN-NumberOfUnits" maxOccurs="9" minOccurs="0"/&gt;
     *                     &lt;element name="PCD" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}PCD-PercentageDetails" maxOccurs="9" minOccurs="0"/&gt;
     *                     &lt;element name="QTY" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}QTY-Quantity" maxOccurs="9" minOccurs="0"/&gt;
     *                     &lt;element name="PRI" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}PRI-PriceDetails" maxOccurs="9" minOccurs="0"/&gt;
     *                     &lt;element name="MOA" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}MOA-MonetaryAmount" maxOccurs="9" minOccurs="0"/&gt;
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
        "tdt",
        "dtm",
        "loc",
        "rff",
        "cux",
        "mea",
        "segGrp3"
    })
    public static class SegGrp2 {

        @XmlElement(name = "TDT", required = true)
        protected TDTDetailsOfTransport tdt;
        @XmlElement(name = "DTM")
        protected List<DTMDateTimePeriod> dtm;
        @XmlElement(name = "LOC")
        protected List<LOCPlaceLocationIdentification> loc;
        @XmlElement(name = "RFF")
        protected List<RFFReference> rff;
        @XmlElement(name = "CUX")
        protected List<CUXCurrencies> cux;
        @XmlElement(name = "MEA")
        protected List<MEAMeasurements> mea;
        @XmlElement(name = "SegGrp-3")
        protected List<IFTRIN.SegGrp2 .SegGrp3> segGrp3;

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
         * Gets the value of the cux property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cux property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCUX().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CUXCurrencies }
         * 
         * 
         */
        public List<CUXCurrencies> getCUX() {
            if (cux == null) {
                cux = new ArrayList<CUXCurrencies>();
            }
            return this.cux;
        }

        /**
         * Gets the value of the mea property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mea property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMEA().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MEAMeasurements }
         * 
         * 
         */
        public List<MEAMeasurements> getMEA() {
            if (mea == null) {
                mea = new ArrayList<MEAMeasurements>();
            }
            return this.mea;
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
         * {@link IFTRIN.SegGrp2 .SegGrp3 }
         * 
         * 
         */
        public List<IFTRIN.SegGrp2 .SegGrp3> getSegGrp3() {
            if (segGrp3 == null) {
                segGrp3 = new ArrayList<IFTRIN.SegGrp2 .SegGrp3>();
            }
            return this.segGrp3;
        }

        public IFTRIN.SegGrp2 withTDT(TDTDetailsOfTransport value) {
            setTDT(value);
            return this;
        }

        public IFTRIN.SegGrp2 withDTM(DTMDateTimePeriod... values) {
            if (values!= null) {
                for (DTMDateTimePeriod value: values) {
                    getDTM().add(value);
                }
            }
            return this;
        }

        public IFTRIN.SegGrp2 withDTM(Collection<DTMDateTimePeriod> values) {
            if (values!= null) {
                getDTM().addAll(values);
            }
            return this;
        }

        public IFTRIN.SegGrp2 withLOC(LOCPlaceLocationIdentification... values) {
            if (values!= null) {
                for (LOCPlaceLocationIdentification value: values) {
                    getLOC().add(value);
                }
            }
            return this;
        }

        public IFTRIN.SegGrp2 withLOC(Collection<LOCPlaceLocationIdentification> values) {
            if (values!= null) {
                getLOC().addAll(values);
            }
            return this;
        }

        public IFTRIN.SegGrp2 withRFF(RFFReference... values) {
            if (values!= null) {
                for (RFFReference value: values) {
                    getRFF().add(value);
                }
            }
            return this;
        }

        public IFTRIN.SegGrp2 withRFF(Collection<RFFReference> values) {
            if (values!= null) {
                getRFF().addAll(values);
            }
            return this;
        }

        public IFTRIN.SegGrp2 withCUX(CUXCurrencies... values) {
            if (values!= null) {
                for (CUXCurrencies value: values) {
                    getCUX().add(value);
                }
            }
            return this;
        }

        public IFTRIN.SegGrp2 withCUX(Collection<CUXCurrencies> values) {
            if (values!= null) {
                getCUX().addAll(values);
            }
            return this;
        }

        public IFTRIN.SegGrp2 withMEA(MEAMeasurements... values) {
            if (values!= null) {
                for (MEAMeasurements value: values) {
                    getMEA().add(value);
                }
            }
            return this;
        }

        public IFTRIN.SegGrp2 withMEA(Collection<MEAMeasurements> values) {
            if (values!= null) {
                getMEA().addAll(values);
            }
            return this;
        }

        public IFTRIN.SegGrp2 withSegGrp3(IFTRIN.SegGrp2 .SegGrp3 ... values) {
            if (values!= null) {
                for (IFTRIN.SegGrp2 .SegGrp3 value: values) {
                    getSegGrp3().add(value);
                }
            }
            return this;
        }

        public IFTRIN.SegGrp2 withSegGrp3(Collection<IFTRIN.SegGrp2 .SegGrp3> values) {
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
         *           &lt;element name="TCC" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}TCC-TransportChargeRateCalculations"/&gt;
         *           &lt;element name="EQN" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}EQN-NumberOfUnits" maxOccurs="9" minOccurs="0"/&gt;
         *           &lt;element name="PCD" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}PCD-PercentageDetails" maxOccurs="9" minOccurs="0"/&gt;
         *           &lt;element name="QTY" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}QTY-Quantity" maxOccurs="9" minOccurs="0"/&gt;
         *           &lt;element name="PRI" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}PRI-PriceDetails" maxOccurs="9" minOccurs="0"/&gt;
         *           &lt;element name="MOA" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}MOA-MonetaryAmount" maxOccurs="9" minOccurs="0"/&gt;
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
            "tcc",
            "eqn",
            "pcd",
            "qty",
            "pri",
            "moa"
        })
        public static class SegGrp3 {

            @XmlElement(name = "TCC", required = true)
            protected TCCTransportChargeRateCalculations tcc;
            @XmlElement(name = "EQN")
            protected List<EQNNumberOfUnits> eqn;
            @XmlElement(name = "PCD")
            protected List<PCDPercentageDetails> pcd;
            @XmlElement(name = "QTY")
            protected List<QTYQuantity> qty;
            @XmlElement(name = "PRI")
            protected List<PRIPriceDetails> pri;
            @XmlElement(name = "MOA")
            protected List<MOAMonetaryAmount> moa;

            /**
             * Gets the value of the tcc property.
             * 
             * @return
             *     possible object is
             *     {@link TCCTransportChargeRateCalculations }
             *     
             */
            public TCCTransportChargeRateCalculations getTCC() {
                return tcc;
            }

            /**
             * Sets the value of the tcc property.
             * 
             * @param value
             *     allowed object is
             *     {@link TCCTransportChargeRateCalculations }
             *     
             */
            public void setTCC(TCCTransportChargeRateCalculations value) {
                this.tcc = value;
            }

            /**
             * Gets the value of the eqn property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the eqn property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEQN().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link EQNNumberOfUnits }
             * 
             * 
             */
            public List<EQNNumberOfUnits> getEQN() {
                if (eqn == null) {
                    eqn = new ArrayList<EQNNumberOfUnits>();
                }
                return this.eqn;
            }

            /**
             * Gets the value of the pcd property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pcd property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPCD().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PCDPercentageDetails }
             * 
             * 
             */
            public List<PCDPercentageDetails> getPCD() {
                if (pcd == null) {
                    pcd = new ArrayList<PCDPercentageDetails>();
                }
                return this.pcd;
            }

            /**
             * Gets the value of the qty property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the qty property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getQTY().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link QTYQuantity }
             * 
             * 
             */
            public List<QTYQuantity> getQTY() {
                if (qty == null) {
                    qty = new ArrayList<QTYQuantity>();
                }
                return this.qty;
            }

            /**
             * Gets the value of the pri property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pri property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPRI().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PRIPriceDetails }
             * 
             * 
             */
            public List<PRIPriceDetails> getPRI() {
                if (pri == null) {
                    pri = new ArrayList<PRIPriceDetails>();
                }
                return this.pri;
            }

            /**
             * Gets the value of the moa property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the moa property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMOA().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MOAMonetaryAmount }
             * 
             * 
             */
            public List<MOAMonetaryAmount> getMOA() {
                if (moa == null) {
                    moa = new ArrayList<MOAMonetaryAmount>();
                }
                return this.moa;
            }

            public IFTRIN.SegGrp2 .SegGrp3 withTCC(TCCTransportChargeRateCalculations value) {
                setTCC(value);
                return this;
            }

            public IFTRIN.SegGrp2 .SegGrp3 withEQN(EQNNumberOfUnits... values) {
                if (values!= null) {
                    for (EQNNumberOfUnits value: values) {
                        getEQN().add(value);
                    }
                }
                return this;
            }

            public IFTRIN.SegGrp2 .SegGrp3 withEQN(Collection<EQNNumberOfUnits> values) {
                if (values!= null) {
                    getEQN().addAll(values);
                }
                return this;
            }

            public IFTRIN.SegGrp2 .SegGrp3 withPCD(PCDPercentageDetails... values) {
                if (values!= null) {
                    for (PCDPercentageDetails value: values) {
                        getPCD().add(value);
                    }
                }
                return this;
            }

            public IFTRIN.SegGrp2 .SegGrp3 withPCD(Collection<PCDPercentageDetails> values) {
                if (values!= null) {
                    getPCD().addAll(values);
                }
                return this;
            }

            public IFTRIN.SegGrp2 .SegGrp3 withQTY(QTYQuantity... values) {
                if (values!= null) {
                    for (QTYQuantity value: values) {
                        getQTY().add(value);
                    }
                }
                return this;
            }

            public IFTRIN.SegGrp2 .SegGrp3 withQTY(Collection<QTYQuantity> values) {
                if (values!= null) {
                    getQTY().addAll(values);
                }
                return this;
            }

            public IFTRIN.SegGrp2 .SegGrp3 withPRI(PRIPriceDetails... values) {
                if (values!= null) {
                    for (PRIPriceDetails value: values) {
                        getPRI().add(value);
                    }
                }
                return this;
            }

            public IFTRIN.SegGrp2 .SegGrp3 withPRI(Collection<PRIPriceDetails> values) {
                if (values!= null) {
                    getPRI().addAll(values);
                }
                return this;
            }

            public IFTRIN.SegGrp2 .SegGrp3 withMOA(MOAMonetaryAmount... values) {
                if (values!= null) {
                    for (MOAMonetaryAmount value: values) {
                        getMOA().add(value);
                    }
                }
                return this;
            }

            public IFTRIN.SegGrp2 .SegGrp3 withMOA(Collection<MOAMonetaryAmount> values) {
                if (values!= null) {
                    getMOA().addAll(values);
                }
                return this;
            }

        }

    }

}