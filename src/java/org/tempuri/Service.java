package org.tempuri;

import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This class was generated by Apache CXF 2.5.0
 * 2012-02-02T10:22:11.414-06:00
 * Generated source version: 2.5.0
 * 
 */
@WebServiceClient(name = "Service", 
                  wsdlLocation = "TestWS/TestWS.wsdl",
                  targetNamespace = "http://tempuri.org/") 
public class Service extends javax.xml.ws.Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://tempuri.org/", "Service");
    public final static QName ServiceSoap = new QName("http://tempuri.org/", "ServiceSoap");
    public final static QName ServiceSoap12 = new QName("http://tempuri.org/", "ServiceSoap12");
    static {
        URL url = null;
        try {
            url = new URL("TestWS/TestWS.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "TestWS/TestWS.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns ServiceSoap
     */
    @WebEndpoint(name = "ServiceSoap")
    public ServiceSoap getServiceSoap() {
        return super.getPort(ServiceSoap, ServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiceSoap
     */
    @WebEndpoint(name = "ServiceSoap")
    public ServiceSoap getServiceSoap(WebServiceFeature... features) {
        return super.getPort(ServiceSoap, ServiceSoap.class, features);
    }
    /**
     *
     * @return
     *     returns ServiceSoap
     */
    @WebEndpoint(name = "ServiceSoap12")
    public ServiceSoap getServiceSoap12() {
        return super.getPort(ServiceSoap12, ServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiceSoap
     */
    @WebEndpoint(name = "ServiceSoap12")
    public ServiceSoap getServiceSoap12(WebServiceFeature... features) {
        return super.getPort(ServiceSoap12, ServiceSoap.class, features);
    }

}
