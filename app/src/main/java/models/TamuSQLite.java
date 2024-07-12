/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import entities.Tamu;
import helpers.DBConnect;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lenovo
 */

public class TamuSQLite implements TamuDAO {

    @Override
    public void insert(Tamu tamu) {
        String sql = "INSERT INTO tamu(noKtp, nama, alamat, noTelp) VALUES(?, ?, ?, ?)";

        try (Connection conn = DBConnect.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, tamu.getNoKtp());
            pstmt.setString(2, tamu.getNama());
            pstmt.setString(3, tamu.getAlamat());
            pstmt.setString(4, tamu.getNoTelp());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Tamu getNoKtp(String noKtp) {
        String sql = "SELECT * FROM tamu WHERE noKtp = ?";
        Tamu tamu = null;

        try (Connection conn = DBConnect.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, noKtp);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                tamu = new Tamu(rs.getString("noKtp"), rs.getString("nama"), rs.getString("alamat"), rs.getString("noTelp"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return tamu;
    }
    
    @Override
    public List<String> getAllNoKtp() {
        List<String> noKtpList = new ArrayList<>();
        String sql = "SELECT noKtp FROM tamu";
        try (Connection conn = DBConnect.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                noKtpList.add(rs.getString("noKtp"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return noKtpList;
    }

    @Override
    public List<Tamu> getAll() {
        String sql = "SELECT * FROM tamu";
        List<Tamu> tamuList = new ArrayList<>();

        try (Connection conn = DBConnect.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Tamu tamu = new Tamu(rs.getString("noKtp"), rs.getString("nama"),
                        rs.getString("alamat"), rs.getString("noTelp"));
                tamuList.add(tamu);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return tamuList;
    }

    @Override
    public void update(Tamu tamu) {
        String sql = "UPDATE tamu SET nama = ?, alamat = ?, noTelp = ? WHERE noKtp = ?";

        try (Connection conn = DBConnect.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, tamu.getNama());
            pstmt.setString(2, tamu.getAlamat());
            pstmt.setString(3, tamu.getNoTelp());
            pstmt.setString(4, tamu.getNoKtp());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void delete(String noKtp) {
        String sql = "DELETE FROM tamu WHERE noKtp = ?";

        try (Connection conn = DBConnect.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, noKtp);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

