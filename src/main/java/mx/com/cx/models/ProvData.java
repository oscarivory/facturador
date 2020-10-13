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
public class ProvData {
    private String roamingPartner;
    private String origCountry;
    private String destCountry;
    private int ansiTrans;
    private int ituTrans;
    private int otherSharedRange;
    private int otherNotFound;
    private int     totalMsus;
    private int     procFacturador;
    private int     dif;

    public String getRoamingPartner() {
        return roamingPartner;
    }

    public void setRoamingPartner(String roamingPartner) {
        this.roamingPartner = roamingPartner;
    }

    public String getOrigCountry() {
        return origCountry;
    }

    public void setOrigCountry(String origCountry) {
        this.origCountry = origCountry;
    }

    public String getDestCountry() {
        return destCountry;
    }

    public void setDestCountry(String destCountry) {
        this.destCountry = destCountry;
    }

    public int getAnsiTrans() {
        return ansiTrans;
    }

    public void setAnsiTrans(int ansiTrans) {
        this.ansiTrans = ansiTrans;
    }

    public int getItuTrans() {
        return ituTrans;
    }

    public void setItuTrans(int ituTrans) {
        this.ituTrans = ituTrans;
    }

    public int getOtherSharedRange() {
        return otherSharedRange;
    }

    public void setOtherSharedRange(int otherSharedRange) {
        this.otherSharedRange = otherSharedRange;
    }

    public int getOtherNotFound() {
        return otherNotFound;
    }

    public void setOtherNotFound(int otherNotFound) {
        this.otherNotFound = otherNotFound;
    }

    public int getTotalMsus() {
        return totalMsus;
    }

    public void setTotalMsus(int totalMsus) {
        this.totalMsus = totalMsus;
    }

    public int getProcFacturador() {
        return procFacturador;
    }

    public void setProcFacturador(int procFacturador) {
        this.procFacturador = procFacturador;
    }

    public int getDif() {
        return dif;
    }

    public void setDif(int dif) {
        this.dif = dif;
    }

}