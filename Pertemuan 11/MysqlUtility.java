/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlUtility {
    private static Connection koneksi; 

    public static Connection getConnection() {  
        if (koneksi == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver"); 
                String url = "jdbc:mysql://localhost:3306/jdbc_mhs"; 
                String user = "student";
                String password = "rahasia"; 

                koneksi = DriverManager.getConnection(url, user, password); 

                if (koneksi != null) {
                    System.out.println("Koneksi berhasil!"); 
                }
            } catch (ClassNotFoundException cne) {
                System.out.println("Gagal load driver: " + cne.getMessage()); 
            } catch (SQLException sqle) {
                System.out.println("Gagal Koneksi: " + sqle.getMessage()); 
            }
        }
        return koneksi; 
    }

    public static void closeConnection() {
        if (koneksi != null) {
            try {
                koneksi.close();
                koneksi = null; 
                System.out.println("Koneksi ditutup.");
            } catch (SQLException sqle) {
                System.out.println("Gagal menutup koneksi: " + sqle.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Connection testConnection = getConnection();
        if (testConnection != null) {
            System.out.println("Tes koneksi berhasil.");
            closeConnection();
        } else {
            System.out.println("Tes koneksi gagal.");
        }
    }
}
