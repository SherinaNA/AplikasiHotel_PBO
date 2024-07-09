/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import entities.Kamar;
import entities.Reservation;
import helpers.TabelBooking;
import helpers.TabelCheckin;
import helpers.TabelCheckout;
import helpers.TabelKamar;
import java.util.List;
import models.KamarDAO;
import models.KamarSQLite;
import models.ReservationDAO;
import models.ReservationSQLite;

/**
 *
 * @author lenovo
 */
public class MainPanel extends javax.swing.JPanel {

    KamarDAO daoKamar;
    ReservationDAO daoReservasi;
    List<Kamar> dataKamar;
    List<Reservation> dataBooking;
    List<Reservation> dataCheckin;
    List<Reservation> dataCheckout;
    
    /**
     * Creates new form MainPanel
     */
    public MainPanel() {
        initComponents();
        daoKamar = new KamarSQLite();
        daoReservasi = new ReservationSQLite();
        refreshData();
    }

    public void refreshData(){
        dataKamar = daoKamar.getAll();
        dataBooking = daoReservasi.getBookRoomData();
        dataCheckin = daoReservasi.getCheckInData();
        dataCheckout = daoReservasi.getCheckOutData();
        
        tblCheckIn.setModel(new TabelCheckin(dataCheckin));
        tblKamar.setModel(new TabelKamar(dataKamar));
        tblBooking.setModel(new TabelBooking(dataBooking));
        tblCheckOut.setModel(new TabelCheckout(dataCheckout));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblStatusKamar = new javax.swing.JLabel();
        lblStatusCheckin = new javax.swing.JLabel();
        lblStatusCheckout = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKamar = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCheckIn = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCheckOut = new javax.swing.JTable();
        lblStatusBooking = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblBooking = new javax.swing.JTable();

        lblStatusKamar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblStatusKamar.setText("Status Kamar");

        lblStatusCheckin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblStatusCheckin.setText("Status Tamu Check-In");

        lblStatusCheckout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblStatusCheckout.setText("Status Tamu Check-Out");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tblKamar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblKamar.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(tblKamar);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setAutoscrolls(true);

        tblCheckIn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblCheckIn.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblCheckIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCheckInMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCheckIn);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tblCheckOut.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblCheckOut.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblCheckOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCheckOutMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblCheckOut);

        lblStatusBooking.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblStatusBooking.setText("Status Booking");

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tblBooking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblBooking.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane4.setViewportView(tblBooking);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblStatusBooking)
                    .addComponent(lblStatusKamar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStatusCheckout)
                            .addComponent(lblStatusCheckin))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatusKamar)
                    .addComponent(lblStatusCheckin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatusBooking)
                    .addComponent(lblStatusCheckout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblCheckOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCheckOutMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
        int row = tblCheckOut.getSelectedRow();
            if (row != -1) {
                // Ambil data Reservation dari model tabel
                Reservation reservation = dataCheckout.get(row);

                // Temukan frame yang menaungi panel ini (MainPanel misalnya)
                java.awt.Frame parentFrame = (java.awt.Frame) javax.swing.SwingUtilities.windowForComponent(this);

                // Tampilkan JDialog RincianForm dengan frame sebagai induk
                RincianForm rincianForm = new RincianForm(parentFrame, true, reservation);
                rincianForm.setVisible(true);
            }
        }
    }//GEN-LAST:event_tblCheckOutMouseClicked

    private void tblCheckInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCheckInMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
        int row = tblCheckIn.getSelectedRow();
            if (row != -1) {
                // Ambil data Reservation dari model tabel
                Reservation reservation = dataCheckin.get(row);

                // Temukan frame yang menaungi panel ini (MainPanel misalnya)
                java.awt.Frame parentFrame = (java.awt.Frame) javax.swing.SwingUtilities.windowForComponent(this);

                // Tampilkan JDialog RincianForm dengan frame sebagai induk
                RincianCheckin rincianCheckin = new RincianCheckin(parentFrame, true, reservation);
                rincianCheckin.setVisible(true);
            }
        }
    }//GEN-LAST:event_tblCheckInMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblStatusBooking;
    private javax.swing.JLabel lblStatusCheckin;
    private javax.swing.JLabel lblStatusCheckout;
    private javax.swing.JLabel lblStatusKamar;
    private javax.swing.JTable tblBooking;
    private javax.swing.JTable tblCheckIn;
    private javax.swing.JTable tblCheckOut;
    private javax.swing.JTable tblKamar;
    // End of variables declaration//GEN-END:variables
}
