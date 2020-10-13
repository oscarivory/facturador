/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.cx.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import mx.com.cx.models.Contrato;
import mx.com.cx.beans.CarService;
import mx.com.cx.models.Car;
import org.primefaces.PrimeFaces;
import org.primefaces.event.SelectEvent;
/**
 *
 * @author fernandezra
 */
@ManagedBean(name="dtBasicView")
@ViewScoped
public class BasicView implements Serializable {
     
    private List<Contrato> contratos = new ArrayList<Contrato>();
    private String[] selectedConsoles = {"AF","EF"};
    private String[] selectedHM = {"SS7","diamiter","GTPC"}; 
    
    
     
    public List<Contrato> getContratos() {
        return contratos;
    }

    public void setContratos(List<Contrato> contratos) {
        this.contratos = contratos;
    }
    
    public BasicView() {
      
        System.out.print("entra a constructor");
        
  }
    @PostConstruct
    public void init() {
        Contrato c1 = new Contrato();
        c1.setEmpresa("Embratel");
        c1.setComtrato("EMBM1901");
        c1.setInicio("01/03/2019");
        c1.setFin("28/02/2020");
        c1.setEstatus("ACTIVO");
        //c1.setDoctos(new ArrayList<Contrato>());
        getContratos().add(c1);
        
        Contrato c2 = new Contrato();
        c2.setEmpresa("Net Servicios");
        c2.setComtrato("NETM1802");
        c2.setInicio("01/11/2018");
        c2.setFin("31/10/2019");
        c2.setEstatus("ACTIVO");
        //c2.setDoctos(new ArrayList<Contrato>());
        getContratos().add(c2);
        
        Contrato c3 = new Contrato();
        c3.setEmpresa("Telgua");
        c3.setComtrato("TLGRM1803");
        c3.setInicio("01/09/2019");
        c3.setFin("30/09/2019");
        c3.setEstatus("ACTIVO");
        //c1.setDoctos(new ArrayList<Contrato>());
        getContratos().add(c3);
        
        Contrato c4 = new Contrato();
        c4.setEmpresa("Claro Argentina");
        c4.setComtrato("CLAM1901");
        c4.setInicio("01/01/2018");
        c4.setFin("31/12/2019");
        c4.setEstatus("ACTIVO");
        //c1.setDoctos(new ArrayList<Contrato>());
        getContratos().add(c4);
        
        Contrato c5 = new Contrato();
        c5.setEmpresa("AMX Paraguay");
        c5.setComtrato("APYRM1902");
        c5.setInicio("01/09/2019");
        c5.setFin("30/09/2019");
        c5.setEstatus("ACTIVO");
        //c1.setDoctos(new ArrayList<Contrato>());
        getContratos().add(c5);
    }
    
    
    public void viewCars() {
        Map<String,Object> options = new HashMap<String, Object>();
        options.put("modal", true);
        options.put("width", "90%");
        options.put("height", 340);
        options.put("contentWidth", "100%");
        options.put("contentHeight", "100%");
        PrimeFaces.current().dialog().openDynamic("detalleContrato", options, null);
    }
     
    public void viewCarsCustomized() {
        Map<String,Object> options = new HashMap<String, Object>();
        options.put("modal", true);
        options.put("width", "90%");
        options.put("height", 340);
        options.put("contentWidth", "100%");
        options.put("contentHeight", "100%");
        options.put("headerElement", "customheader");
         
        PrimeFaces.current().dialog().openDynamic("detalleContrato", options, null);
    }
     
    public void chooseCar() {
        Map<String,Object> options = new HashMap<String, Object>();
          options.put("modal", true);
        options.put("width", "90%");
        options.put("height", 340);
        options.put("contentWidth", "100%");
        options.put("contentHeight", "100%");
      
        PrimeFaces.current().dialog().openDynamic("detalleContrato", options, null);
    }
     
    public void chooseCarValida() {
        Map<String,Object> options = new HashMap<String, Object>();
          options.put("modal", true);
        options.put("width", "90%");
        options.put("height", 340);
        options.put("contentWidth", "100%");
        options.put("contentHeight", "100%");
      
        PrimeFaces.current().dialog().openDynamic("detalleContratoValida", options, null);
    }
    
    public void onCarChosen(SelectEvent event) {
        Car car = (Car) event.getObject();
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Contrato", "Id:" + car.getId());
         
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
     
    public void showMessage() {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "What we do in life", "Echoes in eternity.");
         
        PrimeFaces.current().dialog().showMessageDynamic(message);
    }

    /**
     * @return the selectedConsoles
     */
    public String[] getSelectedConsoles() {
        return selectedConsoles;
    }

    /**
     * @param selectedConsoles the selectedConsoles to set
     */
    public void setSelectedConsoles(String[] selectedConsoles) {
        this.setSelectedConsoles(selectedConsoles);
    }

    /**
     * @return the selectedHM
     */
    public String[] getSelectedHM() {
        return selectedHM;
    }

    /**
     * @param selectedHM the selectedHM to set
     */
    public void setSelectedHM(String[] selectedHM) {
        this.selectedHM = selectedHM;
    }
    
    
    
}
