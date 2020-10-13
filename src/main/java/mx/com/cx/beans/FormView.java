/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.cx.beans;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import mx.com.cx.models.MyFile;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;


/**
 *
 * @author fernandezra
 */
@ApplicationScoped
@ManagedBean
public class FormView {
    private StreamedContent streamedContent;
	private List<MyFile> files = new ArrayList<MyFile>();
	private String selectedFileName;

	@PostConstruct
	public void init() {

		MyFile myFile1 = new MyFile(1, "1.pdf");
		MyFile myFile2 = new MyFile(2, "2.pdf");
		getFiles().add(myFile1);
		getFiles().add(myFile2);

	}

	public List<MyFile> getFiles() {
		return files;
	}

	public String getSelectedFileName() {
		return selectedFileName;
	}

	public void setSelectedFileName(String selectedFileName) {
		this.selectedFileName = selectedFileName;
	}

	public StreamedContent StreamedContent() {
		return getStreamedContent();
	}

	public void setStreamedContent(StreamedContent streamedContent) {
		this.streamedContent = streamedContent;
	}

	public void onRowSelect(SelectEvent event) {
		String fileName = ((MyFile) event.getObject()).getName();

		// we use this for refill the stream
		setSelectedFileName(fileName);

		createStream(fileName);

	}

	private StreamedContent createStream(String fileName) {
		setStreamedContent(new DefaultStreamedContent(getData(fileName), "application/pdf", "downloaded_" + fileName));
		return getStreamedContent();
	}

	private InputStream getData(String fileName) {

		// pdf files under src\main\resources
		File file = new File(System.getProperty("user.dir") + "\\documentosPdfs\\" + fileName);

		InputStream is = null;
		try {
			is = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return is;

	}

	// refill the stream
	public void refreshStream() {
		createStream(getSelectedFileName());
	}

	public String generateRandomIdForNotCaching() {
		return java.util.UUID.randomUUID().toString();
	}

    /**
     * @return the streamedContent
     */
    public StreamedContent getStreamedContent() {
        return createStream("xhtml-basic.pdf");
        //return streamedContent;
    }

    /**
     * @param files the files to set
     */
    public void setFiles(List<MyFile> files) {
        this.files = files;
    }

}
