
package webservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WSGestionUsuario", targetNamespace = "http://webservices/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSGestionUsuario {


    /**
     * 
     * @param apellidos
     * @param pass
     * @param privilegio
     * @param ci
     * @param nombres
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Registrar")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Registrar", targetNamespace = "http://webservices/", className = "webservices.Registrar")
    @ResponseWrapper(localName = "RegistrarResponse", targetNamespace = "http://webservices/", className = "webservices.RegistrarResponse")
    @Action(input = "http://webservices/WSGestionUsuario/RegistrarRequest", output = "http://webservices/WSGestionUsuario/RegistrarResponse")
    public String registrar(
        @WebParam(name = "ci", targetNamespace = "")
        String ci,
        @WebParam(name = "pass", targetNamespace = "")
        String pass,
        @WebParam(name = "apellidos", targetNamespace = "")
        String apellidos,
        @WebParam(name = "nombres", targetNamespace = "")
        String nombres,
        @WebParam(name = "privilegio", targetNamespace = "")
        String privilegio);

    /**
     * 
     * @param pass
     * @param privilegio
     * @param ci
     * @return
     *     returns webservices.Empleado
     */
    @WebMethod(operationName = "Validar")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Validar", targetNamespace = "http://webservices/", className = "webservices.Validar")
    @ResponseWrapper(localName = "ValidarResponse", targetNamespace = "http://webservices/", className = "webservices.ValidarResponse")
    @Action(input = "http://webservices/WSGestionUsuario/ValidarRequest", output = "http://webservices/WSGestionUsuario/ValidarResponse")
    public Empleado validar(
        @WebParam(name = "ci", targetNamespace = "")
        String ci,
        @WebParam(name = "pass", targetNamespace = "")
        String pass,
        @WebParam(name = "privilegio", targetNamespace = "")
        String privilegio);

}
