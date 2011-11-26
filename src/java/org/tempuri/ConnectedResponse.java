
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
 *         &lt;element name="ConnectedResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "connectedResult"
})
@XmlRootElement(name = "ConnectedResponse")
public class ConnectedResponse {

    @XmlElement(name = "ConnectedResult")
    protected boolean connectedResult;

    /**
     * Gets the value of the connectedResult property.
     * 
     */
    public boolean isConnectedResult() {
        return connectedResult;
    }

    /**
     * Sets the value of the connectedResult property.
     * 
     */
    public void setConnectedResult(boolean value) {
        this.connectedResult = value;
    }

}
