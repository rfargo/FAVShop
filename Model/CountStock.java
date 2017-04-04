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
public class CountStock {
            public int countStock() throws SQLException{
                Connect con = new Connect();
                Connection myconObj = con.connect();

              String sql = "SELECT * FROM `phone information`" ;
            
             PreparedStatement pst = myconObj.prepareStatement(sql);
            ResultSet rst= pst.executeQuery(sql);
                        
            
            ArrayList<Integer> test = new ArrayList<>();                        
            
            while (rst.next()) {
                test.add(rst.getInt("Amount"));
           }         
            int n = test.size();
            int sum = 0;
            for (int i = 0; i < n; i++){
                sum += test.get(i);          
            }

            return sum;
    }

}
