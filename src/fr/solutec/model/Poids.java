/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.model;

import java.util.Date;

/**
 *
 * @author ESIC
 */
public class Poids {
    private int id;
    private double poids;
    private Date date;
    private User user;   

    public Poids() {
    }

    public Poids(int id, double poids, Date date, User user) {
        this.id = id;
        this.poids = poids;
        this.date = date;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
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
        return "Poids{" + "id=" + id + ", poids=" + poids + ", date=" + date + ", user=" + user + '}';
    }

    
    
}

