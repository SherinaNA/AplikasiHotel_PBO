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
    void insert(Reservation reservation); //insert data reservation
    void update(Reservation reservation); //update data reservation
    void delete(int id); //delete data reservation
    Reservation get(int id); //get data reservation by id
    List<String> getId(); //get list id dari reservation (checkin+checkout)
    List<Reservation> getAll(); //get seluruh data dari reservation
    List<Reservation> getBookRoomData(); //get data bookroom
    List<Reservation> getCheckInData(); //get data checkin
    List<Reservation> getCheckOutData(); //get data checkout

    void bookRoom(Tamu tamu, Kamar kamar); //method batuan bookroom -> insert reservation
    void checkIn(int id, String checkInDate, int deposit); //method update bookroom ke proses checkin
    void checkOut(int id, String checkOutDate); //method update checkin ke proses checkout
}








