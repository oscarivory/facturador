package mx.com.cx.dao.login;

import java.sql.SQLException;
import mx.com.cx.dto.UsuarioDTO;

public interface LoginDAOInterface {

    boolean validarAcceso(UsuarioDTO usuario) throws SQLException;
    
    UsuarioDTO configuracionUsuario(UsuarioDTO usuario) throws SQLException;

}