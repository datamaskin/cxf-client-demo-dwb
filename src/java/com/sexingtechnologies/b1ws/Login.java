
package com.sexingtechnologies.b1ws;

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
 *         &lt;element name="DatabaseServer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DatabaseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DatabaseType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="dst_MSSQL"/>
 *               &lt;enumeration value="dst_DB_2"/>
 *               &lt;enumeration value="dst_SYBASE"/>
 *               &lt;enumeration value="dst_MSSQL2005"/>
 *               &lt;enumeration value="dst_MAXDB"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DatabaseUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DatabasePassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Language" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="ln_Hebrew"/>
 *               &lt;enumeration value="ln_Spanish_Ar"/>
 *               &lt;enumeration value="ln_English"/>
 *               &lt;enumeration value="ln_Polish"/>
 *               &lt;enumeration value="ln_English_Sg"/>
 *               &lt;enumeration value="ln_Spanish_Pa"/>
 *               &lt;enumeration value="ln_English_Gb"/>
 *               &lt;enumeration value="ln_German"/>
 *               &lt;enumeration value="ln_Serbian"/>
 *               &lt;enumeration value="ln_Danish"/>
 *               &lt;enumeration value="ln_Norwegian"/>
 *               &lt;enumeration value="ln_Italian"/>
 *               &lt;enumeration value="ln_Hungarian"/>
 *               &lt;enumeration value="ln_Chinese"/>
 *               &lt;enumeration value="ln_Dutch"/>
 *               &lt;enumeration value="ln_Finnish"/>
 *               &lt;enumeration value="ln_Greek"/>
 *               &lt;enumeration value="ln_Portuguese"/>
 *               &lt;enumeration value="ln_Swedish"/>
 *               &lt;enumeration value="ln_English_Cy"/>
 *               &lt;enumeration value="ln_French"/>
 *               &lt;enumeration value="ln_Spanish"/>
 *               &lt;enumeration value="ln_Russian"/>
 *               &lt;enumeration value="ln_Spanish_La"/>
 *               &lt;enumeration value="ln_Czech_Cz"/>
 *               &lt;enumeration value="ln_Slovak_Sk"/>
 *               &lt;enumeration value="ln_Korean_Kr"/>
 *               &lt;enumeration value="ln_Portuguese_Br"/>
 *               &lt;enumeration value="ln_Japanese_Jp"/>
 *               &lt;enumeration value="ln_Turkish_Tr"/>
 *               &lt;enumeration value="ln_TrdtnlChinese_Hk"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LicenseServer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "databaseServer",
    "databaseName",
    "databaseType",
    "databaseUserName",
    "databasePassword",
    "companyUsername",
    "companyPassword",
    "language",
    "licenseServer"
})
@XmlRootElement(name = "Login", namespace = "LoginService")
public class Login {

    @XmlElement(name = "DatabaseServer", namespace = "LoginService")
    protected String databaseServer;
    @XmlElement(name = "DatabaseName", namespace = "LoginService")
    protected String databaseName;
    @XmlElement(name = "DatabaseType", namespace = "LoginService")
    protected String databaseType;
    @XmlElement(name = "DatabaseUserName", namespace = "LoginService")
    protected String databaseUserName;
    @XmlElement(name = "DatabasePassword", namespace = "LoginService")
    protected String databasePassword;
    @XmlElement(name = "CompanyUsername", namespace = "LoginService")
    protected String companyUsername;
    @XmlElement(name = "CompanyPassword", namespace = "LoginService")
    protected String companyPassword;
    @XmlElement(name = "Language", namespace = "LoginService")
    protected String language;
    @XmlElement(name = "LicenseServer", namespace = "LoginService")
    protected String licenseServer;

    /**
     * Gets the value of the databaseServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatabaseServer() {
        return databaseServer;
    }

    /**
     * Sets the value of the databaseServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabaseServer(String value) {
        this.databaseServer = value;
    }

    /**
     * Gets the value of the databaseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * Sets the value of the databaseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabaseName(String value) {
        this.databaseName = value;
    }

    /**
     * Gets the value of the databaseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatabaseType() {
        return databaseType;
    }

    /**
     * Sets the value of the databaseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabaseType(String value) {
        this.databaseType = value;
    }

    /**
     * Gets the value of the databaseUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatabaseUserName() {
        return databaseUserName;
    }

    /**
     * Sets the value of the databaseUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabaseUserName(String value) {
        this.databaseUserName = value;
    }

    /**
     * Gets the value of the databasePassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatabasePassword() {
        return databasePassword;
    }

    /**
     * Sets the value of the databasePassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabasePassword(String value) {
        this.databasePassword = value;
    }

    /**
     * Gets the value of the companyUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyUsername() {
        return companyUsername;
    }

    /**
     * Sets the value of the companyUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyUsername(String value) {
        this.companyUsername = value;
    }

    /**
     * Gets the value of the companyPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyPassword() {
        return companyPassword;
    }

    /**
     * Sets the value of the companyPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyPassword(String value) {
        this.companyPassword = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the licenseServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseServer() {
        return licenseServer;
    }

    /**
     * Sets the value of the licenseServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseServer(String value) {
        this.licenseServer = value;
    }

}
