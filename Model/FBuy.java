/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.SQLException;

/**
 *
 * @author Aditya Pribadi,Reinaldy E. Fargo, Veber Sormin
 */
public interface FBuy {
    void buy(String name,String brand, String phoneName, int priceamount, int amount, 
                                        int totalprice, int cnn,int cvv,int zip, String address) throws SQLException;
    int checkZero(String brand, String phoneName) throws SQLException;
    void deleteZero(String brand, String phoneName) throws SQLException;
}
