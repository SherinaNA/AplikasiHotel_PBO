/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package models;

import entities.Kamar;
import java.util.List;

/**
 *
 * @author lenovo
 */

public interface KamarDAO {
    boolean insert(Kamar kamar);
    Kamar get(String noKamar);
    List<String> getNoKamarAvailable();
    List<Kamar> getAll();
    void update(Kamar kamar);
    void delete(String noKamar);
}

