package mx.com.cx.view.reportes.callcenter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import mx.com.cx.dto.UsuarioDTO;
import mx.com.cx.dto.reportes.callcenter.FormularioCalidadDTO;
import mx.com.cx.dto.reportes.callcenter.SeccionesIndicadorDTO;
import mx.com.cx.util.Faces;
import org.apache.log4j.Logger;

@Named(value = "formulario")
@ViewScoped
public class FormularioCalidad extends Faces implements Serializable {

    //private final HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
    private final Logger log = Logger.getLogger(this.getClass());
    private UsuarioDTO usuario;
    private List<SeccionesIndicadorDTO> list;

    @PostConstruct
    public void init() {
        //usuario = (UsuarioDTO) session.getAttribute("USUARIO");
        list = new ArrayList<SeccionesIndicadorDTO>();
        SeccionesIndicadorDTO indicadores = new SeccionesIndicadorDTO("SATISFACCIÓN DEL CLIENTE");
        List<FormularioCalidadDTO> indicadoresList = new ArrayList<>();
        indicadoresList.add(new FormularioCalidadDTO("Call Center Servicio", "71.1", 3, 1,">= 90 %"));
        indicadoresList.add(new FormularioCalidadDTO("Oficinas de Atención", "84.0", 2, 2,">= 90 %"));
        indicadoresList.add(new FormularioCalidadDTO("Funcionalidad del servicio(s)", "90.0", 1, 2,">= 90 %"));
        indicadoresList.add(new FormularioCalidadDTO("Precio", "58.0", 2, 1,">= 90 %"));
        indicadores.setIndicadores(indicadoresList);
        list.add(indicadores);
    }

    public List<SeccionesIndicadorDTO> getList() {
        return list;
    }

    public void setList(List<SeccionesIndicadorDTO> list) {
        this.list = list;
    }

}
