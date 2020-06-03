package app.rsr.com.iropa;

import java.io.Serializable;

public class BDUsuarioAdmin implements Serializable {
    private String nombreUserAdmin;
    private String nombre;
    private String apellido;
    private String email;
    private String password;
    private String fechaNacimiento;
    private int imagenPerfil;
    private String tipo;

    public void BDUsuarioAdmin(){

    }
    public BDUsuarioAdmin(String nombreUserAdmin, String nombre, String apellido, String email, String password, String fechaNacimiento, int imagenPerfil, String tipo) {
        this.nombreUserAdmin = nombreUserAdmin;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.password = password;
        this.fechaNacimiento = fechaNacimiento;
        this.imagenPerfil = imagenPerfil;
        this.tipo = tipo;
    }

    public String getNombreUserAdmin() {
        return nombreUserAdmin;
    }

    public void setNombreUserAdmin(String nombreUserAdmin) {
        this.nombreUserAdmin = nombreUserAdmin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getImagenPerfil() {
        return imagenPerfil;
    }

    public void setImagenPerfil(int imagenPerfil) {
        this.imagenPerfil = imagenPerfil;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
