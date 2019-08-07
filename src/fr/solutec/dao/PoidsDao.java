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
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ESIC
 */
public class PoidsDao {
    public static void addPoid (User user) throws SQLException {
        String sql = "INSERT INTO ";
                
}
    
  }
       
 public static void addUser(User user) throws SQLException {
        String sql = "INSERT INTO user (nomuser, prenomuser, mailuser, mdpuser, sexeuser, poidiniuser"
                + "tailleuser,ageuser) VALUES(?,?,?,?,?,?,?,?)";
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
    }
