package mx.com.cx.dto;

public class UmbralesDTO {

    private int idUmbral;
    private String indicador;
    private String empresa;
    private String gestion;
    private String umbral;

    public UmbralesDTO(){}

    public UmbralesDTO(int idUmbral, String indicador, String empresa, String gestion, String umbral) {
        this.idUmbral = idUmbral;
        this.indicador = indicador;
        this.empresa = empresa;
        this.gestion = gestion;
        this.umbral = umbral;
    }

    public int getIdUmbral() {
        return idUmbral;
    }

    public void setIdUmbral(int idUmbral) {
        this.idUmbral = idUmbral;
    }

    public String getIndicador() {
        return indicador;
    }

    public void setIndicador(String indicador) {
        this.indicador = indicador;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    public String getUmbral() {
        return umbral;
    }

    public void setUmbral(String umbral) {
        this.umbral = umbral;
    }

}