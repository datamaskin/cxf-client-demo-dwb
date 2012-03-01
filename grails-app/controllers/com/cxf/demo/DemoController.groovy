package com.cxf.demo

// These imports are available after running wsdl2java


import com.sexingtechnologies.b1ws.LoginServiceSoap
import com.xmlme.ShakespeareSoap
import com.xmlme.news.GetCustomNewsSoap
import cxf.client.demo.complex.ComplexServicePortType
import cxf.client.demo.secure.SecureServicePortType
import javax.xml.datatype.DatatypeFactory
import javax.xml.datatype.XMLGregorianCalendar
import net.webbservicex.globalweather.GlobalWeatherSoap
import net.webservicex.StockQuoteSoap
import org.tempuri.GetDataTableResponse.GetDataTableResult
import uk.co.demon.DigDNS
import org.tempuri.*

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
    /*XMLGregorianCalendar xmlCreateDate = DatatypeFactory.newInstance().newXMLGregorianCalendar("2012-02-014T00:00:00")
    XMLGregorianCalendar xmlUpdateDate = DatatypeFactory.newInstance().newXMLGregorianCalendar("2012-02-014T00:00:00")*/
    XMLGregorianCalendar xmlCreateDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar)
    XMLGregorianCalendar xmlUpdateDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar)

    def index = {
        render(view: "/index")
    }

    def serviceSoapTest = { // this client runs all of the SAP operations: Add BusinessPartner (customer) and Add Invoice
        def addBusinessPartner = "", helloWorld = "", aCardCode = params.aCardCode, shipToCode = params.stc, comment = params.cmmt,
        desc = params.desc, anItemCode = params.itemCode, aTaxCode = params.taxCode, aWareHouseCode = params.whsCode, aCardName = params.cardName,
        groupName = params.grpn, phoneNum = params.ph, aSecondPhone = params.secondPhone, aMobilePhone = params.mobilePhone,
        aFax = params.fax, priceListName = params.pl, anEmail = params.email, addressName = params.an, address1 = params.address1,
        city = params.city, state = params.state, postalCode = params.postalCode, countryCode = params.countryCode, enabled = params.Enable,
        qtyStr = params.quantity, unitpStr = params.unitP

//        double quantity = 0.0, unitP = 0.0

        Boolean isConnected = false, isAlive = false, addBP = false
        GetDataTableResult getDataTableResult = null, getGroupName = null, getGroupCode = null, getPriceListNum = null, getPriceListName = null,
                            getCardCodeList = null, getPriceListNames = null, getShipToCode = null, getCardCode = null, getAddressName = null,
                            getAddr1 = null, getCity = null, getState = null, getPostalCode = null, getCountryCode = null
        AddInvoiceResponse addInvoiceResponse = null
        def invNum = 0, pList = 0, aGroupCode = 0, aTerms = 0, quantity = qtyStr.toDouble(), unitP = unitpStr.toDouble()
        Exception soapServiceException = null

        Address address = new Address(addressName: "Joe Berry (SAP WS Test)", address1: "22575 Highway 6 South", address2: "Navasota, Texas", postalCode: "77868", countryCode: "USA")
        Address address_1 = new Address(addressName: "David Brown (SAP WS Test)", address1: "919 Navidad", address2: "Bryan, Texas", postalCode: "77801", countryCode: "USA")
        Address billTo = new Address(addressName: params.an, address1: params.add1, address2: "", address3: "", city: params.cty, state: params.ste, postalCode: params.pc, countryCode: params.cc)
        Address shipTo = new Address(addressName: params.an, address1: params.add1, address2: "", address3: "", city: params.cty, state: params.ste, postalCode: params.pc, countryCode: params.cc)

        println("params = " + params)

        def selectedShipToCode = "David Brown (SAP WS Test)"


        UDF udf = new UDF(
            name: "",
            value: ""
        )

        ArrayOfUDF arrayOfUDF = new ArrayOfUDF()

//        arrayOfUDF.getUDVES().add(udf)

        // ArrayOfDocLine adds the line items to the Line Item list in the Invoice Document (but we don't know how yet).
        ArrayOfDocLine arrayOfDocLine = new ArrayOfDocLine()
        ArrayOfDocLine arrayOfDocLine1 = new ArrayOfDocLine()

        DocLine docLine = new DocLine()
        docLine.setComments("Test invoice via wstest")
        docLine.setDescription("Test Invoice")
        docLine.setItemCode("SEMENINV_0001")
        docLine.setQty(10.0)
        docLine.setTaxCode("EX")
        docLine.setUDFs(arrayOfUDF)
        docLine.setUnitPrice(9.9)
        docLine.setWarehouseCode("NavaSort")

        DocLine docLine1 = new DocLine(
            comments: comment,
            description: desc,
            itemCode: anItemCode,
            qty: quantity,
            taxCode: aTaxCode,
            udFs: arrayOfUDF,
            unitPrice: unitP,
            warehouseCode: aWareHouseCode
        )

        arrayOfDocLine1.getDocLines().add(docLine1)

        Document document = new Document( // most of these values are found in the SAP B1: Contents', Logistics' tab & Item Master Data
            billToAddress: billTo,
            cardCode: "",
            comments: "WS Test",
            customerRef: "",
            docDueDate: xmlUpdateDate,
            docPostingDate: xmlCreateDate,
            lines: arrayOfDocLine,
            nbsGUID: "",
            priceList: 2,
            shipToAddress: shipTo,
            shipToCode: selectedShipToCode,
            udFs: arrayOfUDF
        )

        Document document1 = new Document(
            billToAddress: billTo,
            cardCode: aCardCode,
            comments: comment,
            customerRef: "",
            docDueDate: xmlUpdateDate,
            docPostingDate: xmlCreateDate,
            lines: arrayOfDocLine1,
            nbsGUID: "",
            priceList: pList,
            shipToAddress: shipTo,
            shipToCode: addressName,
            udFs: arrayOfUDF
        )

        BusinessPartner businessPartner, businessPartner1

        try { // all of the soapServices are executed here
            isAlive = serviceSoapClient.isAlive()
            isConnected = serviceSoapClient.connected()
            helloWorld = serviceSoapClient.helloWorld()
            def xml = ""
            businessPartner = new BusinessPartner( // do not run this code without changing the cardCode to the next new value
                cardCode: aCardCode,
                cardName: "Brown, David",
                groupCode: 100,
                priceListNum: 2,
                phone: "(832) 492-3847",
                email: "david@davidwbrown.name",
                taxCode: "EX",
                terms: 1,
                secondPhone: "(111) 111-1111",
                mobilePhone: "(999) 999-9999",
                fax: "(222) 222-2222",
                shipToAddress: shipTo,
                billToAddress: billTo
            )

            businessPartner1 = new BusinessPartner(
                cardCode: aCardCode,
                cardName: aCardName,
                groupCode: aGroupCode,
                priceListNum: pList,
                phone: phoneNum,
                email: anEmail,
                taxCode: aTaxCode,
                terms: aTerms,
                secondPhone: aSecondPhone,
                mobilePhone: aMobilePhone,
                fax: aFax,
                shipToAddress: shipTo,
                billToAddress: billTo
            )

            if(isAlive && isConnected && enabled.equalsIgnoreCase("bp")) { // add a BP
//          Following query fetches the next valid CardCode
                getDataTableResult = serviceSoapClient.getDataTable("SELECT 'C' + replace(str(MAX(convert(decimal,substring(CardCode,2,5)))+1,5,0),' ','0') FROM OCRD WHERE cardcode>='C00000' and cardcode<'C99999' and cardtype='C'")
                xml = getDataTableResult.getAnies().toListString()
                aCardCode = getDiffGram(xml)
                getGroupCode = serviceSoapClient.getDataTable("SELECT GroupCode FROM OCRG WHERE GroupName = '${groupName[1]}'")
                xml = getGroupCode.getAnies().toListString()
                aGroupCode = getDiffGram(xml).toInteger()
                businessPartner1.setGroupCode(aGroupCode)
                addBP = serviceSoapClient.addBP(businessPartner1)
            }
            else if(isAlive && isConnected && enabled.equalsIgnoreCase("inv")) {
                getCardCode = serviceSoapClient.getDataTable("SELECT DISTINCT CardCode FROM OINV WHERE CARDNAME = '${aCardName}'")
                xml = getCardCode.getAnies().toListString()
                aCardCode = getDiffGram(xml)
                document1.setCardCode(aCardCode.toString())
                println "aCardCode = ${aCardCode}"

                getPriceListNum = serviceSoapClient.getDataTable("SELECT ListNum FROM OPLN WHERE ListName = '${priceListName[1]}'")
                xml = getPriceListNum.getAnies().toListString()
                pList = getDiffGram(xml).toInteger()
                document1.setPriceList(pList)
                println "pList = ${pList}"

                getShipToCode = serviceSoapClient.getDataTable("SELECT DISTINCT Address FROM CRD1 WHERE CardCode = '${aCardCode}'")
                xml = getShipToCode.getAnies().toListString()
                addressName = getDiffGram(xml)
                document1.setShipToCode(addressName.toString())
                println "addressName = ${addressName}"

                billTo.setAddressName(addressName.toString())
                shipTo.setAddressName(addressName.toString())

                getAddr1 = serviceSoapClient.getDataTable("SELECT DISTINCT Street FROM CRD1 WHERE CardCode = '${aCardCode}'")
                xml = getAddr1.getAnies().toListString()
                address1 = getDiffGram(xml)
                billTo.setAddress1(address1.toString())
                shipTo.setAddress1(address1.toString())
                println "address1 = ${address1}"

                getCity = serviceSoapClient.getDataTable("SELECT DISTINCT City FROM CRD1 WHERE CardCode = '${aCardCode}'")
                xml = getCity.getAnies().toListString()
                city = getDiffGram(xml)
                billTo.setCity(city.toString())
                shipTo.setCity(city.toString())
                println "city = ${city}"

                getState = serviceSoapClient.getDataTable("SELECT DISTINCT State FROM CRD1 WHERE CardCode = '${aCardCode}'")
                xml = getState.getAnies().toListString()
                state = getDiffGram(xml)
                billTo.setState(state.toString())
                shipTo.setState(state.toString())
                println "state = ${state}"

                getPostalCode = serviceSoapClient.getDataTable("SELECT DISTINCT ZipCode FROM CRD1 WHERE CardCode = '${aCardCode}'")
                xml = getPostalCode.getAnies().toListString()
                postalCode = getDiffGram(xml)
                billTo.setPostalCode(postalCode.toString())
                shipTo.setPostalCode(postalCode.toString())
                println "postalCode = ${postalCode}"

                getCountryCode = serviceSoapClient.getDataTable("SELECT DISTINCT Country FROM CRD1 WHERE CardCode = '${aCardCode}'")
                xml = getCountryCode.getAnies().toListString()
                countryCode = getDiffGram(xml)
                billTo.setCountryCode(countryCode.toString())
                shipTo.setCountryCode(countryCode.toString())
                println "countryCode = ${countryCode}"

                /*getDataTableResult = serviceSoapClient.getDataTable("SELECT DISTINCT CardCode FROM CRD1 WHERE Address = '${addressName}'")
                xml = getDataTableResult.getAnies().toListString()
                aCardCode = getDiffGram(xml)
                document1.setCardCode(aCardCode.toString())*/
                /*println "docLine1.comments  = ${docLine1.comments}"
                println "docLine1.itemCode = ${docLine1.itemCode}"
                println "docLine1.qty = ${docLine1.qty}"
                println "docLine1.taxCode = ${docLine1.taxCode}"
                println "docLine1.unitPrice = ${docLine1.unitPrice}"
                println "docLine1.warehouseCode = ${docLine1.warehouseCode}"*/
//                document1.setLines(arrayOfDocLine1)

                invNum = serviceSoapClient.addInvoice(document1).intValue()
//                invNum = addInvoiceResponse.addInvoiceResult.intValue()
            }

        } catch (Exception e) {
            println e
            soapServiceException = new Exception(" Server exception: ${e.getMessage()}")
        }

        render(view: '/index', model: [isAlive: isAlive,
               isConnected: isConnected,
               helloWorld: helloWorld,
               getDataTableResult: aCardCode,
               addBP: addBP,
               addIvn: invNum,
               soapServiceException: soapServiceException?.message ?: ""])
    }

    def getDiffGram (xml) {
        if(xml.startsWith('['))
            xml = xml.substring(1,xml.length())
        if(xml.endsWith(']'))
                xml = xml.trim().substring(0,xml.length()-1)
        xml = xml.trim().replaceAll("\\r|\\n", "") // mssql sends back windows shit
        String[] xmlTmp = xml.trim().split(",")
        xml = xmlTmp[1] // get the diffgram side
        xml = xml.trim().stripIndent()

        println "xml = ${xml}"
        def fp = new XmlParser().parseText(xml)
        def fpSlurp = new XmlSlurper().parseText(xml)
        println "fp.name = ${fp.name()}"
        println "fpSlurp.name ${fpSlurp.name()}"
        assert fpSlurp.name() == "diffgram"
        fpSlurp.name().eachLine {
            it.eachLine {
                println "it = ${it}"
            }
        }

        fpSlurp.find { found ->
            if(fpSlurp.name().equalsIgnoreCase("diffgram")) {
                println "found diffgram = ${found}"
                return found
            } else
                return null
        }
    }

    private void printOut(elem) {
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
