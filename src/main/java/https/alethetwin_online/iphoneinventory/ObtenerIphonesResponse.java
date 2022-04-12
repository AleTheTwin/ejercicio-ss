//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.04.12 a las 05:46:06 PM CDT 
//


package https.alethetwin_online.iphoneinventory;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="iphone" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="modelo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="almacenamiento" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="color" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "iphone"
})
@XmlRootElement(name = "ObtenerIphonesResponse")
public class ObtenerIphonesResponse {

    @XmlElement(required = true)
    protected List<ObtenerIphonesResponse.Iphone> iphone;

    /**
     * Gets the value of the iphone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iphone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIphone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObtenerIphonesResponse.Iphone }
     * 
     * 
     */
    public List<ObtenerIphonesResponse.Iphone> getIphone() {
        if (iphone == null) {
            iphone = new ArrayList<ObtenerIphonesResponse.Iphone>();
        }
        return this.iphone;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="modelo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="almacenamiento" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="color" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id",
        "modelo",
        "almacenamiento",
        "color"
    })
    public static class Iphone {

        protected int id;
        @XmlElement(required = true)
        protected String modelo;
        protected int almacenamiento;
        @XmlElement(required = true)
        protected String color;

        /**
         * Obtiene el valor de la propiedad id.
         * 
         */
        public int getId() {
            return id;
        }

        /**
         * Define el valor de la propiedad id.
         * 
         */
        public void setId(int value) {
            this.id = value;
        }

        /**
         * Obtiene el valor de la propiedad modelo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModelo() {
            return modelo;
        }

        /**
         * Define el valor de la propiedad modelo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModelo(String value) {
            this.modelo = value;
        }

        /**
         * Obtiene el valor de la propiedad almacenamiento.
         * 
         */
        public int getAlmacenamiento() {
            return almacenamiento;
        }

        /**
         * Define el valor de la propiedad almacenamiento.
         * 
         */
        public void setAlmacenamiento(int value) {
            this.almacenamiento = value;
        }

        /**
         * Obtiene el valor de la propiedad color.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getColor() {
            return color;
        }

        /**
         * Define el valor de la propiedad color.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setColor(String value) {
            this.color = value;
        }

    }

}
