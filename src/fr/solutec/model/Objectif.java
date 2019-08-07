/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.model;

import java.sql.Date;

/**
 *
 * @author ESIC
 */
public class Objectif {
    private int id;
    private Date date;
    private String type;
    private  double delta;
    private User user;

    public Objectif() {
    }

    public Objectif(int id, Date date, String type, double delta, User user) {
        this.id = id;
        this.date = date;
        this.type = type;
        this.delta = delta;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    public double getDelta() {
        return delta;
    }

    public User getUser() {
        return user;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDelta(double detla) {
        this.delta = detla;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Objectif{" + "id=" + id + ", date=" + date + ", type=" + type + ", detla=" + delta + ", user=" + user + '}';
    }
    
    
   }
