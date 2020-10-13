/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.cx.beans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import mx.com.cx.models.Proyecciones;
import mx.com.cx.models.ProyeccionesHistoricos;



/**
 *
 * @author fernandezra
 */
@ManagedBean(name = "proyeccionBean")
@ViewScoped
public class ProyeccionBean {

   
    private List<Proyecciones> proyecciones = new ArrayList<Proyecciones>();
    private List<Proyecciones> proyeccionesFiliales = new ArrayList<Proyecciones>();
    private List<Proyecciones> proyeccionesFilialesTot = new ArrayList<Proyecciones>();
    private List<ProyeccionesHistoricos> proyeccionesHistorico = new ArrayList<ProyeccionesHistoricos>();
    private List<ProyeccionesHistoricos> proyeccionesFilialesHistorico = new ArrayList<ProyeccionesHistoricos>();

     
    public int numeroRandom(){
    return (int) (Math.random() * 1000);
    
    } 
     
     
    public void generaHistoricos(){
        
        ProyeccionesHistoricos p1 = new ProyeccionesHistoricos();
        p1.setZona("AMX (REP MSU's POR OPERADOR)");
        p1.setMes1(numeroRandom());
        p1.setMes2(numeroRandom());
        p1.setMes3(numeroRandom());
        p1.setMes4(numeroRandom());
        p1.setMes5(numeroRandom());
        p1.setMes6(numeroRandom());
        p1.setMes7(numeroRandom());
        p1.setMes8(numeroRandom());
        p1.setMes9(numeroRandom());
        p1.setMes10(numeroRandom());
        p1.setMes11(numeroRandom());
        p1.setMes12(numeroRandom());
        p1.setMes13(numeroRandom());
        p1.setMes14(numeroRandom());
        p1.setMes15(numeroRandom());
        p1.setMes16(numeroRandom());
        p1.setMes17(numeroRandom());
        p1.setMes18(numeroRandom());
        p1.setMes19(numeroRandom());
        p1.setMes20(numeroRandom());
        p1.setMes21(numeroRandom());
        p1.setMes22(numeroRandom());
        p1.setMes23(numeroRandom());
        p1.setMes24(numeroRandom());
        p1.setMes25(numeroRandom());
        p1.setMes26(numeroRandom());
        p1.setMes27(numeroRandom());
        p1.setMes28(numeroRandom());
        p1.setMes29(numeroRandom());
        p1.setMes30(numeroRandom());
        p1.setMes31(numeroRandom());
        p1.setMes32(numeroRandom());
        p1.setMes33(numeroRandom());
        p1.setMes34(numeroRandom());
        p1.setMes35(numeroRandom());
        p1.setMes36(numeroRandom());

        getProyeccionesHistorico().add(p1);
    
    
    ProyeccionesHistoricos p2 = new ProyeccionesHistoricos();
    p2.setZona("REST AMX (REP MSU's POR OPERADOR)");
    p2.setMes1(numeroRandom());
p2.setMes2(numeroRandom());
p2.setMes3(numeroRandom());
p2.setMes4(numeroRandom());
p2.setMes5(numeroRandom());
p2.setMes6(numeroRandom());
p2.setMes7(numeroRandom());
p2.setMes8(numeroRandom());
p2.setMes9(numeroRandom());
p2.setMes10(numeroRandom());
p2.setMes11(numeroRandom());
p2.setMes12(numeroRandom());
p2.setMes13(numeroRandom());
p2.setMes14(numeroRandom());
p2.setMes15(numeroRandom());
p2.setMes16(numeroRandom());
p2.setMes17(numeroRandom());
p2.setMes18(numeroRandom());
p2.setMes19(numeroRandom());
p2.setMes20(numeroRandom());
p2.setMes21(numeroRandom());
p2.setMes22(numeroRandom());
p2.setMes23(numeroRandom());
p2.setMes24(numeroRandom());
p2.setMes25(numeroRandom());
p2.setMes26(numeroRandom());
p2.setMes27(numeroRandom());
p2.setMes28(numeroRandom());
p2.setMes29(numeroRandom());
p2.setMes30(numeroRandom());
p2.setMes31(numeroRandom());
p2.setMes32(numeroRandom());
p2.setMes33(numeroRandom());
p2.setMes34(numeroRandom());
p2.setMes35(numeroRandom());
p2.setMes36(numeroRandom());
    
        getProyeccionesHistorico().add(p2);
    
    
    ProyeccionesHistoricos p3 = new ProyeccionesHistoricos();
    p3.setZona("USA - AT&T");
    p3.setMes1(numeroRandom());
        p3.setMes2(numeroRandom());
        p3.setMes3(numeroRandom());
        p3.setMes4(numeroRandom());
        p3.setMes5(numeroRandom());
        p3.setMes6(numeroRandom());
        p3.setMes7(numeroRandom());
        p3.setMes8(numeroRandom());
        p3.setMes9(numeroRandom());
        p3.setMes10(numeroRandom());
        p3.setMes11(numeroRandom());
        p3.setMes12(numeroRandom());
        p3.setMes13(numeroRandom());
        p3.setMes14(numeroRandom());
        p3.setMes15(numeroRandom());
        p3.setMes16(numeroRandom());
        p3.setMes17(numeroRandom());
        p3.setMes18(numeroRandom());
        p3.setMes19(numeroRandom());
        p3.setMes20(numeroRandom());
        p3.setMes21(numeroRandom());
        p3.setMes22(numeroRandom());
        p3.setMes23(numeroRandom());
        p3.setMes24(numeroRandom());
        p3.setMes25(numeroRandom());
        p3.setMes26(numeroRandom());
        p3.setMes27(numeroRandom());
        p3.setMes28(numeroRandom());
        p3.setMes29(numeroRandom());
        p3.setMes30(numeroRandom());
        p3.setMes31(numeroRandom());
        p3.setMes32(numeroRandom());
        p3.setMes33(numeroRandom());
        p3.setMes34(numeroRandom());
        p3.setMes35(numeroRandom());
        p3.setMes36(numeroRandom());
        getProyeccionesHistorico().add(p3);
    
    
    ProyeccionesHistoricos p4 = new ProyeccionesHistoricos();
    p4.setZona("USA - TMOBILE");
        p4.setMes1(numeroRandom());
        p4.setMes2(numeroRandom());
        p4.setMes3(numeroRandom());
        p4.setMes4(numeroRandom());
        p4.setMes5(numeroRandom());
        p4.setMes6(numeroRandom());
        p4.setMes7(numeroRandom());
        p4.setMes8(numeroRandom());
        p4.setMes9(numeroRandom());
        p4.setMes10(numeroRandom());
        p4.setMes11(numeroRandom());
        p4.setMes12(numeroRandom());
        p4.setMes13(numeroRandom());
        p4.setMes14(numeroRandom());
        p4.setMes15(numeroRandom());
        p4.setMes16(numeroRandom());
        p4.setMes17(numeroRandom());
        p4.setMes18(numeroRandom());
        p4.setMes19(numeroRandom());
        p4.setMes20(numeroRandom());
        p4.setMes21(numeroRandom());
        p4.setMes22(numeroRandom());
        p4.setMes23(numeroRandom());
        p4.setMes24(numeroRandom());
        p4.setMes25(numeroRandom());
        p4.setMes26(numeroRandom());
        p4.setMes27(numeroRandom());
        p4.setMes28(numeroRandom());
        p4.setMes29(numeroRandom());
        p4.setMes30(numeroRandom());
        p4.setMes31(numeroRandom());
        p4.setMes32(numeroRandom());
        p4.setMes33(numeroRandom());
        p4.setMes34(numeroRandom());
        p4.setMes35(numeroRandom());
        p4.setMes36(numeroRandom());
    
        getProyeccionesHistorico().add(p4);
    
     ProyeccionesHistoricos p5 = new ProyeccionesHistoricos();
    p5.setZona("USA - VERIZON");
        p5.setMes1(numeroRandom());
        p5.setMes2(numeroRandom());
        p5.setMes3(numeroRandom());
        p5.setMes4(numeroRandom());
        p5.setMes5(numeroRandom());
        p5.setMes6(numeroRandom());
        p5.setMes7(numeroRandom());
        p5.setMes8(numeroRandom());
        p5.setMes9(numeroRandom());
        p5.setMes10(numeroRandom());
        p5.setMes11(numeroRandom());
        p5.setMes12(numeroRandom());
        p5.setMes13(numeroRandom());
        p5.setMes14(numeroRandom());
        p5.setMes15(numeroRandom());
        p5.setMes16(numeroRandom());
        p5.setMes17(numeroRandom());
        p5.setMes18(numeroRandom());
        p5.setMes19(numeroRandom());
        p5.setMes20(numeroRandom());
        p5.setMes21(numeroRandom());
        p5.setMes22(numeroRandom());
        p5.setMes23(numeroRandom());
        p5.setMes24(numeroRandom());
        p5.setMes25(numeroRandom());
        p5.setMes26(numeroRandom());
        p5.setMes27(numeroRandom());
        p5.setMes28(numeroRandom());
        p5.setMes29(numeroRandom());
        p5.setMes30(numeroRandom());
        p5.setMes31(numeroRandom());
        p5.setMes32(numeroRandom());
        p5.setMes33(numeroRandom());
        p5.setMes34(numeroRandom());
        p5.setMes35(numeroRandom());
        p5.setMes36(numeroRandom());
    
        getProyeccionesHistorico().add(p5);
    
    
    //----------------------------------------------------------//
    
    
     ProyeccionesHistoricos pf1 = new ProyeccionesHistoricos();
    
     pf1.setZona("ARGENTINA - CLARO");
        pf1.setMes1(numeroRandom());
        pf1.setMes2(numeroRandom());
        pf1.setMes3(numeroRandom());
        pf1.setMes4(numeroRandom());
        pf1.setMes5(numeroRandom());
        pf1.setMes6(numeroRandom());
        pf1.setMes7(numeroRandom());
        pf1.setMes8(numeroRandom());
        pf1.setMes9(numeroRandom());
        pf1.setMes10(numeroRandom());
        pf1.setMes11(numeroRandom());
        pf1.setMes12(numeroRandom());
        pf1.setMes13(numeroRandom());
        pf1.setMes14(numeroRandom());
        pf1.setMes15(numeroRandom());
        pf1.setMes16(numeroRandom());
        pf1.setMes17(numeroRandom());
        pf1.setMes18(numeroRandom());
        pf1.setMes19(numeroRandom());
        pf1.setMes20(numeroRandom());
        pf1.setMes21(numeroRandom());
        pf1.setMes22(numeroRandom());
        pf1.setMes23(numeroRandom());
        pf1.setMes24(numeroRandom());
        pf1.setMes25(numeroRandom());
        pf1.setMes26(numeroRandom());
        pf1.setMes27(numeroRandom());
        pf1.setMes28(numeroRandom());
        pf1.setMes29(numeroRandom());
        pf1.setMes30(numeroRandom());
        pf1.setMes31(numeroRandom());
        pf1.setMes32(numeroRandom());
        pf1.setMes33(numeroRandom());
        pf1.setMes34(numeroRandom());
        pf1.setMes35(numeroRandom());
        pf1.setMes36(numeroRandom());
    
        getProyeccionesFilialesHistorico().add(pf1);
    
    
    ProyeccionesHistoricos pf2 = new ProyeccionesHistoricos();
    pf2.setZona("BRASIL - CLARO");
    
    pf2.setMes1(numeroRandom());
        pf2.setMes2(numeroRandom());
        pf2.setMes3(numeroRandom());
        pf2.setMes4(numeroRandom());
        pf2.setMes5(numeroRandom());
        pf2.setMes6(numeroRandom());
        pf2.setMes7(numeroRandom());
        pf2.setMes8(numeroRandom());
        pf2.setMes9(numeroRandom());
        pf2.setMes10(numeroRandom());
        pf2.setMes11(numeroRandom());
        pf2.setMes12(numeroRandom());
        pf2.setMes13(numeroRandom());
        pf2.setMes14(numeroRandom());
        pf2.setMes15(numeroRandom());
        pf2.setMes16(numeroRandom());
        pf2.setMes17(numeroRandom());
        pf2.setMes18(numeroRandom());
        pf2.setMes19(numeroRandom());
        pf2.setMes20(numeroRandom());
        pf2.setMes21(numeroRandom());
        pf2.setMes22(numeroRandom());
        pf2.setMes23(numeroRandom());
        pf2.setMes24(numeroRandom());
        pf2.setMes25(numeroRandom());
        pf2.setMes26(numeroRandom());
        pf2.setMes27(numeroRandom());
        pf2.setMes28(numeroRandom());
        pf2.setMes29(numeroRandom());
        pf2.setMes30(numeroRandom());
        pf2.setMes31(numeroRandom());
        pf2.setMes32(numeroRandom());
        pf2.setMes33(numeroRandom());
        pf2.setMes34(numeroRandom());
        pf2.setMes35(numeroRandom());
        pf2.setMes36(numeroRandom());
    
        getProyeccionesFilialesHistorico().add(pf2);
    
    
    ProyeccionesHistoricos pf3 = new ProyeccionesHistoricos();
    pf3.setZona("CHILE - CLARO");
    
        pf3.setMes1(numeroRandom());
        pf3.setMes2(numeroRandom());
        pf3.setMes3(numeroRandom());
        pf3.setMes4(numeroRandom());
        pf3.setMes5(numeroRandom());
        pf3.setMes6(numeroRandom());
        pf3.setMes7(numeroRandom());
        pf3.setMes8(numeroRandom());
        pf3.setMes9(numeroRandom());
        pf3.setMes10(numeroRandom());
        pf3.setMes11(numeroRandom());
        pf3.setMes12(numeroRandom());
        pf3.setMes13(numeroRandom());
        pf3.setMes14(numeroRandom());
        pf3.setMes15(numeroRandom());
        pf3.setMes16(numeroRandom());
        pf3.setMes17(numeroRandom());
        pf3.setMes18(numeroRandom());
        pf3.setMes19(numeroRandom());
        pf3.setMes20(numeroRandom());
        pf3.setMes21(numeroRandom());
        pf3.setMes22(numeroRandom());
        pf3.setMes23(numeroRandom());
        pf3.setMes24(numeroRandom());
        pf3.setMes25(numeroRandom());
        pf3.setMes26(numeroRandom());
        pf3.setMes27(numeroRandom());
        pf3.setMes28(numeroRandom());
        pf3.setMes29(numeroRandom());
        pf3.setMes30(numeroRandom());
        pf3.setMes31(numeroRandom());
        pf3.setMes32(numeroRandom());
        pf3.setMes33(numeroRandom());
        pf3.setMes34(numeroRandom());
        pf3.setMes35(numeroRandom());
        pf3.setMes36(numeroRandom());
    
    
        getProyeccionesFilialesHistorico().add(pf3);
    
    
    ProyeccionesHistoricos pf4 = new ProyeccionesHistoricos();
    pf4.setZona("COLOMBIA - CLARO");
    pf4.setMes1(numeroRandom());
        pf4.setMes2(numeroRandom());
        pf4.setMes3(numeroRandom());
        pf4.setMes4(numeroRandom());
        pf4.setMes5(numeroRandom());
        pf4.setMes6(numeroRandom());
        pf4.setMes7(numeroRandom());
        pf4.setMes8(numeroRandom());
        pf4.setMes9(numeroRandom());
        pf4.setMes10(numeroRandom());
        pf4.setMes11(numeroRandom());
        pf4.setMes12(numeroRandom());
        pf4.setMes13(numeroRandom());
        pf4.setMes14(numeroRandom());
        pf4.setMes15(numeroRandom());
        pf4.setMes16(numeroRandom());
        pf4.setMes17(numeroRandom());
        pf4.setMes18(numeroRandom());
        pf4.setMes19(numeroRandom());
        pf4.setMes20(numeroRandom());
        pf4.setMes21(numeroRandom());
        pf4.setMes22(numeroRandom());
        pf4.setMes23(numeroRandom());
        pf4.setMes24(numeroRandom());
        pf4.setMes25(numeroRandom());
        pf4.setMes26(numeroRandom());
        pf4.setMes27(numeroRandom());
        pf4.setMes28(numeroRandom());
        pf4.setMes29(numeroRandom());
        pf4.setMes30(numeroRandom());
        pf4.setMes31(numeroRandom());
        pf4.setMes32(numeroRandom());
        pf4.setMes33(numeroRandom());
        pf4.setMes34(numeroRandom());
        pf4.setMes35(numeroRandom());
        pf4.setMes36(numeroRandom());
    
        getProyeccionesFilialesHistorico().add(pf4);
    
     ProyeccionesHistoricos pf5 = new ProyeccionesHistoricos();
    pf5.setZona("COSTA RICA - CLARO");
    pf5.setMes1(numeroRandom());
        pf5.setMes2(numeroRandom());
        pf5.setMes3(numeroRandom());
        pf5.setMes4(numeroRandom());
        pf5.setMes5(numeroRandom());
        pf5.setMes6(numeroRandom());
        pf5.setMes7(numeroRandom());
        pf5.setMes8(numeroRandom());
        pf5.setMes9(numeroRandom());
        pf5.setMes10(numeroRandom());
        pf5.setMes11(numeroRandom());
        pf5.setMes12(numeroRandom());
        pf5.setMes13(numeroRandom());
        pf5.setMes14(numeroRandom());
        pf5.setMes15(numeroRandom());
        pf5.setMes16(numeroRandom());
        pf5.setMes17(numeroRandom());
        pf5.setMes18(numeroRandom());
        pf5.setMes19(numeroRandom());
        pf5.setMes20(numeroRandom());
        pf5.setMes21(numeroRandom());
        pf5.setMes22(numeroRandom());
        pf5.setMes23(numeroRandom());
        pf5.setMes24(numeroRandom());
        pf5.setMes25(numeroRandom());
        pf5.setMes26(numeroRandom());
        pf5.setMes27(numeroRandom());
        pf5.setMes28(numeroRandom());
        pf5.setMes29(numeroRandom());
        pf5.setMes30(numeroRandom());
        pf5.setMes31(numeroRandom());
        pf5.setMes32(numeroRandom());
        pf5.setMes33(numeroRandom());
        pf5.setMes34(numeroRandom());
        pf5.setMes35(numeroRandom());
        pf5.setMes36(numeroRandom());
    
        getProyeccionesFilialesHistorico().add(pf5);
    
    
   
        
    }
     
     
    /**
     * Creates a new instance of ProyeccionBean
     */
    public ProyeccionBean() {
        
    generaHistoricos();    
        
    Proyecciones p1 = new Proyecciones();
    p1.setZona("AMX (REP MSU's POR OPERADOR)");
    p1.setAnio1(345);
    p1.setAnio2(347);
    p1.setAnio3(349);
    p1.setAnio4(365);
    p1.setAnio5(390);
    p1.setAnio6(458);
    p1.setAnio7(789);
    p1.setAnio8(321);
    p1.setAnio9(654);
    p1.setVarPor(30);
    
    proyecciones.add(p1);
    
    
    Proyecciones p2 = new Proyecciones();
    p2.setZona("REST AMX (REP MSU's POR OPERADOR)");
    p2.setAnio1(745);
    p2.setAnio2(654);
    p2.setAnio3(159);
    p2.setAnio4(357);
    p2.setAnio5(971);
    p2.setAnio6(784);
    p2.setAnio7(544);
    p2.setAnio8(789);
    p2.setAnio9(645);
    p2.setVarPor(90);
    
    proyecciones.add(p2);
    
    
    Proyecciones p3 = new Proyecciones();
    p3.setZona("USA - AT&T");
    p3.setAnio1(73);
    p3.setAnio2(234);
    p3.setAnio3(876);
    p3.setAnio4(244);
    p3.setAnio5(765);
    p3.setAnio6(286);
    p3.setAnio7(524);
    p3.setAnio8(864);
    p3.setAnio9(563);
    p3.setVarPor(64);
    proyecciones.add(p3);
    
    
    Proyecciones p4 = new Proyecciones();
    p4.setZona("USA - TMOBILE");
    p4.setAnio1(345);
    p4.setAnio2(65);
    p4.setAnio3(483);
    p4.setAnio4(555);
    p4.setAnio5(123);
    p4.setAnio6(856);
    p4.setAnio7(463);
    p4.setAnio8(129);
    p4.setAnio9(324);
    p4.setVarPor(68);
    
    proyecciones.add(p4);
    
     Proyecciones p5 = new Proyecciones();
    p5.setZona("USA - VERIZON");
    p5.setAnio1(123);
    p5.setAnio2(235);
    p5.setAnio3(543);
    p5.setAnio4(535);
    p5.setAnio5(235);
    p5.setAnio6(845);
    p5.setAnio7(246);
    p5.setAnio8(815);
    p5.setAnio9(624);
    p5.setVarPor(85);
    
    proyecciones.add(p5);
    
    
    //----------------------------------------------------------//
    
    
     Proyecciones pf1 = new Proyecciones();
    
     pf1.setZona("ARGENTINA - CLARO");
    pf1.setAnio1(345);
    pf1.setAnio2(347);
    pf1.setAnio3(349);
    pf1.setAnio4(365);
    pf1.setAnio5(390);
    pf1.setAnio6(458);
    pf1.setAnio7(789);
    pf1.setAnio8(321);
    pf1.setAnio9(654);
    pf1.setVarPor(30);
    
    proyeccionesFiliales.add(pf1);
    
    
    Proyecciones pf2 = new Proyecciones();
    pf2.setZona("BRASIL - CLARO");
    pf2.setAnio1(745);
    pf2.setAnio2(654);
    pf2.setAnio3(159);
    pf2.setAnio4(357);
    pf2.setAnio5(971);
    pf2.setAnio6(784);
    pf2.setAnio7(544);
    pf2.setAnio8(789);
    pf2.setAnio9(645);
    pf2.setVarPor(90);
    
    proyeccionesFiliales.add(pf2);
    
    
    Proyecciones pf3 = new Proyecciones();
    pf3.setZona("CHILE - CLARO");
    pf3.setAnio1(73);
    pf3.setAnio2(234);
    pf3.setAnio3(876);
    pf3.setAnio4(244);
    pf3.setAnio5(765);
    pf3.setAnio6(286);
    pf3.setAnio7(524);
    pf3.setAnio8(864);
    pf3.setAnio9(563);
    pf3.setVarPor(64);
    proyeccionesFiliales.add(pf3);
    
    
    Proyecciones pf4 = new Proyecciones();
    pf4.setZona("COLOMBIA - CLARO");
    pf4.setAnio1(345);
    pf4.setAnio2(65);
    pf4.setAnio3(483);
    pf4.setAnio4(555);
    pf4.setAnio5(123);
    pf4.setAnio6(856);
    pf4.setAnio7(463);
    pf4.setAnio8(129);
    pf4.setAnio9(324);
    pf4.setVarPor(68);
    
    proyeccionesFiliales.add(pf4);
    
     Proyecciones pf5 = new Proyecciones();
    pf5.setZona("COSTA RICA - CLARO");
    pf5.setAnio1(123);
    pf5.setAnio2(235);
    pf5.setAnio3(543);
    pf5.setAnio4(535);
    pf5.setAnio5(235);
    pf5.setAnio6(845);
    pf5.setAnio7(246);
    pf5.setAnio8(815);
    pf5.setAnio9(624);
    pf5.setVarPor(85);
    
    proyeccionesFiliales.add(pf5);
    
     //----------------------------------------------------------//
    
    
     Proyecciones pfC1 = new Proyecciones();
    
     pfC1.setZona("TOTAL COSTO");
    pfC1.setAnio1(345);
    pfC1.setAnio2(347);
    pfC1.setAnio3(349);
    pfC1.setAnio4(365);
    pfC1.setAnio5(390);
    pfC1.setAnio6(458);
    pfC1.setAnio7(789);
    pfC1.setAnio8(321);
    pfC1.setAnio9(654);
    pfC1.setVarPor(30);
    
    proyeccionesFilialesTot.add(pfC1);
    
    
    }

    public List<Proyecciones> getProyecciones() {
        return proyecciones;
    }

    public void setProyecciones(List<Proyecciones> proyecciones) {
        this.proyecciones = proyecciones;
    }

    public List<Proyecciones> getProyeccionesFiliales() {
        return proyeccionesFiliales;
    }

    public void setProyeccionesFiliales(List<Proyecciones> proyeccionesFiliales) {
        this.proyeccionesFiliales = proyeccionesFiliales;
    }

    public List<Proyecciones> getProyeccionesFilialesTot() {
        return proyeccionesFilialesTot;
    }

    public void setProyeccionesFilialesTot(List<Proyecciones> proyeccionesFilialesTot) {
        this.proyeccionesFilialesTot = proyeccionesFilialesTot;
    }
    
     public List<ProyeccionesHistoricos> getProyeccionesHistorico() {
        return proyeccionesHistorico;
    }

    public void setProyeccionesHistorico(List<ProyeccionesHistoricos> proyeccionesHistorico) {
        this.proyeccionesHistorico = proyeccionesHistorico;
    }

    public List<ProyeccionesHistoricos> getProyeccionesFilialesHistorico() {
        return proyeccionesFilialesHistorico;
    }

    public void setProyeccionesFilialesHistorico(List<ProyeccionesHistoricos> proyeccionesFilialesHistorico) {
        this.proyeccionesFilialesHistorico = proyeccionesFilialesHistorico;
    }

    
}