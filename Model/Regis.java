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
public interface Regis {
         int validate(String mail, String fname, String lname, String uname, String passw)throws SQLException;
        void register(String mail, String fname, String lname, String uname, String passw) throws SQLException;
}
