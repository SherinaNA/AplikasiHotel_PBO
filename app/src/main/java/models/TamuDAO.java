/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package models;

import entities.Tamu;
import java.util.List;

/**
 *
 * @author lenovo
 */

public interface TamuDAO {
    void insert(Tamu tamu); //menambah data tamu
    Tamu getNoKtp(String noKtp); //get data noKtp tamu
    List<String> getAllNoKtp(); //get list daftar seluruh noKtp (booking)
    List<Tamu> getAll(); //get seluruh data tamu
    void update(Tamu tamu); //update data tamu
    void delete(String noKtp); //delete data tamu
}

