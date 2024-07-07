/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package models;

import entities.Kamar;
import entities.Reservation;
import entities.Tamu;
import java.util.List;

/**
 *
 * @author lenovo
 */

public interface ReservationDAO {
    void insert(Reservation reservation);
    void update(Reservation reservation);
    Reservation get(int id);
    List<String> getId();
    List<Reservation> getAll();
    List<Reservation> getBookRoomData();
    List<Reservation> getCheckInData();
    List<Reservation> getCheckOutData();

    void bookRoom(Tamu tamu, Kamar kamar);
    void checkIn(int id, String checkInDate, int deposit);
    void checkOut(int id, String checkOutDate);
}








