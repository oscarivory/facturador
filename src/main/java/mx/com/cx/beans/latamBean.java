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

import mx.com.cx.models.FacturaLatam;

/**
 *
 * @author fernandezra
 */
@ManagedBean(name = "latamBean")
@ViewScoped
public class latamBean {

   

    private List<FacturaLatam> facturas;
    private List<FacturaLatam> facturasCostos;
    private FacturaLatam factura;
    /**
     * Creates a new instance of latamBean
     */
    public latamBean() {
        facturas = new ArrayList<FacturaLatam>();
        
        FacturaLatam f1 = new FacturaLatam();
        f1.setTipoFlujo("Ingreso");
        f1.setProceso("Normal");
        f1.setFecha("13/07/2018");
        f1.setRoamingPartner("Partner 1");
        f1.setServicio("SS7");
        f1.setRed("Off Net");
        f1.setEstatus("Definitivo");
        f1.setFactura("LATAM20190101");
        f1.setSentido("Inbound ");
        f1.setTier("Tarifa");
        f1.setMedida("MSUS");
        f1.setSubmedida("ANSI");
        f1.setUnidades(1.02f);
        f1.setTarifa(2);
        f1.setImporteAntesImp(3);
        f1.setImp1(3);
        f1.setImp2(2);
        f1.setImp3(1);
        f1.setTotalImp(9);
        f1.setImpAntesImpP(1);
        f1.setTotalImpP(2);
        f1.setdSinImp(3);
        f1.setdConImp(4);
        
        facturas.add(f1);
        
        FacturaLatam f2 = new FacturaLatam();
        f2.setTipoFlujo("Ingreso");
        f2.setProceso("Complem");
        f2.setFecha("14/07/2018");
        f2.setRoamingPartner("Partner 1");
        f2.setServicio("LTE");
        f2.setRed("On Net");
        f2.setEstatus("Definitivo");
        f2.setFactura("LATAM20190102");
        f2.setSentido("Outbound");
        f2.setTier("Tarifa");
        f2.setMedida("MSUS");
        f2.setSubmedida("ITU");
        f2.setUnidades(5.02f);
        f2.setTarifa(3);
        f2.setImporteAntesImp(2);
        f2.setImp1(6);
        f2.setImp2(2);
        f2.setImp3(12);
        f2.setTotalImp(29);
        f2.setImpAntesImpP(14);
        f2.setTotalImpP(25);
        f2.setdSinImp(36);
        f2.setdConImp(34);
        
        facturas.add(f2);
        
        
        FacturaLatam f3 = new FacturaLatam();
        f3.setTipoFlujo("Ingreso");
        f3.setProceso("Normal");
        f3.setFecha("13/07/2018");
        f3.setRoamingPartner("Partner 3");
        f3.setServicio("GRX");
        f3.setRed("On Net");
        f3.setEstatus("Definitivo");
        f3.setFactura("LATAM20190103");
        f3.setSentido("Inbound");
        f3.setTier("Tarifa");
        f3.setMedida("MSUS");
        f3.setSubmedida("ANSI");
        f3.setUnidades(6f);
        f3.setTarifa(34);
        f3.setImporteAntesImp(12);
        f3.setImp1(66);
        f3.setImp2(26);
        f3.setImp3(62);
        f3.setTotalImp(21);
        f3.setImpAntesImpP(64);
        f3.setTotalImpP(45);
        f3.setdSinImp(26);
        f3.setdConImp(24);
        
        facturas.add(f3);
        
        
        //.----------------------------------------.//
        
        facturasCostos = new ArrayList<FacturaLatam>();
        
        FacturaLatam f4 = new FacturaLatam();
        f4.setTipoFlujo("Costos");
        f4.setProceso("Conplem");
        f4.setFecha("13/07/2018");
        f4.setRoamingPartner("Partner 1");
        f4.setServicio("SS7");
        f4.setRed("Off Net");
        f4.setEstatus("Definitivo");
        f4.setFactura("LATAM20190101");
        f4.setSentido("Inbound ");
        f4.setTier("Tarifa");
        f4.setMedida("MSUS");
        f4.setSubmedida("ANSI");
        f4.setUnidades(1.02f);
        f4.setTarifa(2);
        f4.setImporteAntesImp(3);
        f4.setImp1(3);
        f4.setImp2(2);
        f4.setImp3(1);
        f4.setTotalImp(9);
        f4.setImpAntesImpP(1);
        f4.setTotalImpP(2);
        f4.setdSinImp(3);
        f4.setdConImp(4);
        
        facturasCostos.add(f4);
        
        FacturaLatam f5 = new FacturaLatam();
        f5.setTipoFlujo("Costos");
        f5.setProceso("Complem");
        f5.setFecha("14/07/2018");
        f5.setRoamingPartner("Partner 1");
        f5.setServicio("LTE");
        f5.setRed("On Net");
        f5.setEstatus("Definitivo");
        f5.setFactura("LATAM20190102");
        f5.setSentido("Outbound");
        f5.setTier("Tarifa");
        f5.setMedida("MSUS");
        f5.setSubmedida("ITU");
        f5.setUnidades(5.02f);
        f5.setTarifa(3);
        f5.setImporteAntesImp(2);
        f5.setImp1(6);
        f5.setImp2(2);
        f5.setImp3(12);
        f5.setTotalImp(29);
        f5.setImpAntesImpP(14);
        f5.setTotalImpP(25);
        f5.setdSinImp(36);
        f5.setdConImp(34);
        
        facturasCostos.add(f5);
        
        
        FacturaLatam f6 = new FacturaLatam();
        f6.setTipoFlujo("Costo");
        f6.setProceso("Normal");
        f6.setFecha("13/07/2018");
        f6.setRoamingPartner("Partner 3");
        f6.setServicio("GRX");
        f6.setRed("On Net");
        f6.setEstatus("Definitivo");
        f6.setFactura("LATAM20190103");
        f6.setSentido("Inbound");
        f6.setTier("Tarifa");
        f6.setMedida("MSUS");
        f6.setSubmedida("ANSI");
        f6.setUnidades(6f);
        f6.setTarifa(34);
        f6.setImporteAntesImp(12);
        f6.setImp1(66);
        f6.setImp2(26);
        f6.setImp3(62);
        f6.setTotalImp(21);
        f6.setImpAntesImpP(64);
        f6.setTotalImpP(45);
        f6.setdSinImp(26);
        f6.setdConImp(24);
        
        facturasCostos.add(f6);
        
        
        
        
        
        
        
        
        
    }


 public FacturaLatam getFactura() {
        return factura;
    }

    public void setFactura(FacturaLatam factura) {
        this.factura = factura;
    }

    public List<FacturaLatam> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<FacturaLatam> facturas) {
        this.facturas = facturas;
    }

    public List<FacturaLatam> getFacturasCostos() {
        return facturasCostos;
    }

    public void setFacturasCostos(List<FacturaLatam> facturasCostos) {
        this.facturasCostos = facturasCostos;
    }
    
}
