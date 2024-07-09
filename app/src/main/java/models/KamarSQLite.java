/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import entities.Kamar;
import entities.Reservation;
import helpers.DBConnect;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lenovo
 */

public class KamarSQLite implements KamarDAO {

    @Override
    public boolean insert(Kamar kamar) {
        String sql = "INSERT INTO kamar(noKamar, jenisKamar, harga, isAvailable) VALUES(?, ?, ?, ?)";

        try (Connection conn = DBConnect.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, kamar.getNoKamar());
            pstmt.setString(2, kamar.getJenisKamar());
            pstmt.setInt(3, kamar.getHarga());
            pstmt.setBoolean(4, kamar.isAvailable());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public Kamar get(String noKamar) {
        String sql = "SELECT * FROM kamar WHERE noKamar = ?";
        Kamar kamar = null;

        try (Connection conn = DBConnect.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, noKamar);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                kamar = new Kamar(rs.getString("noKamar"), 
                                  rs.getString("jenisKamar"), 
                                  rs.getInt("harga"), 
                                  rs.getBoolean("isAvailable"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return kamar;
    }

    //list untuk combo box NoKamar
    @Override
    public List<String> getNoKamarAvailable() {
        List<String> noKamarList = new ArrayList<>();
        String sql = "SELECT noKamar FROM kamar WHERE isAvailable = 1";
        try (Connection conn = DBConnect.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                noKamarList.add(rs.getString("noKamar"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return noKamarList;
    }
    
    @Override
    public List<Kamar> getAll() {
        String sql = "SELECT * FROM kamar";
        List<Kamar> kamarList = new ArrayList<>();

        try (Connection conn = DBConnect.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Kamar kamar = new Kamar(rs.getString("noKamar"), 
                                        rs.getString("jenisKamar"),
                                        rs.getInt("harga"), 
                                        rs.getBoolean("isAvailable"));
                kamarList.add(kamar);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return kamarList;
    }

    @Override
    public void update(Kamar kamar) {
        String sql = "UPDATE kamar SET jenisKamar = ?, harga = ?, isAvailable = ? WHERE noKamar = ?";

        try (Connection conn = DBConnect.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, kamar.getNoKamar());
            pstmt.setString(2, kamar.getJenisKamar());
            pstmt.setInt(3, kamar.getHarga());
            pstmt.setBoolean(4, kamar.isAvailable());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void delete(String noKamar) {
        String sql = "DELETE FROM kamar WHERE noKamar = ?";

        try (Connection conn = DBConnect.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, noKamar);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

