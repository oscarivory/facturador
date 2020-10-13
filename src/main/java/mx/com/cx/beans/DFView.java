/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.cx.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import mx.com.cx.models.Car;
import org.primefaces.PrimeFaces;
import org.primefaces.event.SelectEvent;

/**
 *
 * @author fernandezra
 */
@ManagedBean(name = "dfView")
public class DFView {
     
    private List<String> selectedConsoles = new ArrayList<String>();
    
    public void viewCars() {
        Map<String,Object> options = new HashMap<String, Object>();
        options.put("resizable", false);
        PrimeFaces.current().dialog().openDynamic("verDocumentos", options, null);
    }
     
    
    
    public void viewCarsCustomized() {
        Map<String,Object> options = new HashMap<String, Object>();
        options.put("modal", true);
        options.put("width", 640);
        options.put("height", 340);
        options.put("contentWidth", "100%");
        options.put("contentHeight", "100%");
        options.put("headerElement", "customheader");
         
        PrimeFaces.current().dialog().openDynamic("verDocumentos", options, null);
    }
     
    public void chooseCar() {
        Map<String,Object> options = new HashMap<String, Object>();
        options.put("resizable", true);
        options.put("draggable", false);
        options.put("modal", true);
        PrimeFaces.current().dialog().openDynamic("verDocumentos", options, null);
    }
     
    public void onCarChosen(SelectEvent event) {
        Car car = (Car) event.getObject();
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Car Selected", "Id:" + car.getId());
         
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
     
    public void showMessage() {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "What we do in life", "Echoes in eternity.");
         
        PrimeFaces.current().dialog().showMessageDynamic(message);
    }

    public List<String> getSelectedConsoles() {
        return selectedConsoles;
    }

    public void setSelectedConsoles(List<String> selectedConsoles) {
        this.selectedConsoles = selectedConsoles;
    }
}