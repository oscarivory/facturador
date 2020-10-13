package mx.com.cx.view.configuracion.umbrales;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
import mx.com.cx.dto.UmbralesDTO;
import mx.com.cx.dto.UsuarioDTO;
import mx.com.cx.util.Faces;
import org.apache.log4j.Logger;

@Named(value = "ventas")
@ViewScoped
public class Ventas extends Faces implements Serializable {

    private final HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
    private final Logger log = Logger.getLogger(this.getClass());
    private UsuarioDTO usuario;
    private List<UmbralesDTO> list;
    private List<UmbralesDTO> filter;
    private UmbralesDTO select;

    @PostConstruct
    public void init() {
        usuario = (UsuarioDTO) session.getAttribute("USUARIO");
        list = new ArrayList<>();
        list.add(new UmbralesDTO(1, "Abandono de Llamadas", "Corporativo", "InBound", "<= 5 %"));
        list.add(new UmbralesDTO(2, "Abandono de Llamadas (Llamadas cortadas en <10 seg.)", "Corporativo", "InBound", "<= 3 %"));
        list.add(new UmbralesDTO(3, "Tiempo de conversación", "Corporativo", "InBound", ">= 90 %"));
        list.add(new UmbralesDTO(4, "Transferencia de Llamadas", "Corporativo", "InBound", "<= 15 %"));
        list.add(new UmbralesDTO(5, "Tiempo promedio de llamada (minutos/segundos)", "Corporativo", "InBound", ">= 3 MIN. <=10 MIN."));
        list.add(new UmbralesDTO(6, "Tiempo promedio de respuesta en segundos (Velocidad de contestación)", "Corporativo", "InBound", "<= 15 SEG."));
        list.add(new UmbralesDTO(7, "Llamadas Atendidas en Tiempo Óptimo (<20 seg.)", "Guatemala", "InBound", ">= 80 %"));
        list.add(new UmbralesDTO(8, "Llamadas Atendidas en Tiempo Óptimo (<20 seg.)", "Ecuador", "InBound", ">= 80 %"));
        list.add(new UmbralesDTO(9, "Llamadas Atendidas en Tiempo Óptimo (<10 seg.)", "Perú HFC", "InBound", ">= 85 %"));
        list.add(new UmbralesDTO(10, "Llamadas Atendidas en Tiempo Óptimo (<20 seg.)", "Colombia", "InBound", ">= 80 %"));
        list.add(new UmbralesDTO(11, "Llamadas Atendidas en Tiempo Óptimo (<60 seg.)", "Claro Brasil", "InBound", ">= 90 %"));
        list.add(new UmbralesDTO(12, "Llamadas Atendidas en Tiempo Óptimo (<10 seg.)", "Brasil Net", "InBound", ">= 90 %"));
        list.add(new UmbralesDTO(13, "Llamadas Atendidas en Tiempo Óptimo (<30 seg.)", "República Dominicana", "InBound", ">= 80 %"));
        list.add(new UmbralesDTO(14, "Llamadas Atendidas en Tiempo Óptimo (<40 seg.)", "Argentina", "InBound", ">= 70 %"));
        list.add(new UmbralesDTO(15, "Llamadas Atendidas en Tiempo Óptimo (<10 seg.)", "Chile", "InBound", ">= 85 %"));
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

}