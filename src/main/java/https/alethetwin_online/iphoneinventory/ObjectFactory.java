//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.04.12 a las 05:46:06 PM CDT 
//


package https.alethetwin_online.iphoneinventory;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.alethetwin_online.iphoneinventory package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ObtenerIphonesRequest_QNAME = new QName("https://alethetwin.online/iPhoneInventory", "ObtenerIphonesRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.alethetwin_online.iphoneinventory
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AgregarIphoneRequest }
     * 
     */
    public AgregarIphoneRequest createAgregarIphoneRequest() {
        return new AgregarIphoneRequest();
    }

    /**
     * Create an instance of {@link ObtenerIphonesResponse }
     * 
     */
    public ObtenerIphonesResponse createObtenerIphonesResponse() {
        return new ObtenerIphonesResponse();
    }

    /**
     * Create an instance of {@link AgregarIphoneRequest.Iphone }
     * 
     */
    public AgregarIphoneRequest.Iphone createAgregarIphoneRequestIphone() {
        return new AgregarIphoneRequest.Iphone();
    }

    /**
     * Create an instance of {@link AgregarIphoneResponse }
     * 
     */
    public AgregarIphoneResponse createAgregarIphoneResponse() {
        return new AgregarIphoneResponse();
    }

    /**
     * Create an instance of {@link ObtenerIphonesResponse.Iphone }
     * 
     */
    public ObtenerIphonesResponse.Iphone createObtenerIphonesResponseIphone() {
        return new ObtenerIphonesResponse.Iphone();
    }

    /**
     * Create an instance of {@link EliminarIphoneRequest }
     * 
     */
    public EliminarIphoneRequest createEliminarIphoneRequest() {
        return new EliminarIphoneRequest();
    }

    /**
     * Create an instance of {@link EliminarIphoneResponse }
     * 
     */
    public EliminarIphoneResponse createEliminarIphoneResponse() {
        return new EliminarIphoneResponse();
    }

    /**
     * Create an instance of {@link ObtenerCantidadPorModeloRequest }
     * 
     */
    public ObtenerCantidadPorModeloRequest createObtenerCantidadPorModeloRequest() {
        return new ObtenerCantidadPorModeloRequest();
    }

    /**
     * Create an instance of {@link ObtenerCantidadPorModeloResponse }
     * 
     */
    public ObtenerCantidadPorModeloResponse createObtenerCantidadPorModeloResponse() {
        return new ObtenerCantidadPorModeloResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "https://alethetwin.online/iPhoneInventory", name = "ObtenerIphonesRequest")
    public JAXBElement<Object> createObtenerIphonesRequest(Object value) {
        return new JAXBElement<Object>(_ObtenerIphonesRequest_QNAME, Object.class, null, value);
    }

}
