
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddInvoiceResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "addInvoiceResult"
})
@XmlRootElement(name = "AddInvoiceResponse")
public class AddInvoiceResponse {

    @XmlElement(name = "AddInvoiceResult")
    protected int addInvoiceResult;

    /**
     * Gets the value of the addInvoiceResult property.
     * 
     */
    public int getAddInvoiceResult() {
        return addInvoiceResult;
    }

    /**
     * Sets the value of the addInvoiceResult property.
     * 
     */
    public void setAddInvoiceResult(int value) {
        this.addInvoiceResult = value;
    }

}
