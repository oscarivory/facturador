/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.cx.models;

/**
 *
 * @author fernandezra
 */
public class Grx {
    private String fecha;
private String operacionAmx;
private String puerto;
private int capacidadMbps;
private float costo;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getOperacionAmx() {
        return operacionAmx;
    }

    public void setOperacionAmxvAmx(String operacionAmx) {
        this.operacionAmx = operacionAmx;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public int getCapacidadMbps() {
        return capacidadMbps;
    }

    public void setCapacidadMbps(int capacidadMbps) {
        this.capacidadMbps = capacidadMbps;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

}
