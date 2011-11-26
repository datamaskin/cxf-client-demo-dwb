
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
 *         &lt;element name="AddBPResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "addBPResult"
})
@XmlRootElement(name = "AddBPResponse")
public class AddBPResponse {

    @XmlElement(name = "AddBPResult")
    protected boolean addBPResult;

    /**
     * Gets the value of the addBPResult property.
     * 
     */
    public boolean isAddBPResult() {
        return addBPResult;
    }

    /**
     * Sets the value of the addBPResult property.
     * 
     */
    public void setAddBPResult(boolean value) {
        this.addBPResult = value;
    }

}
