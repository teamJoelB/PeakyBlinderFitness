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
public class Exercice {
    private int id;
    private String type;
    private int temps;
    private Date date;
    private User user;

    public Exercice() {
    }

    public Exercice(int id, String type, int temps, Date date, User user) {
        this.id = id;
        this.type = type;
        this.temps = temps;
        this.date = date;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTemps() {
        return temps;
    }

    public void setTemps(int temps) {
        this.temps = temps;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Exercice{" + "id=" + id + ", type=" + type + ", temps=" + temps + ", date=" + date + ", user=" + user + '}';
    }
 
    
    
    
}
