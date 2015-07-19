package spring.impl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;
import spring.dao.OrderWs;

/**
 * This class was generated by Apache CXF 3.1.1
 * 2015-07-19T10:11:13.137+08:00
 * Generated source version: 3.1.1
 * 
 */
@WebServiceClient(name = "OrderServiceImplService", 
                  wsdlLocation = "http://localhost:8080/orderws?wsdl",
                  targetNamespace = "http://Impl.spring/") 
public class OrderServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://Impl.spring/", "OrderServiceImplService");
    public final static QName OrderServiceImplPort = new QName("http://Impl.spring/", "OrderServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/orderws?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(OrderServiceImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/orderws?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public OrderServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public OrderServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OrderServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public OrderServiceImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public OrderServiceImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public OrderServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns OrderWs
     */
    @WebEndpoint(name = "OrderServiceImplPort")
    public OrderWs getOrderServiceImplPort() {
        return super.getPort(OrderServiceImplPort, OrderWs.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OrderWs
     */
    @WebEndpoint(name = "OrderServiceImplPort")
    public OrderWs getOrderServiceImplPort(WebServiceFeature... features) {
        return super.getPort(OrderServiceImplPort, OrderWs.class, features);
    }

}
