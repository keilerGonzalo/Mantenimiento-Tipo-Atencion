package entidades;
// Generated 15/07/2019 05:41:19 PM by Hibernate Tools 4.3.1



/**
 * Tipoatencion generated by hbm2java
 */
public class Tipoatencion  implements java.io.Serializable {


     private int idTipoAtencion;
     private String descripcion;
     private char estado;

    public Tipoatencion() {
    }

    public Tipoatencion(int idTipoAtencion, String descripcion, char estado) {
       this.idTipoAtencion = idTipoAtencion;
       this.descripcion = descripcion;
       this.estado = estado;
    }
   
    public int getIdTipoAtencion() {
        return this.idTipoAtencion;
    }
    
    public void setIdTipoAtencion(int idTipoAtencion) {
        this.idTipoAtencion = idTipoAtencion;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public char getEstado() {
        return this.estado;
    }
    
    public void setEstado(char estado) {
        this.estado = estado;
    }




}


