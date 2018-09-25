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
import java.sql.*;

public class SqlTest {
    
    private static Connection con = null;
    
    public static void insert() throws SQLException{
        String sql = "INSERT INTO cliente VALUES (?,?,?)";
        
        PreparedStatement pst = con.prepareStatement(sql);
        
        pst.setInt(1,0);
        pst.setString(2, "Maria");
        pst.setString(3, "F");
        
        pst.execute();
    }
    
    public static void listAll() throws SQLException{
        String sql = "SELECT * FROM cliente";
        
        PreparedStatement pst = con.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery();
        
        while(rs.next()){
            System.out.println(rs.getString("Nome")+" "+ rs.getString("Genero"));
        }
    }
    
    public static void update() throws SQLException{
        String sql = "UPDATE cliente SET Nome=?, Genero=? WHERE id=?";
        
        PreparedStatement pst = con.prepareStatement(sql);
        
        pst.setString(1, "José");
        pst.setString(2, "F");
        pst.setInt(3, 0);
        
        pst.execute();
    }
    
    public static void delete() throws SQLException{
        String sql = "DELETE FROM cliente WHERE id=?";
    
        PreparedStatement pst = con.prepareStatement(sql);
        
        pst.setInt(1, 0);
        
        pst.execute();
    }
    
    public static void main(String[] args){
        try{
            con = ConnectionUtils.getConnection();
            
            insert();
            listAll();
            update();
            listAll();
            delete();
            listAll();
            System.out.println("Sucesso");
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
