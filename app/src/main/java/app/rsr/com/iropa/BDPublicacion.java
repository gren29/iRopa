package app.rsr.com.iropa;

import java.io.Serializable;

public  class BDPublicacion implements Serializable {
    private String idPublicacion;
    private String nombreUser;
    private int imagenPublicacion;
    private String descripcion;
    private String costo;
    private String categoria;

    public void BDPublicacion(){

    }

    public BDPublicacion(String idPublicacion, String nombreUser, int imagenPublicacion, String descripcion, String costo, String categoria) {
        this.idPublicacion = idPublicacion;
        this.nombreUser = nombreUser;
        this.imagenPublicacion = imagenPublicacion;
        this.descripcion = descripcion;
        this.costo = costo;
        this.categoria = categoria;
    }

    public String getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(String idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public String getNombreUser() {
        return nombreUser;
    }

    public void setNombreUser(String nombreUser) {
        this.nombreUser = nombreUser;
    }

    public int getImagenPublicacion() {
        return imagenPublicacion;
    }

    public void setImagenPublicacion(int imagenPublicacion) {
        this.imagenPublicacion = imagenPublicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
