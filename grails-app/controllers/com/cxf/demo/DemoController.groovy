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
import org.tempuri.GetDataTableResponse.GetDataTableResult

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
                                                              groupCode: 1,
                                                              taxCode: "99-9999999",
                                                              priceListNum: 1,
                                                              phone: "614-873-4683",
                                                              mobilePhone: "614-246-1055",
                                                              fax: "614-873-5751",
                                                              terms: 7,
                                                              billToAddress: address,
                                                              email: "AThiergartner@selectsires.com")

        try {
            isConnected = serviceSoapClient.connected()
            isAlive = serviceSoapClient.isAlive()
            helloWorld = serviceSoapClient.helloWorld()
            getDataTableResult = serviceSoapClient.getDataTable("select sqrt(9)")
            addBusinessPartner = serviceSoapClient.addBP(businessPartner)
        } catch (Exception e) {
            println e
            soapServiceException = new Exception("GetDataTable invocation threw an error ${e.getMessage()}")
        }

        render(view: '/index', model: [isConnected: isConnected,
               isAlive: isAlive,
               helloWorld: helloWorld,
               getDataTableResult: getDataTableResult.any,
               addBusinessPartner: addBusinessPartner.asBoolean(),
               soapServiceException: soapServiceException?.message ?: ""])
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
