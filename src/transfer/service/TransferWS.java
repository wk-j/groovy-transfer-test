
package transfer.service;

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
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TransferWS", targetNamespace = "http://service.org/", wsdlLocation = "http://10.0.0.77:8080/TransferService/QTransferWSImpl?wsdl")
public class TransferWS
    extends Service
{

    private final static URL TRANSFERWS_WSDL_LOCATION;
    private final static WebServiceException TRANSFERWS_EXCEPTION;
    private final static QName TRANSFERWS_QNAME = new QName("http://service.org/", "TransferWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.0.0.77:8080/TransferService/QTransferWSImpl?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TRANSFERWS_WSDL_LOCATION = url;
        TRANSFERWS_EXCEPTION = e;
    }

    public TransferWS() {
        super(__getWsdlLocation(), TRANSFERWS_QNAME);
    }

    public TransferWS(WebServiceFeature... features) {
        super(__getWsdlLocation(), TRANSFERWS_QNAME, features);
    }

    public TransferWS(URL wsdlLocation) {
        super(wsdlLocation, TRANSFERWS_QNAME);
    }

    public TransferWS(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TRANSFERWS_QNAME, features);
    }

    public TransferWS(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TransferWS(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns QTransferWS
     */
    @WebEndpoint(name = "QTransferWSImplPort")
    public QTransferWS getQTransferWSImplPort() {
        return super.getPort(new QName("http://service.org/", "QTransferWSImplPort"), QTransferWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns QTransferWS
     */
    @WebEndpoint(name = "QTransferWSImplPort")
    public QTransferWS getQTransferWSImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.org/", "QTransferWSImplPort"), QTransferWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TRANSFERWS_EXCEPTION!= null) {
            throw TRANSFERWS_EXCEPTION;
        }
        return TRANSFERWS_WSDL_LOCATION;
    }

}
