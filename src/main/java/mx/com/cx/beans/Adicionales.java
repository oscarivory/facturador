/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.cx.beans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import mx.com.cx.models.Adicional;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author fernandezra
 */
@ManagedBean(name="bAdicionales")
@ViewScoped
public class Adicionales {
    
    private List <Adicional> adicionales = new ArrayList<Adicional>();

    public Adicionales(){
        Adicional ad1 = new Adicional();
        ad1.setDescripcion("Adicional 1");
        ad1.setCosto(2.3f);
        adicionales.add(ad1);
        
        Adicional ad2 = new Adicional();
        ad2.setDescripcion("Adicional 2");
        ad2.setCosto(5.5f);
        adicionales.add(ad2);
        
        Adicional ad3 = new Adicional();
        ad3.setDescripcion("Adicional 3");
        ad3.setCosto(10.0f);
        adicionales.add(ad3);
        
        Adicional ad4 = new Adicional();
        ad4.setDescripcion("Adicional 4");
        ad4.setCosto(25.5f);
        adicionales.add(ad4);
    }
    
    /**
     * @return the adicionales
     */
    public List <Adicional> getAdicionales() {
        return adicionales;
    }

    /**
     * @param adicionales the adicionales to set
     */
    public void setAdicionales(List <Adicional> adicionales) {
        this.adicionales = adicionales;
    }
    
    
    public void onAddNew() {
       Adicional adn = new Adicional();
        adn.setDescripcion("Adicional n");
        adn.setCosto(1f);
        adicionales.add(adn);
    }
    
  
    public void onRowEdit(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Car Edited", ((Adicional) event.getObject()).getDescripcion());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edit Cancelled", ((Adicional) event.getObject()).getDescripcion());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
 
    
    
}
