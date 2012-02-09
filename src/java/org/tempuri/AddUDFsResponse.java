
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
 *         &lt;element name="AddUDFsResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "addUDFsResult"
})
@XmlRootElement(name = "AddUDFsResponse")
public class AddUDFsResponse {

    @XmlElement(name = "AddUDFsResult")
    protected boolean addUDFsResult;

    /**
     * Gets the value of the addUDFsResult property.
     * 
     */
    public boolean isAddUDFsResult() {
        return addUDFsResult;
    }

    /**
     * Sets the value of the addUDFsResult property.
     * 
     */
    public void setAddUDFsResult(boolean value) {
        this.addUDFsResult = value;
    }

}
