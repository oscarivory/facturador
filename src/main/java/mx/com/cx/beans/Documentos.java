/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.cx.beans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import mx.com.cx.models.documento;

/**
 *
 * @author fernandezra
 */

@ManagedBean(name="dtDoctos")
@ViewScoped
public class Documentos {
    
    private List<documento> documentos = new ArrayList<documento>();
    
    public Documentos(){
        documento d1 = new documento();
        d1.setNombre("Embratel_012019.pdf");
        d1.setUbicacion("url");
        documentos.add(d1);
        
        documento d2 = new documento();
        d2.setNombre("Embratel_egresos_012019.pdf");
        d2.setUbicacion("url");
        documentos.add(d2);
        
        documento d3 = new documento();
        d3.setNombre("brasil_ingresos_012019.pdf");
        d3.setUbicacion("url");
        documentos.add(d3);
    }

    /**
     * @return the documentos
     */
    public List<documento> getDocumentos() {
        return documentos;
    }

    /**
     * @param documentos the documentos to set
     */
    public void setDocumentos(List<documento> documentos) {
        this.documentos = documentos;
    }
    
}
