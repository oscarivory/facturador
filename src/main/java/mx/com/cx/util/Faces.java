package mx.com.cx.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ResourceBundle;
import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import org.primefaces.PrimeFaces;

public class Faces {

    public String actividad(String modulo, String menu, int idUsuario,String metodo) {
        String debug;
        ResourceBundle bundle = ResourceBundle.getBundle("opcionesdemenu");
        debug = " idUsuario " + idUsuario + " | " + bundle.getString(modulo) + " | " + bundle.getString(menu) + " | " + metodo;
        return debug;
    }

    public void mensajes(FacesMessage.Severity severity, String titulo, String mensaje) {
        FacesMessage msg = new FacesMessage(severity, titulo, mensaje);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void update(String componente) {
        PrimeFaces.current().ajax().update(componente);
    }

    public void execute(String componente) {
        PrimeFaces.current().executeScript(componente);
    }

    public void reset(String componente) {
        PrimeFaces.current().resetInputs(componente);
    }

    public String parameter(String componente) {
        ExternalContext contexto = FacesContext.getCurrentInstance().getExternalContext();
        return contexto.getInitParameter(componente);
    }

    public boolean isNumeric(String cadena){
        try{
            Long.parseLong(cadena);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }

    public boolean isFloat(String cadena){
        try{
            Float.parseFloat(cadena.replace(',', '.'));
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }

    public boolean isDate(String cadena){
        try{
            String replace;
            String str = cadena;
            replace = str.replace('-', '/');
            switch (cadena.length()) {
                case 10:
                    new SimpleDateFormat("dd/MM/yyyy").parse(replace);
                    break;
                case 8:
                    new SimpleDateFormat("dd/MM/yy").parse(replace);
                    break;
                default:
                    new SimpleDateFormat("dd/MM/yy").parse(cadena);
                    break;
            }
            return true;
        }catch(ParseException e){
            return false;
        }
    }

}