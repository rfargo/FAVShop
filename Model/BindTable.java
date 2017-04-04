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
 * @author Aditya Pribadi,Reinaldy E. Fargo, Veber Sormin
 */
public class BindTable {
        public ArrayList<Product> BindTable() throws SQLException{

        Connect con = new Connect();
        Connection myconObj = con.connect();
        
   ArrayList<Product> list = new ArrayList<>();
   
   try {
       String query = "SELECT Amount, PhoneName, Brand, Price, Battery, Camera, RAM, OS, ID, "
                           + "CameraFront,`Internal Memory`,`External Memory`, Picture FROM `phone information`";
            PreparedStatement pst = myconObj.prepareStatement(query);
 ResultSet  rs = pst.executeQuery(query);
   
   Product p;
   while(rs.next()){
   p = new Product(
           rs.getInt("Amount"),
           rs.getString("PhoneName"),
           rs.getString("Brand"),           
           rs.getInt("Price"),
           rs.getString("Battery"),
           rs.getString("Camera"),           
           rs.getString("RAM"),
           rs.getString("OS"),           
           rs.getString("CameraFront"),           
           rs.getString("Internal Memory"),
           rs.getString("External Memory"),           
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
