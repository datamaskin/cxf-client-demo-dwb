
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
 *         &lt;element name="BP" type="{http://tempuri.org/}BusinessPartner" minOccurs="0"/>
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
    "bp"
})
@XmlRootElement(name = "AddBP")
public class AddBP {

    @XmlElement(name = "BP")
    protected BusinessPartner bp;

    /**
     * Gets the value of the bp property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessPartner }
     *     
     */
    public BusinessPartner getBP() {
        return bp;
    }

    /**
     * Sets the value of the bp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessPartner }
     *     
     */
    public void setBP(BusinessPartner value) {
        this.bp = value;
    }

}
