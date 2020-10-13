/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.cx.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import mx.com.cx.models.cargaFactura;

/**
 *
 * @author fernandezra
 */
@ManagedBean(name = "cargarRFacturas")
@ViewScoped
public class cargarRFacturas implements Serializable {

    private List<cargaFactura> facturas = new ArrayList<cargaFactura>();
    private List<cargaFactura> pagos = new ArrayList<cargaFactura>();

    
    public void consultarFacturas(){
     cargaFactura cf = new cargaFactura();

        cf.setFechaFactura("22/08/2019");
        cf.setPeriodoFactura("01/07/2019");
        cf.setFactura("3033507131");
        cf.setSolicitante("10000006");
        cf.setTadig("CHSLM");
        cf.setNombre("CLARO CHILE S.A.");
        cf.setMontoTotal("42.22");
        cf.setMon("USD");
        cf.setServicio("SS7");
        cf.setNoDocto("6016207567");
        cf.setTC("197522");

        facturas.add(cf);
        
        
        cargaFactura cf2 = new cargaFactura();

        cf2.setFechaFactura("22/08/2019");
        cf2.setPeriodoFactura("01/07/2019");
        cf2.setFactura("3033507131");
        cf2.setSolicitante("10000006");
        cf2.setTadig("CHSLM");
        cf2.setNombre("CLARO CHILE S.A.");
        cf2.setMontoTotal("42.22");
        cf2.setMon("USD");
        cf2.setServicio("SS7");
        cf2.setNoDocto("6016207567");
        cf2.setTC("197522");

        facturas.add(cf2);
        
        cargaFactura cf3 = new cargaFactura();

        cf3.setFechaFactura("22/08/2019");
        cf3.setPeriodoFactura("01/07/2019");
        cf3.setFactura("3033507131");
        cf3.setSolicitante("10000006");
        cf3.setTadig("CHSLM");
        cf3.setNombre("CLARO CHILE S.A.");
        cf3.setMontoTotal("42.22");
        cf3.setMon("USD");
        cf3.setServicio("SS7");
        cf3.setNoDocto("6016207567");
        cf3.setTC("197522");

        facturas.add(cf3);
        
        cargaFactura cf4 = new cargaFactura();

        cf4.setFechaFactura("22/08/2019");
        cf4.setPeriodoFactura("01/07/2019");
        cf4.setFactura("3033507131");
        cf4.setSolicitante("10000006");
        cf4.setTadig("CHSLM");
        cf4.setNombre("CLARO CHILE S.A.");
        cf4.setMontoTotal("42.22");
        cf4.setMon("USD");
        cf4.setServicio("SS7");
        cf4.setNoDocto("6016207567");
        cf4.setTC("197522");

        facturas.add(cf4);
        
        cargaFactura cf5 = new cargaFactura();

        cf5.setFechaFactura("22/08/2019");
        cf5.setPeriodoFactura("01/07/2019");
        cf5.setFactura("3033507131");
        cf5.setSolicitante("10000006");
        cf5.setTadig("CHSLM");
        cf5.setNombre("CLARO CHILE S.A.");
        cf5.setMontoTotal("42.22");
        cf5.setMon("USD");
        cf5.setServicio("SS7");
        cf5.setNoDocto("6016207567");
        cf5.setTC("197522");

        facturas.add(cf5);
        
        cargaFactura cf6 = new cargaFactura();

        cf6.setFechaFactura("22/08/2019");
        cf6.setPeriodoFactura("01/07/2019");
        cf6.setFactura("3033507131");
        cf6.setSolicitante("10000006");
        cf6.setTadig("CHSLM");
        cf6.setNombre("CLARO CHILE S.A.");
        cf6.setMontoTotal("42.22");
        cf6.setMon("USD");
        cf6.setServicio("SS7");
        cf6.setNoDocto("6016207567");
        cf6.setTC("197522");

        facturas.add(cf6);
        
        cargaFactura cf7 = new cargaFactura();

        cf7.setFechaFactura("22/08/2019");
        cf7.setPeriodoFactura("01/07/2019");
        cf7.setFactura("3033507131");
        cf7.setSolicitante("10000006");
        cf7.setTadig("CHSLM");
        cf7.setNombre("CLARO CHILE S.A.");
        cf7.setMontoTotal("42.22");
        cf7.setMon("USD");
        cf7.setServicio("SS7");
        cf7.setNoDocto("6016207567");
        cf7.setTC("197522");

        facturas.add(cf7);
        
        cargaFactura cf8 = new cargaFactura();

        cf8.setFechaFactura("22/08/2019");
        cf8.setPeriodoFactura("01/07/2019");
        cf8.setFactura("3033507131");
        cf8.setSolicitante("10000006");
        cf8.setTadig("CHSLM");
        cf8.setNombre("CLARO CHILE S.A.");
        cf8.setMontoTotal("42.22");
        cf8.setMon("USD");
        cf8.setServicio("SS7");
        cf8.setNoDocto("6016207567");
        cf8.setTC("197522");

        facturas.add(cf8);
        
        cargaFactura cf9 = new cargaFactura();

        cf9.setFechaFactura("22/08/2019");
        cf9.setPeriodoFactura("01/07/2019");
        cf9.setFactura("3033507131");
        cf9.setSolicitante("10000006");
        cf9.setTadig("CHSLM");
        cf9.setNombre("CLARO CHILE S.A.");
        cf9.setMontoTotal("42.22");
        cf9.setMon("USD");
        cf9.setServicio("SS7");
        cf9.setNoDocto("6016207567");
        cf9.setTC("197522");

        facturas.add(cf9);
        
        cargaFactura cf0 = new cargaFactura();

        cf0.setFechaFactura("22/08/2019");
        cf0.setPeriodoFactura("01/07/2019");
        cf0.setFactura("3033507131");
        cf0.setSolicitante("10000006");
        cf0.setTadig("CHSLM");
        cf0.setNombre("CLARO CHILE S.A.");
        cf0.setMontoTotal("42.22");
        cf0.setMon("USD");
        cf0.setServicio("SS7");
        cf0.setNoDocto("6016207567");
        cf0.setTC("197522");

        facturas.add(cf0);
    
    }
    public void registrarPago(){
    
         cargaFactura cf = new cargaFactura();

        cf.setFechaFactura("22/08/2019");
        cf.setPeriodoFactura("01/07/2019");
        cf.setFactura("3033507131");
        
        cf.setNotaCredito("326896371287");
        cf.setTotalFacturado(500.23f);
        cf.setInteresPorc(80);
        cf.setInteresMonto(234.34f);
        cf.setInteresCobrar(456.65f);
        
        
        cf.setSolicitante("10000006");
        cf.setTadig("CHSLM");
        cf.setNombre("CLARO CHILE S.A.");
        cf.setMontoTotal("42.22");
        cf.setMon("USD");
        cf.setServicio("SS7");
        cf.setNoDocto("6016207567");
        cf.setTC("197522");

        pagos.add(cf);
        
        
        cargaFactura cf2 = new cargaFactura();

        cf2.setFechaFactura("22/08/2019");
        cf2.setPeriodoFactura("01/07/2019");
        cf2.setFactura("3033507131");
        cf2.setSolicitante("10000006");
        cf2.setTadig("CHSLM");
        cf2.setNombre("CLARO CHILE S.A.");
        cf2.setMontoTotal("42.22");
        cf2.setMon("USD");
        cf2.setServicio("SS7");
        cf2.setNoDocto("6016207567");
        cf2.setTC("197522");

        cf2.setNotaCredito("326896371287");
        cf2.setTotalFacturado(500.23f);
        cf2.setInteresPorc(80);
        cf2.setInteresMonto(234.34f);
        cf2.setInteresCobrar(456.65f);
        
        
        pagos.add(cf2);
        
        cargaFactura cf3 = new cargaFactura();

        cf3.setFechaFactura("22/08/2019");
        cf3.setPeriodoFactura("01/07/2019");
        cf3.setFactura("3033507131");
        cf3.setSolicitante("10000006");
        cf3.setTadig("CHSLM");
        cf3.setNombre("CLARO CHILE S.A.");
        cf3.setMontoTotal("42.22");
        cf3.setMon("USD");
        cf3.setServicio("SS7");
        cf3.setNoDocto("6016207567");
        cf3.setTC("197522");

        cf3.setNotaCredito("326896371287");
        cf3.setTotalFacturado(500.23f);
        cf3.setInteresPorc(80);
        cf3.setInteresMonto(234.34f);
        cf3.setInteresCobrar(456.65f);
        
        pagos.add(cf3);
        
        cargaFactura cf4 = new cargaFactura();

        cf4.setFechaFactura("22/08/2019");
        cf4.setPeriodoFactura("01/07/2019");
        cf4.setFactura("3033507131");
        cf4.setSolicitante("10000006");
        cf4.setTadig("CHSLM");
        cf4.setNombre("CLARO CHILE S.A.");
        cf4.setMontoTotal("42.22");
        cf4.setMon("USD");
        cf4.setServicio("SS7");
        cf4.setNoDocto("6016207567");
        cf4.setTC("197522");

        cf4.setNotaCredito("326896371287");
        cf4.setTotalFacturado(500.23f);
        cf4.setInteresPorc(80);
        cf4.setInteresMonto(234.34f);
        cf4.setInteresCobrar(456.65f);
        pagos.add(cf4);
        
        cargaFactura cf5 = new cargaFactura();

        cf5.setFechaFactura("22/08/2019");
        cf5.setPeriodoFactura("01/07/2019");
        cf5.setFactura("3033507131");
        cf5.setSolicitante("10000006");
        cf5.setTadig("CHSLM");
        cf5.setNombre("CLARO CHILE S.A.");
        cf5.setMontoTotal("42.22");
        cf5.setMon("USD");
        cf5.setServicio("SS7");
        cf5.setNoDocto("6016207567");
        cf5.setTC("197522");

        cf5.setNotaCredito("326896371287");
        cf5.setTotalFacturado(500.23f);
        cf5.setInteresPorc(80);
        cf5.setInteresMonto(234.34f);
        cf5.setInteresCobrar(456.65f);
        pagos.add(cf5);
        
        cargaFactura cf6 = new cargaFactura();

        cf6.setFechaFactura("22/08/2019");
        cf6.setPeriodoFactura("01/07/2019");
        cf6.setFactura("3033507131");
        cf6.setSolicitante("10000006");
        cf6.setTadig("CHSLM");
        cf6.setNombre("CLARO CHILE S.A.");
        cf6.setMontoTotal("42.22");
        cf6.setMon("USD");
        cf6.setServicio("SS7");
        cf6.setNoDocto("6016207567");
        cf6.setTC("197522");

        cf6.setNotaCredito("326896371287");
        cf6.setTotalFacturado(500.23f);
        cf6.setInteresPorc(80);
        cf6.setInteresMonto(234.34f);
        cf6.setInteresCobrar(456.65f);
        pagos.add(cf6);
        
        cargaFactura cf7 = new cargaFactura();

        cf7.setFechaFactura("22/08/2019");
        cf7.setPeriodoFactura("01/07/2019");
        cf7.setFactura("3033507131");
        cf7.setSolicitante("10000006");
        cf7.setTadig("CHSLM");
        cf7.setNombre("CLARO CHILE S.A.");
        cf7.setMontoTotal("42.22");
        cf7.setMon("USD");
        cf7.setServicio("SS7");
        cf7.setNoDocto("6016207567");
        cf7.setTC("197522");
cf7.setNotaCredito("326896371287");
        cf7.setTotalFacturado(500.23f);
        cf7.setInteresPorc(80);
        cf7.setInteresMonto(234.34f);
        cf7.setInteresCobrar(456.65f);
        pagos.add(cf7);
        
        cargaFactura cf8 = new cargaFactura();

        cf8.setFechaFactura("22/08/2019");
        cf8.setPeriodoFactura("01/07/2019");
        cf8.setFactura("3033507131");
        cf8.setSolicitante("10000006");
        cf8.setTadig("CHSLM");
        cf8.setNombre("CLARO CHILE S.A.");
        cf8.setMontoTotal("42.22");
        cf8.setMon("USD");
        cf8.setServicio("SS7");
        cf8.setNoDocto("6016207567");
        cf8.setTC("197522");

        
        pagos.add(cf8);
        
        cargaFactura cf9 = new cargaFactura();

        cf9.setFechaFactura("22/08/2019");
        cf9.setPeriodoFactura("01/07/2019");
        cf9.setFactura("3033507131");
        cf9.setSolicitante("10000006");
        cf9.setTadig("CHSLM");
        cf9.setNombre("CLARO CHILE S.A.");
        cf9.setMontoTotal("42.22");
        cf9.setMon("USD");
        cf9.setServicio("SS7");
        cf9.setNoDocto("6016207567");
        cf9.setTC("197522");

        cf9.setNotaCredito("326896371287");
        cf9.setTotalFacturado(500.23f);
        cf9.setInteresPorc(80);
        cf9.setInteresMonto(234.34f);
        cf9.setInteresCobrar(456.65f);
        
        
        pagos.add(cf9);
        
        cargaFactura cf0 = new cargaFactura();

        cf0.setFechaFactura("22/08/2019");
        cf0.setPeriodoFactura("01/07/2019");
        cf0.setFactura("3033507131");
        cf0.setSolicitante("10000006");
        cf0.setTadig("CHSLM");
        cf0.setNombre("CLARO CHILE S.A.");
        cf0.setMontoTotal("42.22");
        cf0.setMon("USD");
        cf0.setServicio("SS7");
        cf0.setNoDocto("6016207567");
        cf0.setTC("197522");

        cf0.setNotaCredito("326896371287");
        cf0.setTotalFacturado(500.23f);
        cf0.setInteresPorc(80);
        cf0.setInteresMonto(234.34f);
        cf0.setInteresCobrar(456.65f);
        
        pagos.add(cf0);
    }
    
    
    /**
     * Creates a new instance of cargarRFacturas
     */
    public cargarRFacturas() {
       consultarFacturas();
       registrarPago();
    }

    
    
    
    
    
    public List<cargaFactura> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<cargaFactura> facturas) {
        this.facturas = facturas;
    }

    public List<cargaFactura> getPagos() {
        return pagos;
    }

    public void setPagos(List<cargaFactura> pagos) {
        this.pagos = pagos;
    }

}
