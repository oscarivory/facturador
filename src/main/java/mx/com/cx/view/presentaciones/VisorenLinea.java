package mx.com.cx.view.presentaciones;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
import mx.com.cx.dto.UsuarioDTO;
import mx.com.cx.service.presentaciones.VisorenLineaService;
import mx.com.cx.util.Faces;
import org.apache.log4j.Logger;
import org.primefaces.model.TreeNode;

@Named(value = "visorenlinea")
@ViewScoped
public class VisorenLinea extends Faces implements Serializable {

    @EJB
    private VisorenLineaService service;
    private final HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
    private final Logger log = Logger.getLogger(this.getClass());
    private UsuarioDTO usuario;
    private TreeNode root1;
    private TreeNode root2;
    private TreeNode root3;
    private TreeNode selectedNode;
    private TreeNode[] selectedNodes1;
    private TreeNode[] selectedNodes2;

    @PostConstruct
    public void init() {
        usuario = (UsuarioDTO) session.getAttribute("USUARIO");
        root1 = service.createDocuments();
        root2 = service.createDocuments();
        root3 = service.createCheckboxDocuments();
    }

    public TreeNode getRoot1() {
        return root1;
    }

    public TreeNode getRoot2() {
        return root2;
    }

    public TreeNode getRoot3() {
        return root3;
    }

    public TreeNode getSelectedNode() {
        return selectedNode;
    }

    public void setSelectedNode(TreeNode selectedNode) {
        this.selectedNode = selectedNode;
    }

    public TreeNode[] getSelectedNodes1() {
        return selectedNodes1;
    }

    public void setSelectedNodes1(TreeNode[] selectedNodes1) {
        this.selectedNodes1 = selectedNodes1;
    }

    public TreeNode[] getSelectedNodes2() {
        return selectedNodes2;
    }

    public void setSelectedNodes2(TreeNode[] selectedNodes2) {
        this.selectedNodes2 = selectedNodes2;
    }

}
