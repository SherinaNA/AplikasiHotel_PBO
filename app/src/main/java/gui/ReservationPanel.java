/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import entities.Reservation;
import helpers.TabelReservasi;
import java.util.List;
import models.ReservationDAO;
import models.ReservationSQLite;

/**
 *
 * @author lenovo
 */
public class ReservationPanel extends javax.swing.JPanel {

    ReservationDAO daoReservasi;
    List<Reservation> dataReservation;
    
    /**
     * Creates new form ReservationPanel
     */
    public ReservationPanel() {
        initComponents();
        daoReservasi = new ReservationSQLite();
        refreshData();
    }
    
    public void refreshData(){
        dataReservation = daoReservasi.getAll();
        tblResv.setModel(new TabelReservasi(dataReservation));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblReservation = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResv = new javax.swing.JTable();

        lblReservation.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblReservation.setText("Rekap Data Reservasi");

        tblResv.setModel(new javax.swing.table.DefaultTableModel(
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
        tblResv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblResvMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblResv);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblReservation)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblReservation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblResvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblResvMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblResvMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblReservation;
    private javax.swing.JTable tblResv;
    // End of variables declaration//GEN-END:variables
}
