package mx.com.cx.dto.reportes.callcenter;

import java.util.List;

public class SeccionesIndicadorDTO {

    private String seccion;
    private List<FormularioCalidadDTO> indicadores;

    public SeccionesIndicadorDTO() {}

    public SeccionesIndicadorDTO(String seccion) {
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public List<FormularioCalidadDTO> getIndicadores() {
        return indicadores;
    }

    public void setIndicadores(List<FormularioCalidadDTO> indicadores) {
        this.indicadores = indicadores;
    }

}