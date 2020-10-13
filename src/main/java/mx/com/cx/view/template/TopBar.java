package mx.com.cx.view.template;

import java.io.Serializable;
import java.util.ResourceBundle;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
import mx.com.cx.dto.UsuarioDTO;

@Named(value = "topBar")
@ViewScoped
public class TopBar implements Serializable {

    HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
    private UsuarioDTO usuario = new UsuarioDTO();

    @PostConstruct
    public void init() {
        if ((UsuarioDTO) session.getAttribute(ResourceBundle.getBundle("RecursosSistema").getString("USUARIO_SESION")) instanceof UsuarioDTO) {
            usuario = (UsuarioDTO) session.getAttribute(ResourceBundle.getBundle("RecursosSistema").getString("USUARIO_SESION"));
        }
    }

    public String cerrar() {
        session.invalidate();
        return "salir";
    }

    public UsuarioDTO getUsuario() {
        return usuario;
    }

}