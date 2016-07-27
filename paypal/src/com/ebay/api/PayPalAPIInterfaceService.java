
package com.ebay.api;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-2b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "PayPalAPIInterfaceService", targetNamespace = "urn:ebay:api:PayPalAPI", wsdlLocation = "https://www.sandbox.paypal.com/wsdl/PayPalSvc.wsdl")
public class PayPalAPIInterfaceService
    extends Service
{

    private final static URL PAYPALAPIINTERFACESERVICE_WSDL_LOCATION;
    private final static WebServiceException PAYPALAPIINTERFACESERVICE_EXCEPTION;
    private final static QName PAYPALAPIINTERFACESERVICE_QNAME = new QName("urn:ebay:api:PayPalAPI", "PayPalAPIInterfaceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://www.sandbox.paypal.com/wsdl/PayPalSvc.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PAYPALAPIINTERFACESERVICE_WSDL_LOCATION = url;
        PAYPALAPIINTERFACESERVICE_EXCEPTION = e;
    }

    public PayPalAPIInterfaceService() {
        super(__getWsdlLocation(), PAYPALAPIINTERFACESERVICE_QNAME);
    }

    public PayPalAPIInterfaceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PAYPALAPIINTERFACESERVICE_QNAME, features);
    }

    public PayPalAPIInterfaceService(URL wsdlLocation) {
        super(wsdlLocation, PAYPALAPIINTERFACESERVICE_QNAME);
    }

    public PayPalAPIInterfaceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PAYPALAPIINTERFACESERVICE_QNAME, features);
    }

    public PayPalAPIInterfaceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PayPalAPIInterfaceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PayPalAPIInterface
     */
    @WebEndpoint(name = "PayPalAPI")
    public PayPalAPIInterface getPayPalAPI() {
        return super.getPort(new QName("urn:ebay:api:PayPalAPI", "PayPalAPI"), PayPalAPIInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PayPalAPIInterface
     */
    @WebEndpoint(name = "PayPalAPI")
    public PayPalAPIInterface getPayPalAPI(WebServiceFeature... features) {
        return super.getPort(new QName("urn:ebay:api:PayPalAPI", "PayPalAPI"), PayPalAPIInterface.class, features);
    }

    /**
     * 
     * @return
     *     returns PayPalAPIAAInterface
     */
    @WebEndpoint(name = "PayPalAPIAA")
    public PayPalAPIAAInterface getPayPalAPIAA() {
        return super.getPort(new QName("urn:ebay:api:PayPalAPI", "PayPalAPIAA"), PayPalAPIAAInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PayPalAPIAAInterface
     */
    @WebEndpoint(name = "PayPalAPIAA")
    public PayPalAPIAAInterface getPayPalAPIAA(WebServiceFeature... features) {
        return super.getPort(new QName("urn:ebay:api:PayPalAPI", "PayPalAPIAA"), PayPalAPIAAInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PAYPALAPIINTERFACESERVICE_EXCEPTION!= null) {
            throw PAYPALAPIINTERFACESERVICE_EXCEPTION;
        }
        return PAYPALAPIINTERFACESERVICE_WSDL_LOCATION;
    }

}
