package app.rsr.com.iropa;

import android.widget.ImageView;

public class ContainerHomeUser {

    private int homeUserIdImagenUser;
    private String homeUserIdNombreUserTitulo;
    private int homeUserIdImagenPublicacion;
    private String homeUserIdNombreUsuerComentario;
    private String homeUserIdComentario;

    public ContainerHomeUser(ImageView imageView, String nombreUser, ImageView view, String aksjd, String comentaro){

    }

    public ContainerHomeUser(int homeUserIdImagenUser, String homeUserIdNombreUserTitulo, int homeUserIdImagenPublicacion, String homeUserIdNombreUsuerComentario, String homeUserIdComentario) {
        this.homeUserIdImagenUser = homeUserIdImagenUser;
        this.homeUserIdNombreUserTitulo = homeUserIdNombreUserTitulo;
        this.homeUserIdImagenPublicacion = homeUserIdImagenPublicacion;
        this.homeUserIdNombreUsuerComentario = homeUserIdNombreUsuerComentario;
        this.homeUserIdComentario = homeUserIdComentario;
    }

    public int getHomeUserIdImagenUser() {
        return homeUserIdImagenUser;
    }

    public void setHomeUserIdImagenUser(int homeUserIdImagenUser) {
        this.homeUserIdImagenUser = homeUserIdImagenUser;
    }

    public String getHomeUserIdNombreUserTitulo() {
        return homeUserIdNombreUserTitulo;
    }

    public void setHomeUserIdNombreUserTitulo(String homeUserIdNombreUserTitulo) {
        this.homeUserIdNombreUserTitulo = homeUserIdNombreUserTitulo;
    }

    public int getHomeUserIdImagenPublicacion() {
        return homeUserIdImagenPublicacion;
    }

    public void setHomeUserIdImagenPublicacion(int homeUserIdImagenPublicacion) {
        this.homeUserIdImagenPublicacion = homeUserIdImagenPublicacion;
    }

    public String getHomeUserIdNombreUsuerComentario() {
        return homeUserIdNombreUsuerComentario;
    }

    public void setHomeUserIdNombreUsuerComentario(String homeUserIdNombreUsuerComentario) {
        this.homeUserIdNombreUsuerComentario = homeUserIdNombreUsuerComentario;
    }

    public String getHomeUserIdComentario() {
        return homeUserIdComentario;
    }

    public void setHomeUserIdComentario(String homeUserIdComentario) {
        this.homeUserIdComentario = homeUserIdComentario;
    }
}
