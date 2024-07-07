/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import entities.Admin;

/**
 *
 * @author lenovo
 */

public interface AdminDAO {
    boolean register(Admin admin);
    Admin login(String username, String password);
    boolean update(Admin admin);
    boolean delete(int id);
}



