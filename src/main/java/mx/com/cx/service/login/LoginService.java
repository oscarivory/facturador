package mx.com.cx.service.login;

import java.sql.SQLException;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import mx.com.cx.dao.login.LoginDAOInterface;
import mx.com.cx.dto.UsuarioDTO;

@Stateless
public class LoginService {

    @EJB
    LoginDAOInterface dao;

    public boolean validaAcceso(UsuarioDTO usuario) throws SQLException{
        //return dao.validarAcceso(usuario);
        
        if(usuario.getClaveUsuario().equals("Administrador") && usuario.getClaveAcceso().equals("2238Mj3")){return true;}
        else {return false;}
    }

    public UsuarioDTO configuraUsuario(UsuarioDTO usuario) throws SQLException {
        
        UsuarioDTO user = new UsuarioDTO();

    user.setIdUsuario(1); 
    user.setNombreUsuario("RAFAEL FERNANDEZ");
    user.setClaveUsuario("991123");
    user.setClaveAcceso("");
    user.setEmail("");
    user.setPuesto("");
    
        return  user;
        //return dao.configuracionUsuario(usuario);
    }

}