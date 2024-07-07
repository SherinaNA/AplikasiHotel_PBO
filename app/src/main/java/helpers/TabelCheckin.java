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
public class TabelCheckin extends AbstractTableModel{
    
    List<Reservation> dataCheckin;
    String[] header = {"Id", "No KTP", "Nama", "No Kamar", "Tgl Check-In", "Deposit", "Status"};

    public TabelCheckin(List<Reservation> dataCheckin) {
        this.dataCheckin = dataCheckin;
    }

    @Override
    public String getColumnName(int column) {
        return header[column];
    }
    
    @Override
    public int getRowCount() {
        return dataCheckin.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Reservation reservation = dataCheckin.get(rowIndex);
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
                return reservation.getDeposit();
            case 6:
                return reservation.isCheckedIn() ? "Checked In" : "Not Checked In";
            default:
                return null;
        }
    }
}
