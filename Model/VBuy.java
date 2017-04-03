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
public class VBuy {
    public int validate(String brand, String merek) throws SQLException{
                Connect con = new Connect();
                Connection myconObj = con.connect();
                 String query ="SELECT `Amount` FROM `data hp` WHERE `PhoneName` = ? AND `Merek` = ?";
                 
                 PreparedStatement pst = myconObj.prepareStatement(query);
            
                pst.setString(1,brand);
                pst.setString(2,merek);                    
                ResultSet rs = pst.executeQuery();
                
                int amountown = 0;
                
                if(rs.next()){
                amountown = rs.getInt("Amount");
                }
                
                return amountown;
    }
}
