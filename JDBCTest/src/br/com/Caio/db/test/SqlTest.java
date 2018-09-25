/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Caio.db.test;

/**
 *
 * @author caio.aluzano
 */
import br.com.jdbc_test.db.utils.ConnectionUtils;
import java.sql.Connection;

public class SqlTest {
    
    private static Connection con = null;
    
    public static void main(String[] args){
        try{
            con = ConnectionUtils.getConnection();
            
            System.out.println("Conectado");
        } catch (Exception e){
            e.printStackTrace();
        } finally{
            try {
                con.close();
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
}
