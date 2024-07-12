/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author lenovo
 */

public class Kamar {
    //attribute
    private String noKamar;
    private String jenisKamar;
    private int harga;
    private boolean isAvailable;

    //constructor
    public Kamar(String noKamar, String jenisKamar, int harga, boolean isAvailable) {
        this.noKamar = noKamar;
        this.jenisKamar = jenisKamar;
        this.harga = harga;
        this.isAvailable = isAvailable;
    }

    //constructor noKamar booking
    public Kamar(String noKamar) {
        this.noKamar = noKamar;
    }
    
    //constructor noKamar+harga (checkout)
    public Kamar(String noKamar, int harga) {
        this.noKamar = noKamar;
        this.harga = harga;
    }

    // Getter dan setter
    public String getNoKamar() {
        return noKamar;
    }

    public void setNoKamar(String noKamar) {
        this.noKamar = noKamar;
    }

    public String getJenisKamar() {
        return jenisKamar;
    }

    public void setJenisKamar(String jenisKamar) {
        this.jenisKamar = jenisKamar;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

