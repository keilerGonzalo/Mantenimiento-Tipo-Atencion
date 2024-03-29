package entidades;
// Generated 15/07/2019 05:41:19 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Mascota generated by hbm2java
 */
public class Mascota  implements java.io.Serializable {


     private int idMascota;
     private String nombreMascota;
     private String nombreCliente;
     private String raza;
     private Set clientepormascotas = new HashSet(0);

    public Mascota() {
    }

	
    public Mascota(int idMascota, String nombreMascota, String nombreCliente, String raza) {
        this.idMascota = idMascota;
        this.nombreMascota = nombreMascota;
        this.nombreCliente = nombreCliente;
        this.raza = raza;
    }
    public Mascota(int idMascota, String nombreMascota, String nombreCliente, String raza, Set clientepormascotas) {
       this.idMascota = idMascota;
       this.nombreMascota = nombreMascota;
       this.nombreCliente = nombreCliente;
       this.raza = raza;
       this.clientepormascotas = clientepormascotas;
    }
   
    public int getIdMascota() {
        return this.idMascota;
    }
    
    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }
    public String getNombreMascota() {
        return this.nombreMascota;
    }
    
    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }
    public String getNombreCliente() {
        return this.nombreCliente;
    }
    
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public String getRaza() {
        return this.raza;
    }
    
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public Set getClientepormascotas() {
        return this.clientepormascotas;
    }
    
    public void setClientepormascotas(Set clientepormascotas) {
        this.clientepormascotas = clientepormascotas;
    }




}


