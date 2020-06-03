package app.rsr.com.iropa;

import java.io.Serializable;

public class BDComentarios implements Serializable {

    private String idComentario;
    private String idPublicacion;
    private String idUser;
    private String comentario;

    private void BDComentarios(){

    }

    public BDComentarios(String idComentario, String idPublicacion, String idUser, String comentario) {
        this.idComentario = idComentario;
        this.idPublicacion = idPublicacion;
        this.idUser = idUser;
        this.comentario = comentario;
    }

    public String getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(String idComentario) {
        this.idComentario = idComentario;
    }

    public String getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(String idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
