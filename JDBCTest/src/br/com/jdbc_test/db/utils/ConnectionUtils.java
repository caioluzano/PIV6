/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jdbc_test.db.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 */
public class ConnectionUtils {
    
    private static Connection connection = null; 
    public static Connection getConnection() throws SQLException{
        
        if (connection == null || connection.isClosed()){
            String dbURL = "jdbc:mysql://localhost:3308/"+"jdbc_test?ServerTimezone=UTC";
            
            Properties properties = new Properties();
            properties.put("user", "root");
            properties.put("password", "");
            
            connection = DriverManager.getConnection(dbURL, properties);
        }
        return connection;
    }
    
}
