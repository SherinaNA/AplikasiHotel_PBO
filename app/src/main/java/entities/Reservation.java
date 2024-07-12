/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author lenovo
 */

public class Reservation {
    private int id;
    private Tamu tamu;
    private Kamar kamar;
    private String checkInDate;
    private String checkOutDate;
    private int totalPrice;
    private int deposit;
    private boolean isCheckedIn;
    private boolean isCheckedOut;

    // Constructor untuk proses bookRoom
    public Reservation(Tamu tamu, Kamar kamar) {
        this.tamu = tamu;
        this.kamar = kamar;
        this.isCheckedIn = false;
        this.isCheckedOut = false;
    }

    // Constructor untuk proses checkIn
    public Reservation(int id, Tamu tamu, Kamar kamar, String checkInDate, int deposit) {
        this.id = id;
        this.tamu = tamu;
        this.kamar = kamar;
        this.checkInDate = checkInDate;
        this.deposit = deposit;
        this.isCheckedIn = true;
        this.isCheckedOut = false;
    }

    // Constructor untuk proses checkOut
    public Reservation(int id, Tamu tamu, Kamar kamar, String checkInDate, String checkOutDate, int totalPrice, int deposit) {
        this.id = id;
        this.tamu = tamu;
        this.kamar = kamar;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.totalPrice = totalPrice;
        this.deposit = deposit;
        this.isCheckedIn = true;
        this.isCheckedOut = true;
    }

    // Constructor untuk mengambil seluruh data dari database
    public Reservation(int id, Tamu tamu, Kamar kamar, String checkInDate, String checkOutDate, int totalPrice, int deposit, boolean isCheckedIn, boolean isCheckedOut) {
        this.id = id;
        this.tamu = tamu;
        this.kamar = kamar;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.totalPrice = totalPrice;
        this.deposit = deposit;
        this.isCheckedIn = isCheckedIn;
        this.isCheckedOut = isCheckedOut;
    }

    // Getter dan setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Tamu getTamu() {
        return tamu;
    }

    public void setTamu(Tamu tamu) {
        this.tamu = tamu;
    }

    public Kamar getKamar() {
        return kamar;
    }

    public void setKamar(Kamar kamar) {
        this.kamar = kamar;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public boolean isCheckedIn() {
        return isCheckedIn;
    }

    public void setCheckedIn(boolean checkedIn) {
        isCheckedIn = checkedIn;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }
    
    public String getNoKtp() {
        return tamu.getNoKtp();
    }

    public String getNama() {
        return tamu.getNama();
    }

    public String getNoKamar() {
        return kamar.getNoKamar();
    }
}


