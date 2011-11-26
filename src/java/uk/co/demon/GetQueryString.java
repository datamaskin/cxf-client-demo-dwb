
package uk.co.demon;

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
 *         &lt;element name="sTarget" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="index" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sType" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "sTarget",
    "index",
    "sType"
})
@XmlRootElement(name = "getQueryString")
public class GetQueryString {

    @XmlElement(required = true)
    protected String sTarget;
    protected int index;
    @XmlElement(required = true)
    protected String sType;

    /**
     * Gets the value of the sTarget property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTarget() {
        return sTarget;
    }

    /**
     * Sets the value of the sTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTarget(String value) {
        this.sTarget = value;
    }

    /**
     * Gets the value of the index property.
     * 
     */
    public int getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     */
    public void setIndex(int value) {
        this.index = value;
    }

    /**
     * Gets the value of the sType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSType() {
        return sType;
    }

    /**
     * Sets the value of the sType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSType(String value) {
        this.sType = value;
    }

}
