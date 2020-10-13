/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.cx.models;

import java.util.LinkedHashMap;
import java.util.Map;

public class Player {
    
    private String name;
    
    private Map<Integer,Integer> goals;
    
    public Player() {
        goals = new LinkedHashMap<Integer,Integer>();
    }
    
    public Player(String name, Map<Integer,Integer> goals) {
        this.name = name;
        this.goals = goals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getGoals(int year) {
        return goals.get(year);
    }
}