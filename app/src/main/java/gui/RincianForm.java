/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gui;

import entities.Reservation;

/**
 *
 * @author lenovo
 */
public class RincianForm extends javax.swing.JDialog {

    Reservation reservation;
    
    /**
     * Creates new form RincianForm
     */
    
    public RincianForm(java.awt.Frame parent, boolean modal, Reservation reservation) {
        super(parent, modal);
        this.reservation = reservation;
        initComponents();
        populateFields();
    }
    
    private void populateFields(){
        // Isi field dengan data dari reservation
        lblIdResv.setText(String.valueOf(reservation.getId()));
        lblTamuId.setText(reservation.getTamu().getNoKtp());
        lblNamaTamu.setText(reservation.getTamu().getNama());
        lblKamar.setText(reservation.getKamar().getNoKamar());
        lblCheckInDate.setText(reservation.getCheckInDate());
        lblCheckOutDate.setText(reservation.getCheckOutDate());
        lblDepo.setText(String.valueOf(reservation.getDeposit()));
        lblTotalTagih.setText(String.valueOf(reservation.getTotalPrice()));

        int sisaTagih = reservation.getTotalPrice() - reservation.getDeposit();
        lblSisaTagih.setText(String.valueOf(sisaTagih));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBills = new javax.swing.JLabel();
        lblNamaTamu = new javax.swing.JLabel();
        lblCheckInDate = new javax.swing.JLabel();
        lblTglOut = new javax.swing.JLabel();
        lblNoId = new javax.swing.JLabel();
        lblDepo = new javax.swing.JLabel();
        lblReservasi = new javax.swing.JLabel();
        lblNama = new javax.swing.JLabel();
        lblIdResv = new javax.swing.JLabel();
        lblNoKamar = new javax.swing.JLabel();
        lblTglIn = new javax.swing.JLabel();
        lblDp = new javax.swing.JLabel();
        lblTamuId = new javax.swing.JLabel();
        lblKamar = new javax.swing.JLabel();
        lblCheckOutDate = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblTotalTagih = new javax.swing.JLabel();
        lblSisa = new javax.swing.JLabel();
        lblSisaTagih = new javax.swing.JLabel();
        btnPrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblBills.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblBills.setText("Rincian Tagihan");

        lblNamaTamu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNamaTamu.setText("Nama Tamu");

        lblCheckInDate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCheckInDate.setText("Tgl Check In");

        lblTglOut.setText("Tanggal Check Out");

        lblNoId.setText("Id Tamu");

        lblDepo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDepo.setText("Deposit");

        lblReservasi.setText("Id Reservasi");

        lblNama.setText("Nama");

        lblIdResv.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblIdResv.setText("Id Reservasi");

        lblNoKamar.setText("Nomor Kamar");

        lblTglIn.setText("Tanggal Check In");

        lblDp.setText("Deposit");

        lblTamuId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTamuId.setText("Id Tamu");

        lblKamar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblKamar.setText("Kamar");

        lblCheckOutDate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCheckOutDate.setText("Tgl Check Out");

        lblTotal.setText("Total Tagihan");

        lblTotalTagih.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalTagih.setText("Total Tagihan");

        lblSisa.setText("Sisa Tagihan");

        lblSisaTagih.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSisaTagih.setText("Sisa Tagihan");

        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-print-48.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTglOut, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(lblDp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(58, 58, 58))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblNoId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblReservasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblBills, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblTglIn, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                .addComponent(lblNama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblNoKamar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDepo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblIdResv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblTamuId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblNamaTamu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblKamar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblCheckInDate, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCheckOutDate, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTotalTagih, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSisaTagih, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(126, 126, 126))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnPrint)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblBills)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblReservasi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNoId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNama)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNoKamar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTglIn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTglOut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSisa))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblIdResv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTamuId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNamaTamu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblKamar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCheckInDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCheckOutDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDepo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTotalTagih)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSisaTagih)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrint;
    private javax.swing.JLabel lblBills;
    private javax.swing.JLabel lblCheckInDate;
    private javax.swing.JLabel lblCheckOutDate;
    private javax.swing.JLabel lblDepo;
    private javax.swing.JLabel lblDp;
    private javax.swing.JLabel lblIdResv;
    private javax.swing.JLabel lblKamar;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblNamaTamu;
    private javax.swing.JLabel lblNoId;
    private javax.swing.JLabel lblNoKamar;
    private javax.swing.JLabel lblReservasi;
    private javax.swing.JLabel lblSisa;
    private javax.swing.JLabel lblSisaTagih;
    private javax.swing.JLabel lblTamuId;
    private javax.swing.JLabel lblTglIn;
    private javax.swing.JLabel lblTglOut;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalTagih;
    // End of variables declaration//GEN-END:variables
}
