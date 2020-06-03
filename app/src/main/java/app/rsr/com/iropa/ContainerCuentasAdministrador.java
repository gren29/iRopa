package app.rsr.com.iropa;

public class ContainerCuentasAdministrador {
    private String cuentaAdministradorNombreUser;
    private String cuentaAdministradorNombreCompleto;
    private String cuentaAdministradorEmail;

    public void ContainerCuentasAdministrador(){

    }

    public ContainerCuentasAdministrador(String cuentaAdministradorNombreUser, String cuentaAdministradorNombreCompleto, String cuentaAdministradorEmail) {
        this.cuentaAdministradorNombreUser = cuentaAdministradorNombreUser;
        this.cuentaAdministradorNombreCompleto = cuentaAdministradorNombreCompleto;
        this.cuentaAdministradorEmail = cuentaAdministradorEmail;
    }

    public String getCuentaAdministradorNombreUser() {
        return cuentaAdministradorNombreUser;
    }

    public void setCuentaAdministradorNombreUser(String cuentaAdministradorNombreUser) {
        this.cuentaAdministradorNombreUser = cuentaAdministradorNombreUser;
    }

    public String getCuentaAdministradorNombreCompleto() {
        return cuentaAdministradorNombreCompleto;
    }

    public void setCuentaAdministradorNombreCompleto(String cuentaAdministradorNombreCompleto) {
        this.cuentaAdministradorNombreCompleto = cuentaAdministradorNombreCompleto;
    }

    public String getCuentaAdministradorEmail() {
        return cuentaAdministradorEmail;
    }

    public void setCuentaAdministradorEmail(String cuentaAdministradorEmail) {
        this.cuentaAdministradorEmail = cuentaAdministradorEmail;
    }
}
