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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class BindBuyer {
            public ArrayList<ShopList> BindBuyer(String name) throws SQLException{

        Connect con = new Connect();
        Connection myconObj = con.connect();
        
   ArrayList<ShopList> list = new ArrayList<>();
   
            String sql = "SELECT `NoteNo`,`BuyerName`, `BrandName`,`Type`,`HargaSatuan`,`TotalBought`,`TotalAmount`"
                             + " FROM `payment` WHERE `BuyerName` = ? ";

            PreparedStatement pst = myconObj.prepareStatement(sql);
            pst.setString(1, name);
            ResultSet rs = pst.executeQuery();
   
                ShopList p;
                    while(rs.next()){
                        p = new ShopList(
                                rs.getInt("NoteNo"),
                                rs.getString("BuyerName"),
                                rs.getString("BrandName"),
                                rs.getString("Type"),
                                 rs.getInt("HargaSatuan"),
                                 rs.getInt("TotalBought"),
                                rs.getInt("TotalAmount")
                     );
                  list.add(p);
            }
                return list;
   
           } 
}