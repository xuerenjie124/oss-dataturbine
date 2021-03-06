//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.11.28 at 03:46:45 PM GMT 
//


package org.nees.data;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The Project element...
 * 
 * <p>Java class for Project complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Project">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{}String16"/>
 *         &lt;element name="title" type="{}String255"/>
 *         &lt;element name="description" type="{}Text"/>
 *         &lt;element name="contactEmail" type="{}String255"/>
 *         &lt;element name="contactName" type="{}String255"/>
 *         &lt;element name="startDate" type="{}Date"/>
 *         &lt;element name="endDate" type="{}Date"/>
 *         &lt;element name="status" type="{}String100"/>
 *         &lt;element name="sysadminName" type="{}String255" minOccurs="0"/>
 *         &lt;element name="sysadminEmail" type="{}String255" minOccurs="0"/>
 *         &lt;element name="nickname" type="{}String100"/>
 *         &lt;element name="fundorg" type="{}String100"/>
 *         &lt;element name="fundorgprojid" type="{}String100"/>
 *         &lt;element name="Experiment" type="{}Experiment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DataFile" type="{}DataFile" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Acknowledgement" type="{}Acknowledgement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Organization" type="{}Organization" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DELETED" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="EXP" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="NEES" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="VIEW" default="MEMBERS">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="MEMBERS"/>
 *             &lt;enumeration value="USERS"/>
 *             &lt;enumeration value="PUBLIC"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
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
@XmlType(name = "Project", propOrder = {
    "name",
    "title",
    "description",
    "contactEmail",
    "contactName",
    "startDate",
    "endDate",
    "status",
    "sysadminName",
    "sysadminEmail",
    "nickname",
    "fundorg",
    "fundorgprojid",
    "experiment",
    "dataFile",
    "acknowledgement",
    "organization"
})
public class Project {

    protected String name;
    protected String title;
    @XmlElementRef(name = "description", type = JAXBElement.class)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "contactEmail", type = JAXBElement.class)
    protected JAXBElement<String> contactEmail;
    @XmlElementRef(name = "contactName", type = JAXBElement.class)
    protected JAXBElement<String> contactName;
    @XmlElementRef(name = "startDate", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> startDate;
    @XmlElementRef(name = "endDate", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> endDate;
    @XmlElementRef(name = "status", type = JAXBElement.class)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "sysadminName", type = JAXBElement.class)
    protected JAXBElement<String> sysadminName;
    @XmlElementRef(name = "sysadminEmail", type = JAXBElement.class)
    protected JAXBElement<String> sysadminEmail;
    @XmlElementRef(name = "nickname", type = JAXBElement.class)
    protected JAXBElement<String> nickname;
    @XmlElementRef(name = "fundorg", type = JAXBElement.class)
    protected JAXBElement<String> fundorg;
    @XmlElementRef(name = "fundorgprojid", type = JAXBElement.class)
    protected JAXBElement<String> fundorgprojid;
    @XmlElement(name = "Experiment")
    protected List<Experiment> experiment;
    @XmlElement(name = "DataFile")
    protected List<DataFile> dataFile;
    @XmlElement(name = "Acknowledgement")
    protected List<Acknowledgement> acknowledgement;
    @XmlElement(name = "Organization")
    protected List<Organization> organization;
    @XmlAttribute(name = "DELETED")
    protected Boolean deleted;
    @XmlAttribute(name = "EXP")
    protected Boolean exp;
    @XmlAttribute(name = "NEES")
    protected Boolean nees;
    @XmlAttribute(name = "VIEW")
    protected String view;
    @XmlAttribute
    protected Integer id;
    @XmlAttribute
    protected String link;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
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
     * Gets the value of the contactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContactEmail() {
        return contactEmail;
    }

    /**
     * Sets the value of the contactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContactEmail(JAXBElement<String> value) {
        this.contactEmail = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContactName(JAXBElement<String> value) {
        this.contactName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.startDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.endDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sysadminName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSysadminName() {
        return sysadminName;
    }

    /**
     * Sets the value of the sysadminName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSysadminName(JAXBElement<String> value) {
        this.sysadminName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sysadminEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSysadminEmail() {
        return sysadminEmail;
    }

    /**
     * Sets the value of the sysadminEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSysadminEmail(JAXBElement<String> value) {
        this.sysadminEmail = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nickname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNickname() {
        return nickname;
    }

    /**
     * Sets the value of the nickname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNickname(JAXBElement<String> value) {
        this.nickname = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fundorg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFundorg() {
        return fundorg;
    }

    /**
     * Sets the value of the fundorg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFundorg(JAXBElement<String> value) {
        this.fundorg = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fundorgprojid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFundorgprojid() {
        return fundorgprojid;
    }

    /**
     * Sets the value of the fundorgprojid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFundorgprojid(JAXBElement<String> value) {
        this.fundorgprojid = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the experiment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the experiment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExperiment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Experiment }
     * 
     * 
     */
    public List<Experiment> getExperiment() {
        if (experiment == null) {
            experiment = new ArrayList<Experiment>();
        }
        return this.experiment;
    }

    /**
     * Gets the value of the dataFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataFile }
     * 
     * 
     */
    public List<DataFile> getDataFile() {
        if (dataFile == null) {
            dataFile = new ArrayList<DataFile>();
        }
        return this.dataFile;
    }

    /**
     * Gets the value of the acknowledgement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acknowledgement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcknowledgement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Acknowledgement }
     * 
     * 
     */
    public List<Acknowledgement> getAcknowledgement() {
        if (acknowledgement == null) {
            acknowledgement = new ArrayList<Acknowledgement>();
        }
        return this.acknowledgement;
    }

    /**
     * Gets the value of the organization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Organization }
     * 
     * 
     */
    public List<Organization> getOrganization() {
        if (organization == null) {
            organization = new ArrayList<Organization>();
        }
        return this.organization;
    }

    /**
     * Gets the value of the deleted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDELETED() {
        if (deleted == null) {
            return false;
        } else {
            return deleted;
        }
    }

    /**
     * Sets the value of the deleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDELETED(Boolean value) {
        this.deleted = value;
    }

    /**
     * Gets the value of the exp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEXP() {
        if (exp == null) {
            return false;
        } else {
            return exp;
        }
    }

    /**
     * Sets the value of the exp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEXP(Boolean value) {
        this.exp = value;
    }

    /**
     * Gets the value of the nees property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNEES() {
        if (nees == null) {
            return true;
        } else {
            return nees;
        }
    }

    /**
     * Sets the value of the nees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNEES(Boolean value) {
        this.nees = value;
    }

    /**
     * Gets the value of the view property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIEW() {
        if (view == null) {
            return "MEMBERS";
        } else {
            return view;
        }
    }

    /**
     * Sets the value of the view property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIEW(String value) {
        this.view = value;
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
