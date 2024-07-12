/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author lenovo
 */

public class Tamu {
    //attribute
    private String noKtp;
    private String nama;
    private String alamat;
    private String noTelp;

    //constructor
    public Tamu(String noKtp, String nama, String alamat, String noTelp) {
        this.noKtp = noKtp;
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
    }

    //constructor untuk booking
    public Tamu(String noKtp, String nama) {
        this.noKtp = noKtp;
        this.nama = nama;
    }

    //getter dan setter
    public String getNoKtp() {
        return noKtp;
    }

    public void setNoKtp(String noKtp) {
        this.noKtp = noKtp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }
}

