/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author esic
 */
public class AccessDAO {

    protected static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
    protected static final String DB_NAME = "peakyblinderfitness";
    protected static final String URL = "jdbc:mysql://localhost/" + DB_NAME; //c'est le local host/bdd
    protected static final String USER = "root";
    protected static final String PASSWORD = "";

    static {
        try {
            Class.forName(DRIVER_NAME).newInstance();
            System.out.print("driver loeaded");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

}
