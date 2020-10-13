package mx.com.cx.view.login;

import java.sql.SQLException;
import java.util.ResourceBundle;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import mx.com.cx.dto.UsuarioDTO;
import mx.com.cx.service.login.LoginService;
import mx.com.cx.util.Faces;
import org.apache.log4j.Logger;

@Named
@RequestScoped
public class Login extends Faces {

    @EJB
    private LoginService service;
    private final HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
    private final Logger log = Logger.getLogger(this.getClass());
    private UsuarioDTO usuario;

    @PostConstruct
    public void init() {
        usuario = new UsuarioDTO();
    }

    public String acceso() {
        try {
            if (service.validaAcceso(usuario)) {
                usuario = service.configuraUsuario(usuario);
                if (usuario == null) {
                    mensajes(FacesMessage.SEVERITY_WARN, "Acceso Sistema", "Clave de Usuario y/o Clave de Acceso Incorrectos");
                    return "";
                } else {
                    session.setAttribute(ResourceBundle.getBundle("RecursosSistema").getString("USUARIO_SESION"), usuario);
                    mensajes(FacesMessage.SEVERITY_INFO, "Acceso a sistema correcto", "Bienvenido " + usuario.getNombreUsuario());
                    session.setAttribute(ResourceBundle.getBundle("RecursosSistema").getString("NOMBREMODULO_SESION"), "Inicio");
                    return "inicio";
                }
            } else {
                mensajes(FacesMessage.SEVERITY_WARN, "Acceso Sistema", "Clave de Usuario y/o Clave de Acceso Incorrectos");
                return "";
            }
        } catch (SQLException ex) {
            log.error(actividad("LOGIN", "INICIO", usuario.getIdUsuario(),"acceso(): " + ex.getMessage()));
            return "";
        }
    }

    public UsuarioDTO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDTO usuario) {
        this.usuario = usuario;
    }

}