package mx.com.cx.view.configuracion.indicadores.callcenter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
import mx.com.cx.dto.IndicadoresDTO;
import mx.com.cx.dto.UmbralesDTO;
import mx.com.cx.dto.UsuarioDTO;
import mx.com.cx.util.Faces;
import org.apache.log4j.Logger;

@Named(value = "callcenterventas")
@ViewScoped
public class CallCenterVentas extends Faces implements Serializable {

    private final HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
    private final Logger log = Logger.getLogger(this.getClass());
    private UsuarioDTO usuario;
    private List<UmbralesDTO> list;
    private List<IndicadoresDTO> indicadores;
    private List<UmbralesDTO> filter;
    private UmbralesDTO select;

    @PostConstruct
    public void init() {
        usuario = (UsuarioDTO) session.getAttribute("USUARIO");
        list = new ArrayList<>();
        indicadores = new ArrayList<>();
        list.add(new UmbralesDTO(1, "Abandono de Llamadas", "Corporativo", "InBound", "ENE, FEB, MAR, ABR, MAY, JUN, JUL, AGO, SEP, OCT, NOV, DIC"));
        list.add(new UmbralesDTO(2, "Abandono de Llamadas (Llamadas cortadas en <10 seg.)", "Corporativo", "InBound", "ENE, FEB, MAR, ABR, MAY, JUN, JUL, AGO, SEP, OCT, NOV, DIC"));
        list.add(new UmbralesDTO(3, "Tiempo de conversación", "Corporativo", "InBound", "ENE, FEB, MAR, ABR, MAY, JUN, JUL, AGO, SEP, OCT, NOV, DIC"));
        list.add(new UmbralesDTO(4, "Transferencia de Llamadas", "Corporativo", "InBound", "ENE, FEB, MAR, ABR, MAY, JUN, JUL, AGO, SEP, OCT, NOV, DIC"));
        list.add(new UmbralesDTO(5, "Tiempo promedio de llamada (minutos/segundos)", "Corporativo", "InBound", "ENE, FEB, MAR, ABR, MAY, JUN, JUL, AGO, SEP, OCT, NOV, DIC"));
        list.add(new UmbralesDTO(6, "Tiempo promedio de respuesta en segundos (Velocidad de contestación)", "Corporativo", "InBound", "ENE, FEB, MAR, ABR, MAY, JUN, JUL, AGO, SEP, OCT, NOV, DIC"));
        list.add(new UmbralesDTO(7, "Llamadas Atendidas en Tiempo Óptimo (<20 seg.)", "Guatemala", "InBound", "ENE, FEB, MAR, ABR, MAY, JUN, JUL, AGO, SEP, OCT, NOV, DIC"));
        list.add(new UmbralesDTO(8, "Llamadas Atendidas en Tiempo Óptimo (<20 seg.)", "Ecuador", "InBound", "ENE, FEB, MAR, ABR, MAY, JUN, JUL, AGO, SEP, OCT, NOV, DIC"));
        list.add(new UmbralesDTO(9, "Llamadas Atendidas en Tiempo Óptimo (<10 seg.)", "Perú HFC", "InBound", "ENE, FEB, MAR, ABR, MAY, JUN, JUL, AGO, SEP, OCT, NOV, DIC"));
        list.add(new UmbralesDTO(10, "Llamadas Atendidas en Tiempo Óptimo (<20 seg.)", "Colombia", "InBound", "ENE, FEB, MAR, ABR, MAY, JUN, JUL, AGO, SEP, OCT, NOV, DIC"));
        list.add(new UmbralesDTO(11, "Llamadas Atendidas en Tiempo Óptimo (<60 seg.)", "Claro Brasil", "InBound", "ENE, FEB, MAR, ABR, MAY, JUN, JUL, AGO, SEP, OCT, NOV, DIC"));
        list.add(new UmbralesDTO(12, "Llamadas Atendidas en Tiempo Óptimo (<10 seg.)", "Brasil Net", "InBound", "ENE, FEB, MAR, ABR, MAY, JUN, JUL, AGO, SEP, OCT, NOV, DIC"));
        list.add(new UmbralesDTO(13, "Llamadas Atendidas en Tiempo Óptimo (<30 seg.)", "República Dominicana", "InBound", "ENE, FEB, MAR, ABR, MAY, JUN, JUL, AGO, SEP, OCT, NOV, DIC"));
        list.add(new UmbralesDTO(14, "Llamadas Atendidas en Tiempo Óptimo (<40 seg.)", "Argentina", "InBound", "ENE, FEB, MAR, ABR, MAY, JUN, JUL, AGO, SEP, OCT, NOV, DIC"));
        list.add(new UmbralesDTO(15, "Llamadas Atendidas en Tiempo Óptimo (<10 seg.)", "Chile", "InBound", "ENE, FEB, MAR, ABR, MAY, JUN, JUL, AGO, SEP, OCT, NOV, DIC"));
        indicadores.add(new IndicadoresDTO(1,"Enero",false));
        indicadores.add(new IndicadoresDTO(2,"Febrero",true));
        indicadores.add(new IndicadoresDTO(3,"Marzo",false));
        indicadores.add(new IndicadoresDTO(4,"Abril",true));
        indicadores.add(new IndicadoresDTO(5,"Mayo",false));
        indicadores.add(new IndicadoresDTO(6,"Junio",true));
        indicadores.add(new IndicadoresDTO(7,"Julio",false));
        indicadores.add(new IndicadoresDTO(8,"Agosto",true));
        indicadores.add(new IndicadoresDTO(9,"Septiembre",false));
        indicadores.add(new IndicadoresDTO(10,"Octubre",true));
        indicadores.add(new IndicadoresDTO(11,"Noviembre",false));
        indicadores.add(new IndicadoresDTO(12,"Diciembre",true));
        log.info(actividad("CATALOGOS", "GRUPOS", usuario.getIdUsuario(), "init()"));
    }

    public List<UmbralesDTO> getList() {
        return list;
    }

    public void setList(List<UmbralesDTO> list) {
        this.list = list;
    }

    public List<UmbralesDTO> getFilter() {
        return filter;
    }

    public void setFilter(List<UmbralesDTO> filter) {
        this.filter = filter;
    }

    public UmbralesDTO getSelect() {
        return select;
    }

    public void setSelect(UmbralesDTO select) {
        this.select = select;
    }

    public List<IndicadoresDTO> getIndicadores() {
        return indicadores;
    }

}