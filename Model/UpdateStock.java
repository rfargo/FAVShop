/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Connect;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class UpdateStock {
        public void updateStock(String brand, String type, int price,int amount) throws SQLException {
                Connect con = new Connect();
                Connection myconObj = con.connect();

            String query = "UPDATE `data hp` SET `Harga` = ?, `Amount` = ? WHERE `PhoneName` = ? AND `Merek` = ?";
            
            PreparedStatement pst = myconObj.prepareStatement(query);
            
            pst.setInt(1,price);   
            pst.setInt(2,amount);   
            pst.setString(3,brand);
            pst.setString(4,type);
            
            pst.execute();

            pst.close();           
    
    }
}
