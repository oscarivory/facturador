package mx.com.cx.service.presentaciones;

import javax.ejb.Stateless;
import mx.com.cx.dto.presentaciones.PresentacionDTO;
import org.primefaces.model.CheckboxTreeNode;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

@Stateless
public class VisorenLineaService {

    public TreeNode createDocuments() {
        TreeNode root = new DefaultTreeNode(new PresentacionDTO("Files", "-", "Folder"), null);
		
		TreeNode documents = new DefaultTreeNode(new PresentacionDTO("Categoría 1", "-", "Folder"), root);
		TreeNode pictures = new DefaultTreeNode(new PresentacionDTO("Categoría 2", "-", "Folder"), root);
		TreeNode movies = new DefaultTreeNode(new PresentacionDTO("Categoría 3", "-", "Folder"), root);
		
		TreeNode work = new DefaultTreeNode(new PresentacionDTO("Sub categoría 1", "-", "Folder"), documents);
		TreeNode primefaces = new DefaultTreeNode(new PresentacionDTO("Sub categoría 2", "-", "Folder"), documents);
		
		//PresentacionDTOs
		TreeNode expenses = new DefaultTreeNode("document", new PresentacionDTO("Expenses.ppt", "30 KB", "Word Document"), work);
		TreeNode resume = new DefaultTreeNode("document", new PresentacionDTO("Resume.ppt", "10 KB", "Word Document"), work);
		TreeNode refdoc = new DefaultTreeNode("document", new PresentacionDTO("RefDoc.ppt", "40 KB", "Pages Document"), primefaces);
		
		//Pictures
		TreeNode barca = new DefaultTreeNode("picture", new PresentacionDTO("barcelona.ppt", "30 KB", "JPEG Image"), pictures);
		TreeNode primelogo = new DefaultTreeNode("picture", new PresentacionDTO("logo.ppt", "45 KB", "JPEG Image"), pictures);
		TreeNode optimus = new DefaultTreeNode("picture", new PresentacionDTO("optimusprime.ppt", "96 KB", "PNG Image"), pictures);
		
		//Movies
		TreeNode pacino = new DefaultTreeNode(new PresentacionDTO("Al Pacino", "-", "Folder"), movies);
		TreeNode deniro = new DefaultTreeNode(new PresentacionDTO("Robert De Niro", "-", "Folder"), movies);
		
		TreeNode scarface = new DefaultTreeNode("movie", new PresentacionDTO("Scarface", "15 GB", "Movie File"), pacino);
		TreeNode carlitosWay = new DefaultTreeNode("movie", new PresentacionDTO("Carlitos' Way", "24 GB", "Movie File"), pacino);
		
		TreeNode goodfellas = new DefaultTreeNode("movie", new PresentacionDTO("Goodfellas", "23 GB", "Movie File"), deniro);
		TreeNode untouchables = new DefaultTreeNode("movie", new PresentacionDTO("Untouchables", "17 GB", "Movie File"), deniro);
        
        return root;
    }
    
    public TreeNode createCheckboxDocuments() {
        TreeNode root = new CheckboxTreeNode(new PresentacionDTO("Files", "-", "Folder"), null);
		
		TreeNode documents = new CheckboxTreeNode(new PresentacionDTO("PresentacionDTOs", "-", "Folder"), root);
		TreeNode pictures = new CheckboxTreeNode(new PresentacionDTO("Pictures", "-", "Folder"), root);
		TreeNode movies = new CheckboxTreeNode(new PresentacionDTO("Movies", "-", "Folder"), root);
		
		TreeNode work = new CheckboxTreeNode(new PresentacionDTO("Work", "-", "Folder"), documents);
		TreeNode primefaces = new CheckboxTreeNode(new PresentacionDTO("PrimeFaces", "-", "Folder"), documents);
		
		//PresentacionDTOs
		TreeNode expenses = new CheckboxTreeNode("document", new PresentacionDTO("Expenses.doc", "30 KB", "Word Document"), work);
		TreeNode resume = new CheckboxTreeNode("document", new PresentacionDTO("Resume.doc", "10 KB", "Word Document"), work);
		TreeNode refdoc = new CheckboxTreeNode("document", new PresentacionDTO("RefDoc.pages", "40 KB", "Pages Document"), primefaces);
		
		//Pictures
		TreeNode barca = new CheckboxTreeNode("picture", new PresentacionDTO("barcelona.jpg", "30 KB", "JPEG Image"), pictures);
		TreeNode primelogo = new CheckboxTreeNode("picture", new PresentacionDTO("logo.jpg", "45 KB", "JPEG Image"), pictures);
		TreeNode optimus = new CheckboxTreeNode("picture", new PresentacionDTO("optimusprime.png", "96 KB", "PNG Image"), pictures);
		
		//Movies
		TreeNode pacino = new CheckboxTreeNode(new PresentacionDTO("Al Pacino", "-", "Folder"), movies);
		TreeNode deniro = new CheckboxTreeNode(new PresentacionDTO("Robert De Niro", "-", "Folder"), movies);
		
		TreeNode scarface = new CheckboxTreeNode("movie", new PresentacionDTO("Scarface", "15 GB", "Movie File"), pacino);
		TreeNode carlitosWay = new CheckboxTreeNode("movie", new PresentacionDTO("Carlitos' Way", "24 GB", "Movie File"), pacino);
		
		TreeNode goodfellas = new CheckboxTreeNode("movie", new PresentacionDTO("Goodfellas", "23 GB", "Movie File"), deniro);
		TreeNode untouchables = new CheckboxTreeNode("movie", new PresentacionDTO("Untouchables", "17 GB", "Movie File"), deniro);
        
        return root;
    }

}