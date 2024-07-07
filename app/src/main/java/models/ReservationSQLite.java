/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;


import entities.Kamar;
import entities.Reservation;
import entities.Tamu;
import helpers.DBConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
/**
 *
 * @author lenovo
 */

public class ReservationSQLite implements ReservationDAO {

    @Override
    public void insert(Reservation reservation) {
        String sql = "INSERT INTO reservation(noKtp, nama, noKamar, isCheckedIn, isCheckedOut) VALUES(?, ?, ?, ?, ?)";

        try (Connection conn = DBConnect.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setString(1, reservation.getTamu().getNoKtp());
            pstmt.setString(2, reservation.getTamu().getNama());
            pstmt.setString(3, reservation.getKamar().getNoKamar());
            pstmt.setBoolean(4, reservation.isCheckedIn());
            pstmt.setBoolean(5, reservation.isCheckedOut());
            pstmt.executeUpdate();

            // Mendapatkan nilai id yang di-generate
            try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    reservation.setId(generatedKeys.getInt(1));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void update(Reservation reservation) {
        String sql = "UPDATE reservation SET noKtp = ?, nama = ?, noKamar = ?, checkInDate = ?, checkOutDate = ?, totalPrice = ?, deposit = ?, isCheckedIn = ?, isCheckedOut = ? WHERE id = ?";

        try (Connection conn = DBConnect.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, reservation.getTamu().getNoKtp());
            pstmt.setString(2, reservation.getTamu().getNama());
            pstmt.setString(3, reservation.getKamar().getNoKamar());
            pstmt.setString(4, reservation.getCheckInDate());
            pstmt.setString(5, reservation.getCheckOutDate());
            pstmt.setInt(6, reservation.getTotalPrice());
            pstmt.setInt(7, reservation.getDeposit());
            pstmt.setBoolean(8, reservation.isCheckedIn());
            pstmt.setBoolean(9, reservation.isCheckedOut());
            pstmt.setInt(10, reservation.getId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Reservation get(int id) {
        String sql = "SELECT * FROM reservation WHERE id = ?";
        Reservation reservation = null;

        try (Connection conn = DBConnect.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                Tamu tamu = new Tamu(rs.getString("noKtp"), rs.getString("nama"));
                Kamar kamar = new Kamar(rs.getString("noKamar"));
                reservation = new Reservation(
                        rs.getInt("id"),
                        tamu,
                        kamar,
                        rs.getString("checkInDate"),
                        rs.getString("checkOutDate"),
                        rs.getInt("totalPrice"),
                        rs.getInt("deposit"),
                        rs.getBoolean("isCheckedIn"),
                        rs.getBoolean("isCheckedOut")
                );
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return reservation;
    }
    
    @Override
    public List<String> getId() {
        List<String> noIdList = new ArrayList<>();
        String sql = "SELECT id FROM reservation";
        try (Connection conn = DBConnect.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                noIdList.add(rs.getString("id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return noIdList;
    }

    @Override
public List<Reservation> getAll() {
    String sql = "SELECT r.*, t.nama, k.harga " +
                 "FROM reservation r " +
                 "JOIN tamu t ON r.noKtp = t.noKtp " +
                 "JOIN kamar k ON r.noKamar = k.noKamar";
    List<Reservation> reservationList = new ArrayList<>();

    try (Connection conn = DBConnect.connect();
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(sql)) {

        while (rs.next()) {
            Tamu tamu = new Tamu(rs.getString("noKtp"), rs.getString("nama"));
            Kamar kamar = new Kamar(rs.getString("noKamar"), rs.getInt("harga"));
            String checkInDate = rs.getString("checkInDate");
            String checkOutDate = rs.getString("checkOutDate");
            
            int totalPrice = rs.getInt("totalPrice"); // Default to value from database
            if (checkInDate != null && !checkInDate.isEmpty() && checkOutDate != null && !checkOutDate.isEmpty()) {
                try {
                    LocalDate checkIn = LocalDate.parse(checkInDate);
                    LocalDate checkOut = LocalDate.parse(checkOutDate);
                    long daysStayed = ChronoUnit.DAYS.between(checkIn, checkOut);
                    totalPrice = (int) (daysStayed * kamar.getHarga());
                } catch (DateTimeParseException e) {
                    System.out.println("Error parsing dates: " + e.getMessage());
                }
            }

            Reservation reservation = new Reservation(
                rs.getInt("id"),
                tamu,
                kamar,
                checkInDate,
                checkOutDate,
                totalPrice,
                rs.getInt("deposit"),
                rs.getBoolean("isCheckedIn"),
                rs.getBoolean("isCheckedOut")
            );
            reservationList.add(reservation);
        }
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
    return reservationList;
}


    @Override
    public List<Reservation> getBookRoomData() {
        String sql = "SELECT * FROM reservation WHERE isCheckedIn = 0 AND isCheckedOut = 0";
        List<Reservation> reservationList = new ArrayList<>();

        try (Connection conn = DBConnect.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Tamu tamu = new Tamu(rs.getString("noKtp"), rs.getString("nama"));
                Kamar kamar = new Kamar(rs.getString("noKamar"));
                Reservation reservation = new Reservation(
                        rs.getInt("id"),
                        tamu,
                        kamar,
                        null,
                        null,
                        0,
                        0,
                        false,
                        false
                );
                reservationList.add(reservation);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return reservationList;
    }

    @Override
    public List<Reservation> getCheckInData() {
        String sql = "SELECT * FROM reservation WHERE isCheckedIn = 1 AND isCheckedOut = 0";
        List<Reservation> reservationList = new ArrayList<>();

        try (Connection conn = DBConnect.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Tamu tamu = new Tamu(rs.getString("noKtp"), rs.getString("nama"));
                Kamar kamar = new Kamar(rs.getString("noKamar"));
                Reservation reservation = new Reservation(
                        rs.getInt("id"),
                        tamu,
                        kamar,
                        rs.getString("checkInDate"),
                        null,
                        0,
                        rs.getInt("deposit"),
                        true,
                        false
                );
                reservationList.add(reservation);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return reservationList;
    }
    
    @Override
    public List<Reservation> getCheckOutData() {
        String sql = "SELECT r.*, k.harga FROM reservation r JOIN kamar k ON r.noKamar = k.noKamar WHERE r.isCheckedIn = 1 AND r.isCheckedOut = 1";
        List<Reservation> reservationList = new ArrayList<>();

        try (Connection conn = DBConnect.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Tamu tamu = new Tamu(rs.getString("noKtp"), rs.getString("nama"));
                Kamar kamar = new Kamar(rs.getString("noKamar"), rs.getInt("harga"));
                String checkInDateStr = rs.getString("checkInDate");
                String checkOutDateStr = rs.getString("checkOutDate");
                
                LocalDate checkInDate = LocalDate.parse(checkInDateStr);
                LocalDate checkOutDate = LocalDate.parse(checkOutDateStr);

                long daysBetween = ChronoUnit.DAYS.between(checkInDate, checkOutDate);
                int totalPrice = (int) (daysBetween * kamar.getHarga());
                
                Reservation reservation = new Reservation(
                    rs.getInt("id"),
                    tamu,
                    kamar,
                    checkInDateStr,
                    checkOutDateStr, 
                    totalPrice,
                    rs.getInt("deposit"),
                    true,
                    true
                );
                reservationList.add(reservation);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return reservationList;
    }

    @Override
    public void bookRoom(Tamu tamu, Kamar kamar) {
        Reservation reservation = new Reservation(tamu, kamar);
        insert(reservation);
    }

    @Override
    public void checkIn(int id, String checkInDate, int deposit) {
        Reservation reservation = get(id);
        if (reservation != null) {
            reservation.setCheckInDate(checkInDate);
            reservation.setDeposit(deposit);
            reservation.setCheckedIn(true);
            update(reservation);
        }
    }

    @Override
    public void checkOut(int id, String checkOutDate) {
        Reservation reservation = get(id);
        if (reservation != null) {
        String checkInDate = reservation.getCheckInDate();
        LocalDate checkIn = LocalDate.parse(checkInDate);
        LocalDate checkOut = LocalDate.parse(checkOutDate);
        long daysBetween = ChronoUnit.DAYS.between(checkIn, checkOut);
        int totalPrice = (int) daysBetween * reservation.getKamar().getHarga();

        reservation.setCheckOutDate(checkOutDate);
        reservation.setTotalPrice(totalPrice);
        reservation.setCheckedOut(true);
        update(reservation);
        }
    }
}




