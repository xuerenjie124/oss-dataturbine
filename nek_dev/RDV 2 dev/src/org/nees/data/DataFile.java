//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.11.28 at 03:46:45 PM GMT 
//


package org.nees.data;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DataFile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataFile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{}String255"/>
 *         &lt;element name="path" type="{}String255"/>
 *         &lt;element name="Authors" type="{}String255" minOccurs="0"/>
 *         &lt;element name="AuthorEmails" type="{}String255" minOccurs="0"/>
 *         &lt;element name="Description" type="{}String255" minOccurs="0"/>
 *         &lt;element name="HowToCite" type="{}String255" minOccurs="0"/>
 *         &lt;element name="Title" type="{}String255" minOccurs="0"/>
 *         &lt;element name="PageCount" type="{}UnsignedInt" minOccurs="0"/>
 *         &lt;element name="checksum" type="{}String32" minOccurs="0"/>
 *         &lt;element name="DataFile" type="{}DataFile" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="fileData" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/>
 *           &lt;element name="contentLink" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="created" type="{}Timestamp" />
 *       &lt;attribute name="id" type="{}IDnumber" />
 *       &lt;attribute name="isDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="isDirectory" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="link" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataFile", propOrder = {
    "name",
    "path",
    "authors",
    "authorEmails",
    "description",
    "howToCite",
    "title",
    "pageCount",
    "checksum",
    "dataFile",
    "fileData",
    "contentLink"
})
public class DataFile {

    protected String name;
    protected String path;
    @XmlElement(name = "Authors")
    protected String authors;
    @XmlElement(name = "AuthorEmails")
    protected String authorEmails;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "HowToCite")
    protected String howToCite;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "PageCount")
    protected Integer pageCount;
    protected String checksum;
    @XmlElement(name = "DataFile")
    protected List<DataFile> dataFile;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] fileData;
    protected String contentLink;
    @XmlAttribute
    protected XMLGregorianCalendar created;
    @XmlAttribute
    protected Integer id;
    @XmlAttribute
    protected Boolean isDeleted;
    @XmlAttribute
    protected Boolean isDirectory;
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
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * Gets the value of the authors property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthors() {
        return authors;
    }

    /**
     * Sets the value of the authors property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthors(String value) {
        this.authors = value;
    }

    /**
     * Gets the value of the authorEmails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorEmails() {
        return authorEmails;
    }

    /**
     * Sets the value of the authorEmails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorEmails(String value) {
        this.authorEmails = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the howToCite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHowToCite() {
        return howToCite;
    }

    /**
     * Sets the value of the howToCite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHowToCite(String value) {
        this.howToCite = value;
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
     * Gets the value of the pageCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageCount() {
        return pageCount;
    }

    /**
     * Sets the value of the pageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageCount(Integer value) {
        this.pageCount = value;
    }

    /**
     * Gets the value of the checksum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChecksum() {
        return checksum;
    }

    /**
     * Sets the value of the checksum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChecksum(String value) {
        this.checksum = value;
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
     * Gets the value of the fileData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getFileData() {
        return fileData;
    }

    /**
     * Sets the value of the fileData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileData(byte[] value) {
        this.fileData = ((byte[]) value);
    }

    /**
     * Gets the value of the contentLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentLink() {
        return contentLink;
    }

    /**
     * Sets the value of the contentLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentLink(String value) {
        this.contentLink = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
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
     * Gets the value of the isDeleted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsDeleted() {
        if (isDeleted == null) {
            return false;
        } else {
            return isDeleted;
        }
    }

    /**
     * Sets the value of the isDeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeleted(Boolean value) {
        this.isDeleted = value;
    }

    /**
     * Gets the value of the isDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsDirectory() {
        if (isDirectory == null) {
            return false;
        } else {
            return isDirectory;
        }
    }

    /**
     * Sets the value of the isDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDirectory(Boolean value) {
        this.isDirectory = value;
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
