/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.model;

/**
 *
 * @author ESIC
 */
public class User {
    private int id;
    private String nom;
    private String prenom;
    private String mail;
    private String mdp;
    private String sexe;
    private double poid;
    private int taille;
    private int age;

       public User(int id, String nom, String prenom, String mail, String mdp, String sexe, double poid, int taille, int age) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.mdp = mdp;
        this.sexe = sexe;
        this.poid = poid;
        this.taille = taille;
        this.age = age;
    }

    public User() {
    }

    
    
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getMail() {
        return mail;
    }

    public String getMdp() {
        return mdp;
    }

    public String getSexe() {
        return sexe;
    }

    public double getPoid() {
        return poid;
    }

    public int getTaille() {
        return taille;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setPoid(double poid) {
        this.poid = poid;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", mail=" + mail + ", mdp=" + mdp + ", sexe=" + sexe + ", poid=" + poid + ", taille=" + taille + ", age=" + age + '}';
    }

 
    


}
