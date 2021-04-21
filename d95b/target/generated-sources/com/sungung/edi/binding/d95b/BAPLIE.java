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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BAPLIE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BAPLIE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="BGM" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}BGM-BeginningOfMessage"/&gt;
 *           &lt;element name="DTM" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}DTM-DateTimePeriod"/&gt;
 *           &lt;element name="RFF" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}RFF-Reference" minOccurs="0"/&gt;
 *           &lt;element name="NAD" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}NAD-NameAndAddress" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="SegGrp-1" maxOccurs="3"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="TDT" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}TDT-DetailsOfTransport"/&gt;
 *                     &lt;element name="LOC" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}LOC-PlaceLocationIdentification" maxOccurs="2"/&gt;
 *                     &lt;element name="DTM" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}DTM-DateTimePeriod" maxOccurs="99"/&gt;
 *                     &lt;element name="RFF" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}RFF-Reference" minOccurs="0"/&gt;
 *                     &lt;element name="FTX" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}FTX-FreeText" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SegGrp-2" maxOccurs="9999" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="LOC" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}LOC-PlaceLocationIdentification"/&gt;
 *                     &lt;element name="GID" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}GID-GoodsItemDetails" minOccurs="0"/&gt;
 *                     &lt;element name="GDS" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}GDS-NatureOfCargo" minOccurs="0"/&gt;
 *                     &lt;element name="FTX" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}FTX-FreeText" maxOccurs="9" minOccurs="0"/&gt;
 *                     &lt;element name="MEA" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}MEA-Measurements" maxOccurs="9"/&gt;
 *                     &lt;element name="DIM" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}DIM-Dimensions" maxOccurs="9" minOccurs="0"/&gt;
 *                     &lt;element name="TMP" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}TMP-Temperature" minOccurs="0"/&gt;
 *                     &lt;element name="RNG" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}RNG-RangeDetails" minOccurs="0"/&gt;
 *                     &lt;element name="LOC" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}LOC-PlaceLocationIdentification" maxOccurs="9" minOccurs="0"/&gt;
 *                     &lt;element name="RFF" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}RFF-Reference"/&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;element name="SegGrp-3" maxOccurs="3" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="EQD" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}EQD-EquipmentDetails"/&gt;
 *                               &lt;element name="EQA" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}EQA-AttachedEquipment" maxOccurs="9" minOccurs="0"/&gt;
 *                               &lt;element name="NAD" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}NAD-NameAndAddress" minOccurs="0"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SegGrp-4" maxOccurs="999" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="DGS" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}DGS-DangerousGoods"/&gt;
 *                               &lt;element name="FTX" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}FTX-FreeText" minOccurs="0"/&gt;
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
@XmlType(name = "BAPLIE", propOrder = {
    "bgm",
    "dtm",
    "rff",
    "nad",
    "segGrp1",
    "segGrp2"
})
public class BAPLIE {

    @XmlElement(name = "BGM", required = true)
    protected BGMBeginningOfMessage bgm;
    @XmlElement(name = "DTM", required = true)
    protected DTMDateTimePeriod dtm;
    @XmlElement(name = "RFF")
    protected RFFReference rff;
    @XmlElement(name = "NAD")
    protected List<NADNameAndAddress> nad;
    @XmlElement(name = "SegGrp-1", required = true)
    protected List<BAPLIE.SegGrp1> segGrp1;
    @XmlElement(name = "SegGrp-2")
    protected List<BAPLIE.SegGrp2> segGrp2;

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
     * Gets the value of the nad property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nad property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNAD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NADNameAndAddress }
     * 
     * 
     */
    public List<NADNameAndAddress> getNAD() {
        if (nad == null) {
            nad = new ArrayList<NADNameAndAddress>();
        }
        return this.nad;
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
     * {@link BAPLIE.SegGrp1 }
     * 
     * 
     */
    public List<BAPLIE.SegGrp1> getSegGrp1() {
        if (segGrp1 == null) {
            segGrp1 = new ArrayList<BAPLIE.SegGrp1>();
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
     * {@link BAPLIE.SegGrp2 }
     * 
     * 
     */
    public List<BAPLIE.SegGrp2> getSegGrp2() {
        if (segGrp2 == null) {
            segGrp2 = new ArrayList<BAPLIE.SegGrp2>();
        }
        return this.segGrp2;
    }

    public BAPLIE withBGM(BGMBeginningOfMessage value) {
        setBGM(value);
        return this;
    }

    public BAPLIE withDTM(DTMDateTimePeriod value) {
        setDTM(value);
        return this;
    }

    public BAPLIE withRFF(RFFReference value) {
        setRFF(value);
        return this;
    }

    public BAPLIE withNAD(NADNameAndAddress... values) {
        if (values!= null) {
            for (NADNameAndAddress value: values) {
                getNAD().add(value);
            }
        }
        return this;
    }

    public BAPLIE withNAD(Collection<NADNameAndAddress> values) {
        if (values!= null) {
            getNAD().addAll(values);
        }
        return this;
    }

    public BAPLIE withSegGrp1(BAPLIE.SegGrp1 ... values) {
        if (values!= null) {
            for (BAPLIE.SegGrp1 value: values) {
                getSegGrp1().add(value);
            }
        }
        return this;
    }

    public BAPLIE withSegGrp1(Collection<BAPLIE.SegGrp1> values) {
        if (values!= null) {
            getSegGrp1().addAll(values);
        }
        return this;
    }

    public BAPLIE withSegGrp2(BAPLIE.SegGrp2 ... values) {
        if (values!= null) {
            for (BAPLIE.SegGrp2 value: values) {
                getSegGrp2().add(value);
            }
        }
        return this;
    }

    public BAPLIE withSegGrp2(Collection<BAPLIE.SegGrp2> values) {
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
     *           &lt;element name="TDT" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}TDT-DetailsOfTransport"/&gt;
     *           &lt;element name="LOC" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}LOC-PlaceLocationIdentification" maxOccurs="2"/&gt;
     *           &lt;element name="DTM" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}DTM-DateTimePeriod" maxOccurs="99"/&gt;
     *           &lt;element name="RFF" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}RFF-Reference" minOccurs="0"/&gt;
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
        "tdt",
        "loc",
        "dtm",
        "rff",
        "ftx"
    })
    public static class SegGrp1 {

        @XmlElement(name = "TDT", required = true)
        protected TDTDetailsOfTransport tdt;
        @XmlElement(name = "LOC", required = true)
        protected List<LOCPlaceLocationIdentification> loc;
        @XmlElement(name = "DTM", required = true)
        protected List<DTMDateTimePeriod> dtm;
        @XmlElement(name = "RFF")
        protected RFFReference rff;
        @XmlElement(name = "FTX")
        protected FTXFreeText ftx;

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

        public BAPLIE.SegGrp1 withTDT(TDTDetailsOfTransport value) {
            setTDT(value);
            return this;
        }

        public BAPLIE.SegGrp1 withLOC(LOCPlaceLocationIdentification... values) {
            if (values!= null) {
                for (LOCPlaceLocationIdentification value: values) {
                    getLOC().add(value);
                }
            }
            return this;
        }

        public BAPLIE.SegGrp1 withLOC(Collection<LOCPlaceLocationIdentification> values) {
            if (values!= null) {
                getLOC().addAll(values);
            }
            return this;
        }

        public BAPLIE.SegGrp1 withDTM(DTMDateTimePeriod... values) {
            if (values!= null) {
                for (DTMDateTimePeriod value: values) {
                    getDTM().add(value);
                }
            }
            return this;
        }

        public BAPLIE.SegGrp1 withDTM(Collection<DTMDateTimePeriod> values) {
            if (values!= null) {
                getDTM().addAll(values);
            }
            return this;
        }

        public BAPLIE.SegGrp1 withRFF(RFFReference value) {
            setRFF(value);
            return this;
        }

        public BAPLIE.SegGrp1 withFTX(FTXFreeText value) {
            setFTX(value);
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
     *           &lt;element name="LOC" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}LOC-PlaceLocationIdentification"/&gt;
     *           &lt;element name="GID" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}GID-GoodsItemDetails" minOccurs="0"/&gt;
     *           &lt;element name="GDS" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}GDS-NatureOfCargo" minOccurs="0"/&gt;
     *           &lt;element name="FTX" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}FTX-FreeText" maxOccurs="9" minOccurs="0"/&gt;
     *           &lt;element name="MEA" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}MEA-Measurements" maxOccurs="9"/&gt;
     *           &lt;element name="DIM" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}DIM-Dimensions" maxOccurs="9" minOccurs="0"/&gt;
     *           &lt;element name="TMP" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}TMP-Temperature" minOccurs="0"/&gt;
     *           &lt;element name="RNG" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}RNG-RangeDetails" minOccurs="0"/&gt;
     *           &lt;element name="LOC" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}LOC-PlaceLocationIdentification" maxOccurs="9" minOccurs="0"/&gt;
     *           &lt;element name="RFF" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}RFF-Reference"/&gt;
     *         &lt;/sequence&gt;
     *         &lt;element name="SegGrp-3" maxOccurs="3" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="EQD" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}EQD-EquipmentDetails"/&gt;
     *                     &lt;element name="EQA" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}EQA-AttachedEquipment" maxOccurs="9" minOccurs="0"/&gt;
     *                     &lt;element name="NAD" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}NAD-NameAndAddress" minOccurs="0"/&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SegGrp-4" maxOccurs="999" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="DGS" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}DGS-DangerousGoods"/&gt;
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
    @XmlType(name = "", propOrder = {
        "content"
    })
    public static class SegGrp2 {

        @XmlElementRefs({
            @XmlElementRef(name = "LOC", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "GID", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "GDS", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "FTX", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "MEA", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "DIM", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "TMP", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "RNG", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "RFF", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "SegGrp-3", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "SegGrp-4", type = JAXBElement.class, required = false)
        })
        protected List<JAXBElement<?>> content;

        /**
         * Gets the rest of the content model. 
         * 
         * <p>
         * You are getting this "catch-all" property because of the following reason: 
         * The field name "LOC" is used by two different parts of a schema. See: 
         * line 13798 of file:/E:/dev/turbina/github/smook-customised-edifact-binding/d95b/target/classes/EDIFACT-Messages.dfdl.xsd
         * line 13790 of file:/E:/dev/turbina/github/smook-customised-edifact-binding/d95b/target/classes/EDIFACT-Messages.dfdl.xsd
         * <p>
         * To get rid of this property, apply a property customization to one 
         * of both of the following declarations to change their names: 
         * Gets the value of the content property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the content property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link LOCPlaceLocationIdentification }{@code >}
         * {@link JAXBElement }{@code <}{@link GIDGoodsItemDetails }{@code >}
         * {@link JAXBElement }{@code <}{@link GDSNatureOfCargo }{@code >}
         * {@link JAXBElement }{@code <}{@link FTXFreeText }{@code >}
         * {@link JAXBElement }{@code <}{@link MEAMeasurements }{@code >}
         * {@link JAXBElement }{@code <}{@link DIMDimensions }{@code >}
         * {@link JAXBElement }{@code <}{@link TMPTemperature }{@code >}
         * {@link JAXBElement }{@code <}{@link RNGRangeDetails }{@code >}
         * {@link JAXBElement }{@code <}{@link RFFReference }{@code >}
         * {@link JAXBElement }{@code <}{@link BAPLIE.SegGrp2 .SegGrp3 }{@code >}
         * {@link JAXBElement }{@code <}{@link BAPLIE.SegGrp2 .SegGrp4 }{@code >}
         * 
         * 
         */
        public List<JAXBElement<?>> getContent() {
            if (content == null) {
                content = new ArrayList<JAXBElement<?>>();
            }
            return this.content;
        }

        public BAPLIE.SegGrp2 withContent(JAXBElement<?> ... values) {
            if (values!= null) {
                for (JAXBElement<?> value: values) {
                    getContent().add(value);
                }
            }
            return this;
        }

        public BAPLIE.SegGrp2 withContent(Collection<JAXBElement<?>> values) {
            if (values!= null) {
                getContent().addAll(values);
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
         *           &lt;element name="EQD" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}EQD-EquipmentDetails"/&gt;
         *           &lt;element name="EQA" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}EQA-AttachedEquipment" maxOccurs="9" minOccurs="0"/&gt;
         *           &lt;element name="NAD" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}NAD-NameAndAddress" minOccurs="0"/&gt;
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
            "eqd",
            "eqa",
            "nad"
        })
        public static class SegGrp3 {

            @XmlElement(name = "EQD", required = true)
            protected EQDEquipmentDetails eqd;
            @XmlElement(name = "EQA")
            protected List<EQAAttachedEquipment> eqa;
            @XmlElement(name = "NAD")
            protected NADNameAndAddress nad;

            /**
             * Gets the value of the eqd property.
             * 
             * @return
             *     possible object is
             *     {@link EQDEquipmentDetails }
             *     
             */
            public EQDEquipmentDetails getEQD() {
                return eqd;
            }

            /**
             * Sets the value of the eqd property.
             * 
             * @param value
             *     allowed object is
             *     {@link EQDEquipmentDetails }
             *     
             */
            public void setEQD(EQDEquipmentDetails value) {
                this.eqd = value;
            }

            /**
             * Gets the value of the eqa property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the eqa property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEQA().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link EQAAttachedEquipment }
             * 
             * 
             */
            public List<EQAAttachedEquipment> getEQA() {
                if (eqa == null) {
                    eqa = new ArrayList<EQAAttachedEquipment>();
                }
                return this.eqa;
            }

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

            public BAPLIE.SegGrp2 .SegGrp3 withEQD(EQDEquipmentDetails value) {
                setEQD(value);
                return this;
            }

            public BAPLIE.SegGrp2 .SegGrp3 withEQA(EQAAttachedEquipment... values) {
                if (values!= null) {
                    for (EQAAttachedEquipment value: values) {
                        getEQA().add(value);
                    }
                }
                return this;
            }

            public BAPLIE.SegGrp2 .SegGrp3 withEQA(Collection<EQAAttachedEquipment> values) {
                if (values!= null) {
                    getEQA().addAll(values);
                }
                return this;
            }

            public BAPLIE.SegGrp2 .SegGrp3 withNAD(NADNameAndAddress value) {
                setNAD(value);
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
         *           &lt;element name="DGS" type="{http://www.ibm.com/dfdl/edi/un/edifact/D95B}DGS-DangerousGoods"/&gt;
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
            "dgs",
            "ftx"
        })
        public static class SegGrp4 {

            @XmlElement(name = "DGS", required = true)
            protected DGSDangerousGoods dgs;
            @XmlElement(name = "FTX")
            protected FTXFreeText ftx;

            /**
             * Gets the value of the dgs property.
             * 
             * @return
             *     possible object is
             *     {@link DGSDangerousGoods }
             *     
             */
            public DGSDangerousGoods getDGS() {
                return dgs;
            }

            /**
             * Sets the value of the dgs property.
             * 
             * @param value
             *     allowed object is
             *     {@link DGSDangerousGoods }
             *     
             */
            public void setDGS(DGSDangerousGoods value) {
                this.dgs = value;
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

            public BAPLIE.SegGrp2 .SegGrp4 withDGS(DGSDangerousGoods value) {
                setDGS(value);
                return this;
            }

            public BAPLIE.SegGrp2 .SegGrp4 withFTX(FTXFreeText value) {
                setFTX(value);
                return this;
            }

        }

    }

}
