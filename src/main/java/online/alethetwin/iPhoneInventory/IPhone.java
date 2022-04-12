package online.alethetwin.iPhoneInventory;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class IPhone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String modelo;
    private String color;
    private Integer almacenamiento;
    
    public String getModelo() {
        return modelo;
    }
    public Integer getAlmacenamiento() {
        return almacenamiento;
    }
    public Integer getId() {
        return id;
    }
    public void setAlmacenamiento(Integer almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setId(Integer id) {
        this.id = id;
    }

}
