/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.cx.models;

import java.io.Serializable;

public class Sale implements Serializable {

    private String manufacturer;

    private int lastYearSale;

    private int thisYearSale;

    private int lastYearProfit;

    private int thisYearProfit;

    public Sale() {}

    public Sale(String manufacturer, int lastYearSale, int thisYearSale, int lastYearProfit, int thisYearProfit) {
        this.manufacturer = manufacturer;
        this.lastYearSale = lastYearSale;
        this.thisYearSale = thisYearSale;
        this.lastYearProfit = lastYearProfit;
        this.thisYearProfit = thisYearProfit;
    }

    public int getLastYearProfit() {
        return lastYearProfit;
    }

    public void setLastYearProfit(int lastYearProfit) {
        this.lastYearProfit = lastYearProfit;
    }

    public int getLastYearSale() {
        return lastYearSale;
    }

    public void setLastYearSale(int lastYearSale) {
        this.lastYearSale = lastYearSale;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getThisYearProfit() {
        return thisYearProfit;
    }

    public void setThisYearProfit(int thisYearProfit) {
        this.thisYearProfit = thisYearProfit;
    }

    public int getThisYearSale() {
        return thisYearSale;
    }

    public void setThisYearSale(int thisYearSale) {
        this.thisYearSale = thisYearSale;
    }
    
}
