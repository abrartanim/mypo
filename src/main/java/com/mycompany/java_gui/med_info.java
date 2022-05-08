/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_gui;

/**
 *
 * @author abrar
 */
public class med_info extends fileio{
    private String name;
    private String company;
    private String exp_date;
    private String cost;

    public med_info(String name, String company, String exp_date, String cost) {
        this.name = name;
        this.company = company;
        this.exp_date = exp_date;
        this.cost = cost;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getExp_date() {
        return exp_date;
    }

    public void setExp_date(String exp_date) {
        this.exp_date = exp_date;
    }
    
    
}
