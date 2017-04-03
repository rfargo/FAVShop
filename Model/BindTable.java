/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class BindTable {
    
    public ArrayList<Product2> BindTable() throws SQLException{

        Connect con = new Connect();
        Connection myconObj = con.connect();
        
   ArrayList<Product2> list = new ArrayList<>();
   
   try {
       String query = "SELECT Amount, PhoneName, Merek, Harga, batre, kamera, ram, os, Picture FROM `data hp`";
            PreparedStatement pst = myconObj.prepareStatement(query);
 ResultSet  rs = pst.executeQuery(query);
   
   Product2 p;
   while(rs.next()){
   p = new Product2(
           rs.getInt("Amount"),
           rs.getString("PhoneName"),
           rs.getString("Merek"),           
           rs.getInt("Harga"),
           rs.getString("batre"),
           rs.getString("kamera"),           
           rs.getString("ram"),
           rs.getString("os"),           
           rs.getBytes("Picture")
   );
   list.add(p);
   }
   
   } catch (SQLException ex) {
   Logger.getLogger(BindTable.class.getName()).log(Level.SEVERE, null, ex);
   }
   
   return list;
   }
}
