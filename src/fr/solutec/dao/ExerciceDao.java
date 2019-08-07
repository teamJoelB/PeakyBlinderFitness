/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.dao;

import fr.solutec.model.Objectif;
import fr.solutec.model.User;
import fr.solutec.model.Exercice;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;


/**
 *
 * @author ESIC
 */
public class ExerciceDao {
    
        public static void addExercice (User user, Exercice exo) throws SQLException {
        
        String sql = "INSERT INTO exercice (typeexercice, tempsexercice, dateexercice) VALUES (?,?,?)";
        
        Connection connexion = AccessDAO.getConnection();

        PreparedStatement ordre = connexion.prepareStatement(sql);

        ordre.setString(1, exo.getType());
        ordre.setInt(2, exo.getTemps());
        ordre.setDate(3, exo.getDate());

        ordre.execute();

    }
    
    public static List<Exercice> getMyExos(User user) throws SQLException {
        List<Exercice> result = new ArrayList<>();

        String sql = "SELECT * FROM exercice WHERE user_iduser=?";

        Connection connexion = AccessDAO.getConnection();
        PreparedStatement requette = connexion.prepareStatement(sql);

        requette.setInt(1, user.getId());

        ResultSet rs = requette.executeQuery(); //on stock la réponse de la requette sql dans rs

        while (rs.next()) {
            Exercice e = new Exercice();
            e.setId(rs.getInt("idexercice"));
            e.setType(rs.getString("typeexercice"));
            e.setTemps(rs.getInt("tempsexercice"));
            e.setDate(rs.getDate("dateexercice"));
            e.setUser(user);
            result.add(e);
        }
        

        
        
        return result;
    }
    
}
