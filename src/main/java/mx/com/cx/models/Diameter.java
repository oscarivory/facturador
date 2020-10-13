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
public class Diameter {
private String fecha;
private String zona;
private String operacionAmx;
private String roamingPartner;
private String paisOrigen;
private String paisDestino;
private int transaccionesRecibidas;
private int transaccionesEnviadas;
private int totalTransaccionesRecibidas;
private int totalTransaccionesEnviadas;
private float Costo;


    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getOperacionAmx() {
        return operacionAmx;
    }

    public void setOperacionAmx(String operacionAmx) {
        this.operacionAmx = operacionAmx;
    }

    public String getRoamingPartner() {
        return roamingPartner;
    }

    public void setRoamingPartner(String roamingPartner) {
        this.roamingPartner = roamingPartner;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getPaisDestino() {
        return paisDestino;
    }

    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }

    public int getTransaccionesRecibidas() {
        return transaccionesRecibidas;
    }

    public void setTransaccionesRecibidas(int transaccionesRecibidas) {
        this.transaccionesRecibidas = transaccionesRecibidas;
    }

    public int getTransaccionesEnviadas() {
        return transaccionesEnviadas;
    }

    public void setTransaccionesEnviadas(int transaccionesEnviadas) {
        this.transaccionesEnviadas = transaccionesEnviadas;
    }

    public int getTotalTransaccionesRecibidas() {
        return totalTransaccionesRecibidas;
    }

    public void setTotalTransaccionesRecibidas(int totalTransaccionesRecibidas) {
        this.totalTransaccionesRecibidas = totalTransaccionesRecibidas;
    }

    public int getTotalTransaccionesEnviadas() {
        return totalTransaccionesEnviadas;
    }

    public void setTotalTransaccionesEnviadas(int totalTransaccionesEnviadas) {
        this.totalTransaccionesEnviadas = totalTransaccionesEnviadas;
    }

    public float getCosto() {
        return Costo;
    }

    public void setCosto(float Costo) {
        this.Costo = Costo;
    }

    
}
