/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Connect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.Query;

/**
 *
 * @author user
 */
public class UpdateText {
        
    
    public ArrayList<Product2> getData(String PhoneName,String Merek) throws SQLException{
        
                                    Connect con = new Connect();
        Connection myconObj = con.connect();
        
            ArrayList<Product2> list = new ArrayList<>();
            ResultSet rs;
   
            try {
                
                                 Statement st = myconObj.createStatement();
                 
                             String sql = "SELECT `Amount`,`Harga` FROM `data hp` WHERE `PhoneName` = ? "
                                                    + "AND `Merek` = ? ";
            
            PreparedStatement pst = myconObj.prepareStatement(sql);
            pst.setString(1, PhoneName);
            pst.setString(2, Merek);
            rs = pst.executeQuery();
                   
                Product2 p;
                    while(rs.next()){
                        p = new Product2(
                                rs.getInt("Amount"),
                         rs.getString("PhoneName"),
                        rs.getString("Merek"),
                                rs.getInt("Harga")
                     );
                  list.add(p);
            }
   
           } catch (SQLException ex) {
   Logger.getLogger(UpdateText.class.getName()).log(Level.SEVERE, null, ex);
   }
   return list;
   }

}
