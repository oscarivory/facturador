package mx.com.cx.dto;

import java.util.List;

public class UsuarioDTO {

    private int idUsuario;
    private String nombreUsuario;
    private String claveUsuario;
    private String claveAcceso;
    private String email;
    private String puesto;
    private int compartido;
    private CatPerfilDTO perfil = new CatPerfilDTO();

    public UsuarioDTO(){}

    public UsuarioDTO(int idUsuario, String nombreUsuario, String claveUsuario, int compartido) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.claveUsuario = claveUsuario;
        this.compartido = compartido;
    }

    public UsuarioDTO(int idUsuario, String nombreUsuario, String claveUsuario, String claveAcceso, String email, String puesto) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.claveUsuario = claveUsuario;
        this.claveAcceso = claveAcceso;
        this.email = email;
        this.puesto = puesto;
    }

    public UsuarioDTO(int idUsuario, String nombreUsuario, String claveUsuario, String claveAcceso, CatPerfilDTO perfil) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.claveUsuario = claveUsuario;
        this.claveAcceso = claveAcceso;
        this.perfil = perfil;
    }

    public UsuarioDTO(int idUsuario, String nombreUsuario) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getClaveUsuario() {
        return claveUsuario;
    }

    public void setClaveUsuario(String claveUsuario) {
        this.claveUsuario = claveUsuario;
    }

    public String getClaveAcceso() {
        return claveAcceso;
    }

    public void setClaveAcceso(String claveAcceso) {
        this.claveAcceso = claveAcceso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getCompartido() {
        return compartido;
    }

    public void setCompartido(int compartido) {
        this.compartido = compartido;
    }

    public CatPerfilDTO getPerfil() {
        return perfil;
    }

    public void setPerfil(CatPerfilDTO perfil) {
        this.perfil = perfil;
    }

}