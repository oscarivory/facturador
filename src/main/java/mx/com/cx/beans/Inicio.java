package mx.com.cx.beans;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
import mx.com.cx.dto.InicioCtrl;
import mx.com.cx.util.Faces;
import org.apache.log4j.Logger;

@Named(value = "inicio")
@ViewScoped
public class Inicio extends Faces implements Serializable {

    private final HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
    private final Logger log = Logger.getLogger(this.getClass());
    private InicioCtrl ctrl;
    private int tipo;

    @PostConstruct
    public void init() {
        ctrl = new InicioCtrl(false, false, false,false, false, false);
    }

    public void actualizaForm() {
        if (tipo == 1) {
            ctrl.setPanelGridUno(true);
            ctrl.setPanelGridDos(false);
            ctrl.setPanelGridTres(false);
            ctrl.setPanelGridCuatro(false);
            ctrl.setPanelGridCinco(false);
            ctrl.setPanelGridSeis(false);
        } else if (tipo == 2) {
            ctrl.setPanelGridDos(true);
            ctrl.setPanelGridUno(false);
            ctrl.setPanelGridTres(false);
            ctrl.setPanelGridCuatro(false);
            ctrl.setPanelGridCinco(false);
            ctrl.setPanelGridSeis(false);
        } else if (tipo == 3) {
            ctrl.setPanelGridTres(true);
            ctrl.setPanelGridUno(false);
            ctrl.setPanelGridDos(false);
            ctrl.setPanelGridCuatro(false);
            ctrl.setPanelGridCinco(false);
            ctrl.setPanelGridSeis(false);
        }
        else if (tipo == 4) {
            ctrl.setPanelGridTres(false);
            ctrl.setPanelGridUno(false);
            ctrl.setPanelGridDos(false);
            ctrl.setPanelGridCuatro(true);
            ctrl.setPanelGridCinco(false);
            ctrl.setPanelGridSeis(false);
        }
        else if (tipo == 5) {
            ctrl.setPanelGridTres(false);
            ctrl.setPanelGridUno(false);
            ctrl.setPanelGridDos(false);
            ctrl.setPanelGridCuatro(false);
            ctrl.setPanelGridCinco(true);
            ctrl.setPanelGridSeis(false);
        }
        else if (tipo == 6) {
            ctrl.setPanelGridTres(false);
            ctrl.setPanelGridUno(false);
            ctrl.setPanelGridDos(false);
            ctrl.setPanelGridCuatro(false);
            ctrl.setPanelGridCinco(false);
            ctrl.setPanelGridSeis(true);
        }
    }

    public InicioCtrl getCtrl() {
        return ctrl;
    }

    public void setCtrl(InicioCtrl ctrl) {
        this.ctrl = ctrl;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

}
