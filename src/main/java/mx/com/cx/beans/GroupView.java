/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.cx.beans;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import mx.com.cx.models.Player;
import mx.com.cx.models.ProvData;
import mx.com.cx.models.Sale;

/**
 *
 * @author fernandezra
 */
@ManagedBean(name="dtGroupView")
@ViewScoped
public class GroupView implements Serializable{

   
    private final static String[] manufacturers;
    private List<Sale> sales;
     
    private final static String[] playerNames;
    private List<Integer> years;
    private List<Player> players;
    
    
    private List<ProvData> pData ;
    
     
    static {        
        manufacturers = new String[10];
        manufacturers[0] = "Embratel";
        manufacturers[1] = "Verizon";
        manufacturers[2] = "Att";
        manufacturers[3] = "TMobile";
        manufacturers[4] = "Sony";
        manufacturers[5] = "LG";
        manufacturers[6] = "Sharp";
        manufacturers[7] = "Panasonic";
        manufacturers[8] = "HTC";
        manufacturers[9] = "Nokia";
    }
         
    static {
        playerNames = new String[10];
        playerNames[0] = "Lionel Messi";
        playerNames[1] = "Cristiano Ronaldo";
        playerNames[2] = "Arjen Robben";
        playerNames[3] = "Franck Ribery";
        playerNames[4] = "Ronaldinho";
        playerNames[5] = "Luis Suarez";
        playerNames[6] = "Sergio Aguero";
        playerNames[7] = "Zlatan Ibrahimovic";
        playerNames[8] = "Neymar Jr";
        playerNames[9] = "Andres Iniesta";
    }
         
    
    
    @PostConstruct
    public void init() {
        
        this.pData = new ArrayList<ProvData>();
        
        
        ProvData d1 = new ProvData();
        d1.setRoamingPartner("42 TELECOM AB");
        d1.setOrigCountry("MEX");
        d1.setDestCountry("SWE");
        d1.setAnsiTrans(0);
        d1.setItuTrans(6);
        d1.setOtherSharedRange(0);
        d1.setOtherNotFound(0);
        d1.setTotalMsus(6);
        d1.setProcFacturador(6);
        d1.setDif(0);
        
        pData.add(d1);
        
        ProvData d2 = new ProvData();
        d2.setRoamingPartner("ADVANCED WIRELESS NET. - THAIL");
        d2.setOrigCountry("MEX");
        d2.setDestCountry("THA");
        d2.setAnsiTrans(0);
        d2.setItuTrans(1837458);
        d2.setOtherSharedRange(0);
        d2.setOtherNotFound(0);
        d2.setTotalMsus(1837458);
        d2.setProcFacturador(1837458);
        d2.setDif(0);
        
        pData.add(d2);
        
        ProvData d3 = new ProvData();
        d3.setRoamingPartner("AERIS");
        d3.setOrigCountry("MEX");
        d3.setDestCountry("USA");
        d3.setAnsiTrans(1347);
        d3.setItuTrans(0);
        d3.setOtherSharedRange(0);
        d3.setOtherNotFound(0);
        d3.setTotalMsus(1347);
        d3.setProcFacturador(1347);
        d3.setDif(0);
        
        pData.add(d3);
        
        ProvData d4 = new ProvData();
        d4.setRoamingPartner("AFGHAN WIRELESS (AWCC) ");
        d4.setOrigCountry("MEX");
        d4.setDestCountry("AFG");
        d4.setAnsiTrans(0);
        d4.setItuTrans(939);
        d4.setOtherSharedRange(0);
        d4.setOtherNotFound(0);
        d4.setTotalMsus(939);
        d4.setProcFacturador(939);
        d4.setDif(0);
        
        pData.add(d4);
        
        ProvData d5 = new ProvData();
        d5.setRoamingPartner("AFRICEL - GAMBIA");
        d5.setOrigCountry("MEX");
        d5.setDestCountry("GMB");
        d5.setAnsiTrans(0);
        d5.setItuTrans(491);
        d5.setOtherSharedRange(0);
        d5.setOtherNotFound(0);
        d5.setTotalMsus(491);
        d5.setProcFacturador(491);
        d5.setDif(0);
        
        pData.add(d5);
        
        ProvData d6 = new ProvData();
        d6.setRoamingPartner("AIRADIGM COMUNICATIONS INC.");
        d6.setOrigCountry("MEX");
        d6.setDestCountry("USA");
        d6.setAnsiTrans(15603266);
        d6.setItuTrans(0);
        d6.setOtherSharedRange(0);
        d6.setOtherNotFound(0);
        d6.setTotalMsus(15103266);
        d6.setProcFacturador(15603200);
        d6.setDif(499934);
        
        pData.add(d6);
        
        ProvData d7 = new ProvData();
        d7.setRoamingPartner("AIRCEL LTD");
        d7.setOrigCountry("MEX");
        d7.setDestCountry("IND");
        d7.setAnsiTrans(0);
        d7.setItuTrans(167);
        d7.setOtherSharedRange(0);
        d7.setOtherNotFound(0);
        d7.setTotalMsus(167);
        d7.setProcFacturador(167);
        d7.setDif(0);
        
        pData.add(d7);
        
        ProvData d8 = new ProvData();
        d8.setRoamingPartner("ALASKA WIRELESS NETWORKS - A");
        d8.setOrigCountry("MEX");
        d8.setDestCountry("USA");
        d8.setAnsiTrans(89375);
        d8.setItuTrans(0);
        d8.setOtherSharedRange(0);
        d8.setOtherNotFound(0);
        d8.setTotalMsus(89375);
        d8.setProcFacturador(89295);
        d8.setDif(80);
        
        pData.add(d8);
        
        ProvData d9 = new ProvData();
        d9.setRoamingPartner("AIRTEL TANZANIA LTE");
        d9.setOrigCountry("MEX");
        d9.setDestCountry("TZA");
        d9.setAnsiTrans(0);
        d9.setItuTrans(66290);
        d9.setOtherSharedRange(0);
        d9.setOtherNotFound(0);
        d9.setTotalMsus(66290);
        d9.setProcFacturador(66290);
        d9.setDif(0);
        
        pData.add(d9);
        
        ProvData d10 = new ProvData();
        d10.setRoamingPartner("AIS THAILAND");
        d10.setOrigCountry("MEX");
        d10.setDestCountry("THA");
        d10.setAnsiTrans(0);
        d10.setItuTrans(11133);
        d10.setOtherSharedRange(0);
        d10.setOtherNotFound(0);
        d10.setTotalMsus(11133);
        d10.setProcFacturador(11133);
        d10.setDif(0);
        
        pData.add(d10);
        
        
          ProvData dFinal = new ProvData();
        dFinal.setRoamingPartner("");
        dFinal.setOrigCountry("");
        dFinal.setDestCountry("");
        dFinal.setAnsiTrans(15693988);
        dFinal.setItuTrans(1916478);
        dFinal.setOtherSharedRange(0);
        dFinal.setOtherNotFound(0);
        dFinal.setTotalMsus(17110472);
        dFinal.setProcFacturador(17610326);
        dFinal.setDif(499854);
        
        pData.add(dFinal);
        
        /*
        ProvData d1 = new ProvData();
        d1.setRoamingPartner("42 TELECOM AB");
        d1.setOrigCountry("MEX");
        d1.setDestCountry("SWE");
        d1.setAnsiTrans(0);
        d1.setItuTrans(6);
        d1.setOtherSharedRange(0);
        d1.setOtherNotFound(0);
        d1.setTotalMsus(6);
        d1.setProcFacturador(6);
        d1.setDif(0);
        
        pData.add(d1);
        
        ProvData d1 = new ProvData();
        d1.setRoamingPartner("42 TELECOM AB");
        d1.setOrigCountry("MEX");
        d1.setDestCountry("SWE");
        d1.setAnsiTrans(0);
        d1.setItuTrans(6);
        d1.setOtherSharedRange(0);
        d1.setOtherNotFound(0);
        d1.setTotalMsus(6);
        d1.setProcFacturador(6);
        d1.setDif(0);
        
        pData.add(d1);
        
        ProvData d1 = new ProvData();
        d1.setRoamingPartner("42 TELECOM AB");
        d1.setOrigCountry("MEX");
        d1.setDestCountry("SWE");
        d1.setAnsiTrans(0);
        d1.setItuTrans(6);
        d1.setOtherSharedRange(0);
        d1.setOtherNotFound(0);
        d1.setTotalMsus(6);
        d1.setProcFacturador(6);
        d1.setDif(0);
        
        pData.add(d1);
        
        ProvData d1 = new ProvData();
        d1.setRoamingPartner("42 TELECOM AB");
        d1.setOrigCountry("MEX");
        d1.setDestCountry("SWE");
        d1.setAnsiTrans(0);
        d1.setItuTrans(6);
        d1.setOtherSharedRange(0);
        d1.setOtherNotFound(0);
        d1.setTotalMsus(6);
        d1.setProcFacturador(6);
        d1.setDif(0);
        
        pData.add(d1);
        
        ProvData d1 = new ProvData();
        d1.setRoamingPartner("42 TELECOM AB");
        d1.setOrigCountry("MEX");
        d1.setDestCountry("SWE");
        d1.setAnsiTrans(0);
        d1.setItuTrans(6);
        d1.setOtherSharedRange(0);
        d1.setOtherNotFound(0);
        d1.setTotalMsus(6);
        d1.setProcFacturador(6);
        d1.setDif(0);
        
        pData.add(d1);
        
        ProvData d1 = new ProvData();
        d1.setRoamingPartner("42 TELECOM AB");
        d1.setOrigCountry("MEX");
        d1.setDestCountry("SWE");
        d1.setAnsiTrans(0);
        d1.setItuTrans(6);
        d1.setOtherSharedRange(0);
        d1.setOtherNotFound(0);
        d1.setTotalMsus(6);
        d1.setProcFacturador(6);
        d1.setDif(0);
        
        pData.add(d1);
        
        
        ProvData d17 = new ProvData();
        d17.setRoamingPartner("42 TELECOM AB");
        d17.setOrigCountry("MEX");
        d17.setDestCountry("SWE");
        d17.setAnsiTrans(0);
        d17.setItuTrans(6);
        d17.setOtherSharedRange(0);
        d17.setOtherNotFound(0);
        d17.setTotalMsus(6);
        d17.setProcFacturador(6);
        d17.setDif(0);
        
        pData.add(d1);
        
        
        
        */
        
        
        
        
    /*    sales = new ArrayList<Sale>();
        for(int i = 0; i < 10; i++) {
            sales.add(new Sale(manufacturers[i], getRandomAmount(), getRandomAmount(), getRandomPercentage(), getRandomPercentage()));
        }
         
        years = new ArrayList<Integer>();
        years.add(2010);
        years.add(2011);
        years.add(2012);
        years.add(2013);
        years.add(2014);
         
        players = new ArrayList<Player>();
        for(int i = 0; i < 10; i++) {
            players.add(new Player(playerNames[i], generateRandomGoalStatsData()));
        }*/
    }
 
    public List<Sale> getSales() {
        return sales;
    }
 
    private int getRandomAmount() {
        return (int) (Math.random() * 100000);
    }
 
    private int getRandomPercentage() {
        return (int) (Math.random() * 100);
    }
     
    public String getLastYearTotal() {
        int total = 0;
 
        for(Sale sale : getSales()) {
            total += sale.getLastYearSale();
        }
 
        return new DecimalFormat("###,###.###").format(total);
    }
 
    public String getThisYearTotal() {
        int total = 0;
 
        for(Sale sale : getSales()) {
            total += sale.getThisYearSale();
        }
 
        return new DecimalFormat("###,###.###").format(total);
    }
 
    public List<Integer> getYears() {
        return years;
    }
     
    public int getYearCount() {
        return years.size();
    }
 
    public List<Player> getPlayers() {
        return players;
    }
 
    private Map<Integer,Integer> generateRandomGoalStatsData() {
        Map<Integer,Integer> stats = new LinkedHashMap<Integer, Integer>();
        for (int i = 0; i < 5; i++) {
            stats.put(years.get(i), getRandomGoals());
        }
         
        return stats;
    }
     
    private int getRandomGoals() {
        return (int) (Math.random() * 50);
    }
    
     public List<ProvData> getpData() {
        return pData;
    }

    public void setpData(List<ProvData> pData) {
        this.pData = pData;
    }
    
    
}
