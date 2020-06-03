package app.rsr.com.iropa;

public class ContainerComentarioUser {
    private String comentarioUserNombreUser;
    private String comentarioUserComentario;

    public ContainerComentarioUser(){

    }
    public ContainerComentarioUser(String comentarioUserNombreUser, String comentarioUserComentario) {
        this.comentarioUserNombreUser = comentarioUserNombreUser;
        this.comentarioUserComentario = comentarioUserComentario;
    }

    public String getComentarioUserNombreUser() {
        return comentarioUserNombreUser;
    }

    public void setComentarioUserNombreUser(String comentarioUserNombreUser) {
        this.comentarioUserNombreUser = comentarioUserNombreUser;
    }

    public String getComentarioUserComentario() {
        return comentarioUserComentario;
    }

    public void setComentarioUserComentario(String comentarioUserComentario) {
        this.comentarioUserComentario = comentarioUserComentario;
    }
}
