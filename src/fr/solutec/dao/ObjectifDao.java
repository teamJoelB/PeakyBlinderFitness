/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.dao;

import fr.solutec.model.Poids;
import fr.solutec.model.User;
import fr.solutec.model.Objectif;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ESIC
 */
public class ObjectifDao {
    public static void addObjectif (User user, Objectif obj) throws SQLException {
        
        String sql = "INSERT INTO objectif (dateobjectif, typeobjectif,deltapoid) VALUES (?,?,?,?)";
        
        Connection connexion = AccessDAO.getConnection();

        PreparedStatement ordre = connexion.prepareStatement(sql);

        //ordre.setDouble(1, obj.getDate());
        ordre.setString(2, obj.getType());
        ordre.setDouble(3, obj.getDelta());
        

    }
    
}
