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
public class FacturaTelcel {
    private String fecha;
    private String zona;
    private String operacionAmx;
    private String roamingPartner;
    private String pOrigen;
    private String pDestino;
    private int ansiIn;
    private int ansiOut;
    private int ituIn;
    private int ituOut;
    private int totalIn;
    private int totalOut;
    private float costoOut;

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

    public String getpOrigen() {
        return pOrigen;
    }

    public void setpOrigen(String pOrigen) {
        this.pOrigen = pOrigen;
    }

    public String getpDestino() {
        return pDestino;
    }

    public void setpDestino(String pDestino) {
        this.pDestino = pDestino;
    }

    public int getAnsiIn() {
        return ansiIn;
    }

    public void setAnsiIn(int ansiIn) {
        this.ansiIn = ansiIn;
    }

    public int getAnsiOut() {
        return ansiOut;
    }

    public void setAnsiOut(int ansiOut) {
        this.ansiOut = ansiOut;
    }

    public int getItuIn() {
        return ituIn;
    }

    public void setItuIn(int ituIn) {
        this.ituIn = ituIn;
    }

    public int getItuOut() {
        return ituOut;
    }

    public void setItuOut(int ituOut) {
        this.ituOut = ituOut;
    }

    public int getTotalIn() {
        return totalIn;
    }

    public void setTotalIn(int totalIn) {
        this.totalIn = totalIn;
    }

    public int getTotalOut() {
        return totalOut;
    }

    public void setTotalOut(int totalOut) {
        this.totalOut = totalOut;
    }

    public float getCostoOut() {
        return costoOut;
    }

    public void setCostoOut(float costoOut) {
        this.costoOut = costoOut;
    }
}
