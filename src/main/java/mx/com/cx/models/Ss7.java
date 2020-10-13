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
public class Ss7 {
    
private String fecha; 
private String zona;
private String operacionAmx;
private String roamingPartner;
private String paisOrigen;
private String paisDestino;
private int ansiMsus;
private int ituMsus;
private int totalMsusInb;
private int totalMsusOut;
private float costoMsusOut;

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

    public int getAnsiMsus() {
        return ansiMsus;
    }

    public void setAnsiMsus(int ansiMsus) {
        this.ansiMsus = ansiMsus;
    }

    public int getItuMsus() {
        return ituMsus;
    }

    public void setItuMsus(int ituMsus) {
        this.ituMsus = ituMsus;
    }

    public int getTotalMsusInb() {
        return totalMsusInb;
    }

    public void setTotalMsusInb(int totalMsusInb) {
        this.totalMsusInb = totalMsusInb;
    }

    public int getTotalMsusOut() {
        return totalMsusOut;
    }

    public void setTotalMsusOut(int totalMsusOut) {
        this.totalMsusOut = totalMsusOut;
    }

    public float getCostoMsusOut() {
        return costoMsusOut;
    }

    public void setCostoMsusOut(float costoMsusOut) {
        this.costoMsusOut = costoMsusOut;
    }
    
    
}
