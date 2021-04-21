//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.21 at 01:57:40 PM AEST 
//


package com.sungung.edi.binding.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 The UNA segment is optional. If present, it specifies the special characters that are to be used to
 *                 interpret the remainder of the message. There are six characters following UNA in this order:
 * 
 *                 - component data element separator (usually :)
 *                 - data element separator (usually +)
 *                 - decimal notification (usually . or ,)
 *                 - release character (usually ?)
 *                 - repeat separator (usually * but if space use data element separator (v3 syntax))
 *                 - segment terminator (usually ')
 * 
 *                 The special characters in the sample UNA segment above are also the default values.
 * 
 *                 Component data element separator and data element separator are the "first level" and "second level"
 *                 separators of data elements within a message segment.
 *                 Referring to them as + and : for brevity, the + separates top-level or composite data elements, and :
 *                 separates second-level data elements nested within composite data elements.
 *                 Trailing empty (or null) data elements and their leading separators are omitted to reduce message size.
 * 
 *                 Decimal notification is used to separate the integer from the decimal part of non-integer numbers.
 * 
 *                 Repeat separator separates repeats of the same data element within a segment.
 *                 Trailing empty (or null) repeats and their leading separators are omitted to reduce message size.
 *                 This was only added in syntax version 4, until then this was reserved with a space so if space is
 *                 found use the data element separator.
 * 
 *                 Release character (analogous to the \ in regular expressions) is used as a prefix to remove special
 *                 meaning from the separator, segment termination, and release characters when they are used as plain
 *                 text.
 * 
 *                 Segment terminator indicates the end of a message segment.
 *             
 * 
 * <p>Java class for UNA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UNA"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompositeSeparator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FieldSeparator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DecimalSeparator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EscapeCharacter" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RepeatSeparator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SegmentTerminator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UNA", propOrder = {
    "compositeSeparator",
    "fieldSeparator",
    "decimalSeparator",
    "escapeCharacter",
    "repeatSeparator",
    "segmentTerminator"
})
public class UNA {

    @XmlElement(name = "CompositeSeparator", required = true)
    protected String compositeSeparator;
    @XmlElement(name = "FieldSeparator", required = true)
    protected String fieldSeparator;
    @XmlElement(name = "DecimalSeparator", required = true, defaultValue = ".")
    protected String decimalSeparator;
    @XmlElement(name = "EscapeCharacter", required = true, defaultValue = "?")
    protected String escapeCharacter;
    @XmlElement(name = "RepeatSeparator", required = true, defaultValue = "*")
    protected String repeatSeparator;
    @XmlElement(name = "SegmentTerminator", required = true, defaultValue = "'")
    protected String segmentTerminator;

    /**
     * Gets the value of the compositeSeparator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompositeSeparator() {
        return compositeSeparator;
    }

    /**
     * Sets the value of the compositeSeparator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompositeSeparator(String value) {
        this.compositeSeparator = value;
    }

    /**
     * Gets the value of the fieldSeparator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldSeparator() {
        return fieldSeparator;
    }

    /**
     * Sets the value of the fieldSeparator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldSeparator(String value) {
        this.fieldSeparator = value;
    }

    /**
     * Gets the value of the decimalSeparator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecimalSeparator() {
        return decimalSeparator;
    }

    /**
     * Sets the value of the decimalSeparator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecimalSeparator(String value) {
        this.decimalSeparator = value;
    }

    /**
     * Gets the value of the escapeCharacter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscapeCharacter() {
        return escapeCharacter;
    }

    /**
     * Sets the value of the escapeCharacter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscapeCharacter(String value) {
        this.escapeCharacter = value;
    }

    /**
     * Gets the value of the repeatSeparator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepeatSeparator() {
        return repeatSeparator;
    }

    /**
     * Sets the value of the repeatSeparator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepeatSeparator(String value) {
        this.repeatSeparator = value;
    }

    /**
     * Gets the value of the segmentTerminator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentTerminator() {
        return segmentTerminator;
    }

    /**
     * Sets the value of the segmentTerminator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentTerminator(String value) {
        this.segmentTerminator = value;
    }

    public UNA withCompositeSeparator(String value) {
        setCompositeSeparator(value);
        return this;
    }

    public UNA withFieldSeparator(String value) {
        setFieldSeparator(value);
        return this;
    }

    public UNA withDecimalSeparator(String value) {
        setDecimalSeparator(value);
        return this;
    }

    public UNA withEscapeCharacter(String value) {
        setEscapeCharacter(value);
        return this;
    }

    public UNA withRepeatSeparator(String value) {
        setRepeatSeparator(value);
        return this;
    }

    public UNA withSegmentTerminator(String value) {
        setSegmentTerminator(value);
        return this;
    }

}