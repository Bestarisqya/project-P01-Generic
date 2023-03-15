/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generic;


import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author LENOVO
 */
public class KoleksiMusik extends AbstractTableModel{
    List<Musik> list = new ArrayList<>();

    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public String getColumnName(int column) {
        switch(column){
           case 0 : return "JUDUL LAGU";
           case 1 : return "UKURAN";
           default: return "";

        }
    }
    
    public void add(Musik m){
        list.add(m); 
        fireTableRowsInserted(getRowCount(),getColumnCount());
        
    }
    
    public void set(int i , Musik m){
        list.set(i, m);
        fireTableDataChanged();
        

    }
    
    public void clear(){
        list.clear();
        fireTableDataChanged();
        
    }
    
    public void remove(int row){
        list.remove(row);
        fireTableRowsDeleted(row, row);
        
    }
    
    public Musik get(int row){
        return (Musik) list.get(row);
        
    }

        
    
    
        
    }
    

