/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.dao;

import fr.solutec.model.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ESIC
 */
public class PoidsDao {

    public static void addPoids(User user, Poids poids) throws SQLException {
        String sql = "INSERT INTO poid (valeurpoid,user_iduser) VALUES (?,?)";
        Connection connexion = AccessDAO.getConnection();

        PreparedStatement ordre = connexion.prepareStatement(sql);

        ordre.setDouble(1, poids.getPoids());
        ordre.setInt(2, user.getId());
        ordre.execute();
    }

    public static List<Poids> getMyPoids(User user) throws SQLException {
        List<Poids> result = new ArrayList<>();

        String sql = "SELECT * FROM poid WHERE user_iduser=?";

        Connection connexion = AccessDAO.getConnection();
        PreparedStatement requette = connexion.prepareStatement(sql);

        requette.setInt(1, user.getId());

        ResultSet rs = requette.executeQuery(); //on stock la réponse de la requette sql dans rs

        while (rs.next()) {
            Poids p = new Poids();
            p.setId(rs.getInt("idpoid"));
            p.setPoids(rs.getDouble("valeurpoid"));
            p.setDate(rs.getDate("datepoid"));
            p.setUser(user);
            result.add(p);
        }
        return result;
    }

}

/*    public static List <User> getAll() throws SQLException{
        
    List <User>  result = new ArrayList<>();
        
        String sql = "SELECT* FROM personne";
        
        Connection connexion = AccessDao.getConnection();
        
        PreparedStatement requette = connexion.prepareStatement(sql); //vient de java sql
        
            
        ResultSet rs = requette.executeQuery(); //on stock la réponse de la requette sql dans rs
        
        while(rs.next()){
            User u = new User();
            u.setId(rs.getInt("idpersonne"));
            u.setNom(rs.getString("nom"));
            u.setPrenom(rs.getString("prenom"));
            u.setLogin(rs.getString("login"));
            result.add(u);
        }
        return result;
    }


public static void addUser(User user) throws SQLException {
        String sql = "INSERT INTO user (nomuser, prenomuser, mailuser, mdpuser, sexeuser, poidiniuser,tailleuser,ageuser) VALUES(?,?,?,?,?,?,?,?)";
        Connection connexion = AccessDAO.getConnection();
        PreparedStatement ordre = connexion.prepareStatement(sql);

        ordre.setString(1, user.getNom());
        ordre.setString(2, user.getPrenom());
        ordre.setString(3, user.getMail());
        ordre.setString(4, user.getMdp());
        ordre.setString(5, user.getSexe());
        ordre.setDouble(6, user.getPoid());
        ordre.setInt(7, user.getTaille());
        ordre.setInt(8, user.getAge());

        ordre.execute();
    }*/
