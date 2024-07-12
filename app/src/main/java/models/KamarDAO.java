/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package models;

import entities.Kamar;
import entities.Reservation;
import java.util.List;

/**
 *
 * @author lenovo
 */

public interface KamarDAO {
    void insert(Kamar kamar); //menambahkan data kamar
    Kamar get(String noKamar); //get data noKamar
    List<String> getNoKamarAvailable(); // get data noKamar yg tersedia
    List<Kamar> getAll(); //mendapatkan seluruh data kamar yg ada
    void update(Kamar kamar); //update data kamar
    void delete(String noKamar); //delete data kamar
}

