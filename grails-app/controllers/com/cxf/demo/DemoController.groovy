package com.cxf.demo

import cxf.client.demo.complex.ComplexServicePortType
import cxf.client.demo.secure.SecureServicePortType
import cxf.client.demo.simple.SimpleServicePortType
import net.webservicex.StockQuoteSoap
import net.webbservicex.globalweather.GlobalWeatherSoap
import uk.co.demon.DigDNS
import com.xmlme.ShakespeareSoap
import com.xmlme.news.GetCustomNewsSoap
import com.sexingtechnologies.b1ws.LoginServiceSoap
import org.tempuri.ServiceSoap
import org.tempuri.Address
import org.tempuri.BusinessPartner
import org.tempuri.GetDataTableResponse.GetDataTableResult
import javax.xml.datatype.XMLGregorianCalendar
import javax.xml.datatype.DatatypeFactory



class DemoController {

    SimpleServicePortType simpleServiceClient
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
    ServiceSoap serviceSoapClient

    GregorianCalendar calendar = new GregorianCalendar()
    XMLGregorianCalendar xmlCreateDate = DatatypeFactory.newInstance().newXMLGregorianCalendar("2007-04-09T00:00:00-06:00")
    XMLGregorianCalendar xmlUpdateDate = DatatypeFactory.newInstance().newXMLGregorianCalendar("2009-12-31T00:00:00-07:00")


    def index = {
        render(view: "/index")
    }

    def serviceSoapTest = {
        String addBusinessPartner = "", helloWorld = ""
        Boolean isConnected = false, isAlive = false, addBP = false
        GetDataTableResult getDataTableResult = null
        Exception soapServiceException = null

        Address address = new Address(address1: "22575 Highway 6 South", address2: "Navasota, Texas", postalCode: "77868")
        BusinessPartner businessPartner = new BusinessPartner(cardCode: "C00570",
                                                              cardName: "Select Sires",
//                                                              cardType: "C",
                                                              groupCode: 107,
                                                              cmpPrivate: "C",
                                                              address: "300 Billings Drive",
                                                              zipCode: "19083",
                                                              mailAddres: "300 Billings Drive",
                                                              mailZipCod: "19083",
                                                              phone1: "(610) 565-9000",
                                                              fax: "614-873-5751",
                                                              cntctPrsn: "Norm Thompson",
                                                              balance: 91130.850000,
                                                              checksBal: -6057.900000,
                                                              dNotesBal: 1168.650000,
                                                              ordersBal: 26241.360000,
                                                              groupNum: 1,
                                                              creditLine: 0.000000,
                                                              debtLine: 0.000000,
                                                              discount: 0.000000,
                                                              vatStatus: "Y",
                                                              licTradNum: "US25-987634",
                                                              ddctStatus: "N",
                                                              ddctPrcnt: 0.000000,
                                                              listNum: 0.000000,
                                                              dNoteBalFC: 0.000000,
                                                              orderBalFC: 0.000000,
                                                              dNoteBalSy: 1168.650000,
                                                              orderBalSy: 26241.360000,
                                                              transfered: "N",
                                                              balTrnsfrd: "N",
                                                              intrstRate: 0.000000,
                                                              commission: 0.000000,
                                                              commGrCode: 0,
                                                              slpCode: 1,
                                                              prevYearAc: "N",
                                                              currency: "\$",
                                                              balanceSys: 91130.850000,
                                                              balanceFC: 0.000000,
                                                              city: "Havertown",
                                                              county: "Delaware",
                                                              country: "US",
                                                              mailCity: "Havertown",
                                                              mailCounty: "Delaware",
                                                              mailCountr: "US",
                                                              eMail: "info@norm.com",
                                                              dflAccount: "230-6789-456464",
                                                              dflBranch: "101",
                                                              bankCode: "BOA",
                                                              fatherType: "P",
                                                              qryGroup1: "N",
                                                              qryGroup2: "N",
                                                              qryGroup3: "N",
                                                              qryGroup4: "N",
                                                              qryGroup5: "N",
                                                              qryGroup6: "N",
                                                              qryGroup7: "N",
                                                              qryGroup8: "N",
                                                              qryGroup9: "N",
                                                              qryGroup10: "N",
                                                              qryGroup11: "N",
                                                              qryGroup12: "N",
                                                              qryGroup13: "N",
                                                              qryGroup14: "N",
                                                              qryGroup15: "N",
                                                              qryGroup16: "N",
                                                              qryGroup17: "N",
                                                              qryGroup18: "N",
                                                              qryGroup19: "N",
                                                              qryGroup20: "N",
                                                              qryGroup21: "N",
                                                              qryGroup22: "N",
                                                              qryGroup23: "N",
                                                              qryGroup24: "N",
                                                              qryGroup25: "N",
                                                              qryGroup26: "N",
                                                              qryGroup27: "N",
                                                              qryGroup28: "N",
                                                              qryGroup29: "N",
                                                              qryGroup30: "N",
                                                              qryGroup31: "N",
                                                              qryGroup32: "N",
                                                              qryGroup33: "N",
                                                              qryGroup34: "N",
                                                              qryGroup35: "N",
                                                              qryGroup36: "N",
                                                              qryGroup37: "N",
                                                              qryGroup38: "N",
                                                              qryGroup39: "N",
                                                              qryGroup40: "N",
                                                              qryGroup41: "N",
                                                              qryGroup42: "N",
                                                              qryGroup43: "N",
                                                              qryGroup44: "N",
                                                              qryGroup45: "N",
                                                              qryGroup46: "N",
                                                              qryGroup47: "N",
                                                              qryGroup48: "N",
                                                              qryGroup49: "N",
                                                              qryGroup50: "N",
                                                              qryGroup51: "N",
                                                              qryGroup52: "N",
                                                              qryGroup53: "N",
                                                              qryGroup54: "N",
                                                              qryGroup55: "N",
                                                              qryGroup56: "N",
                                                              qryGroup57: "N",
                                                              qryGroup58: "N",
                                                              qryGroup59: "N",
                                                              qryGroup60: "N",
                                                              qryGroup61: "N",
                                                              qryGroup62: "N",
                                                              qryGroup63: "N",
                                                              qryGroup64: "N",
                                                              createDate: xmlCreateDate,
                                                              updateDate: xmlUpdateDate,
                                                              dscntObjct: -1,
                                                              dscntRel: "L",
                                                              spgCounter: 0,
                                                              SPPCounter: 0,
                                                              minIntrst: 0.000000,
                                                              dataSource: 0,
                                                              oprCount: 6,
                                                              priority: 1,
                                                              creditCard: 1,
                                                              crCardNum: "39vQdtk98qMI9yBd/jHngWUE7ZbANtCD5FczibTq0IeHdSAjT1uOBzHyLFEtx4cV",
                                                              userSign: 1,
                                                              locMth: 1,
                                                              validFor: "N",
                                                              frozenFor:  "N",
                                                              sEmployed: "N",
                                                              ddgKey: -1,
                                                              ddtKey: -1,
                                                              chainStore: "N",
                                                              discInRet: "N",
                                                              state1: "PA",
                                                              state2: "PA",
                                                              logInstanc: 0,
                                                              objType: 2,
                                                              shipType: 1,
                                                              debPayAcct: "_SYS00000000010",
                                                              shipToDef: "Ship to",
                                                              block: "Suite 500",
                                                              mailBlock: "Suite 500",
                                                              deleted: "N",
                                                              docEntry: 1,
                                                              pymCode: "Incoming BT 02",
                                                              backOrder: "Y",
                                                              partDelivr: "Y",
                                                              dunnLevel: 0,
                                                              blockDunn: "N",
                                                              bankCountr: "US",
                                                              collecAuth: "N",
                                                              singlePaym: "N",
                                                              paymBlock: "N",
                                                              houseBank: "BOA",
                                                              pyBlckDesc: -1,
                                                              housBnkCry: "US",
                                                              housBnkAct: "100-3443-7867",
                                                              housBnkBrn: "Main",
                                                              sysMatchNo: -11,
                                                              deferrTax: "N",
                                                              maxAmount: 0.000000,
                                                              accCritria: "N",
                                                              equ: "N",
                                                              hldCode: "2007 Holidays",
                                                              typWTReprt: "C",
                                                              isDomestic: "Y",
                                                              isResident: "Y",
                                                              autoCalBCG: "N",
                                                              dunTerm: "Standard",
                                                              billToDef: "Bill To",
                                                              intrntSite: "www.norm.com",
                                                              langCode: 3,
                                                              housActKey: 2,
                                                              useShpdGd: "Y",
                                                              insurOp347: "N",
                                                              taxRndRule: "D",
                                                              threshOver: "N",
                                                              surOver: "N",
                                                              opCode347: "B",
                                                              residenNum: 1,
                                                              userSign2: 1,
                                                              affiliate: "N",
                                                              mivzExpSts: "B",
                                                              hierchDdct: "N",
                                                              certWHT: "N",
                                                              certBKeep: "N",
                                                              whShaamGrp: 1,
                                                              datevFirst: "Y",
                                                              taxIdIdent: 3
                                                              )

        try {
            isConnected = serviceSoapClient.connected()
            isAlive = serviceSoapClient.isAlive()
            helloWorld = serviceSoapClient.helloWorld()
            getDataTableResult = serviceSoapClient.getDataTable("select cardName, groupCode, balance from OCRD where cardCode='C00570'")
//            addBP = serviceSoapClient.addBP(businessPartner)
        } catch (Exception e) {
            println e
            soapServiceException = new Exception("addBP invocation threw an error ${e.getMessage()}")
        }

        printOut(getDataTableResult.getAnies())

        String xml = getDataTableResult.getAnies().toListString()
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

        println "slurpProps = ${bpSlurp.breadthFirst().properties}"

        render(view: '/index', model: [isConnected: isConnected,
               isAlive: isAlive,
               helloWorld: helloWorld,
               getDataTableResult: "${slurpNodes.subList(3,4)} ${slurpNodes.subList(4,5)} ${slurpNodes.subList(5,6)}" ,
//               addBP: addBP,
               soapServiceException: soapServiceException?.message ?: ""])
    }

    private void printOut(elem) {
        println elem
        elem?.childNodes.each {
            printOut it
        }
    }

    def loginServiceDemo = {
        String loginService
        try {
            loginService = loginServiceClient.login("10.1.1.65","APP-DEV","dst_MSSQL","sa","","dbrown","","In_English","10.1.1.65:30000")
        } catch (Exception e) {
            loginService = e.message
        }

        render(view: '/index', model: [loginService: loginService])
    }

    def stockQuoteDemo = {
        String stockQuote
        try {
            stockQuote = stockQuoteClient.getQuote("AAPL")
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
