package app.rsr.com.iropa;

public class ContainerHomeAdministrador {
    private int homeAdministradorIdImagenUser;
    private String homeAdministradorIdNombreUserTitulo;
    private int homeAdministradorIdImagenPublicacion;
    private String homeAdministradorIdNombreUsuerComentario;
    private String homeAdministradorIdComentario;

    public void ContainerHomeAdministrador(){

    }
    public ContainerHomeAdministrador(int homeAdministradorIdImagenUser, String homeAdministradorIdNombreUserTitulo, int homeAdministradorIdImagenPublicacion, String homeAdministradorIdNombreUsuerComentario, String homeAdministradorIdComentario) {
        this.homeAdministradorIdImagenUser = homeAdministradorIdImagenUser;
        this.homeAdministradorIdNombreUserTitulo = homeAdministradorIdNombreUserTitulo;
        this.homeAdministradorIdImagenPublicacion = homeAdministradorIdImagenPublicacion;
        this.homeAdministradorIdNombreUsuerComentario = homeAdministradorIdNombreUsuerComentario;
        this.homeAdministradorIdComentario = homeAdministradorIdComentario;
    }

    public int getHomeAdministradorIdImagenUser() {
        return homeAdministradorIdImagenUser;
    }

    public void setHomeAdministradorIdImagenUser(int homeAdministradorIdImagenUser) {
        this.homeAdministradorIdImagenUser = homeAdministradorIdImagenUser;
    }

    public String getHomeAdministradorIdNombreUserTitulo() {
        return homeAdministradorIdNombreUserTitulo;
    }

    public void setHomeAdministradorIdNombreUserTitulo(String homeAdministradorIdNombreUserTitulo) {
        this.homeAdministradorIdNombreUserTitulo = homeAdministradorIdNombreUserTitulo;
    }

    public int getHomeAdministradorIdImagenPublicacion() {
        return homeAdministradorIdImagenPublicacion;
    }

    public void setHomeAdministradorIdImagenPublicacion(int homeAdministradorIdImagenPublicacion) {
        this.homeAdministradorIdImagenPublicacion = homeAdministradorIdImagenPublicacion;
    }

    public String getHomeAdministradorIdNombreUsuerComentario() {
        return homeAdministradorIdNombreUsuerComentario;
    }

    public void setHomeAdministradorIdNombreUsuerComentario(String homeAdministradorIdNombreUsuerComentario) {
        this.homeAdministradorIdNombreUsuerComentario = homeAdministradorIdNombreUsuerComentario;
    }

    public String getHomeAdministradorIdComentario() {
        return homeAdministradorIdComentario;
    }

    public void setHomeAdministradorIdComentario(String homeAdministradorIdComentario) {
        this.homeAdministradorIdComentario = homeAdministradorIdComentario;
    }
}
