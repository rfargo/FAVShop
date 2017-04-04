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

/**
 *
 * @author Aditya Pribadi,Reinaldy E. Fargo, Veber Sormin
 */
public class CountUser {
    
    public int count() throws SQLException{
                    Connect con = new Connect();
                Connection myconObj = con.connect();

              String sql = "SELECT * FROM `register`" ;
            
             PreparedStatement pst = myconObj.prepareStatement(sql);
            ResultSet rst= pst.executeQuery(sql);
            
            ArrayList<String> testnum = new ArrayList<>();

            int count = 0;
            while (rst.next()) {
            testnum.add( rst.getString("username"));
            count ++;
            }
            
            return count;
    }
}
