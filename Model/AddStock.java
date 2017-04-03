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
public class AddStock {


    public void addStock(String brand, String type, String batery, String cam, String ram, String os, int price,int amount,InputStream gambar) throws SQLException {
                Connect con = new Connect();
                Connection myconObj = con.connect();

            String query = "INSERT INTO `data hp` (PhoneName,`Merek`,`batre`,kamera,ram,os,Harga,Amount,Picture) VALUES (?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement pst = myconObj.prepareStatement(query);
            
            pst.setString(1,brand);
            pst.setString(2,type);
            pst.setString(3,batery);
            pst.setString(4,cam);                    
            pst.setString(5,ram);
            pst.setString(6,os);                    
            pst.setInt(7,price);   
            pst.setInt(8,amount);   
            pst.setBlob(9, gambar);
            
            pst.execute();

            pst.close();           
    }
}
