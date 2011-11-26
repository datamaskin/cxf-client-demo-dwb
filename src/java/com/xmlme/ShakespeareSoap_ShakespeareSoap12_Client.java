
package com.xmlme;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.0
 * 2011-11-16T09:26:43.411-06:00
 * Generated source version: 2.5.0
 * 
 */
public final class ShakespeareSoap_ShakespeareSoap12_Client {

    private static final QName SERVICE_NAME = new QName("http://xmlme.com/WebServices", "Shakespeare");

    private ShakespeareSoap_ShakespeareSoap12_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = Shakespeare.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        Shakespeare ss = new Shakespeare(wsdlURL, SERVICE_NAME);
        ShakespeareSoap port = ss.getShakespeareSoap12();  
        
        {
        System.out.println("Invoking getSpeech...");
        java.lang.String _getSpeech_request = "";
        java.lang.String _getSpeech__return = port.getSpeech(_getSpeech_request);
        System.out.println("getSpeech.result=" + _getSpeech__return);


        }

        System.exit(0);
    }

}