/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.cx.beans;

import java.io.InputStream;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

/**
 *
 * @author fernandezra
 */
@ManagedBean
public class FileDownloadView {
     
    private StreamedContent filePdf;
    private StreamedContent fileExcel;
     
    public FileDownloadView() {        
        InputStream streamPdf = FacesContext.getCurrentInstance().getExternalContext().getResourceAsStream("/resources/demo/EjemplosDownload/detallesPDF.pdf");
        InputStream streamExcel = FacesContext.getCurrentInstance().getExternalContext().getResourceAsStream("/resources/demo/EjemplosDownload/detallesPDF.pdf");
        filePdf = new DefaultStreamedContent(streamPdf, "application/pdf", "detalle.pdf");
        fileExcel = new DefaultStreamedContent(streamExcel, "image/jpg", "downloaded_boromir.jpg");
    }
 
    public StreamedContent getFilePdf() {
        return filePdf;
    }
    
     public StreamedContent getFileExcel() {
        return fileExcel;
    }
    
}
