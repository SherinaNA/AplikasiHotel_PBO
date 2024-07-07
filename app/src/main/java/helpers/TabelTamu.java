/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

import entities.Tamu;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lenovo
 */
public class TabelTamu extends AbstractTableModel{
    List<Tamu> dataTamu;
    String[] header = {"No KTP", "Nama", "Alamat", "No Telp"};

    public TabelTamu(List<Tamu> dataTamu){
        this.dataTamu = dataTamu;
    }

    @Override
    public String getColumnName(int column) {
        return header[column];
    }
    
    @Override
    public int getRowCount() {
        return dataTamu.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Tamu tamu = dataTamu.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> tamu.getNoKtp();
            case 1 -> tamu.getNama();
            case 2 -> tamu.getAlamat();
            case 3 -> tamu.getNoTelp();
            default -> null;
        };
    }
}
