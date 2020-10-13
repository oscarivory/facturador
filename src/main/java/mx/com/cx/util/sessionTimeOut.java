package mx.com.cx.util;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@RequestScoped
public class sessionTimeOut {
    
    public void onIdle() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
    }
 
    public void onActive() {
         FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
    }

}