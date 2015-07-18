package w.p.j;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.1
 * 2015-07-18T08:26:32.874+08:00
 * Generated source version: 3.1.1
 * 
 */
@WebService(targetNamespace = "http://j.p.w/", name = "IHello")
@XmlSeeAlso({ObjectFactory.class})
public interface IHello {

    @WebMethod
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://j.p.w/", className = "w.p.j.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://j.p.w/", className = "w.p.j.SayHelloResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String sayHello(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebMethod
    @RequestWrapper(localName = "sayAge", targetNamespace = "http://j.p.w/", className = "w.p.j.SayAge")
    @ResponseWrapper(localName = "sayAgeResponse", targetNamespace = "http://j.p.w/", className = "w.p.j.SayAgeResponse")
    @WebResult(name = "return", targetNamespace = "")
    public int sayAge(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );
}