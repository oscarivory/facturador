package mx.com.cx.dto;

public class IndicadoresDTO {

    private int idIndicador;
    private String indicador;
    private boolean disponibilidad;

    public IndicadoresDTO() {}

    public IndicadoresDTO(int idIndicador, String indicador, boolean disponibilidad) {
        this.idIndicador = idIndicador;
        this.indicador = indicador;
        this.disponibilidad = disponibilidad;
    }

    public int getIdIndicador() {
        return idIndicador;
    }

    public void setIdIndicador(int idIndicador) {
        this.idIndicador = idIndicador;
    }

    public String getIndicador() {
        return indicador;
    }

    public void setIndicador(String indicador) {
        this.indicador = indicador;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

}