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
public class TabelReservasi extends AbstractTableModel {

    List<Reservation> dataReservasi;
    String[] header = {"ID", "No KTP", "Nama", "No Kamar", "Tgl Check-In", "Tgl Check-Out", "Total Tagihan", "Deposit", "Status"};
    
    public TabelReservasi(List<Reservation> dataReservasi) {
        this.dataReservasi = dataReservasi;
    }
    
    @Override
    public String getColumnName(int column) {
        return header[column];
    }
    
    @Override
    public int getRowCount() {
        return dataReservasi.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Reservation reservation = dataReservasi.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return reservation.getId();
            case 1:
                return reservation.getTamu().getNoKtp();
            case 2:
                return reservation.getTamu().getNama();
            case 3:
                return reservation.getKamar().getNoKamar();
            case 4:
                return reservation.getCheckInDate();
            case 5:
                return reservation.getCheckOutDate();
            case 6:
                return reservation.getTotalPrice();
            case 7:
                return reservation.getDeposit();
            case 8:
                if (reservation.isCheckedIn() && reservation.isCheckedOut()) {
                    return "Checked Out";
                } else if (reservation.isCheckedIn()) {
                    return "Checked In";
                } else {
                    return "Not Checked In";
                }
            default:
                return null;
        }
    }
}
