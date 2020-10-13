package mx.com.cx.dto.reportes.callcenter;

import java.io.Serializable;

public class FormularioCalidadDTO implements Serializable {

    private String indicador;
    private String dato;
    private int color;
    private int icon;
    private String practica;

    public FormularioCalidadDTO() {}

    public FormularioCalidadDTO(String indicador, String dato, int color, int icon, String practica) {
        this.indicador = indicador;
        this.dato = dato;
        this.color = color;
        this.icon = icon;
        this.practica = practica;
    }

    public String getIndicador() {
        return indicador;
    }

    public void setIndicador(String indicador) {
        this.indicador = indicador;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getPractica() {
        return practica;
    }

    public void setPractica(String practica) {
        this.practica = practica;
    }

}