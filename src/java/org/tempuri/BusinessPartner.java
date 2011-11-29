
package org.tempuri;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BusinessPartner complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessPartner">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CardCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupCode" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="CmpPrivate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailAddres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailZipCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CntctPrsn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Balance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ChecksBal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DNotesBal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OrdersBal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="GroupNum" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="CreditLine" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DebtLine" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VatStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LicTradNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DdctStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DdctPrcnt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ValidUntil" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Chrctrstcs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ExMatchNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InMatchNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ListNum" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="DNoteBalFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OrderBalFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DNoteBalSy" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OrderBalSy" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Transfered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BalTrnsfrd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IntrstRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Commission" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CommGrCode" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="Free_Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SlpCode" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="PrevYearAc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RateDifAct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BalanceSys" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BalanceFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Protected" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cellular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AvrageLate" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailCountr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="E_Mail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Picture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DflAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DflBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pager" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FatherCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardFName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FatherType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup21" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup26" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup27" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup28" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup29" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup30" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup31" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup32" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup33" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup34" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup35" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup36" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup37" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup38" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup39" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup40" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup41" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup42" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup43" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup44" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup45" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup46" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup47" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup48" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup49" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup50" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup51" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup52" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup53" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup54" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup55" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup56" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup57" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup58" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup59" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup60" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup61" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup62" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup63" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QryGroup64" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DdctOffice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="UpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ExportCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DscntObjct" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="DscntRel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SPGCounter" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="SPPCounter" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DdctFileNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SCNCounter" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="MinIntrst" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DataSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OprCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ExemptNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CreditCard" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="CrCardNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardValid" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="UserSign" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="LocMth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validFor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="validTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="frozenFor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="frozenFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="frozenTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="sEmployed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MTHCounter" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BNKCounter" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DdgKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DdtKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ValidComm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FrozenComm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chainStore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiscInRet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VatGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LogInstanc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ObjType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Indicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipType" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="DebPayAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToDef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Block" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailBlock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ECVatGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Deleted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IBAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FormCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Box1099" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PymCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BackOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartDelivr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DunnLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DunnDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="BlockDunn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankCountr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CollecAuth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InstrucKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SinglePaym" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISRBillId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymBlock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HouseBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerIdNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PyBlckDesc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HousBnkCry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HousBnkAct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HousBnkBrn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SysMatchNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="VatIdUnCmp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TolrncDays" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="SelfInvoic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeferrTax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LetterNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ToDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="WTLiable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CrtfcateNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="NINum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccCritria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WTCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Equ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HldCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConnBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MltMthNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TypWTReprt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VATRegNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RepName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Industry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Business" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WTTaxCat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsDomestic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsResident" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutoCalBCG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtrCtlAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AliasName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Building" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailBuildi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BoEPrsnt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BoEDiscnt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BoEOnClct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnpaidBoE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ITWTCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DunTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChannlBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DfTcnician" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Territory" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BillToDef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DpmClear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IntrntSite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LangCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HousActKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Profession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CDPNum" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="DflBankKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BCACode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UseShpdGd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VerifNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankCtlKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HousCtlKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddrType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InsurOp347" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailAddrTy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailStrNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxRndRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VendTID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ThreshOver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SurOver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VendorOcup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OpCode347" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DpmIntAct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResidenNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserSign2" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="PlngGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VatIDNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Affiliate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MivzExpSts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HierchDdct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CertWHT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CertBKeep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WHShaamGrp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndustryC" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DatevAcct" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DatevFirst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GTSRegNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GTSBankAct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GTSBilAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NTSWebSite" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="EDocExpFrm" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TaxIdIdent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HsBnkSwift" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HsBnkIBAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DflSwift" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DflIBAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attachment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AtcEntry" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="U_NBS_CustRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_NBS_SerRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_NBS_RateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="U_NBS_RateNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessPartner", propOrder = {
    "cardCode",
    "cardName",
    "cardType",
    "groupCode",
    "cmpPrivate",
    "address",
    "zipCode",
    "mailAddres",
    "mailZipCod",
    "phone1",
    "phone2",
    "fax",
    "cntctPrsn",
    "notes",
    "balance",
    "checksBal",
    "dNotesBal",
    "ordersBal",
    "groupNum",
    "creditLine",
    "debtLine",
    "discount",
    "vatStatus",
    "licTradNum",
    "ddctStatus",
    "ddctPrcnt",
    "validUntil",
    "chrctrstcs",
    "exMatchNum",
    "inMatchNum",
    "listNum",
    "dNoteBalFC",
    "orderBalFC",
    "dNoteBalSy",
    "orderBalSy",
    "transfered",
    "balTrnsfrd",
    "intrstRate",
    "commission",
    "commGrCode",
    "freeText",
    "slpCode",
    "prevYearAc",
    "currency",
    "rateDifAct",
    "balanceSys",
    "balanceFC",
    "_protected",
    "cellular",
    "avrageLate",
    "city",
    "county",
    "country",
    "mailCity",
    "mailCounty",
    "mailCountr",
    "eMail",
    "picture",
    "dflAccount",
    "dflBranch",
    "bankCode",
    "addID",
    "pager",
    "fatherCard",
    "cardFName",
    "fatherType",
    "qryGroup1",
    "qryGroup2",
    "qryGroup3",
    "qryGroup4",
    "qryGroup5",
    "qryGroup6",
    "qryGroup7",
    "qryGroup8",
    "qryGroup9",
    "qryGroup10",
    "qryGroup11",
    "qryGroup12",
    "qryGroup13",
    "qryGroup14",
    "qryGroup15",
    "qryGroup16",
    "qryGroup17",
    "qryGroup18",
    "qryGroup19",
    "qryGroup20",
    "qryGroup21",
    "qryGroup22",
    "qryGroup23",
    "qryGroup24",
    "qryGroup25",
    "qryGroup26",
    "qryGroup27",
    "qryGroup28",
    "qryGroup29",
    "qryGroup30",
    "qryGroup31",
    "qryGroup32",
    "qryGroup33",
    "qryGroup34",
    "qryGroup35",
    "qryGroup36",
    "qryGroup37",
    "qryGroup38",
    "qryGroup39",
    "qryGroup40",
    "qryGroup41",
    "qryGroup42",
    "qryGroup43",
    "qryGroup44",
    "qryGroup45",
    "qryGroup46",
    "qryGroup47",
    "qryGroup48",
    "qryGroup49",
    "qryGroup50",
    "qryGroup51",
    "qryGroup52",
    "qryGroup53",
    "qryGroup54",
    "qryGroup55",
    "qryGroup56",
    "qryGroup57",
    "qryGroup58",
    "qryGroup59",
    "qryGroup60",
    "qryGroup61",
    "qryGroup62",
    "qryGroup63",
    "qryGroup64",
    "ddctOffice",
    "createDate",
    "updateDate",
    "exportCode",
    "dscntObjct",
    "dscntRel",
    "spgCounter",
    "sppCounter",
    "ddctFileNo",
    "scnCounter",
    "minIntrst",
    "dataSource",
    "oprCount",
    "exemptNo",
    "priority",
    "creditCard",
    "crCardNum",
    "cardValid",
    "userSign",
    "locMth",
    "validFor",
    "validFrom",
    "validTo",
    "frozenFor",
    "frozenFrom",
    "frozenTo",
    "sEmployed",
    "mthCounter",
    "bnkCounter",
    "ddgKey",
    "ddtKey",
    "validComm",
    "frozenComm",
    "chainStore",
    "discInRet",
    "state1",
    "state2",
    "vatGroup",
    "logInstanc",
    "objType",
    "indicator",
    "shipType",
    "debPayAcct",
    "shipToDef",
    "block",
    "mailBlock",
    "password",
    "ecVatGroup",
    "deleted",
    "iban",
    "docEntry",
    "formCode",
    "box1099",
    "pymCode",
    "backOrder",
    "partDelivr",
    "dunnLevel",
    "dunnDate",
    "blockDunn",
    "bankCountr",
    "collecAuth",
    "dme",
    "instrucKey",
    "singlePaym",
    "isrBillId",
    "paymBlock",
    "refDetails",
    "houseBank",
    "ownerIdNum",
    "pyBlckDesc",
    "housBnkCry",
    "housBnkAct",
    "housBnkBrn",
    "projectCod",
    "sysMatchNo",
    "vatIdUnCmp",
    "agentCode",
    "tolrncDays",
    "selfInvoic",
    "deferrTax",
    "letterNum",
    "maxAmount",
    "fromDate",
    "toDate",
    "wtLiable",
    "crtfcateNO",
    "expireDate",
    "niNum",
    "accCritria",
    "wtCode",
    "equ",
    "hldCode",
    "connBP",
    "mltMthNum",
    "typWTReprt",
    "vatRegNum",
    "repName",
    "industry",
    "business",
    "wtTaxCat",
    "isDomestic",
    "isResident",
    "autoCalBCG",
    "otrCtlAcct",
    "aliasName",
    "building",
    "mailBuildi",
    "boEPrsnt",
    "boEDiscnt",
    "boEOnClct",
    "unpaidBoE",
    "itwtCode",
    "dunTerm",
    "channlBP",
    "dfTcnician",
    "territory",
    "billToDef",
    "dpmClear",
    "intrntSite",
    "langCode",
    "housActKey",
    "profession",
    "cdpNum",
    "dflBankKey",
    "bcaCode",
    "useShpdGd",
    "regNum",
    "verifNum",
    "bankCtlKey",
    "housCtlKey",
    "addrType",
    "insurOp347",
    "mailAddrTy",
    "streetNo",
    "mailStrNo",
    "taxRndRule",
    "vendTID",
    "threshOver",
    "surOver",
    "vendorOcup",
    "opCode347",
    "dpmIntAct",
    "residenNum",
    "userSign2",
    "plngGroup",
    "vatIDNum",
    "affiliate",
    "mivzExpSts",
    "hierchDdct",
    "certWHT",
    "certBKeep",
    "whShaamGrp",
    "industryC",
    "datevAcct",
    "datevFirst",
    "gtsRegNum",
    "gtsBankAct",
    "gtsBilAddr",
    "ntsWebSite",
    "eDocExpFrm",
    "taxIdIdent",
    "hsBnkSwift",
    "hsBnkIBAN",
    "dflSwift",
    "dflIBAN",
    "attachment",
    "atcEntry",
    "unbsCustRating",
    "unbsSerRating",
    "unbsRateDate",
    "unbsRateNote"
})
public class BusinessPartner {

    @XmlElement(name = "CardCode")
    protected String cardCode;
    @XmlElement(name = "CardName")
    protected String cardName;
    @XmlElement(name = "CardType")
    protected String cardType;
    @XmlElement(name = "GroupCode")
    protected Short groupCode;
    @XmlElement(name = "CmpPrivate")
    protected String cmpPrivate;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "ZipCode")
    protected String zipCode;
    @XmlElement(name = "MailAddres")
    protected String mailAddres;
    @XmlElement(name = "MailZipCod")
    protected String mailZipCod;
    @XmlElement(name = "Phone1")
    protected String phone1;
    @XmlElement(name = "Phone2")
    protected String phone2;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "CntctPrsn")
    protected String cntctPrsn;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "Balance")
    protected BigDecimal balance;
    @XmlElement(name = "ChecksBal")
    protected BigDecimal checksBal;
    @XmlElement(name = "DNotesBal")
    protected BigDecimal dNotesBal;
    @XmlElement(name = "OrdersBal")
    protected BigDecimal ordersBal;
    @XmlElement(name = "GroupNum")
    protected Short groupNum;
    @XmlElement(name = "CreditLine")
    protected BigDecimal creditLine;
    @XmlElement(name = "DebtLine")
    protected BigDecimal debtLine;
    @XmlElement(name = "Discount")
    protected BigDecimal discount;
    @XmlElement(name = "VatStatus")
    protected String vatStatus;
    @XmlElement(name = "LicTradNum")
    protected String licTradNum;
    @XmlElement(name = "DdctStatus")
    protected String ddctStatus;
    @XmlElement(name = "DdctPrcnt")
    protected BigDecimal ddctPrcnt;
    @XmlElement(name = "ValidUntil")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validUntil;
    @XmlElement(name = "Chrctrstcs")
    protected Integer chrctrstcs;
    @XmlElement(name = "ExMatchNum")
    protected Integer exMatchNum;
    @XmlElement(name = "InMatchNum")
    protected Integer inMatchNum;
    @XmlElement(name = "ListNum")
    protected Short listNum;
    @XmlElement(name = "DNoteBalFC")
    protected BigDecimal dNoteBalFC;
    @XmlElement(name = "OrderBalFC")
    protected BigDecimal orderBalFC;
    @XmlElement(name = "DNoteBalSy")
    protected BigDecimal dNoteBalSy;
    @XmlElement(name = "OrderBalSy")
    protected BigDecimal orderBalSy;
    @XmlElement(name = "Transfered")
    protected String transfered;
    @XmlElement(name = "BalTrnsfrd")
    protected String balTrnsfrd;
    @XmlElement(name = "IntrstRate")
    protected BigDecimal intrstRate;
    @XmlElement(name = "Commission")
    protected BigDecimal commission;
    @XmlElement(name = "CommGrCode")
    protected Short commGrCode;
    @XmlElement(name = "Free_Text")
    protected String freeText;
    @XmlElement(name = "SlpCode")
    protected Short slpCode;
    @XmlElement(name = "PrevYearAc")
    protected String prevYearAc;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "RateDifAct")
    protected String rateDifAct;
    @XmlElement(name = "BalanceSys")
    protected BigDecimal balanceSys;
    @XmlElement(name = "BalanceFC")
    protected BigDecimal balanceFC;
    @XmlElement(name = "Protected")
    protected String _protected;
    @XmlElement(name = "Cellular")
    protected String cellular;
    @XmlElement(name = "AvrageLate")
    protected Short avrageLate;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "County")
    protected String county;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "MailCity")
    protected String mailCity;
    @XmlElement(name = "MailCounty")
    protected String mailCounty;
    @XmlElement(name = "MailCountr")
    protected String mailCountr;
    @XmlElement(name = "E_Mail")
    protected String eMail;
    @XmlElement(name = "Picture")
    protected String picture;
    @XmlElement(name = "DflAccount")
    protected String dflAccount;
    @XmlElement(name = "DflBranch")
    protected String dflBranch;
    @XmlElement(name = "BankCode")
    protected String bankCode;
    @XmlElement(name = "AddID")
    protected String addID;
    @XmlElement(name = "Pager")
    protected String pager;
    @XmlElement(name = "FatherCard")
    protected String fatherCard;
    @XmlElement(name = "CardFName")
    protected String cardFName;
    @XmlElement(name = "FatherType")
    protected String fatherType;
    @XmlElement(name = "QryGroup1")
    protected String qryGroup1;
    @XmlElement(name = "QryGroup2")
    protected String qryGroup2;
    @XmlElement(name = "QryGroup3")
    protected String qryGroup3;
    @XmlElement(name = "QryGroup4")
    protected String qryGroup4;
    @XmlElement(name = "QryGroup5")
    protected String qryGroup5;
    @XmlElement(name = "QryGroup6")
    protected String qryGroup6;
    @XmlElement(name = "QryGroup7")
    protected String qryGroup7;
    @XmlElement(name = "QryGroup8")
    protected String qryGroup8;
    @XmlElement(name = "QryGroup9")
    protected String qryGroup9;
    @XmlElement(name = "QryGroup10")
    protected String qryGroup10;
    @XmlElement(name = "QryGroup11")
    protected String qryGroup11;
    @XmlElement(name = "QryGroup12")
    protected String qryGroup12;
    @XmlElement(name = "QryGroup13")
    protected String qryGroup13;
    @XmlElement(name = "QryGroup14")
    protected String qryGroup14;
    @XmlElement(name = "QryGroup15")
    protected String qryGroup15;
    @XmlElement(name = "QryGroup16")
    protected String qryGroup16;
    @XmlElement(name = "QryGroup17")
    protected String qryGroup17;
    @XmlElement(name = "QryGroup18")
    protected String qryGroup18;
    @XmlElement(name = "QryGroup19")
    protected String qryGroup19;
    @XmlElement(name = "QryGroup20")
    protected String qryGroup20;
    @XmlElement(name = "QryGroup21")
    protected String qryGroup21;
    @XmlElement(name = "QryGroup22")
    protected String qryGroup22;
    @XmlElement(name = "QryGroup23")
    protected String qryGroup23;
    @XmlElement(name = "QryGroup24")
    protected String qryGroup24;
    @XmlElement(name = "QryGroup25")
    protected String qryGroup25;
    @XmlElement(name = "QryGroup26")
    protected String qryGroup26;
    @XmlElement(name = "QryGroup27")
    protected String qryGroup27;
    @XmlElement(name = "QryGroup28")
    protected String qryGroup28;
    @XmlElement(name = "QryGroup29")
    protected String qryGroup29;
    @XmlElement(name = "QryGroup30")
    protected String qryGroup30;
    @XmlElement(name = "QryGroup31")
    protected String qryGroup31;
    @XmlElement(name = "QryGroup32")
    protected String qryGroup32;
    @XmlElement(name = "QryGroup33")
    protected String qryGroup33;
    @XmlElement(name = "QryGroup34")
    protected String qryGroup34;
    @XmlElement(name = "QryGroup35")
    protected String qryGroup35;
    @XmlElement(name = "QryGroup36")
    protected String qryGroup36;
    @XmlElement(name = "QryGroup37")
    protected String qryGroup37;
    @XmlElement(name = "QryGroup38")
    protected String qryGroup38;
    @XmlElement(name = "QryGroup39")
    protected String qryGroup39;
    @XmlElement(name = "QryGroup40")
    protected String qryGroup40;
    @XmlElement(name = "QryGroup41")
    protected String qryGroup41;
    @XmlElement(name = "QryGroup42")
    protected String qryGroup42;
    @XmlElement(name = "QryGroup43")
    protected String qryGroup43;
    @XmlElement(name = "QryGroup44")
    protected String qryGroup44;
    @XmlElement(name = "QryGroup45")
    protected String qryGroup45;
    @XmlElement(name = "QryGroup46")
    protected String qryGroup46;
    @XmlElement(name = "QryGroup47")
    protected String qryGroup47;
    @XmlElement(name = "QryGroup48")
    protected String qryGroup48;
    @XmlElement(name = "QryGroup49")
    protected String qryGroup49;
    @XmlElement(name = "QryGroup50")
    protected String qryGroup50;
    @XmlElement(name = "QryGroup51")
    protected String qryGroup51;
    @XmlElement(name = "QryGroup52")
    protected String qryGroup52;
    @XmlElement(name = "QryGroup53")
    protected String qryGroup53;
    @XmlElement(name = "QryGroup54")
    protected String qryGroup54;
    @XmlElement(name = "QryGroup55")
    protected String qryGroup55;
    @XmlElement(name = "QryGroup56")
    protected String qryGroup56;
    @XmlElement(name = "QryGroup57")
    protected String qryGroup57;
    @XmlElement(name = "QryGroup58")
    protected String qryGroup58;
    @XmlElement(name = "QryGroup59")
    protected String qryGroup59;
    @XmlElement(name = "QryGroup60")
    protected String qryGroup60;
    @XmlElement(name = "QryGroup61")
    protected String qryGroup61;
    @XmlElement(name = "QryGroup62")
    protected String qryGroup62;
    @XmlElement(name = "QryGroup63")
    protected String qryGroup63;
    @XmlElement(name = "QryGroup64")
    protected String qryGroup64;
    @XmlElement(name = "DdctOffice")
    protected String ddctOffice;
    @XmlElement(name = "CreateDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlElement(name = "UpdateDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateDate;
    @XmlElement(name = "ExportCode")
    protected String exportCode;
    @XmlElement(name = "DscntObjct")
    protected Short dscntObjct;
    @XmlElement(name = "DscntRel")
    protected String dscntRel;
    @XmlElement(name = "SPGCounter")
    protected Short spgCounter;
    @XmlElement(name = "SPPCounter")
    protected Integer sppCounter;
    @XmlElement(name = "DdctFileNo")
    protected String ddctFileNo;
    @XmlElement(name = "SCNCounter")
    protected Short scnCounter;
    @XmlElement(name = "MinIntrst")
    protected BigDecimal minIntrst;
    @XmlElement(name = "DataSource")
    protected String dataSource;
    @XmlElement(name = "OprCount")
    protected Integer oprCount;
    @XmlElement(name = "ExemptNo")
    protected String exemptNo;
    @XmlElement(name = "Priority")
    protected Integer priority;
    @XmlElement(name = "CreditCard")
    protected Short creditCard;
    @XmlElement(name = "CrCardNum")
    protected String crCardNum;
    @XmlElement(name = "CardValid")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cardValid;
    @XmlElement(name = "UserSign")
    protected Short userSign;
    @XmlElement(name = "LocMth")
    protected String locMth;
    protected String validFor;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validTo;
    protected String frozenFor;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar frozenFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar frozenTo;
    protected String sEmployed;
    @XmlElement(name = "MTHCounter")
    protected Integer mthCounter;
    @XmlElement(name = "BNKCounter")
    protected Integer bnkCounter;
    @XmlElement(name = "DdgKey")
    protected Integer ddgKey;
    @XmlElement(name = "DdtKey")
    protected Integer ddtKey;
    @XmlElement(name = "ValidComm")
    protected String validComm;
    @XmlElement(name = "FrozenComm")
    protected String frozenComm;
    protected String chainStore;
    @XmlElement(name = "DiscInRet")
    protected String discInRet;
    @XmlElement(name = "State1")
    protected String state1;
    @XmlElement(name = "State2")
    protected String state2;
    @XmlElement(name = "VatGroup")
    protected String vatGroup;
    @XmlElement(name = "LogInstanc")
    protected Integer logInstanc;
    @XmlElement(name = "ObjType")
    protected String objType;
    @XmlElement(name = "Indicator")
    protected String indicator;
    @XmlElement(name = "ShipType")
    protected Short shipType;
    @XmlElement(name = "DebPayAcct")
    protected String debPayAcct;
    @XmlElement(name = "ShipToDef")
    protected String shipToDef;
    @XmlElement(name = "Block")
    protected String block;
    @XmlElement(name = "MailBlock")
    protected String mailBlock;
    @XmlElement(name = "Password")
    protected String password;
    @XmlElement(name = "ECVatGroup")
    protected String ecVatGroup;
    @XmlElement(name = "Deleted")
    protected String deleted;
    @XmlElement(name = "IBAN")
    protected String iban;
    @XmlElement(name = "DocEntry")
    protected Integer docEntry;
    @XmlElement(name = "FormCode")
    protected Integer formCode;
    @XmlElement(name = "Box1099")
    protected String box1099;
    @XmlElement(name = "PymCode")
    protected String pymCode;
    @XmlElement(name = "BackOrder")
    protected String backOrder;
    @XmlElement(name = "PartDelivr")
    protected String partDelivr;
    @XmlElement(name = "DunnLevel")
    protected Integer dunnLevel;
    @XmlElement(name = "DunnDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dunnDate;
    @XmlElement(name = "BlockDunn")
    protected String blockDunn;
    @XmlElement(name = "BankCountr")
    protected String bankCountr;
    @XmlElement(name = "CollecAuth")
    protected String collecAuth;
    @XmlElement(name = "DME")
    protected String dme;
    @XmlElement(name = "InstrucKey")
    protected String instrucKey;
    @XmlElement(name = "SinglePaym")
    protected String singlePaym;
    @XmlElement(name = "ISRBillId")
    protected String isrBillId;
    @XmlElement(name = "PaymBlock")
    protected String paymBlock;
    @XmlElement(name = "RefDetails")
    protected String refDetails;
    @XmlElement(name = "HouseBank")
    protected String houseBank;
    @XmlElement(name = "OwnerIdNum")
    protected String ownerIdNum;
    @XmlElement(name = "PyBlckDesc")
    protected Integer pyBlckDesc;
    @XmlElement(name = "HousBnkCry")
    protected String housBnkCry;
    @XmlElement(name = "HousBnkAct")
    protected String housBnkAct;
    @XmlElement(name = "HousBnkBrn")
    protected String housBnkBrn;
    @XmlElement(name = "ProjectCod")
    protected String projectCod;
    @XmlElement(name = "SysMatchNo")
    protected Integer sysMatchNo;
    @XmlElement(name = "VatIdUnCmp")
    protected String vatIdUnCmp;
    @XmlElement(name = "AgentCode")
    protected String agentCode;
    @XmlElement(name = "TolrncDays")
    protected Short tolrncDays;
    @XmlElement(name = "SelfInvoic")
    protected String selfInvoic;
    @XmlElement(name = "DeferrTax")
    protected String deferrTax;
    @XmlElement(name = "LetterNum")
    protected String letterNum;
    @XmlElement(name = "MaxAmount")
    protected BigDecimal maxAmount;
    @XmlElement(name = "FromDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromDate;
    @XmlElement(name = "ToDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toDate;
    @XmlElement(name = "WTLiable")
    protected String wtLiable;
    @XmlElement(name = "CrtfcateNO")
    protected String crtfcateNO;
    @XmlElement(name = "ExpireDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expireDate;
    @XmlElement(name = "NINum")
    protected String niNum;
    @XmlElement(name = "AccCritria")
    protected String accCritria;
    @XmlElement(name = "WTCode")
    protected String wtCode;
    @XmlElement(name = "Equ")
    protected String equ;
    @XmlElement(name = "HldCode")
    protected String hldCode;
    @XmlElement(name = "ConnBP")
    protected String connBP;
    @XmlElement(name = "MltMthNum")
    protected Integer mltMthNum;
    @XmlElement(name = "TypWTReprt")
    protected String typWTReprt;
    @XmlElement(name = "VATRegNum")
    protected String vatRegNum;
    @XmlElement(name = "RepName")
    protected String repName;
    @XmlElement(name = "Industry")
    protected String industry;
    @XmlElement(name = "Business")
    protected String business;
    @XmlElement(name = "WTTaxCat")
    protected String wtTaxCat;
    @XmlElement(name = "IsDomestic")
    protected String isDomestic;
    @XmlElement(name = "IsResident")
    protected String isResident;
    @XmlElement(name = "AutoCalBCG")
    protected String autoCalBCG;
    @XmlElement(name = "OtrCtlAcct")
    protected String otrCtlAcct;
    @XmlElement(name = "AliasName")
    protected String aliasName;
    @XmlElement(name = "Building")
    protected String building;
    @XmlElement(name = "MailBuildi")
    protected String mailBuildi;
    @XmlElement(name = "BoEPrsnt")
    protected String boEPrsnt;
    @XmlElement(name = "BoEDiscnt")
    protected String boEDiscnt;
    @XmlElement(name = "BoEOnClct")
    protected String boEOnClct;
    @XmlElement(name = "UnpaidBoE")
    protected String unpaidBoE;
    @XmlElement(name = "ITWTCode")
    protected String itwtCode;
    @XmlElement(name = "DunTerm")
    protected String dunTerm;
    @XmlElement(name = "ChannlBP")
    protected String channlBP;
    @XmlElement(name = "DfTcnician")
    protected Integer dfTcnician;
    @XmlElement(name = "Territory")
    protected Integer territory;
    @XmlElement(name = "BillToDef")
    protected String billToDef;
    @XmlElement(name = "DpmClear")
    protected String dpmClear;
    @XmlElement(name = "IntrntSite")
    protected String intrntSite;
    @XmlElement(name = "LangCode")
    protected Integer langCode;
    @XmlElement(name = "HousActKey")
    protected Integer housActKey;
    @XmlElement(name = "Profession")
    protected String profession;
    @XmlElement(name = "CDPNum")
    protected Short cdpNum;
    @XmlElement(name = "DflBankKey")
    protected Integer dflBankKey;
    @XmlElement(name = "BCACode")
    protected String bcaCode;
    @XmlElement(name = "UseShpdGd")
    protected String useShpdGd;
    @XmlElement(name = "RegNum")
    protected String regNum;
    @XmlElement(name = "VerifNum")
    protected String verifNum;
    @XmlElement(name = "BankCtlKey")
    protected String bankCtlKey;
    @XmlElement(name = "HousCtlKey")
    protected String housCtlKey;
    @XmlElement(name = "AddrType")
    protected String addrType;
    @XmlElement(name = "InsurOp347")
    protected String insurOp347;
    @XmlElement(name = "MailAddrTy")
    protected String mailAddrTy;
    @XmlElement(name = "StreetNo")
    protected String streetNo;
    @XmlElement(name = "MailStrNo")
    protected String mailStrNo;
    @XmlElement(name = "TaxRndRule")
    protected String taxRndRule;
    @XmlElement(name = "VendTID")
    protected Integer vendTID;
    @XmlElement(name = "ThreshOver")
    protected String threshOver;
    @XmlElement(name = "SurOver")
    protected String surOver;
    @XmlElement(name = "VendorOcup")
    protected String vendorOcup;
    @XmlElement(name = "OpCode347")
    protected String opCode347;
    @XmlElement(name = "DpmIntAct")
    protected String dpmIntAct;
    @XmlElement(name = "ResidenNum")
    protected String residenNum;
    @XmlElement(name = "UserSign2")
    protected Short userSign2;
    @XmlElement(name = "PlngGroup")
    protected String plngGroup;
    @XmlElement(name = "VatIDNum")
    protected String vatIDNum;
    @XmlElement(name = "Affiliate")
    protected String affiliate;
    @XmlElement(name = "MivzExpSts")
    protected String mivzExpSts;
    @XmlElement(name = "HierchDdct")
    protected String hierchDdct;
    @XmlElement(name = "CertWHT")
    protected String certWHT;
    @XmlElement(name = "CertBKeep")
    protected String certBKeep;
    @XmlElement(name = "WHShaamGrp")
    protected String whShaamGrp;
    @XmlElement(name = "IndustryC")
    protected Integer industryC;
    @XmlElement(name = "DatevAcct")
    protected Integer datevAcct;
    @XmlElement(name = "DatevFirst")
    protected String datevFirst;
    @XmlElement(name = "GTSRegNum")
    protected String gtsRegNum;
    @XmlElement(name = "GTSBankAct")
    protected String gtsBankAct;
    @XmlElement(name = "GTSBilAddr")
    protected String gtsBilAddr;
    @XmlElement(name = "NTSWebSite")
    protected Short ntsWebSite;
    @XmlElement(name = "EDocExpFrm")
    protected Integer eDocExpFrm;
    @XmlElement(name = "TaxIdIdent")
    protected String taxIdIdent;
    @XmlElement(name = "HsBnkSwift")
    protected String hsBnkSwift;
    @XmlElement(name = "HsBnkIBAN")
    protected String hsBnkIBAN;
    @XmlElement(name = "DflSwift")
    protected String dflSwift;
    @XmlElement(name = "DflIBAN")
    protected String dflIBAN;
    @XmlElement(name = "Attachment")
    protected String attachment;
    @XmlElement(name = "AtcEntry")
    protected Integer atcEntry;
    @XmlElement(name = "U_NBS_CustRating")
    protected String unbsCustRating;
    @XmlElement(name = "U_NBS_SerRating")
    protected String unbsSerRating;
    @XmlElement(name = "U_NBS_RateDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar unbsRateDate;
    @XmlElement(name = "U_NBS_RateNote")
    protected String unbsRateNote;

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
     * Gets the value of the cardName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardName() {
        return cardName;
    }

    /**
     * Sets the value of the cardName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardName(String value) {
        this.cardName = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the groupCode property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getGroupCode() {
        return groupCode;
    }

    /**
     * Sets the value of the groupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setGroupCode(Short value) {
        this.groupCode = value;
    }

    /**
     * Gets the value of the cmpPrivate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmpPrivate() {
        return cmpPrivate;
    }

    /**
     * Sets the value of the cmpPrivate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmpPrivate(String value) {
        this.cmpPrivate = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

    /**
     * Gets the value of the mailAddres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailAddres() {
        return mailAddres;
    }

    /**
     * Sets the value of the mailAddres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailAddres(String value) {
        this.mailAddres = value;
    }

    /**
     * Gets the value of the mailZipCod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailZipCod() {
        return mailZipCod;
    }

    /**
     * Sets the value of the mailZipCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailZipCod(String value) {
        this.mailZipCod = value;
    }

    /**
     * Gets the value of the phone1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone1() {
        return phone1;
    }

    /**
     * Sets the value of the phone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone1(String value) {
        this.phone1 = value;
    }

    /**
     * Gets the value of the phone2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone2() {
        return phone2;
    }

    /**
     * Sets the value of the phone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone2(String value) {
        this.phone2 = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the cntctPrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntctPrsn() {
        return cntctPrsn;
    }

    /**
     * Sets the value of the cntctPrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntctPrsn(String value) {
        this.cntctPrsn = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalance(BigDecimal value) {
        this.balance = value;
    }

    /**
     * Gets the value of the checksBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChecksBal() {
        return checksBal;
    }

    /**
     * Sets the value of the checksBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChecksBal(BigDecimal value) {
        this.checksBal = value;
    }

    /**
     * Gets the value of the dNotesBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDNotesBal() {
        return dNotesBal;
    }

    /**
     * Sets the value of the dNotesBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDNotesBal(BigDecimal value) {
        this.dNotesBal = value;
    }

    /**
     * Gets the value of the ordersBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrdersBal() {
        return ordersBal;
    }

    /**
     * Sets the value of the ordersBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrdersBal(BigDecimal value) {
        this.ordersBal = value;
    }

    /**
     * Gets the value of the groupNum property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getGroupNum() {
        return groupNum;
    }

    /**
     * Sets the value of the groupNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setGroupNum(Short value) {
        this.groupNum = value;
    }

    /**
     * Gets the value of the creditLine property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditLine() {
        return creditLine;
    }

    /**
     * Sets the value of the creditLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditLine(BigDecimal value) {
        this.creditLine = value;
    }

    /**
     * Gets the value of the debtLine property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDebtLine() {
        return debtLine;
    }

    /**
     * Sets the value of the debtLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDebtLine(BigDecimal value) {
        this.debtLine = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscount(BigDecimal value) {
        this.discount = value;
    }

    /**
     * Gets the value of the vatStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatStatus() {
        return vatStatus;
    }

    /**
     * Sets the value of the vatStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatStatus(String value) {
        this.vatStatus = value;
    }

    /**
     * Gets the value of the licTradNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicTradNum() {
        return licTradNum;
    }

    /**
     * Sets the value of the licTradNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicTradNum(String value) {
        this.licTradNum = value;
    }

    /**
     * Gets the value of the ddctStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdctStatus() {
        return ddctStatus;
    }

    /**
     * Sets the value of the ddctStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdctStatus(String value) {
        this.ddctStatus = value;
    }

    /**
     * Gets the value of the ddctPrcnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDdctPrcnt() {
        return ddctPrcnt;
    }

    /**
     * Sets the value of the ddctPrcnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDdctPrcnt(BigDecimal value) {
        this.ddctPrcnt = value;
    }

    /**
     * Gets the value of the validUntil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidUntil() {
        return validUntil;
    }

    /**
     * Sets the value of the validUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidUntil(XMLGregorianCalendar value) {
        this.validUntil = value;
    }

    /**
     * Gets the value of the chrctrstcs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChrctrstcs() {
        return chrctrstcs;
    }

    /**
     * Sets the value of the chrctrstcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChrctrstcs(Integer value) {
        this.chrctrstcs = value;
    }

    /**
     * Gets the value of the exMatchNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExMatchNum() {
        return exMatchNum;
    }

    /**
     * Sets the value of the exMatchNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExMatchNum(Integer value) {
        this.exMatchNum = value;
    }

    /**
     * Gets the value of the inMatchNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInMatchNum() {
        return inMatchNum;
    }

    /**
     * Sets the value of the inMatchNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInMatchNum(Integer value) {
        this.inMatchNum = value;
    }

    /**
     * Gets the value of the listNum property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getListNum() {
        return listNum;
    }

    /**
     * Sets the value of the listNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setListNum(Short value) {
        this.listNum = value;
    }

    /**
     * Gets the value of the dNoteBalFC property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDNoteBalFC() {
        return dNoteBalFC;
    }

    /**
     * Sets the value of the dNoteBalFC property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDNoteBalFC(BigDecimal value) {
        this.dNoteBalFC = value;
    }

    /**
     * Gets the value of the orderBalFC property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrderBalFC() {
        return orderBalFC;
    }

    /**
     * Sets the value of the orderBalFC property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrderBalFC(BigDecimal value) {
        this.orderBalFC = value;
    }

    /**
     * Gets the value of the dNoteBalSy property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDNoteBalSy() {
        return dNoteBalSy;
    }

    /**
     * Sets the value of the dNoteBalSy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDNoteBalSy(BigDecimal value) {
        this.dNoteBalSy = value;
    }

    /**
     * Gets the value of the orderBalSy property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrderBalSy() {
        return orderBalSy;
    }

    /**
     * Sets the value of the orderBalSy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrderBalSy(BigDecimal value) {
        this.orderBalSy = value;
    }

    /**
     * Gets the value of the transfered property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransfered() {
        return transfered;
    }

    /**
     * Sets the value of the transfered property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransfered(String value) {
        this.transfered = value;
    }

    /**
     * Gets the value of the balTrnsfrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalTrnsfrd() {
        return balTrnsfrd;
    }

    /**
     * Sets the value of the balTrnsfrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalTrnsfrd(String value) {
        this.balTrnsfrd = value;
    }

    /**
     * Gets the value of the intrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIntrstRate() {
        return intrstRate;
    }

    /**
     * Sets the value of the intrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIntrstRate(BigDecimal value) {
        this.intrstRate = value;
    }

    /**
     * Gets the value of the commission property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCommission(BigDecimal value) {
        this.commission = value;
    }

    /**
     * Gets the value of the commGrCode property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCommGrCode() {
        return commGrCode;
    }

    /**
     * Sets the value of the commGrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCommGrCode(Short value) {
        this.commGrCode = value;
    }

    /**
     * Gets the value of the freeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeText() {
        return freeText;
    }

    /**
     * Sets the value of the freeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeText(String value) {
        this.freeText = value;
    }

    /**
     * Gets the value of the slpCode property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSlpCode() {
        return slpCode;
    }

    /**
     * Sets the value of the slpCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSlpCode(Short value) {
        this.slpCode = value;
    }

    /**
     * Gets the value of the prevYearAc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevYearAc() {
        return prevYearAc;
    }

    /**
     * Sets the value of the prevYearAc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevYearAc(String value) {
        this.prevYearAc = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the rateDifAct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateDifAct() {
        return rateDifAct;
    }

    /**
     * Sets the value of the rateDifAct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateDifAct(String value) {
        this.rateDifAct = value;
    }

    /**
     * Gets the value of the balanceSys property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalanceSys() {
        return balanceSys;
    }

    /**
     * Sets the value of the balanceSys property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalanceSys(BigDecimal value) {
        this.balanceSys = value;
    }

    /**
     * Gets the value of the balanceFC property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalanceFC() {
        return balanceFC;
    }

    /**
     * Sets the value of the balanceFC property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalanceFC(BigDecimal value) {
        this.balanceFC = value;
    }

    /**
     * Gets the value of the protected property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtected() {
        return _protected;
    }

    /**
     * Sets the value of the protected property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtected(String value) {
        this._protected = value;
    }

    /**
     * Gets the value of the cellular property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellular() {
        return cellular;
    }

    /**
     * Sets the value of the cellular property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellular(String value) {
        this.cellular = value;
    }

    /**
     * Gets the value of the avrageLate property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAvrageLate() {
        return avrageLate;
    }

    /**
     * Sets the value of the avrageLate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAvrageLate(Short value) {
        this.avrageLate = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty(String value) {
        this.county = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the mailCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailCity() {
        return mailCity;
    }

    /**
     * Sets the value of the mailCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailCity(String value) {
        this.mailCity = value;
    }

    /**
     * Gets the value of the mailCounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailCounty() {
        return mailCounty;
    }

    /**
     * Sets the value of the mailCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailCounty(String value) {
        this.mailCounty = value;
    }

    /**
     * Gets the value of the mailCountr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailCountr() {
        return mailCountr;
    }

    /**
     * Sets the value of the mailCountr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailCountr(String value) {
        this.mailCountr = value;
    }

    /**
     * Gets the value of the eMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMail() {
        return eMail;
    }

    /**
     * Sets the value of the eMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMail(String value) {
        this.eMail = value;
    }

    /**
     * Gets the value of the picture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPicture() {
        return picture;
    }

    /**
     * Sets the value of the picture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPicture(String value) {
        this.picture = value;
    }

    /**
     * Gets the value of the dflAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDflAccount() {
        return dflAccount;
    }

    /**
     * Sets the value of the dflAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDflAccount(String value) {
        this.dflAccount = value;
    }

    /**
     * Gets the value of the dflBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDflBranch() {
        return dflBranch;
    }

    /**
     * Sets the value of the dflBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDflBranch(String value) {
        this.dflBranch = value;
    }

    /**
     * Gets the value of the bankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Sets the value of the bankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCode(String value) {
        this.bankCode = value;
    }

    /**
     * Gets the value of the addID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddID() {
        return addID;
    }

    /**
     * Sets the value of the addID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddID(String value) {
        this.addID = value;
    }

    /**
     * Gets the value of the pager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPager() {
        return pager;
    }

    /**
     * Sets the value of the pager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPager(String value) {
        this.pager = value;
    }

    /**
     * Gets the value of the fatherCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherCard() {
        return fatherCard;
    }

    /**
     * Sets the value of the fatherCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherCard(String value) {
        this.fatherCard = value;
    }

    /**
     * Gets the value of the cardFName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardFName() {
        return cardFName;
    }

    /**
     * Sets the value of the cardFName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardFName(String value) {
        this.cardFName = value;
    }

    /**
     * Gets the value of the fatherType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherType() {
        return fatherType;
    }

    /**
     * Sets the value of the fatherType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherType(String value) {
        this.fatherType = value;
    }

    /**
     * Gets the value of the qryGroup1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup1() {
        return qryGroup1;
    }

    /**
     * Sets the value of the qryGroup1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup1(String value) {
        this.qryGroup1 = value;
    }

    /**
     * Gets the value of the qryGroup2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup2() {
        return qryGroup2;
    }

    /**
     * Sets the value of the qryGroup2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup2(String value) {
        this.qryGroup2 = value;
    }

    /**
     * Gets the value of the qryGroup3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup3() {
        return qryGroup3;
    }

    /**
     * Sets the value of the qryGroup3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup3(String value) {
        this.qryGroup3 = value;
    }

    /**
     * Gets the value of the qryGroup4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup4() {
        return qryGroup4;
    }

    /**
     * Sets the value of the qryGroup4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup4(String value) {
        this.qryGroup4 = value;
    }

    /**
     * Gets the value of the qryGroup5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup5() {
        return qryGroup5;
    }

    /**
     * Sets the value of the qryGroup5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup5(String value) {
        this.qryGroup5 = value;
    }

    /**
     * Gets the value of the qryGroup6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup6() {
        return qryGroup6;
    }

    /**
     * Sets the value of the qryGroup6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup6(String value) {
        this.qryGroup6 = value;
    }

    /**
     * Gets the value of the qryGroup7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup7() {
        return qryGroup7;
    }

    /**
     * Sets the value of the qryGroup7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup7(String value) {
        this.qryGroup7 = value;
    }

    /**
     * Gets the value of the qryGroup8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup8() {
        return qryGroup8;
    }

    /**
     * Sets the value of the qryGroup8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup8(String value) {
        this.qryGroup8 = value;
    }

    /**
     * Gets the value of the qryGroup9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup9() {
        return qryGroup9;
    }

    /**
     * Sets the value of the qryGroup9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup9(String value) {
        this.qryGroup9 = value;
    }

    /**
     * Gets the value of the qryGroup10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup10() {
        return qryGroup10;
    }

    /**
     * Sets the value of the qryGroup10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup10(String value) {
        this.qryGroup10 = value;
    }

    /**
     * Gets the value of the qryGroup11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup11() {
        return qryGroup11;
    }

    /**
     * Sets the value of the qryGroup11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup11(String value) {
        this.qryGroup11 = value;
    }

    /**
     * Gets the value of the qryGroup12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup12() {
        return qryGroup12;
    }

    /**
     * Sets the value of the qryGroup12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup12(String value) {
        this.qryGroup12 = value;
    }

    /**
     * Gets the value of the qryGroup13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup13() {
        return qryGroup13;
    }

    /**
     * Sets the value of the qryGroup13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup13(String value) {
        this.qryGroup13 = value;
    }

    /**
     * Gets the value of the qryGroup14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup14() {
        return qryGroup14;
    }

    /**
     * Sets the value of the qryGroup14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup14(String value) {
        this.qryGroup14 = value;
    }

    /**
     * Gets the value of the qryGroup15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup15() {
        return qryGroup15;
    }

    /**
     * Sets the value of the qryGroup15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup15(String value) {
        this.qryGroup15 = value;
    }

    /**
     * Gets the value of the qryGroup16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup16() {
        return qryGroup16;
    }

    /**
     * Sets the value of the qryGroup16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup16(String value) {
        this.qryGroup16 = value;
    }

    /**
     * Gets the value of the qryGroup17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup17() {
        return qryGroup17;
    }

    /**
     * Sets the value of the qryGroup17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup17(String value) {
        this.qryGroup17 = value;
    }

    /**
     * Gets the value of the qryGroup18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup18() {
        return qryGroup18;
    }

    /**
     * Sets the value of the qryGroup18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup18(String value) {
        this.qryGroup18 = value;
    }

    /**
     * Gets the value of the qryGroup19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup19() {
        return qryGroup19;
    }

    /**
     * Sets the value of the qryGroup19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup19(String value) {
        this.qryGroup19 = value;
    }

    /**
     * Gets the value of the qryGroup20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup20() {
        return qryGroup20;
    }

    /**
     * Sets the value of the qryGroup20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup20(String value) {
        this.qryGroup20 = value;
    }

    /**
     * Gets the value of the qryGroup21 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup21() {
        return qryGroup21;
    }

    /**
     * Sets the value of the qryGroup21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup21(String value) {
        this.qryGroup21 = value;
    }

    /**
     * Gets the value of the qryGroup22 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup22() {
        return qryGroup22;
    }

    /**
     * Sets the value of the qryGroup22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup22(String value) {
        this.qryGroup22 = value;
    }

    /**
     * Gets the value of the qryGroup23 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup23() {
        return qryGroup23;
    }

    /**
     * Sets the value of the qryGroup23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup23(String value) {
        this.qryGroup23 = value;
    }

    /**
     * Gets the value of the qryGroup24 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup24() {
        return qryGroup24;
    }

    /**
     * Sets the value of the qryGroup24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup24(String value) {
        this.qryGroup24 = value;
    }

    /**
     * Gets the value of the qryGroup25 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup25() {
        return qryGroup25;
    }

    /**
     * Sets the value of the qryGroup25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup25(String value) {
        this.qryGroup25 = value;
    }

    /**
     * Gets the value of the qryGroup26 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup26() {
        return qryGroup26;
    }

    /**
     * Sets the value of the qryGroup26 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup26(String value) {
        this.qryGroup26 = value;
    }

    /**
     * Gets the value of the qryGroup27 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup27() {
        return qryGroup27;
    }

    /**
     * Sets the value of the qryGroup27 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup27(String value) {
        this.qryGroup27 = value;
    }

    /**
     * Gets the value of the qryGroup28 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup28() {
        return qryGroup28;
    }

    /**
     * Sets the value of the qryGroup28 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup28(String value) {
        this.qryGroup28 = value;
    }

    /**
     * Gets the value of the qryGroup29 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup29() {
        return qryGroup29;
    }

    /**
     * Sets the value of the qryGroup29 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup29(String value) {
        this.qryGroup29 = value;
    }

    /**
     * Gets the value of the qryGroup30 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup30() {
        return qryGroup30;
    }

    /**
     * Sets the value of the qryGroup30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup30(String value) {
        this.qryGroup30 = value;
    }

    /**
     * Gets the value of the qryGroup31 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup31() {
        return qryGroup31;
    }

    /**
     * Sets the value of the qryGroup31 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup31(String value) {
        this.qryGroup31 = value;
    }

    /**
     * Gets the value of the qryGroup32 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup32() {
        return qryGroup32;
    }

    /**
     * Sets the value of the qryGroup32 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup32(String value) {
        this.qryGroup32 = value;
    }

    /**
     * Gets the value of the qryGroup33 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup33() {
        return qryGroup33;
    }

    /**
     * Sets the value of the qryGroup33 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup33(String value) {
        this.qryGroup33 = value;
    }

    /**
     * Gets the value of the qryGroup34 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup34() {
        return qryGroup34;
    }

    /**
     * Sets the value of the qryGroup34 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup34(String value) {
        this.qryGroup34 = value;
    }

    /**
     * Gets the value of the qryGroup35 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup35() {
        return qryGroup35;
    }

    /**
     * Sets the value of the qryGroup35 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup35(String value) {
        this.qryGroup35 = value;
    }

    /**
     * Gets the value of the qryGroup36 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup36() {
        return qryGroup36;
    }

    /**
     * Sets the value of the qryGroup36 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup36(String value) {
        this.qryGroup36 = value;
    }

    /**
     * Gets the value of the qryGroup37 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup37() {
        return qryGroup37;
    }

    /**
     * Sets the value of the qryGroup37 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup37(String value) {
        this.qryGroup37 = value;
    }

    /**
     * Gets the value of the qryGroup38 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup38() {
        return qryGroup38;
    }

    /**
     * Sets the value of the qryGroup38 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup38(String value) {
        this.qryGroup38 = value;
    }

    /**
     * Gets the value of the qryGroup39 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup39() {
        return qryGroup39;
    }

    /**
     * Sets the value of the qryGroup39 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup39(String value) {
        this.qryGroup39 = value;
    }

    /**
     * Gets the value of the qryGroup40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup40() {
        return qryGroup40;
    }

    /**
     * Sets the value of the qryGroup40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup40(String value) {
        this.qryGroup40 = value;
    }

    /**
     * Gets the value of the qryGroup41 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup41() {
        return qryGroup41;
    }

    /**
     * Sets the value of the qryGroup41 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup41(String value) {
        this.qryGroup41 = value;
    }

    /**
     * Gets the value of the qryGroup42 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup42() {
        return qryGroup42;
    }

    /**
     * Sets the value of the qryGroup42 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup42(String value) {
        this.qryGroup42 = value;
    }

    /**
     * Gets the value of the qryGroup43 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup43() {
        return qryGroup43;
    }

    /**
     * Sets the value of the qryGroup43 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup43(String value) {
        this.qryGroup43 = value;
    }

    /**
     * Gets the value of the qryGroup44 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup44() {
        return qryGroup44;
    }

    /**
     * Sets the value of the qryGroup44 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup44(String value) {
        this.qryGroup44 = value;
    }

    /**
     * Gets the value of the qryGroup45 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup45() {
        return qryGroup45;
    }

    /**
     * Sets the value of the qryGroup45 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup45(String value) {
        this.qryGroup45 = value;
    }

    /**
     * Gets the value of the qryGroup46 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup46() {
        return qryGroup46;
    }

    /**
     * Sets the value of the qryGroup46 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup46(String value) {
        this.qryGroup46 = value;
    }

    /**
     * Gets the value of the qryGroup47 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup47() {
        return qryGroup47;
    }

    /**
     * Sets the value of the qryGroup47 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup47(String value) {
        this.qryGroup47 = value;
    }

    /**
     * Gets the value of the qryGroup48 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup48() {
        return qryGroup48;
    }

    /**
     * Sets the value of the qryGroup48 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup48(String value) {
        this.qryGroup48 = value;
    }

    /**
     * Gets the value of the qryGroup49 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup49() {
        return qryGroup49;
    }

    /**
     * Sets the value of the qryGroup49 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup49(String value) {
        this.qryGroup49 = value;
    }

    /**
     * Gets the value of the qryGroup50 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup50() {
        return qryGroup50;
    }

    /**
     * Sets the value of the qryGroup50 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup50(String value) {
        this.qryGroup50 = value;
    }

    /**
     * Gets the value of the qryGroup51 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup51() {
        return qryGroup51;
    }

    /**
     * Sets the value of the qryGroup51 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup51(String value) {
        this.qryGroup51 = value;
    }

    /**
     * Gets the value of the qryGroup52 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup52() {
        return qryGroup52;
    }

    /**
     * Sets the value of the qryGroup52 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup52(String value) {
        this.qryGroup52 = value;
    }

    /**
     * Gets the value of the qryGroup53 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup53() {
        return qryGroup53;
    }

    /**
     * Sets the value of the qryGroup53 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup53(String value) {
        this.qryGroup53 = value;
    }

    /**
     * Gets the value of the qryGroup54 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup54() {
        return qryGroup54;
    }

    /**
     * Sets the value of the qryGroup54 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup54(String value) {
        this.qryGroup54 = value;
    }

    /**
     * Gets the value of the qryGroup55 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup55() {
        return qryGroup55;
    }

    /**
     * Sets the value of the qryGroup55 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup55(String value) {
        this.qryGroup55 = value;
    }

    /**
     * Gets the value of the qryGroup56 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup56() {
        return qryGroup56;
    }

    /**
     * Sets the value of the qryGroup56 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup56(String value) {
        this.qryGroup56 = value;
    }

    /**
     * Gets the value of the qryGroup57 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup57() {
        return qryGroup57;
    }

    /**
     * Sets the value of the qryGroup57 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup57(String value) {
        this.qryGroup57 = value;
    }

    /**
     * Gets the value of the qryGroup58 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup58() {
        return qryGroup58;
    }

    /**
     * Sets the value of the qryGroup58 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup58(String value) {
        this.qryGroup58 = value;
    }

    /**
     * Gets the value of the qryGroup59 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup59() {
        return qryGroup59;
    }

    /**
     * Sets the value of the qryGroup59 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup59(String value) {
        this.qryGroup59 = value;
    }

    /**
     * Gets the value of the qryGroup60 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup60() {
        return qryGroup60;
    }

    /**
     * Sets the value of the qryGroup60 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup60(String value) {
        this.qryGroup60 = value;
    }

    /**
     * Gets the value of the qryGroup61 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup61() {
        return qryGroup61;
    }

    /**
     * Sets the value of the qryGroup61 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup61(String value) {
        this.qryGroup61 = value;
    }

    /**
     * Gets the value of the qryGroup62 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup62() {
        return qryGroup62;
    }

    /**
     * Sets the value of the qryGroup62 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup62(String value) {
        this.qryGroup62 = value;
    }

    /**
     * Gets the value of the qryGroup63 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup63() {
        return qryGroup63;
    }

    /**
     * Sets the value of the qryGroup63 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup63(String value) {
        this.qryGroup63 = value;
    }

    /**
     * Gets the value of the qryGroup64 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryGroup64() {
        return qryGroup64;
    }

    /**
     * Sets the value of the qryGroup64 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryGroup64(String value) {
        this.qryGroup64 = value;
    }

    /**
     * Gets the value of the ddctOffice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdctOffice() {
        return ddctOffice;
    }

    /**
     * Sets the value of the ddctOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdctOffice(String value) {
        this.ddctOffice = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the updateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateDate() {
        return updateDate;
    }

    /**
     * Sets the value of the updateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateDate(XMLGregorianCalendar value) {
        this.updateDate = value;
    }

    /**
     * Gets the value of the exportCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportCode() {
        return exportCode;
    }

    /**
     * Sets the value of the exportCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportCode(String value) {
        this.exportCode = value;
    }

    /**
     * Gets the value of the dscntObjct property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDscntObjct() {
        return dscntObjct;
    }

    /**
     * Sets the value of the dscntObjct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDscntObjct(Short value) {
        this.dscntObjct = value;
    }

    /**
     * Gets the value of the dscntRel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDscntRel() {
        return dscntRel;
    }

    /**
     * Sets the value of the dscntRel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDscntRel(String value) {
        this.dscntRel = value;
    }

    /**
     * Gets the value of the spgCounter property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSPGCounter() {
        return spgCounter;
    }

    /**
     * Sets the value of the spgCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSPGCounter(Short value) {
        this.spgCounter = value;
    }

    /**
     * Gets the value of the sppCounter property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSPPCounter() {
        return sppCounter;
    }

    /**
     * Sets the value of the sppCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSPPCounter(Integer value) {
        this.sppCounter = value;
    }

    /**
     * Gets the value of the ddctFileNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdctFileNo() {
        return ddctFileNo;
    }

    /**
     * Sets the value of the ddctFileNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdctFileNo(String value) {
        this.ddctFileNo = value;
    }

    /**
     * Gets the value of the scnCounter property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSCNCounter() {
        return scnCounter;
    }

    /**
     * Sets the value of the scnCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSCNCounter(Short value) {
        this.scnCounter = value;
    }

    /**
     * Gets the value of the minIntrst property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinIntrst() {
        return minIntrst;
    }

    /**
     * Sets the value of the minIntrst property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinIntrst(BigDecimal value) {
        this.minIntrst = value;
    }

    /**
     * Gets the value of the dataSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * Sets the value of the dataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSource(String value) {
        this.dataSource = value;
    }

    /**
     * Gets the value of the oprCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOprCount() {
        return oprCount;
    }

    /**
     * Sets the value of the oprCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOprCount(Integer value) {
        this.oprCount = value;
    }

    /**
     * Gets the value of the exemptNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExemptNo() {
        return exemptNo;
    }

    /**
     * Sets the value of the exemptNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExemptNo(String value) {
        this.exemptNo = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriority(Integer value) {
        this.priority = value;
    }

    /**
     * Gets the value of the creditCard property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCreditCard() {
        return creditCard;
    }

    /**
     * Sets the value of the creditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCreditCard(Short value) {
        this.creditCard = value;
    }

    /**
     * Gets the value of the crCardNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrCardNum() {
        return crCardNum;
    }

    /**
     * Sets the value of the crCardNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrCardNum(String value) {
        this.crCardNum = value;
    }

    /**
     * Gets the value of the cardValid property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCardValid() {
        return cardValid;
    }

    /**
     * Sets the value of the cardValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCardValid(XMLGregorianCalendar value) {
        this.cardValid = value;
    }

    /**
     * Gets the value of the userSign property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getUserSign() {
        return userSign;
    }

    /**
     * Sets the value of the userSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setUserSign(Short value) {
        this.userSign = value;
    }

    /**
     * Gets the value of the locMth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocMth() {
        return locMth;
    }

    /**
     * Sets the value of the locMth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocMth(String value) {
        this.locMth = value;
    }

    /**
     * Gets the value of the validFor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidFor() {
        return validFor;
    }

    /**
     * Sets the value of the validFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidFor(String value) {
        this.validFor = value;
    }

    /**
     * Gets the value of the validFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidFrom() {
        return validFrom;
    }

    /**
     * Sets the value of the validFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidFrom(XMLGregorianCalendar value) {
        this.validFrom = value;
    }

    /**
     * Gets the value of the validTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidTo() {
        return validTo;
    }

    /**
     * Sets the value of the validTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidTo(XMLGregorianCalendar value) {
        this.validTo = value;
    }

    /**
     * Gets the value of the frozenFor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrozenFor() {
        return frozenFor;
    }

    /**
     * Sets the value of the frozenFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrozenFor(String value) {
        this.frozenFor = value;
    }

    /**
     * Gets the value of the frozenFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFrozenFrom() {
        return frozenFrom;
    }

    /**
     * Sets the value of the frozenFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFrozenFrom(XMLGregorianCalendar value) {
        this.frozenFrom = value;
    }

    /**
     * Gets the value of the frozenTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFrozenTo() {
        return frozenTo;
    }

    /**
     * Sets the value of the frozenTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFrozenTo(XMLGregorianCalendar value) {
        this.frozenTo = value;
    }

    /**
     * Gets the value of the sEmployed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEmployed() {
        return sEmployed;
    }

    /**
     * Sets the value of the sEmployed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEmployed(String value) {
        this.sEmployed = value;
    }

    /**
     * Gets the value of the mthCounter property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMTHCounter() {
        return mthCounter;
    }

    /**
     * Sets the value of the mthCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMTHCounter(Integer value) {
        this.mthCounter = value;
    }

    /**
     * Gets the value of the bnkCounter property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBNKCounter() {
        return bnkCounter;
    }

    /**
     * Sets the value of the bnkCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBNKCounter(Integer value) {
        this.bnkCounter = value;
    }

    /**
     * Gets the value of the ddgKey property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDdgKey() {
        return ddgKey;
    }

    /**
     * Sets the value of the ddgKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDdgKey(Integer value) {
        this.ddgKey = value;
    }

    /**
     * Gets the value of the ddtKey property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDdtKey() {
        return ddtKey;
    }

    /**
     * Sets the value of the ddtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDdtKey(Integer value) {
        this.ddtKey = value;
    }

    /**
     * Gets the value of the validComm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidComm() {
        return validComm;
    }

    /**
     * Sets the value of the validComm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidComm(String value) {
        this.validComm = value;
    }

    /**
     * Gets the value of the frozenComm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrozenComm() {
        return frozenComm;
    }

    /**
     * Sets the value of the frozenComm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrozenComm(String value) {
        this.frozenComm = value;
    }

    /**
     * Gets the value of the chainStore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChainStore() {
        return chainStore;
    }

    /**
     * Sets the value of the chainStore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChainStore(String value) {
        this.chainStore = value;
    }

    /**
     * Gets the value of the discInRet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscInRet() {
        return discInRet;
    }

    /**
     * Sets the value of the discInRet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscInRet(String value) {
        this.discInRet = value;
    }

    /**
     * Gets the value of the state1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState1() {
        return state1;
    }

    /**
     * Sets the value of the state1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState1(String value) {
        this.state1 = value;
    }

    /**
     * Gets the value of the state2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState2() {
        return state2;
    }

    /**
     * Sets the value of the state2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState2(String value) {
        this.state2 = value;
    }

    /**
     * Gets the value of the vatGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatGroup() {
        return vatGroup;
    }

    /**
     * Sets the value of the vatGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatGroup(String value) {
        this.vatGroup = value;
    }

    /**
     * Gets the value of the logInstanc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLogInstanc() {
        return logInstanc;
    }

    /**
     * Sets the value of the logInstanc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLogInstanc(Integer value) {
        this.logInstanc = value;
    }

    /**
     * Gets the value of the objType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjType() {
        return objType;
    }

    /**
     * Sets the value of the objType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjType(String value) {
        this.objType = value;
    }

    /**
     * Gets the value of the indicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicator() {
        return indicator;
    }

    /**
     * Sets the value of the indicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicator(String value) {
        this.indicator = value;
    }

    /**
     * Gets the value of the shipType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getShipType() {
        return shipType;
    }

    /**
     * Sets the value of the shipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setShipType(Short value) {
        this.shipType = value;
    }

    /**
     * Gets the value of the debPayAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebPayAcct() {
        return debPayAcct;
    }

    /**
     * Sets the value of the debPayAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebPayAcct(String value) {
        this.debPayAcct = value;
    }

    /**
     * Gets the value of the shipToDef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToDef() {
        return shipToDef;
    }

    /**
     * Sets the value of the shipToDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToDef(String value) {
        this.shipToDef = value;
    }

    /**
     * Gets the value of the block property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlock() {
        return block;
    }

    /**
     * Sets the value of the block property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlock(String value) {
        this.block = value;
    }

    /**
     * Gets the value of the mailBlock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailBlock() {
        return mailBlock;
    }

    /**
     * Sets the value of the mailBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailBlock(String value) {
        this.mailBlock = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the ecVatGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getECVatGroup() {
        return ecVatGroup;
    }

    /**
     * Sets the value of the ecVatGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setECVatGroup(String value) {
        this.ecVatGroup = value;
    }

    /**
     * Gets the value of the deleted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeleted() {
        return deleted;
    }

    /**
     * Sets the value of the deleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeleted(String value) {
        this.deleted = value;
    }

    /**
     * Gets the value of the iban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBAN() {
        return iban;
    }

    /**
     * Sets the value of the iban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBAN(String value) {
        this.iban = value;
    }

    /**
     * Gets the value of the docEntry property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocEntry() {
        return docEntry;
    }

    /**
     * Sets the value of the docEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocEntry(Integer value) {
        this.docEntry = value;
    }

    /**
     * Gets the value of the formCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFormCode() {
        return formCode;
    }

    /**
     * Sets the value of the formCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFormCode(Integer value) {
        this.formCode = value;
    }

    /**
     * Gets the value of the box1099 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBox1099() {
        return box1099;
    }

    /**
     * Sets the value of the box1099 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBox1099(String value) {
        this.box1099 = value;
    }

    /**
     * Gets the value of the pymCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPymCode() {
        return pymCode;
    }

    /**
     * Sets the value of the pymCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPymCode(String value) {
        this.pymCode = value;
    }

    /**
     * Gets the value of the backOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackOrder() {
        return backOrder;
    }

    /**
     * Sets the value of the backOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackOrder(String value) {
        this.backOrder = value;
    }

    /**
     * Gets the value of the partDelivr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartDelivr() {
        return partDelivr;
    }

    /**
     * Sets the value of the partDelivr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartDelivr(String value) {
        this.partDelivr = value;
    }

    /**
     * Gets the value of the dunnLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDunnLevel() {
        return dunnLevel;
    }

    /**
     * Sets the value of the dunnLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDunnLevel(Integer value) {
        this.dunnLevel = value;
    }

    /**
     * Gets the value of the dunnDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDunnDate() {
        return dunnDate;
    }

    /**
     * Sets the value of the dunnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDunnDate(XMLGregorianCalendar value) {
        this.dunnDate = value;
    }

    /**
     * Gets the value of the blockDunn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockDunn() {
        return blockDunn;
    }

    /**
     * Sets the value of the blockDunn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockDunn(String value) {
        this.blockDunn = value;
    }

    /**
     * Gets the value of the bankCountr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCountr() {
        return bankCountr;
    }

    /**
     * Sets the value of the bankCountr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCountr(String value) {
        this.bankCountr = value;
    }

    /**
     * Gets the value of the collecAuth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollecAuth() {
        return collecAuth;
    }

    /**
     * Sets the value of the collecAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollecAuth(String value) {
        this.collecAuth = value;
    }

    /**
     * Gets the value of the dme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDME() {
        return dme;
    }

    /**
     * Sets the value of the dme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDME(String value) {
        this.dme = value;
    }

    /**
     * Gets the value of the instrucKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrucKey() {
        return instrucKey;
    }

    /**
     * Sets the value of the instrucKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrucKey(String value) {
        this.instrucKey = value;
    }

    /**
     * Gets the value of the singlePaym property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSinglePaym() {
        return singlePaym;
    }

    /**
     * Sets the value of the singlePaym property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSinglePaym(String value) {
        this.singlePaym = value;
    }

    /**
     * Gets the value of the isrBillId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISRBillId() {
        return isrBillId;
    }

    /**
     * Sets the value of the isrBillId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISRBillId(String value) {
        this.isrBillId = value;
    }

    /**
     * Gets the value of the paymBlock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymBlock() {
        return paymBlock;
    }

    /**
     * Sets the value of the paymBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymBlock(String value) {
        this.paymBlock = value;
    }

    /**
     * Gets the value of the refDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefDetails() {
        return refDetails;
    }

    /**
     * Sets the value of the refDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefDetails(String value) {
        this.refDetails = value;
    }

    /**
     * Gets the value of the houseBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseBank() {
        return houseBank;
    }

    /**
     * Sets the value of the houseBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseBank(String value) {
        this.houseBank = value;
    }

    /**
     * Gets the value of the ownerIdNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerIdNum() {
        return ownerIdNum;
    }

    /**
     * Sets the value of the ownerIdNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerIdNum(String value) {
        this.ownerIdNum = value;
    }

    /**
     * Gets the value of the pyBlckDesc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPyBlckDesc() {
        return pyBlckDesc;
    }

    /**
     * Sets the value of the pyBlckDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPyBlckDesc(Integer value) {
        this.pyBlckDesc = value;
    }

    /**
     * Gets the value of the housBnkCry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHousBnkCry() {
        return housBnkCry;
    }

    /**
     * Sets the value of the housBnkCry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHousBnkCry(String value) {
        this.housBnkCry = value;
    }

    /**
     * Gets the value of the housBnkAct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHousBnkAct() {
        return housBnkAct;
    }

    /**
     * Sets the value of the housBnkAct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHousBnkAct(String value) {
        this.housBnkAct = value;
    }

    /**
     * Gets the value of the housBnkBrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHousBnkBrn() {
        return housBnkBrn;
    }

    /**
     * Sets the value of the housBnkBrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHousBnkBrn(String value) {
        this.housBnkBrn = value;
    }

    /**
     * Gets the value of the projectCod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectCod() {
        return projectCod;
    }

    /**
     * Sets the value of the projectCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectCod(String value) {
        this.projectCod = value;
    }

    /**
     * Gets the value of the sysMatchNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSysMatchNo() {
        return sysMatchNo;
    }

    /**
     * Sets the value of the sysMatchNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSysMatchNo(Integer value) {
        this.sysMatchNo = value;
    }

    /**
     * Gets the value of the vatIdUnCmp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatIdUnCmp() {
        return vatIdUnCmp;
    }

    /**
     * Sets the value of the vatIdUnCmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatIdUnCmp(String value) {
        this.vatIdUnCmp = value;
    }

    /**
     * Gets the value of the agentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentCode() {
        return agentCode;
    }

    /**
     * Sets the value of the agentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentCode(String value) {
        this.agentCode = value;
    }

    /**
     * Gets the value of the tolrncDays property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTolrncDays() {
        return tolrncDays;
    }

    /**
     * Sets the value of the tolrncDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTolrncDays(Short value) {
        this.tolrncDays = value;
    }

    /**
     * Gets the value of the selfInvoic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelfInvoic() {
        return selfInvoic;
    }

    /**
     * Sets the value of the selfInvoic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelfInvoic(String value) {
        this.selfInvoic = value;
    }

    /**
     * Gets the value of the deferrTax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeferrTax() {
        return deferrTax;
    }

    /**
     * Sets the value of the deferrTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeferrTax(String value) {
        this.deferrTax = value;
    }

    /**
     * Gets the value of the letterNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLetterNum() {
        return letterNum;
    }

    /**
     * Sets the value of the letterNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLetterNum(String value) {
        this.letterNum = value;
    }

    /**
     * Gets the value of the maxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxAmount() {
        return maxAmount;
    }

    /**
     * Sets the value of the maxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxAmount(BigDecimal value) {
        this.maxAmount = value;
    }

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromDate(XMLGregorianCalendar value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToDate(XMLGregorianCalendar value) {
        this.toDate = value;
    }

    /**
     * Gets the value of the wtLiable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWTLiable() {
        return wtLiable;
    }

    /**
     * Sets the value of the wtLiable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWTLiable(String value) {
        this.wtLiable = value;
    }

    /**
     * Gets the value of the crtfcateNO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrtfcateNO() {
        return crtfcateNO;
    }

    /**
     * Sets the value of the crtfcateNO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrtfcateNO(String value) {
        this.crtfcateNO = value;
    }

    /**
     * Gets the value of the expireDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpireDate() {
        return expireDate;
    }

    /**
     * Sets the value of the expireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpireDate(XMLGregorianCalendar value) {
        this.expireDate = value;
    }

    /**
     * Gets the value of the niNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNINum() {
        return niNum;
    }

    /**
     * Sets the value of the niNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNINum(String value) {
        this.niNum = value;
    }

    /**
     * Gets the value of the accCritria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccCritria() {
        return accCritria;
    }

    /**
     * Sets the value of the accCritria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccCritria(String value) {
        this.accCritria = value;
    }

    /**
     * Gets the value of the wtCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWTCode() {
        return wtCode;
    }

    /**
     * Sets the value of the wtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWTCode(String value) {
        this.wtCode = value;
    }

    /**
     * Gets the value of the equ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEqu() {
        return equ;
    }

    /**
     * Sets the value of the equ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEqu(String value) {
        this.equ = value;
    }

    /**
     * Gets the value of the hldCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHldCode() {
        return hldCode;
    }

    /**
     * Sets the value of the hldCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHldCode(String value) {
        this.hldCode = value;
    }

    /**
     * Gets the value of the connBP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnBP() {
        return connBP;
    }

    /**
     * Sets the value of the connBP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnBP(String value) {
        this.connBP = value;
    }

    /**
     * Gets the value of the mltMthNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMltMthNum() {
        return mltMthNum;
    }

    /**
     * Sets the value of the mltMthNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMltMthNum(Integer value) {
        this.mltMthNum = value;
    }

    /**
     * Gets the value of the typWTReprt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypWTReprt() {
        return typWTReprt;
    }

    /**
     * Sets the value of the typWTReprt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypWTReprt(String value) {
        this.typWTReprt = value;
    }

    /**
     * Gets the value of the vatRegNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVATRegNum() {
        return vatRegNum;
    }

    /**
     * Sets the value of the vatRegNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVATRegNum(String value) {
        this.vatRegNum = value;
    }

    /**
     * Gets the value of the repName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepName() {
        return repName;
    }

    /**
     * Sets the value of the repName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepName(String value) {
        this.repName = value;
    }

    /**
     * Gets the value of the industry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * Sets the value of the industry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustry(String value) {
        this.industry = value;
    }

    /**
     * Gets the value of the business property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusiness() {
        return business;
    }

    /**
     * Sets the value of the business property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusiness(String value) {
        this.business = value;
    }

    /**
     * Gets the value of the wtTaxCat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWTTaxCat() {
        return wtTaxCat;
    }

    /**
     * Sets the value of the wtTaxCat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWTTaxCat(String value) {
        this.wtTaxCat = value;
    }

    /**
     * Gets the value of the isDomestic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsDomestic() {
        return isDomestic;
    }

    /**
     * Sets the value of the isDomestic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsDomestic(String value) {
        this.isDomestic = value;
    }

    /**
     * Gets the value of the isResident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsResident() {
        return isResident;
    }

    /**
     * Sets the value of the isResident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsResident(String value) {
        this.isResident = value;
    }

    /**
     * Gets the value of the autoCalBCG property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoCalBCG() {
        return autoCalBCG;
    }

    /**
     * Sets the value of the autoCalBCG property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoCalBCG(String value) {
        this.autoCalBCG = value;
    }

    /**
     * Gets the value of the otrCtlAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtrCtlAcct() {
        return otrCtlAcct;
    }

    /**
     * Sets the value of the otrCtlAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtrCtlAcct(String value) {
        this.otrCtlAcct = value;
    }

    /**
     * Gets the value of the aliasName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliasName() {
        return aliasName;
    }

    /**
     * Sets the value of the aliasName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAliasName(String value) {
        this.aliasName = value;
    }

    /**
     * Gets the value of the building property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuilding() {
        return building;
    }

    /**
     * Sets the value of the building property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuilding(String value) {
        this.building = value;
    }

    /**
     * Gets the value of the mailBuildi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailBuildi() {
        return mailBuildi;
    }

    /**
     * Sets the value of the mailBuildi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailBuildi(String value) {
        this.mailBuildi = value;
    }

    /**
     * Gets the value of the boEPrsnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoEPrsnt() {
        return boEPrsnt;
    }

    /**
     * Sets the value of the boEPrsnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoEPrsnt(String value) {
        this.boEPrsnt = value;
    }

    /**
     * Gets the value of the boEDiscnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoEDiscnt() {
        return boEDiscnt;
    }

    /**
     * Sets the value of the boEDiscnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoEDiscnt(String value) {
        this.boEDiscnt = value;
    }

    /**
     * Gets the value of the boEOnClct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoEOnClct() {
        return boEOnClct;
    }

    /**
     * Sets the value of the boEOnClct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoEOnClct(String value) {
        this.boEOnClct = value;
    }

    /**
     * Gets the value of the unpaidBoE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnpaidBoE() {
        return unpaidBoE;
    }

    /**
     * Sets the value of the unpaidBoE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnpaidBoE(String value) {
        this.unpaidBoE = value;
    }

    /**
     * Gets the value of the itwtCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITWTCode() {
        return itwtCode;
    }

    /**
     * Sets the value of the itwtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITWTCode(String value) {
        this.itwtCode = value;
    }

    /**
     * Gets the value of the dunTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDunTerm() {
        return dunTerm;
    }

    /**
     * Sets the value of the dunTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDunTerm(String value) {
        this.dunTerm = value;
    }

    /**
     * Gets the value of the channlBP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannlBP() {
        return channlBP;
    }

    /**
     * Sets the value of the channlBP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannlBP(String value) {
        this.channlBP = value;
    }

    /**
     * Gets the value of the dfTcnician property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDfTcnician() {
        return dfTcnician;
    }

    /**
     * Sets the value of the dfTcnician property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDfTcnician(Integer value) {
        this.dfTcnician = value;
    }

    /**
     * Gets the value of the territory property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTerritory() {
        return territory;
    }

    /**
     * Sets the value of the territory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTerritory(Integer value) {
        this.territory = value;
    }

    /**
     * Gets the value of the billToDef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToDef() {
        return billToDef;
    }

    /**
     * Sets the value of the billToDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToDef(String value) {
        this.billToDef = value;
    }

    /**
     * Gets the value of the dpmClear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDpmClear() {
        return dpmClear;
    }

    /**
     * Sets the value of the dpmClear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDpmClear(String value) {
        this.dpmClear = value;
    }

    /**
     * Gets the value of the intrntSite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrntSite() {
        return intrntSite;
    }

    /**
     * Sets the value of the intrntSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntrntSite(String value) {
        this.intrntSite = value;
    }

    /**
     * Gets the value of the langCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLangCode() {
        return langCode;
    }

    /**
     * Sets the value of the langCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLangCode(Integer value) {
        this.langCode = value;
    }

    /**
     * Gets the value of the housActKey property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHousActKey() {
        return housActKey;
    }

    /**
     * Sets the value of the housActKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHousActKey(Integer value) {
        this.housActKey = value;
    }

    /**
     * Gets the value of the profession property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfession() {
        return profession;
    }

    /**
     * Sets the value of the profession property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfession(String value) {
        this.profession = value;
    }

    /**
     * Gets the value of the cdpNum property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCDPNum() {
        return cdpNum;
    }

    /**
     * Sets the value of the cdpNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCDPNum(Short value) {
        this.cdpNum = value;
    }

    /**
     * Gets the value of the dflBankKey property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDflBankKey() {
        return dflBankKey;
    }

    /**
     * Sets the value of the dflBankKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDflBankKey(Integer value) {
        this.dflBankKey = value;
    }

    /**
     * Gets the value of the bcaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCACode() {
        return bcaCode;
    }

    /**
     * Sets the value of the bcaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCACode(String value) {
        this.bcaCode = value;
    }

    /**
     * Gets the value of the useShpdGd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseShpdGd() {
        return useShpdGd;
    }

    /**
     * Sets the value of the useShpdGd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseShpdGd(String value) {
        this.useShpdGd = value;
    }

    /**
     * Gets the value of the regNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegNum() {
        return regNum;
    }

    /**
     * Sets the value of the regNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegNum(String value) {
        this.regNum = value;
    }

    /**
     * Gets the value of the verifNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerifNum() {
        return verifNum;
    }

    /**
     * Sets the value of the verifNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerifNum(String value) {
        this.verifNum = value;
    }

    /**
     * Gets the value of the bankCtlKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCtlKey() {
        return bankCtlKey;
    }

    /**
     * Sets the value of the bankCtlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCtlKey(String value) {
        this.bankCtlKey = value;
    }

    /**
     * Gets the value of the housCtlKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHousCtlKey() {
        return housCtlKey;
    }

    /**
     * Sets the value of the housCtlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHousCtlKey(String value) {
        this.housCtlKey = value;
    }

    /**
     * Gets the value of the addrType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrType() {
        return addrType;
    }

    /**
     * Sets the value of the addrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrType(String value) {
        this.addrType = value;
    }

    /**
     * Gets the value of the insurOp347 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsurOp347() {
        return insurOp347;
    }

    /**
     * Sets the value of the insurOp347 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsurOp347(String value) {
        this.insurOp347 = value;
    }

    /**
     * Gets the value of the mailAddrTy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailAddrTy() {
        return mailAddrTy;
    }

    /**
     * Sets the value of the mailAddrTy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailAddrTy(String value) {
        this.mailAddrTy = value;
    }

    /**
     * Gets the value of the streetNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetNo() {
        return streetNo;
    }

    /**
     * Sets the value of the streetNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetNo(String value) {
        this.streetNo = value;
    }

    /**
     * Gets the value of the mailStrNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailStrNo() {
        return mailStrNo;
    }

    /**
     * Sets the value of the mailStrNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailStrNo(String value) {
        this.mailStrNo = value;
    }

    /**
     * Gets the value of the taxRndRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRndRule() {
        return taxRndRule;
    }

    /**
     * Sets the value of the taxRndRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRndRule(String value) {
        this.taxRndRule = value;
    }

    /**
     * Gets the value of the vendTID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVendTID() {
        return vendTID;
    }

    /**
     * Sets the value of the vendTID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVendTID(Integer value) {
        this.vendTID = value;
    }

    /**
     * Gets the value of the threshOver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreshOver() {
        return threshOver;
    }

    /**
     * Sets the value of the threshOver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreshOver(String value) {
        this.threshOver = value;
    }

    /**
     * Gets the value of the surOver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurOver() {
        return surOver;
    }

    /**
     * Sets the value of the surOver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurOver(String value) {
        this.surOver = value;
    }

    /**
     * Gets the value of the vendorOcup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorOcup() {
        return vendorOcup;
    }

    /**
     * Sets the value of the vendorOcup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorOcup(String value) {
        this.vendorOcup = value;
    }

    /**
     * Gets the value of the opCode347 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpCode347() {
        return opCode347;
    }

    /**
     * Sets the value of the opCode347 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpCode347(String value) {
        this.opCode347 = value;
    }

    /**
     * Gets the value of the dpmIntAct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDpmIntAct() {
        return dpmIntAct;
    }

    /**
     * Sets the value of the dpmIntAct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDpmIntAct(String value) {
        this.dpmIntAct = value;
    }

    /**
     * Gets the value of the residenNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidenNum() {
        return residenNum;
    }

    /**
     * Sets the value of the residenNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidenNum(String value) {
        this.residenNum = value;
    }

    /**
     * Gets the value of the userSign2 property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getUserSign2() {
        return userSign2;
    }

    /**
     * Sets the value of the userSign2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setUserSign2(Short value) {
        this.userSign2 = value;
    }

    /**
     * Gets the value of the plngGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlngGroup() {
        return plngGroup;
    }

    /**
     * Sets the value of the plngGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlngGroup(String value) {
        this.plngGroup = value;
    }

    /**
     * Gets the value of the vatIDNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatIDNum() {
        return vatIDNum;
    }

    /**
     * Sets the value of the vatIDNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatIDNum(String value) {
        this.vatIDNum = value;
    }

    /**
     * Gets the value of the affiliate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffiliate() {
        return affiliate;
    }

    /**
     * Sets the value of the affiliate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffiliate(String value) {
        this.affiliate = value;
    }

    /**
     * Gets the value of the mivzExpSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMivzExpSts() {
        return mivzExpSts;
    }

    /**
     * Sets the value of the mivzExpSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMivzExpSts(String value) {
        this.mivzExpSts = value;
    }

    /**
     * Gets the value of the hierchDdct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierchDdct() {
        return hierchDdct;
    }

    /**
     * Sets the value of the hierchDdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierchDdct(String value) {
        this.hierchDdct = value;
    }

    /**
     * Gets the value of the certWHT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertWHT() {
        return certWHT;
    }

    /**
     * Sets the value of the certWHT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertWHT(String value) {
        this.certWHT = value;
    }

    /**
     * Gets the value of the certBKeep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertBKeep() {
        return certBKeep;
    }

    /**
     * Sets the value of the certBKeep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertBKeep(String value) {
        this.certBKeep = value;
    }

    /**
     * Gets the value of the whShaamGrp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWHShaamGrp() {
        return whShaamGrp;
    }

    /**
     * Sets the value of the whShaamGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWHShaamGrp(String value) {
        this.whShaamGrp = value;
    }

    /**
     * Gets the value of the industryC property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndustryC() {
        return industryC;
    }

    /**
     * Sets the value of the industryC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndustryC(Integer value) {
        this.industryC = value;
    }

    /**
     * Gets the value of the datevAcct property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatevAcct() {
        return datevAcct;
    }

    /**
     * Sets the value of the datevAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatevAcct(Integer value) {
        this.datevAcct = value;
    }

    /**
     * Gets the value of the datevFirst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatevFirst() {
        return datevFirst;
    }

    /**
     * Sets the value of the datevFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatevFirst(String value) {
        this.datevFirst = value;
    }

    /**
     * Gets the value of the gtsRegNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGTSRegNum() {
        return gtsRegNum;
    }

    /**
     * Sets the value of the gtsRegNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGTSRegNum(String value) {
        this.gtsRegNum = value;
    }

    /**
     * Gets the value of the gtsBankAct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGTSBankAct() {
        return gtsBankAct;
    }

    /**
     * Sets the value of the gtsBankAct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGTSBankAct(String value) {
        this.gtsBankAct = value;
    }

    /**
     * Gets the value of the gtsBilAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGTSBilAddr() {
        return gtsBilAddr;
    }

    /**
     * Sets the value of the gtsBilAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGTSBilAddr(String value) {
        this.gtsBilAddr = value;
    }

    /**
     * Gets the value of the ntsWebSite property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNTSWebSite() {
        return ntsWebSite;
    }

    /**
     * Sets the value of the ntsWebSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNTSWebSite(Short value) {
        this.ntsWebSite = value;
    }

    /**
     * Gets the value of the eDocExpFrm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEDocExpFrm() {
        return eDocExpFrm;
    }

    /**
     * Sets the value of the eDocExpFrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEDocExpFrm(Integer value) {
        this.eDocExpFrm = value;
    }

    /**
     * Gets the value of the taxIdIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxIdIdent() {
        return taxIdIdent;
    }

    /**
     * Sets the value of the taxIdIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxIdIdent(String value) {
        this.taxIdIdent = value;
    }

    /**
     * Gets the value of the hsBnkSwift property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHsBnkSwift() {
        return hsBnkSwift;
    }

    /**
     * Sets the value of the hsBnkSwift property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHsBnkSwift(String value) {
        this.hsBnkSwift = value;
    }

    /**
     * Gets the value of the hsBnkIBAN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHsBnkIBAN() {
        return hsBnkIBAN;
    }

    /**
     * Sets the value of the hsBnkIBAN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHsBnkIBAN(String value) {
        this.hsBnkIBAN = value;
    }

    /**
     * Gets the value of the dflSwift property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDflSwift() {
        return dflSwift;
    }

    /**
     * Sets the value of the dflSwift property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDflSwift(String value) {
        this.dflSwift = value;
    }

    /**
     * Gets the value of the dflIBAN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDflIBAN() {
        return dflIBAN;
    }

    /**
     * Sets the value of the dflIBAN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDflIBAN(String value) {
        this.dflIBAN = value;
    }

    /**
     * Gets the value of the attachment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachment() {
        return attachment;
    }

    /**
     * Sets the value of the attachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachment(String value) {
        this.attachment = value;
    }

    /**
     * Gets the value of the atcEntry property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAtcEntry() {
        return atcEntry;
    }

    /**
     * Sets the value of the atcEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAtcEntry(Integer value) {
        this.atcEntry = value;
    }

    /**
     * Gets the value of the unbsCustRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBSCustRating() {
        return unbsCustRating;
    }

    /**
     * Sets the value of the unbsCustRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBSCustRating(String value) {
        this.unbsCustRating = value;
    }

    /**
     * Gets the value of the unbsSerRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBSSerRating() {
        return unbsSerRating;
    }

    /**
     * Sets the value of the unbsSerRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBSSerRating(String value) {
        this.unbsSerRating = value;
    }

    /**
     * Gets the value of the unbsRateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUNBSRateDate() {
        return unbsRateDate;
    }

    /**
     * Sets the value of the unbsRateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUNBSRateDate(XMLGregorianCalendar value) {
        this.unbsRateDate = value;
    }

    /**
     * Gets the value of the unbsRateNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBSRateNote() {
        return unbsRateNote;
    }

    /**
     * Sets the value of the unbsRateNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBSRateNote(String value) {
        this.unbsRateNote = value;
    }

}
