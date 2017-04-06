/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.Icon;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Aditya Pribadi,Reinaldy E. Fargo, Veber Sormin
 */
public class TheModel1 extends AbstractTableModel {

    private String[] columns;
    private Object[][] rows;
    
    public TheModel1(){}
    
    public TheModel1(Object[][] data, String[] columnName){
    
        this.rows = data;
        this.columns = columnName;
    }

 
    
    @Override
    public int getRowCount() {
     return this.rows.length;
    }

    @Override
    public int getColumnCount() {
     return this.columns.length;
    }

    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
    
    return this.rows[rowIndex][columnIndex];
    }
    @Override
    public String getColumnName(int col){
        return this.columns[col];
    }


}
