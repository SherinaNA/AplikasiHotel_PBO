/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

import entities.Kamar;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lenovo
 */
public class TabelKamar extends AbstractTableModel{
    
    List<Kamar> dataKamar;
    String[] header = {"No Kamar", "Jenis Kamar", "Harga", "Status"};

    public TabelKamar(List<Kamar> dataKamar) {
        this.dataKamar = dataKamar;
    }

    @Override
    public String getColumnName(int column) {
        return header[column];
    }
    
    @Override
    public int getRowCount() {
        return dataKamar.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Kamar kamar = dataKamar.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> kamar.getNoKamar();
            case 1 -> kamar.getJenisKamar();
            case 2 -> kamar.getHarga();
            case 3 -> kamar.isAvailable() ? "Available" : "Not Available";
            default -> null;
        };
    }   
}
