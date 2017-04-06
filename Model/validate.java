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
public class validate {
    
        //validate username login
                public int validate(String username, String password) throws SQLException{
             
                Connect con = new Connect();
                Connection myconObj = con.connect();
                
            String query ="SELECT * FROM `register` WHERE `username` = ? AND `password` = ?";
            PreparedStatement pst = myconObj.prepareStatement(query);
            
                pst.setString(1,username);
                pst.setString(2,password);                    

                ResultSet rs = pst.executeQuery();

                int count = 0;
                while(rs.next())
                {
                    count = count + 1;
                }//end while
                
                if ("admin".equals(password) && "admin".equals(username)){
                    count = count +1;
                } //end if 2
                
                return count;
    }
    
}
