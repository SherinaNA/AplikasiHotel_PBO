/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

import entities.Reservation;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lenovo
 */
public class TabelBooking extends AbstractTableModel {
    
    List<Reservation> dataBooking;
    String[] header = {"ID", "No KTP", "Nama", "No Kamar"};

    // Konstruktor yang menerima data booking dari getBookRoomData()
    public TabelBooking(List<Reservation> dataBooking) {
        this.dataBooking = dataBooking;
    }

    @Override
    public String getColumnName(int column) {
        return header[column];
    }
    
    @Override
    public int getRowCount() {
        return dataBooking.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Reservation reservation = dataBooking.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return reservation.getId();
            case 1:
                return reservation.getTamu().getNoKtp();
            case 2:
                return reservation.getTamu().getNama();
            case 3:
                return reservation.getKamar().getNoKamar();
            default:
                return null;
        }
    }
}
