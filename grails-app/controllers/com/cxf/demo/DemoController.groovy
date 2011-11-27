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
import org.tempuri.HelloWorld
import org.tempuri.HelloWorldResponse
/*import com.sexingtechnologies.TestWS.GetDataTableResponse
import com.sexingtechnologies.TestWS.GetDataTable
import com.sexingtechnologies.TestWS.ServiceSoap
import com.sexingtechnologies.TestWS.BusinessPartner
import com.sexingtechnologies.TestWS.Address
import com.sexingtechnologies.TestWS.Connected
import com.sexingtechnologies.TestWS.IsAlive*/
import org.tempuri.ServiceSoap
import org.tempuri.Service
import org.tempuri.AddBP
import org.tempuri.AddBPResponse
import org.tempuri.Address
import org.tempuri.BusinessPartner
import org.tempuri.Connected
import org.tempuri.ConnectedResponse
import org.tempuri.GetDataTable
import org.tempuri.GetDataTableResponse
import org.tempuri.HelloWorld
import org.tempuri.HelloWorldResponse
import org.tempuri.IsAlive
import org.tempuri.IsAliveResponse
import org.tempuri.ObjectFactory

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
    org.tempuri.ServiceSoap serviceSoapClient

    def index = {
        render(view: "/index")
    }

    def serviceSoapTest = {
        String soapServiceException, addBP1, connect1, isAlive1, helloWorld1, getDataTable1

        BusinessPartner bp = new BusinessPartner()
        Address address = new Address()
        Address billTo1 = new Address()
        Address billTo2 = new Address()
        Address billToPostal = new Address()

        try {
            address.setAddress1("910 Navidad")
            address.setAddress2("Bryan, Texas")
            address.setPostalCode("77801")
            bp.setCardCode("C00570")
            bp.setCardName("Select Sires")
            bp.setGroupCode(1)
            bp.setTaxCode("99-9999999")
            bp.setPriceListNum(1)
            billTo1.setAddress1("22575 Highway 6 South")
            bp.setBillToAddress(billTo1)
            billTo2.setAddress2("Navasota, Texas")
            bp.setBillToAddress(billTo2)
//            billToPostal.setPostalCode("77868")
            bp.setEmail("AThiergartner@selectsires.com")
            bp.setPhone("614-873-4683")
            bp.setMobilePhone("614-246-1055")
            bp.setFax("614-873-5751")
            bp.setTerms(7)
            connect1 = serviceSoapClient.connected()
            isAlive1 = serviceSoapClient.isAlive()
            helloWorld1 = serviceSoapClient.helloWorld()
            getDataTable1 = serviceSoapClient.getDataTable("select sqrt(2)")
            /*addBP1 = serviceSoapClient.addBP(bp)*/
        } catch (Exception e) {
            soapServiceException = new Exception("GetDataTable invocation threw an error ") + e.getMessage()
        }

        render(view: '/index', model: [connect1: connect1,
                                        isAlive1: isAlive1,
                                        helloWorld1: helloWorld1,
                                        getDataTable1: getDataTable1,
                                        /*addBP1: addBP1,*/
                                        soapServiceException: soapServiceException])
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
