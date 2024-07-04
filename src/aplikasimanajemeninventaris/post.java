/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasimanajemeninventaris;

/**
 *
 * @author user
 */
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class post {

    Koneksi connect = new Koneksi();

    public void post(String kode, String nama_barang, String kategori, int harga, int jumlah, int total_pendapatan) {

        try {

            connect.koneksi();
            Statement statement = connect.con.createStatement();
            String sql = "INSERT INTO `data_barang`(`kode`, `nama_barang`, `kategori`, `harga`, `jumlah_barang`, `total_harga`) VALUES ('" + kode + "','" + nama_barang + "','" + kategori + "','" + harga + "','" + jumlah + "','" + total_pendapatan + "')";
            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

}