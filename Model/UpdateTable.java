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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class UpdateTable {
    
        public ArrayList<Product2> getData(String PhoneName) throws SQLException{
        
                    Connect con = new Connect();
        Connection myconObj = con.connect();

            ArrayList<Product2> list = new ArrayList<>();
            ResultSet rs;
   
            try {
             String sql = "SELECT * FROM `data hp` WHERE `PhoneName` = ? ";
            
            PreparedStatement pst = myconObj.prepareStatement(sql);
            pst.setString(1, PhoneName);
            rs = pst.executeQuery();
   
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
   Logger.getLogger(UpdateTable.class.getName()).log(Level.SEVERE, null, ex);
   }
   return list;
   }
}
