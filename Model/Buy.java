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

/**
 *
 * @author user
 */
public class Buy {

    public void buy(String brand, String merek,int amount,int amountown) throws SQLException{
        
        int amountleft = amountown-amount;
        
                 Connect con = new Connect();
                Connection myconObj = con.connect();

            String query = "UPDATE `data hp` SET `Amount` = ? WHERE `PhoneName` = ? AND `Merek` = ?";
            
            PreparedStatement pst = myconObj.prepareStatement(query);
             
            pst.setInt(1,amountleft);   
            pst.setString(2,brand);
            pst.setString(3,merek);
            
            pst.execute();

            pst.close();           
    

                
    }
}
