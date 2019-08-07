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
public class UserDao {
    public static User getByLoginPass(String mail, String mdp)throws SQLException{
        User result = null;
        String sql = "SELECT* FROM user WHERE mailuser=?AND mdpuser=?";
        
        Connection connexion = AccessDAO.getConnection();
        
        PreparedStatement requette = connexion.prepareStatement(sql); //vient de java sql
        
        requette.setString(1, mail);
        requette.setString(2, mdp);
        
        ResultSet rs = requette.executeQuery(); //on stock la réponse de la requette sql dans rs
        
        if (rs.next()){
            result = new User();
            result.setId(rs.getInt("iduser"));
            result.setNom(rs.getString("nomuser"));
            result.setPrenom(rs.getString("prenomuser"));
            result.setAge(rs.getInt("ageuser"));
            result.setPoid(rs.getDouble("poidiniuser"));
            result.setSexe(rs.getString("sexeuser"));
            result.setTaille(rs.getInt("tailleuser"));
            result.setPrenom(rs.getString("prenom"));
            result.setMail(rs.getString("mailuser"));  
            result.setMdp(rs.getString("mdpuser"));  
            
        }
        
        return result;
    }
    
        public static void addUser(User user) throws SQLException{
        String sql = "INSERT INTO user (nomuser, prenomuser, mailuser, mdpuser, sexeuser, poidiniuser"
                + "tailleuser,ageusuer) VALUES(?,?,?,?,?,?,?,?)";
        Connection connexion = AccessDAO.getConnection();
        PreparedStatement ordre = connexion.prepareStatement(sql);
        
        ordre.setString(1, user.getNom());
        ordre.setString(2, user.getPrenom());
        ordre.setString(3, user.getMail());
        ordre.setString(4, user.getMdp());
        ordre.setString(5, user.getMdp());
        ordre.setString(6, user.getMdp());
        ordre.setString(7, user.getMdp());
        ordre.setString(8, user.getMdp());
             
        ordre.execute();       
}
}
