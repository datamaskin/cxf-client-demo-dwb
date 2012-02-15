
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Document complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Document">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nbsGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocDueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DocPostingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Lines" type="{http://tempuri.org/}ArrayOfDocLine" minOccurs="0"/>
 *         &lt;element name="CardCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillToAddress" type="{http://tempuri.org/}Address" minOccurs="0"/>
 *         &lt;element name="ShipToAddress" type="{http://tempuri.org/}Address" minOccurs="0"/>
 *         &lt;element name="PriceList" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CustomerRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UDFs" type="{http://tempuri.org/}ArrayOfUDF" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "nbsGUID",
    "docDueDate",
    "docPostingDate",
    "lines",
    "cardCode",
    "comments",
    "billToAddress",
    "shipToAddress",
    "priceList",
    "customerRef",
    "shipToCode",
    "udFs"
})
public class Document {

    protected String nbsGUID;
    @XmlElement(name = "DocDueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docDueDate;
    @XmlElement(name = "DocPostingDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docPostingDate;
    @XmlElement(name = "Lines")
    protected ArrayOfDocLine lines;
    @XmlElement(name = "CardCode")
    protected String cardCode;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "BillToAddress")
    protected Address billToAddress;
    @XmlElement(name = "ShipToAddress")
    protected Address shipToAddress;
    @XmlElement(name = "PriceList")
    protected int priceList;
    @XmlElement(name = "CustomerRef")
    protected String customerRef;
    @XmlElement(name = "ShipToCode")
    protected String shipToCode;
    @XmlElement(name = "UDFs")
    protected ArrayOfUDF udFs;

    /**
     * Gets the value of the nbsGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbsGUID() {
        return nbsGUID;
    }

    /**
     * Sets the value of the nbsGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbsGUID(String value) {
        this.nbsGUID = value;
    }

    /**
     * Gets the value of the docDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocDueDate() {
        return docDueDate;
    }

    /**
     * Sets the value of the docDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocDueDate(XMLGregorianCalendar value) {
        this.docDueDate = value;
    }

    /**
     * Gets the value of the docPostingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocPostingDate() {
        return docPostingDate;
    }

    /**
     * Sets the value of the docPostingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocPostingDate(XMLGregorianCalendar value) {
        this.docPostingDate = value;
    }

    /**
     * Gets the value of the lines property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDocLine }
     *     
     */
    public ArrayOfDocLine getLines() {
        return lines;
    }

    /**
     * Sets the value of the lines property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDocLine }
     *     
     */
    public void setLines(ArrayOfDocLine value) {
        this.lines = value;
    }

    /**
     * Gets the value of the cardCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCode() {
        return cardCode;
    }

    /**
     * Sets the value of the cardCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCode(String value) {
        this.cardCode = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the billToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getBillToAddress() {
        return billToAddress;
    }

    /**
     * Sets the value of the billToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setBillToAddress(Address value) {
        this.billToAddress = value;
    }

    /**
     * Gets the value of the shipToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getShipToAddress() {
        return shipToAddress;
    }

    /**
     * Sets the value of the shipToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setShipToAddress(Address value) {
        this.shipToAddress = value;
    }

    /**
     * Gets the value of the priceList property.
     * 
     */
    public int getPriceList() {
        return priceList;
    }

    /**
     * Sets the value of the priceList property.
     * 
     */
    public void setPriceList(int value) {
        this.priceList = value;
    }

    /**
     * Gets the value of the customerRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerRef() {
        return customerRef;
    }

    /**
     * Sets the value of the customerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerRef(String value) {
        this.customerRef = value;
    }

    /**
     * Gets the value of the shipToCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCode() {
        return shipToCode;
    }

    /**
     * Sets the value of the shipToCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCode(String value) {
        this.shipToCode = value;
    }

    /**
     * Gets the value of the udFs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUDF }
     *     
     */
    public ArrayOfUDF getUDFs() {
        return udFs;
    }

    /**
     * Sets the value of the udFs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUDF }
     *     
     */
    public void setUDFs(ArrayOfUDF value) {
        this.udFs = value;
    }

}
