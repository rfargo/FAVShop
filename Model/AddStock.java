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
 * @author Aditya Pribadi,Reinaldy E. Fargo, Veber Sormin
 */
public class AddStock {
    // to validate
        public int validate(String brand, String phoneName, String batery, 
                                        String cam, String ram, String os, int price,int amount,InputStream gambar,
                                        String camf, String internalm, String externalm) 
                                        throws SQLException {
        int count = 0;
            if (brand != null && !brand.isEmpty()) {
                 count = count +1;
            }
            if (phoneName != null && !phoneName.isEmpty()) {
                 count = count +1;
            } 
            if (batery != null && !batery.isEmpty()) {
                 count = count +1;
            }            
            if (cam != null && !cam.isEmpty()) {
                 count = count +1;
            }
            if (ram != null && !ram.isEmpty()) {
                 count = count +1;
            }            
            if (os != null && !os.isEmpty()) {
                 count = count +1;
            }
            if (price > 0) {
                 count = count +1;
            } 
            if (amount > 0) {
                 count = count +1;
            }            
            if (gambar != null ) {
                 count = count +1;
            }
            if (camf != null && !camf.isEmpty()) {
                 count = count +1;
            }            
            if (internalm != null && !internalm.isEmpty()) {
                 count = count +1;
            }            
            if (externalm != null && !externalm.isEmpty()) {
                 count = count +1;
            }
            return count;                
    }
    
    public void addStock(String brand, String phoneName, String batery, 
                                        String cam, String ram, String os, int price,int amount,InputStream gambar,
                                        String camf, String internalm, String externalm) 
                                        throws SQLException 
                {
                Connect con = new Connect();
                Connection myconObj = con.connect();
                
                //to database
            String query = "INSERT INTO `phone information` (Brand, PhoneName,`Battery`,"
                                    + "Camera,RAM,OS,Price,Amount,Picture,CameraFront,`Internal Memory`, `External Memory`) "
                                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement pst = myconObj.prepareStatement(query);
            
            pst.setString(1,brand);
            pst.setString(2,phoneName);
            pst.setString(3,batery);
            pst.setString(4,cam);                    
            pst.setString(5,ram);
            pst.setString(6,os);                    
            pst.setInt(7,price);   
            pst.setInt(8,amount);   
            pst.setBlob(9, gambar);
            pst.setString(10,camf);                    
            pst.setString(11,internalm);
            pst.setString(12,externalm);                                
            pst.execute();

            pst.close();           
    }
}
