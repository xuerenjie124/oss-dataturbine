//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.11.28 at 03:46:45 PM GMT 
//


package org.nees.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NAWIfacilities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NAWIfacilities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="facilityid" type="{}IDnumber"/>
 *       &lt;/sequence>
 *       &lt;attribute name="nawiid" use="required" type="{}IDnumber" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NAWIfacilities", propOrder = {
    "facilityid"
})
public class NAWIfacilities {

    protected Integer facilityid;
    @XmlAttribute(required = true)
    protected int nawiid;

    /**
     * Gets the value of the facilityid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFacilityid() {
        return facilityid;
    }

    /**
     * Sets the value of the facilityid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFacilityid(Integer value) {
        this.facilityid = value;
    }

    /**
     * Gets the value of the nawiid property.
     * 
     */
    public int getNawiid() {
        return nawiid;
    }

    /**
     * Sets the value of the nawiid property.
     * 
     */
    public void setNawiid(int value) {
        this.nawiid = value;
    }

}
