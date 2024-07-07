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
    void insert(Tamu tamu);
    Tamu getNoKtp(String noKtp);
    List<String> getAllNoKtp();
    List<Tamu> getAll();
    void update(Tamu tamu);
    void delete(String noKtp);
}

