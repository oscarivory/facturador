/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.cx.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import mx.com.cx.models.ExportPosicionesSAP;


/**
 *
 * @author fernandezra
 */
@ManagedBean(name = "exportSAP")
@ViewScoped
public class exportSAP implements Serializable {

    private List<ExportPosicionesSAP> layouts = new ArrayList<ExportPosicionesSAP>();

    /**
     * Creates a new instance of exportSAP
     */
    public exportSAP() {
        
        
        ExportPosicionesSAP lay1 = new ExportPosicionesSAP();
        
        //fila 1
        lay1.setS1("H");
        lay1.setS2("ZTA1");
        lay1.setS3("MX01");
        lay1.setS4("14");
        lay1.setS5("14");
        lay1.setS6("M101");
        lay1.setS7("11100431");
        //15 espacios
        lay1.setS23("USD");
        lay1.setS24("M27");
        lay1.setS25("1");
        // 1 espacio
        lay1.setS27("FACT GSM USAW6 DEL 01 AL 31 DE JULIO 2019");
        layouts.add(lay1);
        
        ExportPosicionesSAP lay2 = new ExportPosicionesSAP();
        //fila 2
        lay2.setS1("I");
        lay2.setS2("1001713");
        lay2.setS3("1");
        lay2.setS4("11820.68");
        //2 espacios
        lay2.setS5("USD");
        layouts.add(lay2);
        
        ExportPosicionesSAP lay3 = new ExportPosicionesSAP();
        //fila 3
        lay3.setS1("F");
        lay3.setS2("99");
        layouts.add(lay3);
        
        ExportPosicionesSAP lay4 = new ExportPosicionesSAP();
        //fila 4
        lay4.setS1("M");
        lay4.setS2("PPD");
        layouts.add(lay4);
        
        ExportPosicionesSAP lay5 = new ExportPosicionesSAP();
        //fila 5
        lay5.setS1("U");
        lay5.setS2("P01");
        
        layouts.add(lay5);
        
    }

    public List<ExportPosicionesSAP> getLayouts() {
        return layouts;
    }

    public void setSLayouts(List<ExportPosicionesSAP> layouts) {
        this.layouts = layouts;
    }

}
