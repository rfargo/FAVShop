/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Aditya Pribadi,Reinaldy E. Fargo, Veber Sormin
 */
public class Buy {
        public void buy(String brand, String PhoneName,int amount,int amountown) throws SQLException{
        
        int amountleft = amountown-amount;
        
                 Connect con = new Connect();
                Connection myconObj = con.connect();

            String query = "UPDATE `phone information` SET `Amount` = ? WHERE `Brand` = ? AND `PhoneName` = ?";
            
            PreparedStatement pst = myconObj.prepareStatement(query);
             
            pst.setInt(1,amountleft);   
            pst.setString(2,brand);
            pst.setString(3,PhoneName);
            
            pst.execute();

            pst.close();           
    
    }
}
