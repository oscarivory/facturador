package mx.com.cx.dto;

public class CatPerfilDTO {
    
    private int idPerfil;
    private String perfil;

    public CatPerfilDTO(){}
    
    public CatPerfilDTO(int idPerfil, String perfil) {
        this.idPerfil = idPerfil;
        this.perfil = perfil;
    }

    public int getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

}