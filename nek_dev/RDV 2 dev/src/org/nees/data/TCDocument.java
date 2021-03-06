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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TCDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TCDocument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="documentName" type="{}String255"/>
 *         &lt;element name="lastModified" type="{}Date"/>
 *         &lt;element name="docTypeId" type="{}IDnumber"/>
 *         &lt;element name="pageCount" type="{}SmallInt"/>
 *         &lt;element name="documentFile_id" type="{}IDnumber"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TCDocId" use="required" type="{}IDnumber" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCDocument", propOrder = {
    "documentName",
    "lastModified",
    "docTypeId",
    "pageCount",
    "documentFileId"
})
public class TCDocument {

    @XmlElementRef(name = "documentName", type = JAXBElement.class)
    protected JAXBElement<String> documentName;
    @XmlElementRef(name = "lastModified", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> lastModified;
    @XmlElementRef(name = "docTypeId", type = JAXBElement.class)
    protected JAXBElement<Integer> docTypeId;
    @XmlElementRef(name = "pageCount", type = JAXBElement.class)
    protected JAXBElement<Integer> pageCount;
    @XmlElementRef(name = "documentFile_id", type = JAXBElement.class)
    protected JAXBElement<Integer> documentFileId;
    @XmlAttribute(name = "TCDocId", required = true)
    protected int tcDocId;

    /**
     * Gets the value of the documentName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocumentName() {
        return documentName;
    }

    /**
     * Sets the value of the documentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocumentName(JAXBElement<String> value) {
        this.documentName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the lastModified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastModified() {
        return lastModified;
    }

    /**
     * Sets the value of the lastModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastModified(JAXBElement<XMLGregorianCalendar> value) {
        this.lastModified = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the docTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDocTypeId() {
        return docTypeId;
    }

    /**
     * Sets the value of the docTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDocTypeId(JAXBElement<Integer> value) {
        this.docTypeId = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the pageCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPageCount() {
        return pageCount;
    }

    /**
     * Sets the value of the pageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPageCount(JAXBElement<Integer> value) {
        this.pageCount = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the documentFileId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDocumentFileId() {
        return documentFileId;
    }

    /**
     * Sets the value of the documentFileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDocumentFileId(JAXBElement<Integer> value) {
        this.documentFileId = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the tcDocId property.
     * 
     */
    public int getTCDocId() {
        return tcDocId;
    }

    /**
     * Sets the value of the tcDocId property.
     * 
     */
    public void setTCDocId(int value) {
        this.tcDocId = value;
    }

}
