package online.alethetwin.iPhoneInventory;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import https.alethetwin_online.iphoneinventory.AgregarIphoneRequest;
import https.alethetwin_online.iphoneinventory.AgregarIphoneRequest.Iphone;
import https.alethetwin_online.iphoneinventory.AgregarIphoneResponse;
import https.alethetwin_online.iphoneinventory.EliminarIphoneRequest;
import https.alethetwin_online.iphoneinventory.EliminarIphoneResponse;
import https.alethetwin_online.iphoneinventory.ObtenerCantidadPorModeloRequest;
import https.alethetwin_online.iphoneinventory.ObtenerCantidadPorModeloResponse;
import https.alethetwin_online.iphoneinventory.ObtenerIphonesResponse;


@Endpoint
public class IPhoneInventoryEndPoint {

    @Autowired
    private IdaoIPhones dao;

    @PayloadRoot(namespace = "https://alethetwin.online/iPhoneInventory", localPart = "AgregarIphoneRequest")
    @ResponsePayload
    public AgregarIphoneResponse agregarIphone(@RequestPayload AgregarIphoneRequest peticion) {
        AgregarIphoneResponse respuesta = new AgregarIphoneResponse();

        List<Iphone> iphonesPeticion = peticion.getIphone();

        for(Iphone iphonePeticion : iphonesPeticion) {
            IPhone iphone = new IPhone();
            iphone.setModelo(iphonePeticion.getModelo());
            iphone.setAlmacenamiento(iphonePeticion.getAlmacenamiento());
            iphone.setColor(iphonePeticion.getColor());
            dao.save(iphone);
        }

        respuesta.setRespuesta(true);
        return respuesta;
    }

    @PayloadRoot(namespace = "https://alethetwin.online/iPhoneInventory", localPart = "ObtenerIphonesRequest")
    @ResponsePayload
    public ObtenerIphonesResponse obtenerIphones() {
        ObtenerIphonesResponse respuesta = new ObtenerIphonesResponse();
        
        Iterable<IPhone> iphones = dao.findAll();

        iphones.forEach(iphone -> {
            ObtenerIphonesResponse.Iphone iphoneResponse = new ObtenerIphonesResponse.Iphone();
            iphoneResponse.setId(iphone.getId());
            iphoneResponse.setAlmacenamiento(iphone.getAlmacenamiento());
            iphoneResponse.setColor(iphone.getColor());
            iphoneResponse.setModelo(iphone.getModelo());

            respuesta.getIphone().add(iphoneResponse);
        });

        return respuesta;
    }

    @PayloadRoot(namespace = "https://alethetwin.online/iPhoneInventory", localPart = "EliminarIphoneRequest")
    @ResponsePayload
    public EliminarIphoneResponse eliminarIphone(@RequestPayload EliminarIphoneRequest peticion) {
        EliminarIphoneResponse respuesta = new EliminarIphoneResponse();

        Integer id = peticion.getId();

        dao.deleteById(id);

        respuesta.setRespuesta(true);
        return respuesta;
    }


    @PayloadRoot(namespace = "https://alethetwin.online/iPhoneInventory", localPart = "ObtenerCantidadPorModeloRequest")
    @ResponsePayload
    public ObtenerCantidadPorModeloResponse obtenerCantidadPorModelo(@RequestPayload ObtenerCantidadPorModeloRequest peticion) {
        ObtenerCantidadPorModeloResponse respuesta = new ObtenerCantidadPorModeloResponse();

        String modelo = peticion.getModelo();

        Iterable<IPhone> iphones = dao.findAll();
        int counter = 0;
        for(IPhone iphone : iphones) {  
            if(iphone.getModelo().equals(modelo)) {
                counter++;
            }
        }
        int cantidad = counter;
        
        

        respuesta.setRespuesta(cantidad);
        return respuesta;
    }
}
