package mx.com.cx.view.seguridad;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
import mx.com.cx.dto.UsuarioDTO;
import mx.com.cx.util.Faces;
import org.apache.log4j.Logger;
import org.primefaces.event.SelectEvent;

@Named(value = "usuarios")
@ViewScoped
public class Usuarios extends Faces implements Serializable {

    private final HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
    private final Logger log = Logger.getLogger(this.getClass());
    private UsuarioDTO usuario;
    private List<UsuarioDTO> list;
    private List<UsuarioDTO> filter;
    private UsuarioDTO select;
    private String nombre;

    @PostConstruct
    public void init() {
        usuario = (UsuarioDTO) session.getAttribute("USUARIO");
        list = new ArrayList<>();
        list.add(new UsuarioDTO(1,"Soporte Hitss","soporte.hitss",1));
        list.add(new UsuarioDTO(2,"Abad Roxanna","roxaba",1));
        list.add(new UsuarioDTO(3,"Aguilar Castillo Fabian Edson","fabedson",1));
        list.add(new UsuarioDTO(4,"Aguilar Guadamuz Manuel Alfredo","manalaggua",0));
        list.add(new UsuarioDTO(5,"Alejandra Ramirez Nayla","naaleram",0));
        list.add(new UsuarioDTO(6,"Alvarado Luz","lalvarado",1));
        list.add(new UsuarioDTO(7,"Conde Gallego Deysi del Pilar","condede",1));
        list.add(new UsuarioDTO(8,"Escobar SAC Christian","escobarch",0));
        list.add(new UsuarioDTO(9,"Gonzalez Tamara Cintia","gonzaleztacin",0));
        list.add(new UsuarioDTO(10,"Hernandez Sanchez Yarib","hernandezyasa",1));
        list.add(new UsuarioDTO(11,"Soporte Hitss","soporte.hitss",1));
        list.add(new UsuarioDTO(12,"Abad Roxanna","roxaba",1));
        list.add(new UsuarioDTO(13,"Aguilar Castillo Fabian Edson","fabedson",1));
        list.add(new UsuarioDTO(14,"Aguilar Guadamuz Manuel Alfredo","manalaggua",0));
        list.add(new UsuarioDTO(15,"Alejandra Ramirez Nayla","naaleram",0));
        list.add(new UsuarioDTO(16,"Alvarado Luz","lalvarado",1));
        list.add(new UsuarioDTO(17,"Conde Gallego Deysi del Pilar","condede",1));
        list.add(new UsuarioDTO(18,"Escobar SAC Christian","escobarch",0));
        list.add(new UsuarioDTO(19,"Gonzalez Tamara Cintia","gonzaleztacin",0));
        list.add(new UsuarioDTO(20,"Hernandez Sanchez Yarib","hernandezyasa",1));
    }

    public List<String> complete(String query) {
        List<String> results = new ArrayList<String>();
        for(int i = 0; i < 10; i++) {
            results.add(query + i);
        }
        return results;
    }

    public void onItemSelect(SelectEvent event) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Item Selected", event.getObject().toString()));
    }

    public List<UsuarioDTO> getList() {
        return list;
    }

    public void setList(List<UsuarioDTO> list) {
        this.list = list;
    }

    public List<UsuarioDTO> getFilter() {
        return filter;
    }

    public void setFilter(List<UsuarioDTO> filter) {
        this.filter = filter;
    }

    public UsuarioDTO getSelect() {
        return select;
    }

    public void setSelect(UsuarioDTO select) {
        this.select = select;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}