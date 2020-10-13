package mx.com.cx.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.annotation.Resource;
import javax.sql.DataSource;
import org.apache.log4j.Logger;

public class Conexion {

//    @Resource(lookup = "SIMULADOR")
//    private DataSource dsOracle;
//    private final Logger log = Logger.getLogger(this.getClass());
//
//    public Connection getConnection() {
//        try {
//            if (dsOracle == null) {
//                throw new SQLException("No se encontro DataSource");
//            }
//            Connection conn = dsOracle.getConnection();
//            if (conn == null) {
//                throw new SQLException("No se pudo establecer una conexion");
//            }
//            return conn;
//
//        } catch (SQLException e) {
//            log.error("Error al conectar por medio de jdbc/Simulador");
//            log.error(e.getMessage());
//            return null;
//        }
//    }
//
//    public void closeResources(Connection conn, Statement stmt, ResultSet rs) {
//        if(rs != null){
//            try {
//                rs.close();
//            } catch (SQLException er) {
//                log.error(er.getMessage());
//            }
//        }
//        if(stmt != null){
//            try {
//                stmt.close();
//            } catch (SQLException es) {
//                log.error(es.getMessage());
//            }
//        }
//        if(conn != null){
//            try {
//                conn.close();
//            } catch (SQLException ec) {
//                log.error(ec.getMessage());
//            }
//        }
//    }
//
//    public void rollback(Connection conn) {
//        try {
//            conn.rollback();
//        } catch (SQLException es) {
//            log.error(es.getMessage());
//        }
//    }

}