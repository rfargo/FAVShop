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
public class FinalBuy implements FBuy{
    
                public int validate( int cnn,int cvv,int zip, String address) throws SQLException{
        int count = 0;
            if (cnn > 0 ) {
                 count = count +1;
            }            
            if (cvv > 0) {
                 count = count +1;
            }
            if (zip > 0) {
                 count = count +1;
            }
            if (address != null && !address.isEmpty()) {
                 count = count +1;
            } 
            return count;                
    }
    
                //poly
            @Override
            public void buy(String name,String brand, String phoneName, int priceamount, int amount, 
                                        int totalprice, int cnn,int cvv,int zip, String address) throws SQLException{
                
                 Connect con = new Connect();
                Connection myconObj = con.connect();

      String query = " insert into payment (`BuyerName`, `BrandName`,`Type`,`HargaSatuan`,`TotalBought`,`TotalAmount`"
                                + ",`CreditNumber`,`CVV`,`ZIPCode`,`Address`)"
                                + " values (?, ?, ?, ?, ?,?, ?, ?, ?, ?)";

            PreparedStatement pst = myconObj.prepareStatement(query);
             
            pst.setString(1,name);   
            pst.setString(2,brand);
            pst.setString(3,phoneName);
            pst.setInt(4, priceamount);
            pst.setInt(5, amount);            
            pst.setInt(6, totalprice);
            pst.setInt(7, cnn);            
            pst.setInt(8, cvv);
            pst.setInt(9, zip);     
            pst.setString(10,address);           
            
            pst.execute();

            pst.close();           
    
    }
            //cek kalo habis
            @Override
            public int checkZero(String brand, String phoneName) throws SQLException{
                 Connect con = new Connect();
                Connection myconObj = con.connect();
                
                 String query ="SELECT `Amount` FROM `phone information` WHERE `Brand` = ? AND `PhoneName` = ?";
                 
                 PreparedStatement pst = myconObj.prepareStatement(query);
                 
                pst.setString(1,brand);
                pst.setString(2,phoneName);                    
                ResultSet rs = pst.executeQuery();
                
                int amount = 0;
                
                if(rs.next()){
                amount = rs.getInt("Amount");
                }
                
                return amount;
            }
            
            //hapus stok kosong
            @Override
            public void deleteZero(String brand, String phoneName) throws SQLException{
                 Connect con = new Connect();
                Connection myconObj = con.connect();
                
                 String query ="DELETE FROM `phone information` WHERE `Brand` = ? AND `PhoneName` = ?";
                 
                 PreparedStatement pst = myconObj.prepareStatement(query);
                 
                pst.setString(1,brand);
                pst.setString(2,phoneName);         
                
                pst.executeUpdate();
                
            }
}
