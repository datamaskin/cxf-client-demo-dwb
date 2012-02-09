package com.cxf.demo

import com.sexingtechnologies.b1ws.LoginServiceSoap
import com.xmlme.ShakespeareSoap
import com.xmlme.news.GetCustomNewsSoap
import cxf.client.demo.complex.ComplexServicePortType
import cxf.client.demo.secure.SecureServicePortType
import javax.xml.datatype.DatatypeFactory
import javax.xml.datatype.XMLGregorianCalendar
import net.webbservicex.globalweather.GlobalWeatherSoap
import net.webservicex.StockQuoteSoap
// These imports are available after running wsdl2java
import org.tempuri.Address
import org.tempuri.BusinessPartner
import org.tempuri.Document
import org.tempuri.GetDataTableResponse.GetDataTableResult
import uk.co.demon.DigDNS
import org.tempuri.ArrayOfDocLine
import org.tempuri.DocLine
import org.tempuri.ArrayOfUDF

class DemoController { // all of the service client in this controller should work well without mods except for the SAP service.

//    SimpleServicePortType simpleServiceClient
    // create instances of your target ws client
    ComplexServicePortType complexServiceClient
    SecureServicePortType secureServiceClient
    SecureServicePortType insecureServiceClient
    SecureServicePortType customSecureServiceClient
    StockQuoteSoap stockQuoteClient
    GlobalWeatherSoap globalWeatherClient
    DigDNS digDNSClient
    ShakespeareSoap shakeSpeareClient
    GetCustomNewsSoap getCustomNewsClient
    LoginServiceSoap loginServiceClient
    org.tempuri.ServiceSoap serviceSoapClient
    net.uhurucloud.ServiceSoap helloSAPClient

    GregorianCalendar calendar = new GregorianCalendar()
    XMLGregorianCalendar xmlCreateDate = DatatypeFactory.newInstance().newXMLGregorianCalendar("2012-02-08")
    XMLGregorianCalendar xmlUpdateDate = DatatypeFactory.newInstance().newXMLGregorianCalendar("2012-02-08")

    def index = {
        render(view: "/index")
    }

    def serviceSoapTest = { // this client runs all of the SAP operations: Add BusinessPartner (customer) and Add Invoice
        String addBusinessPartner = "", helloWorld = "", addInvoice = "", aCardCode = "", strTmp = ""
        Boolean isConnected = false, isAlive = false, addBP = false
        GetDataTableResult getDataTableResult = null
        Exception soapServiceException = null

        Address address = new Address(addressName: "Joe Berry (SAP WS Test)", address1: "22575 Highway 6 South", address2: "Navasota, Texas", postalCode: "77868", countryCode: "USA")

        // ArrayOfDocLine adds the line items to the Line Item list in the Invoice Document (but we don't know how yet).
        ArrayOfDocLine arrayOfDocLine = new ArrayOfDocLine()
        arrayOfDocLine.docLines = new ArrayList<DocLine>()
        // the arrayOfDocLine is commented out because the line items must be correctly valued.
        /*arrayOfDocLine.docLines.add("one")
        arrayOfDocLine.docLines.add("two")
        arrayOfDocLine.docLines.add("three")*/

        ArrayOfUDF arrayOfUDF = new ArrayOfUDF()
        arrayOfUDF.udves = new ArrayList()
        /*arrayOfUDF.udves.add("eins")
        arrayOfUDF.udves.add("zwei")
        arrayOfUDF.udves.add("drei")*/

        Document document = new Document(
                billToAddress: address,
                cardCode: "C00070",
                comments: "WS Test",
                customerRef: "45748-BD",
                docDueDate: xmlUpdateDate,
                docPostingDate: xmlCreateDate,
                lines: arrayOfDocLine,
                nbsGUID: "aguid", // this value is not correct
                priceList: 1,
                shipToAddress: address,
                udFs: arrayOfUDF
        )

        BusinessPartner businessPartner

        try { // all of the soapServices are executed here
            isConnected = serviceSoapClient.connected()
            isAlive = serviceSoapClient.isAlive()
            helloWorld = serviceSoapClient.helloWorld()
//            getDataTableResult = serviceSoapClient.getDataTable("select cardName, groupCode from OCRD where cardCode='C00106'")
            getDataTableResult = serviceSoapClient.getDataTable("SELECT 'C' + replace(str(MAX(convert(decimal,substring(CardCode,2,5)))+1,5,0),' ','0') FROM OCRD WHERE cardcode>='C00000' and cardcode<'C99999' and cardtype='C'")
            aCardCode = new String("${getDataTableResult.getAnies().get(1)}")
            log.debug("aCardCode = " + aCardCode)
            println "aCardCode = " + aCardCode
            businessPartner = new BusinessPartner( // do not run this code without changing the cardCode to the next new value
                cardCode: "C01065",
                cardName: "Casy Choate",
                groupCode: 100,
                priceListNum: 1,
                phone: "(610) 565-9000",
                email: "cchoate@sexingtechnologies.com",
                taxCode: "EX",
                terms: 1,
                secondPhone: "(111) 111-1111",
                mobilePhone: "(999) 999-9999",
                fax: "(222) 222-2222",
                shipToAddress: address,
                billToAddress: address
        )
//            getDataTableResult = serviceSoapClient.getDataTable("select * from OCRD where cardType = 'C' AND cardCode='C00070'")
//            getDataTableResult = serviceSoapClient.getDataTable("SELECT name FROM sysobjects WHERE id IN ( SELECT id FROM syscolumns WHERE name = 'PRICELISTNUM')")
            addBP = serviceSoapClient.addBP(businessPartner)
//            serviceSoapClient.addInvoice(document)
        } catch (Exception e) {
            println e
            soapServiceException = new Exception(" addBP invocation threw an error ${e.getMessage()}")
        }

        printOut(getDataTableResult.getAnies())

        // The commented out code below was used to clean up the old SOAP response from the old NBS test service for AddBP (http://ts2.nbs-us.com/TestWS/Service.asmx)
        /*String xml = strTmp
        xml = xml.trim().replaceFirst("^([^<]+)<", "<") // a lot of cleanup to make the SAX parser happy
        xml = xml.trim().replaceFirst(">([^>]+)\$", ">")
        xml = xml.trim().replaceAll("\\r|\\n", "")
        String[] xmlTmp = xml.trim().split(",")
        xml = xmlTmp[1]
        xml = xml.trim().stripIndent()


        println "xml = ${xml}"
        def bp = new XmlParser().parseText(xml)
        def bpSlurp = new XmlSlurper().parseText(xml)
        println "bp.name = ${bp.name()}"
        println "bpSlurp.name ${bpSlurp.name()}"

        bpSlurp.name().eachLine {
            it.eachLine {
                println "it = ${it}"
            }
        }

        bpSlurp.find { found ->
            if(bpSlurp.name().equalsIgnoreCase("diffgram"))
                println "found diffgram = ${found}"
        }

        println "depthFirst = ${bp.depthFirst()}"
        println "breadthFirst = ${bp.breadthFirst()}"
        def allNodes = bp.depthFirst().collect { it }
        println "allNodes.size = ${allNodes.size()}"
        println "bp.size = ${bp.children().size()}"
        def bpSublist = bp.children().subList(0,1)
        println "bpSublist.size = ${bpSublist.size()}"
        println "bpSublist = ${bpSublist}"
        def slurpNodes = bpSlurp.breadthFirst().collect{ it }
        println "slurpNodes = " + slurpNodes
        println "slurpNodes.size = ${slurpNodes.size()}"
        println "slurpNodes.subList = ${slurpNodes.subList(3,4)}"
        println "slurpNodes.subList = ${slurpNodes.subList(4,5)}"
        println "slurpNodes.subList = ${slurpNodes.subList(5,6)}"

        bp.children().each {
            println "bp.children.each.name = ${it.name()}"
        }

        bpSlurp.children().each {
            if(bpSlurp.children().name().equalsIgnoreCase("DocumentElement"))
                println "bpSlurp.children.each.name = ${it.name()}"
        }

        bpSlurp.children().each {
            println "bpSlurp.children.each.attribute = ${it.attributes()}"
        }

        def allSlurp = bpSlurp.breadthFirst()

        while (allSlurp.hasNext()) {
            println "allSlurp.next = ${allSlurp.next()}"
        }

        println "slurpName = ${bpSlurp.name()}"

        println "slurpProps = ${bpSlurp.breadthFirst().properties}"*/

        render(view: '/index', model: [isConnected: isConnected,
               isAlive: isAlive,
               helloWorld: helloWorld,
//               getDataTableResult: "${slurpNodes.subList(3,4)} ${slurpNodes.subList(4,5)} ${slurpNodes.subList(5,6)}" ,
               getDataTableResult: aCardCode,
               addBP: addBP,
               addIvn: serviceSoapClient.addInvoice(document), // currently this is not working because of unknown required data type.
               soapServiceException: soapServiceException?.message ?: ""])
    }

    def getCardCode (cardNo) {
        def re = /([0-9]+)/
        def matcher = (cardNo =~ re)
        return matcher[0][1]
    }

    private void printOut(elem) {
        println elem
        elem?.childNodes.each {
            printOut it
        }
    }

    private String printOutStr(elem) {
        println elem
        elem?.childNodes.each {
            printOut it
        }
    }

    def helloSAPDemo = {
        String helloSAPService
        try {
            helloSAPService = helloSAPClient.helloWorld()
            log.debug(helloSAPService)
        } catch (Exception e) {
            helloSAPService = e.message
        }

        render(view: '/index', model: [helloSAPService: helloSAPService])
    }

    def loginServiceDemo = {
        String loginService
        try {
//            loginService = loginServiceClient.login("ST-SAP\\STSAP","*Inguran_AppDev_Sandbox*","dst_MSSQL2008","appdev","redpanda","appdev","redpanda","In_English","10.1.1.65:30000")
            loginService = loginServiceClient.login("10.1.0.252","Inguran_AppDev_Sandbox","dst_MSSQL","appdev","redpanda","appdev","redpanda","In_English","10.1.1.253:30000")
        } catch (Exception e) {
            loginService = e.message
        }

        render(view: '/index', model: [loginService: loginService])
    }

    def stockQuoteDemo = {
        String stockQuote
        try {
//            stockQuote = stockQuoteClient.getQuote("AAPL")
            stockQuote = stockQuoteClient.getQuote("SAP")
        } catch(Exception e){
            stockQuote = e.message
        }

        render(view: '/index', model: [stockQuote: stockQuote])
    }

    def globalWeatherDemo = {
        String globalWeather
        try {
            globalWeather = globalWeatherClient.getWeather("College Station, Easterwood Field", "United States")
        } catch(Exception e){
            globalWeather = e.message
        }

        render(view: '/index', model: [globalWeather: globalWeather])
    }

    def digDNSDemo = {
        String digDNS
        try {
            digDNS = digDNSClient.getQueryString("google.com", 1, "SOA")
        } catch(Exception e){
            digDNS = e.message
        }

        render(view: '/index', model: [digDNS: digDNS])
    }

    def shakeSpeareDemo = {
        String shakeSpeare
        try {
            shakeSpeare = shakeSpeareClient.getSpeech("Out, damned spot")
        } catch(Exception e) {
            shakeSpeare = e.message
        }

        render(view: '/index', model: [shakeSpeare: shakeSpeare])
    }

    def getCustomNewsDemo = {
        String getCustomNews
        try {
            getCustomNews = getCustomNewsClient.getCustomNews("physics")
        } catch(Exception e) {
            getCustomNews = e.message
        }

        render(view: '/index', model: [getCustomNews: getCustomNews])
    }

    def insecureServiceDemo = {
        def serviceException = null
        cxf.client.demo.simple.SimpleRequest request1 = new cxf.client.demo.simple.SimpleRequest(age: 32, name: "Christian")
        cxf.client.demo.secure.SimpleResponse response1 = new cxf.client.demo.secure.SimpleResponse()
        try {
            response1 = insecureServiceClient.secureMethod()
        } catch (Exception e) {
            serviceException = new Exception("Service invocation threw an error")
        }

        render(view: '/index', model: [serviceException: serviceException, simpleRequest1: request1, simpleResponse1: response1])
    }

    def customSecureServiceDemo = {
        def serviceException = null
        cxf.client.demo.simple.SimpleRequest request1 = new cxf.client.demo.simple.SimpleRequest(age: 32, name: "Christian")
        cxf.client.demo.secure.SimpleResponse response1 = new cxf.client.demo.secure.SimpleResponse()
        try {
            response1 = customSecureServiceClient.secureMethod()
        } catch (Exception e) {
            serviceException = new Exception("Service invocation threw an error")
        }

        render(view: '/index', model: [serviceException: serviceException, simpleRequest1: request1, simpleResponse1: response1])
    }

    def secureServiceDemo = {
        cxf.client.demo.simple.SimpleRequest request1 = new cxf.client.demo.simple.SimpleRequest(age: 32, name: "Christian")
        cxf.client.demo.secure.SimpleResponse response1 = secureServiceClient.secureMethod()

        render(view: '/index', model: [simpleRequest1: request1, simpleResponse1: response1])
    }

    /**
     * I am using the full path for objects in controller since I have source for original objects here
     * which are named the same as the jaxb objects except the namespace.
     */
    def simpleServiceDemo = {
        cxf.client.demo.simple.SimpleRequest request1 = new cxf.client.demo.simple.SimpleRequest(age: 32, name: "Christian")
        cxf.client.demo.simple.SimpleResponse response1 = simpleServiceClient.simpleMethod1(request1)


        cxf.client.demo.simple.SimpleRequest request2 = new cxf.client.demo.simple.SimpleRequest(age: 32, name: "Christian")
        cxf.client.demo.simple.SimpleResponse response2 = simpleServiceClient.simpleMethod2(request2)

        render(view: '/index', model: [simpleRequest1: request1, simpleResponse1: response1, simpleRequest2: request2, simpleResponse2: response2])

    }

    //{http://demo.cxf.com/}simpleMethod1Response
    /**
     * I am using the full path for objects in controller since I have source for original objects here
     * which are named the same as the jaxb objects except the namespace.
     */
    def complexServiceDemo = {
        cxf.client.demo.complex.ComplexRequest request1 = new cxf.client.demo.complex.ComplexRequest(
                singleChild: new cxf.client.demo.complex.ComplexChild(name: "Child"),
                propagateCount: 3)
        cxf.client.demo.complex.ComplexResponse response1 = complexServiceClient.complexMethod1(request1)


        cxf.client.demo.complex.ComplexRequest request2 = new cxf.client.demo.complex.ComplexRequest(
                singleChild: new cxf.client.demo.complex.ComplexChild(name: "Child"),
                propagateCount: 3)
        cxf.client.demo.complex.ComplexResponse response2 = complexServiceClient.complexMethod2(request1)

        render(view: '/index', model: [complexRequest1: request1, complexResponse1: response1, complexRequest2: request2, complexResponse2: response2])
    }
}
