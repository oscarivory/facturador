/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.cx.beans;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import mx.com.cx.models.Car;

/**
 *
 * @author fernandezra
 */
@ManagedBean(name="tabbed")
public class TabbedView {
     
    private List<Car> cars;
 
    @PostConstruct
    public void init() {
        cars = new ArrayList<Car>();
        cars.add(new Car("Y25YIH5", "Fiat", 2014, "Black", 10000, true));
        cars.add(new Car("JHF261G", "BMW", 2013, "Blue", 50000, true));
        cars.add(new Car("HSFY23H", "Ford", 2012, "Black", 35000, false));
        cars.add(new Car("GMDK353", "Volvo", 2014, "White", 40000, true));
        cars.add(new Car("345GKM5", "Jaguar", 2011, "Gray", 48000, false));
    }
     
    public List<Car> getCars() {
        return cars;
    }
     
  /*  public void onTabChange(TabChangeEvent event) {
        FacesMessage msg = new FacesMessage("Tab Changed", "Active Tab: " + event.getTab().getTitle());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }*/
         
   /* public void onTabClose(TabCloseEvent event) {
        FacesMessage msg = new FacesMessage("Tab Closed", "Closed tab: " + event.getTab().getTitle());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }*/
}