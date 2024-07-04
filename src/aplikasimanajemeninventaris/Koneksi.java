/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasimanajemeninventaris;

import java.sql.DriverManager;

/**
 *
 * @author PY7
 */
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Koneksi {
    private static Connection koneksi;
    String status = "Tidak Terhubung";
    Connection con = null;

    public static Connection getKoneksi() {
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/aplikasi_inventaris";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Connection Successfully");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        return koneksi;
    }

    public void koneksi() {
        try {
            String connectionURL = "jdbc:mysql://localhost:3306/aplikasi_inventaris";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(connectionURL, username, password);
            status = "Terhubung";
            System.out.println("Status: " + status);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Terhubung");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Koneksi tesDatabase = new Koneksi();
        tesDatabase.koneksi();
    }
}
