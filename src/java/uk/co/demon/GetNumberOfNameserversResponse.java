
package uk.co.demon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="getNumberOfNameserversReturn" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "getNumberOfNameserversReturn"
})
@XmlRootElement(name = "getNumberOfNameserversResponse")
public class GetNumberOfNameserversResponse {

    protected int getNumberOfNameserversReturn;

    /**
     * Gets the value of the getNumberOfNameserversReturn property.
     * 
     */
    public int getGetNumberOfNameserversReturn() {
        return getNumberOfNameserversReturn;
    }

    /**
     * Sets the value of the getNumberOfNameserversReturn property.
     * 
     */
    public void setGetNumberOfNameserversReturn(int value) {
        this.getNumberOfNameserversReturn = value;
    }

}
