/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author lenovo
 */

public class DBSetup {
    public static void setupDatabase() {
        //setup tabel admin
        String createAdminTable = "CREATE TABLE IF NOT EXISTS admin ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "username TEXT NOT NULL, "
                + "password TEXT NOT NULL);";

        //setup tabel tamu
        String createTamuTable = "CREATE TABLE IF NOT EXISTS tamu ("
                + "noKtp TEXT PRIMARY KEY, "  // Menggunakan noKtp sebagai primary key
                + "nama TEXT NOT NULL, "
                + "alamat TEXT NOT NULL, "
                + "noTelp TEXT NOT NULL);";

        //setup tabel kamar
        String createKamarTable = "CREATE TABLE IF NOT EXISTS kamar ("
                + "noKamar TEXT PRIMARY KEY, "  // Menggunakan noKamar sebagai primary key
                + "jenisKamar TEXT NOT NULL, "
                + "harga INTEGER NOT NULL, "
                + "isAvailable BOOLEAN NOT NULL);";

        //setup tabel reservasi
        String createReservationTable = "CREATE TABLE IF NOT EXISTS reservation ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "noKtp TEXT NOT NULL, "  // Menggunakan noKtp dari tabel tamu
                + "nama TEXT NOT NULL, "  // Menggunakan nama dari tabel tamu
                + "noKamar TEXT NOT NULL, "  // Menggunakan noKamar dari tabel kamar
                + "checkInDate TEXT, "  // checkInDate bisa NULL untuk bookRoom
                + "checkOutDate TEXT, "  // checkOutDate bisa NULL untuk bookRoom dan checkIn
                + "totalPrice INTEGER, "  // totalPrice bisa NULL untuk bookRoom dan checkIn
                + "deposit INTEGER, "  // deposit bisa NULL untuk bookRoom
                + "isCheckedIn BOOLEAN NOT NULL DEFAULT 0, "
                + "isCheckedOut BOOLEAN NOT NULL DEFAULT 0, "
                + "FOREIGN KEY(noKtp) REFERENCES tamu(noKtp), "  // Menyesuaikan foreign key
                + "FOREIGN KEY(noKamar) REFERENCES kamar(noKamar));";  // Menyesuaikan foreign key

        try (Connection conn = DBConnect.connect();
             Statement stmt = conn.createStatement()) {
            stmt.execute(createAdminTable);
            stmt.execute(createTamuTable);
            stmt.execute(createKamarTable);
            stmt.execute(createReservationTable);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

