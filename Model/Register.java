/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Connect;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author user
 */
public class Register {

    public int validate(String mail, String fname, String lname, String uname, String passw) throws SQLException{
        int count = 0;
            if (mail != null && !mail.isEmpty()) {
                 count = count +1;
            }
            if (fname != null && !fname.isEmpty()) {
                 count = count +1;
            } 
            if (lname != null && !lname.isEmpty()) {
                 count = count +1;
            }            
            if (uname != null && !uname.isEmpty()) {
                 count = count +1;
            }
            if (passw != null && !passw.isEmpty()) {
                 count = count +1;
            }            
            return count;
                
    }
    
    public void register(String mail, String fname, String lname, String uname, String passw) throws SQLException {
        
                Connect con = new Connect();
                Connection myconObj = con.connect();

            String query = "INSERT INTO `register` (email,`first name`,`last name`,username,password) VALUES (?,?,?,?,?)";
            
            PreparedStatement pst = myconObj.prepareStatement(query);
            
            pst.setString(1,mail);
            pst.setString(2,fname);
            pst.setString(3,lname);
            pst.setString(4,uname);                    
            pst.setString(5,passw);
               
            pst.execute();

            pst.close();           
    }                                        
}

