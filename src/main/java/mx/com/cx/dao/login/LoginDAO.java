package mx.com.cx.dao.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.ejb.Stateless;
import mx.com.cx.dto.UsuarioDTO;


@Stateless
public class LoginDAO  implements LoginDAOInterface {

    @Override
    public boolean validarAcceso(UsuarioDTO usuario) throws SQLException {
     /*   Connection conn = getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (conn != null) {
            try {
                StringBuilder query = new StringBuilder();
                query.append("SELECT COUNT(1) ACCESO ");
                query.append("  FROM USUARIO U");
                query.append(" WHERE U.ESTATUS = 1 ");
                query.append("   AND U.CLAVEUSUARIO = ? ");
                query.append("   AND U.CLAVEACCESO = ENCRYPTDECRYPT.ENCRYPT(?)");
                ps = conn.prepareStatement(query.toString());
                ps.setString(1, usuario.getClaveUsuario());
                ps.setString(2, usuario.getClaveAcceso());
                rs = ps.executeQuery();
                rs.next();
                return (rs.getInt("ACCESO") > 0);
            } finally {
                closeResources(conn, ps, rs);
            }
        }
        return false;*/
     return true;
    }

    @Override
    public UsuarioDTO configuracionUsuario(UsuarioDTO usuario) throws SQLException {
        
        return new UsuarioDTO();
    }

}