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
    private Date date;
    private User user;   

    public Poids() {
    }

    public Poids(int id, Date date, User user) {
        this.id = id;
        this.date = date;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
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

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Poids{" + "id=" + id + ", date=" + date + ", user=" + user + '}';
    }

    
       
}

