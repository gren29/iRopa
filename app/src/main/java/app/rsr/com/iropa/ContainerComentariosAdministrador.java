package app.rsr.com.iropa;

public class ContainerComentariosAdministrador {
    private String comentarioAdministradorNombreUser;
    private String comentarioAdministradorComentario;

    public void ContainerComentariosAdministrador(){

    }
    public ContainerComentariosAdministrador(String comentarioAdministradorNombreUser, String comentarioAdministradorComentario) {
        this.comentarioAdministradorNombreUser = comentarioAdministradorNombreUser;
        this.comentarioAdministradorComentario = comentarioAdministradorComentario;
    }

    public String getComentarioAdministradorNombreUser() {
        return comentarioAdministradorNombreUser;
    }

    public void setComentarioAdministradorNombreUser(String comentarioAdministradorNombreUser) {
        this.comentarioAdministradorNombreUser = comentarioAdministradorNombreUser;
    }

    public String getComentarioAdministradorComentario() {
        return comentarioAdministradorComentario;
    }

    public void setComentarioAdministradorComentario(String comentarioAdministradorComentario) {
        this.comentarioAdministradorComentario = comentarioAdministradorComentario;
    }
}
