/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.cx.beans;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import mx.com.cx.models.Ss7;

/**
 *
 * @author fernandezra
 */
@ManagedBean(name = "ss7Bean")
public class DataSs7 {

    private List<Ss7> reporteSs7 = new ArrayList<Ss7>();
    private Ss7 ss7;
    @PostConstruct
    public void init() {
        Ss7 s1 = new Ss7();
        s1.setFecha("13/07/2018");
        s1.setZona("AMX");
        s1.setOperacionAmx("Telcel");
        s1.setRoamingPartner("AT&T");
        s1.setPaisOrigen("MEX");
        s1.setPaisDestino("USA");
        s1.setAnsiMsus(100);
        s1.setItuMsus(200);
        s1.setTotalMsusInb(120);
        s1.setTotalMsusOut(180);
        s1.setCostoMsusOut(2600.20f);
        getReporteSs7().add(s1);

        Ss7 s2 = new Ss7();
        s2.setFecha("27/09/2019");
        s2.setZona("Europa");
        s2.setOperacionAmx("Vodafone");
        s2.setRoamingPartner("t-mobile");
        s2.setPaisOrigen("Alemania");
        s2.setPaisDestino("USA");
        s2.setAnsiMsus(795);
        s2.setItuMsus(205);
        s2.setTotalMsusInb(500);
        s2.setTotalMsusOut(500);
        s2.setCostoMsusOut(8815.46f);
        getReporteSs7().add(s2);

        Ss7 s3 = new Ss7();
        s3.setFecha("10/05/2019");
        s3.setZona("AMERICA-CARIBE");
        s3.setOperacionAmx("BTC");
        s3.setRoamingPartner("Orange");
        s3.setPaisOrigen("Bahamas");
        s3.setPaisDestino("Belgica");
        s3.setAnsiMsus(500);
        s3.setItuMsus(200);
        s3.setTotalMsusInb(488);
        s3.setTotalMsusOut(212);
        s3.setCostoMsusOut(79846.54f);
        getReporteSs7().add(s3);

    /*
        Ss7 s4 = new Ss7();
        getReporteSs7().add(s4);

        Ss7 s5 = new Ss7();
        getReporteSs7().add(s5);

        Ss7 s6 = new Ss7();
        getReporteSs7().add(s6);

        Ss7 s7 = new Ss7();
        getReporteSs7().add(s7);

        Ss7 s8 = new Ss7();
        getReporteSs7().add(s8);

        Ss7 s9 = new Ss7();
        getReporteSs7().add(s9);

        Ss7 s10 = new Ss7();
        getReporteSs7().add(s10);
*/
    }

    public int getRandomPrice() {
        
        return (int) (Math.random() * 100000);
        
    }
    
    
    /**
     * @return the reporteSs7
     */
    public List<Ss7> getReporteSs7() {
        return reporteSs7;
    }

    /**
     * @param reporteSs7 the reporteSs7 to set
     */
    public void setReporteSs7(List<Ss7> reporteSs7) {
        this.reporteSs7 = reporteSs7;
    }

    public Ss7 getSs7() {
        return ss7;
    }

    public void setSs7(Ss7 ss7) {
        this.ss7 = ss7;
    }

}
