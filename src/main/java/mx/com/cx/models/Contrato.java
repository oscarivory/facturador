/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.cx.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fernandezra
 */
public class Contrato {
    
    String empresa;
    String comtrato;
    String inicio;
    String fin;
    String estatus;
    List<String> doctos = new ArrayList<String>();

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getComtrato() {
        return comtrato;
    }

    public void setComtrato(String comtrato) {
        this.comtrato = comtrato;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public List<String> getDoctos() {
        return doctos;
    }

    public void setDoctos(List<String> doctos) {
        this.doctos = doctos;
    }
    
}
