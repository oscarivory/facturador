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
import mx.com.cx.models.FacturaTelcel;

/**
 *
 * @author fernandezra
 */
@ManagedBean(name = "vTelcel")
@ViewScoped
public class ValidacionesTelcel {
    
    private List<FacturaTelcel> facturas = new ArrayList<FacturaTelcel>();

    public void consultaFacturas(){
        FacturaTelcel f1 = new FacturaTelcel();
        f1.setFecha("10/09/2019");
        f1.setZona("AMX");
        f1.setOperacionAmx("Telcel");
        f1.setRoamingPartner("AT&T");
        f1.setpOrigen("MEX");
        f1.setpDestino("USA");
        f1.setAnsiIn(0);
        f1.setAnsiOut(0);
        f1.setItuIn(0);
        f1.setItuOut(0);
        f1.setTotalIn(0);
        f1.setTotalOut(0);
        f1.setCostoOut(0);
        
        facturas.add(f1);
        
        FacturaTelcel f2 = new FacturaTelcel();
        f2.setFecha("12/01/2019");
        f2.setZona("AMX");
        f2.setOperacionAmx("Telcel");
        f2.setRoamingPartner("AT&T");
        f2.setpOrigen("MEX");
        f2.setpDestino("USA");
        f2.setAnsiIn(0);
        f2.setAnsiOut(0);
        f2.setItuIn(0);
        f2.setItuOut(0);
        f2.setTotalIn(0);
        f2.setTotalOut(0);
        f2.setCostoOut(0);
        
        facturas.add(f2);
        
        
        
        
    }
    
    public List<FacturaTelcel> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<FacturaTelcel> facturas) {
        this.facturas = facturas;
    }
    
    
    
}
