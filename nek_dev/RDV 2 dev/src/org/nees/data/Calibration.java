//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.11.28 at 03:46:45 PM GMT 
//


package org.nees.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Calibration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Calibration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="calibDate" type="{}Date"/>
 *         &lt;element name="calibrator" type="{}String50"/>
 *         &lt;element name="description" type="{}String255"/>
 *         &lt;element name="adjustments" type="{}Double"/>
 *         &lt;element name="minMeasuredValue" type="{}Double"/>
 *         &lt;element name="maxMeasuredValue" type="{}Double"/>
 *         &lt;element name="measuredValueUnits">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="sensitivity" type="{}Double"/>
 *         &lt;element name="sensitivityUnits">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="reference" type="{}Double"/>
 *         &lt;element name="referenceUnits">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="calibFactor" type="{}String100"/>
 *         &lt;element name="calibFactorUnits">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="deleted">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="FALSE"/>
 *               &lt;enumeration value="TRUE"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{}IDnumber" />
 *       &lt;attribute name="link" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Calibration", propOrder = {
    "calibDate",
    "calibrator",
    "description",
    "adjustments",
    "minMeasuredValue",
    "maxMeasuredValue",
    "measuredValueUnits",
    "sensitivity",
    "sensitivityUnits",
    "reference",
    "referenceUnits",
    "calibFactor",
    "calibFactorUnits",
    "deleted"
})
public class Calibration {

    @XmlElementRef(name = "calibDate", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> calibDate;
    @XmlElementRef(name = "calibrator", type = JAXBElement.class)
    protected JAXBElement<String> calibrator;
    @XmlElementRef(name = "description", type = JAXBElement.class)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "adjustments", type = JAXBElement.class)
    protected JAXBElement<Double> adjustments;
    @XmlElementRef(name = "minMeasuredValue", type = JAXBElement.class)
    protected JAXBElement<Double> minMeasuredValue;
    @XmlElementRef(name = "maxMeasuredValue", type = JAXBElement.class)
    protected JAXBElement<Double> maxMeasuredValue;
    @XmlElementRef(name = "measuredValueUnits", type = JAXBElement.class)
    protected JAXBElement<String> measuredValueUnits;
    @XmlElementRef(name = "sensitivity", type = JAXBElement.class)
    protected JAXBElement<Double> sensitivity;
    @XmlElementRef(name = "sensitivityUnits", type = JAXBElement.class)
    protected JAXBElement<String> sensitivityUnits;
    @XmlElementRef(name = "reference", type = JAXBElement.class)
    protected JAXBElement<Double> reference;
    @XmlElementRef(name = "referenceUnits", type = JAXBElement.class)
    protected JAXBElement<String> referenceUnits;
    @XmlElementRef(name = "calibFactor", type = JAXBElement.class)
    protected JAXBElement<String> calibFactor;
    @XmlElementRef(name = "calibFactorUnits", type = JAXBElement.class)
    protected JAXBElement<String> calibFactorUnits;
    @XmlElement(defaultValue = "FALSE")
    protected String deleted;
    @XmlAttribute
    protected Integer id;
    @XmlAttribute
    protected String link;

    /**
     * Gets the value of the calibDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCalibDate() {
        return calibDate;
    }

    /**
     * Sets the value of the calibDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCalibDate(JAXBElement<XMLGregorianCalendar> value) {
        this.calibDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the calibrator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCalibrator() {
        return calibrator;
    }

    /**
     * Sets the value of the calibrator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCalibrator(JAXBElement<String> value) {
        this.calibrator = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adjustments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getAdjustments() {
        return adjustments;
    }

    /**
     * Sets the value of the adjustments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setAdjustments(JAXBElement<Double> value) {
        this.adjustments = ((JAXBElement<Double> ) value);
    }

    /**
     * Gets the value of the minMeasuredValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getMinMeasuredValue() {
        return minMeasuredValue;
    }

    /**
     * Sets the value of the minMeasuredValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setMinMeasuredValue(JAXBElement<Double> value) {
        this.minMeasuredValue = ((JAXBElement<Double> ) value);
    }

    /**
     * Gets the value of the maxMeasuredValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getMaxMeasuredValue() {
        return maxMeasuredValue;
    }

    /**
     * Sets the value of the maxMeasuredValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setMaxMeasuredValue(JAXBElement<Double> value) {
        this.maxMeasuredValue = ((JAXBElement<Double> ) value);
    }

    /**
     * Gets the value of the measuredValueUnits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMeasuredValueUnits() {
        return measuredValueUnits;
    }

    /**
     * Sets the value of the measuredValueUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMeasuredValueUnits(JAXBElement<String> value) {
        this.measuredValueUnits = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sensitivity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getSensitivity() {
        return sensitivity;
    }

    /**
     * Sets the value of the sensitivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setSensitivity(JAXBElement<Double> value) {
        this.sensitivity = ((JAXBElement<Double> ) value);
    }

    /**
     * Gets the value of the sensitivityUnits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSensitivityUnits() {
        return sensitivityUnits;
    }

    /**
     * Sets the value of the sensitivityUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSensitivityUnits(JAXBElement<String> value) {
        this.sensitivityUnits = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setReference(JAXBElement<Double> value) {
        this.reference = ((JAXBElement<Double> ) value);
    }

    /**
     * Gets the value of the referenceUnits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferenceUnits() {
        return referenceUnits;
    }

    /**
     * Sets the value of the referenceUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferenceUnits(JAXBElement<String> value) {
        this.referenceUnits = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the calibFactor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCalibFactor() {
        return calibFactor;
    }

    /**
     * Sets the value of the calibFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCalibFactor(JAXBElement<String> value) {
        this.calibFactor = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the calibFactorUnits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCalibFactorUnits() {
        return calibFactorUnits;
    }

    /**
     * Sets the value of the calibFactorUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCalibFactorUnits(JAXBElement<String> value) {
        this.calibFactorUnits = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the deleted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeleted() {
        return deleted;
    }

    /**
     * Sets the value of the deleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeleted(String value) {
        this.deleted = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the link property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLink(String value) {
        this.link = value;
    }

}
