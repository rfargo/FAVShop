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
 * @author Aditya Pribadi,Reinaldy E. Fargo, Veber Sormin
 */
public class VBuy {
      public int validate(String brand, String phoneName) throws SQLException{
                Connect con = new Connect();
                Connection myconObj = con.connect();
                 String query ="SELECT `Amount` FROM `phone information` WHERE `Brand` = ? AND `PhoneName` = ?";
                 
                 PreparedStatement pst = myconObj.prepareStatement(query);
            
                pst.setString(1,brand);
                pst.setString(2,phoneName);                    
                ResultSet rs = pst.executeQuery();
                
                int amountown = 0;
                
                if(rs.next()){
                amountown = rs.getInt("Amount");
                }
                
                return amountown;
    }  
}
