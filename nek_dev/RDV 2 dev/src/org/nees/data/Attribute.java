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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Attribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Attribute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{}String64"/>
 *         &lt;element name="description" type="{}String255"/>
 *         &lt;element name="Unit" type="{}Unit"/>
 *         &lt;element name="EquipmentClass" type="{}EquipmentClass"/>
 *         &lt;element name="minValue" type="{}Double"/>
 *         &lt;element name="maxValue" type="{}Double"/>
 *         &lt;element name="dataType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="GROUP"/>
 *               &lt;enumeration value="INTEGER"/>
 *               &lt;enumeration value="NUMBER"/>
 *               &lt;enumeration value="STRING"/>
 *               &lt;enumeration value="URL"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="label" type="{}String128"/>
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
@XmlType(name = "Attribute", propOrder = {
    "name",
    "description",
    "unit",
    "equipmentClass",
    "minValue",
    "maxValue",
    "dataType",
    "label"
})
public class Attribute {

    @XmlElementRef(name = "name", type = JAXBElement.class)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "description", type = JAXBElement.class)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "Unit", type = JAXBElement.class)
    protected JAXBElement<Unit> unit;
    @XmlElementRef(name = "EquipmentClass", type = JAXBElement.class)
    protected JAXBElement<EquipmentClass> equipmentClass;
    @XmlElementRef(name = "minValue", type = JAXBElement.class)
    protected JAXBElement<Double> minValue;
    @XmlElementRef(name = "maxValue", type = JAXBElement.class)
    protected JAXBElement<Double> maxValue;
    protected String dataType;
    @XmlElementRef(name = "label", type = JAXBElement.class)
    protected JAXBElement<String> label;
    @XmlAttribute
    protected Integer id;
    @XmlAttribute
    protected String link;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = ((JAXBElement<String> ) value);
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
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Unit }{@code >}
     *     
     */
    public JAXBElement<Unit> getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Unit }{@code >}
     *     
     */
    public void setUnit(JAXBElement<Unit> value) {
        this.unit = ((JAXBElement<Unit> ) value);
    }

    /**
     * Gets the value of the equipmentClass property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EquipmentClass }{@code >}
     *     
     */
    public JAXBElement<EquipmentClass> getEquipmentClass() {
        return equipmentClass;
    }

    /**
     * Sets the value of the equipmentClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EquipmentClass }{@code >}
     *     
     */
    public void setEquipmentClass(JAXBElement<EquipmentClass> value) {
        this.equipmentClass = ((JAXBElement<EquipmentClass> ) value);
    }

    /**
     * Gets the value of the minValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getMinValue() {
        return minValue;
    }

    /**
     * Sets the value of the minValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setMinValue(JAXBElement<Double> value) {
        this.minValue = ((JAXBElement<Double> ) value);
    }

    /**
     * Gets the value of the maxValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getMaxValue() {
        return maxValue;
    }

    /**
     * Sets the value of the maxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setMaxValue(JAXBElement<Double> value) {
        this.maxValue = ((JAXBElement<Double> ) value);
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLabel(JAXBElement<String> value) {
        this.label = ((JAXBElement<String> ) value);
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
