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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ESIC
 */
public class ObjectifDao {
    public static void addObjectif (User user, Objectif obj) throws SQLException {
        
        String sql = "INSERT INTO objectif (dateobjectif, typeobjectif,deltapoid,user_iduser) VALUES (?,?,?,?)";
        
        Connection connexion = AccessDAO.getConnection();

        PreparedStatement ordre = connexion.prepareStatement(sql);

        ordre.setDate(1, obj.getDate());
        ordre.setString(2, obj.getType());
        ordre.setDouble(3, obj.getDelta());
        ordre.setInt(4, user.getId());
        ordre.execute();

    }
    
    public static List<Objectif> getMyObjectifs (User user) throws SQLException {
        List<Objectif> result = new ArrayList<>();

        String sql = "SELECT * FROM objectif WHERE user_iduser=?";

        Connection connexion = AccessDAO.getConnection();
        PreparedStatement requette = connexion.prepareStatement(sql);

        requette.setInt(1, user.getId());

        ResultSet rs = requette.executeQuery(); //on stock la réponse de la requette sql dans rs

        while (rs.next()) {
            Objectif o = new Objectif();
            o.setId(rs.getInt("idobjectif"));
            o.setType(rs.getString("typeobjectif"));
            o.setDate(rs.getDate("dateobjectif"));
            o.setDelta(rs.getDouble("deltapoid"));
            o.setUser(user);
            result.add(o);
        }
        

        
        
        return result;
    }
    
}
