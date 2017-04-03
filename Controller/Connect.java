/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class Connect {
          Connection myconObj;
        Statement mystatObj;

    public Connection connect()  throws SQLException{
             String url = "jdbc:mysql://localhost:3306/login";
            String uname = "root";
            String pass = "";
            myconObj = DriverManager.getConnection(url, uname, pass);
            mystatObj = myconObj.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            
            return myconObj;
    }
  
}
