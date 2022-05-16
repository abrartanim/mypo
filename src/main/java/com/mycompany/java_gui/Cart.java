/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_gui;

import java.util.ArrayList;

/**
 *
 * @author abrar
 */
public class Cart {
    private ArrayList<String> item = new ArrayList<String>();
    private ArrayList<String> cost = new ArrayList<String>();

    public void removeItem(int a)
    {
        item.remove(a);
        cost.remove(a);
    }
    public String getItem(int a) {
        return item.get(a);
    }
    
    public int getsize()
    {
        return item.size();
    }

    public void setItem(String a) {
        this.item.add(a);
    }

    public String getCost(int a) {
        return cost.get(a);
    }

    public void setCost(String a) {
        this.cost.add(a);
    }
    
    
}
