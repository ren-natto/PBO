/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;

import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MysqlMahasiswaService {
    Connection koneksi = null; 

    public MysqlMahasiswaService() { 
        this.koneksi = MysqlUtility.getConnection();
        if (this.koneksi == null) {
            System.err.println("Service tidak dapat membuat koneksi ke database.");
        }
    }

    private Mahasiswa makeMhsObject(ResultSet rs) throws SQLException { 
        Mahasiswa mhs = new Mahasiswa();
        mhs.setId(rs.getInt("id"));
        mhs.setNama(rs.getString("nama"));
        return mhs;
    }

    public void add(Mahasiswa mhs) { 
        String sql = "INSERT INTO mahasiswa (id, nama) VALUES (?, ?)";
        try (PreparedStatement ps = koneksi.prepareStatement(sql)) {
            ps.setInt(1, mhs.getId());
            ps.setString(2, mhs.getNama());
            ps.executeUpdate();
            System.out.println("Berhasil insert: " + mhs);
        } catch (SQLException e) {
            System.err.println("Error adding mahasiswa: " + e.getMessage());
        }
    }

    public void update(Mahasiswa mhs) { 
        String sql = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(sql)) {
            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());
            int affectedRows = ps.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Berhasil update: " + mhs);
            } else {
                System.out.println("Gagal update, mahasiswa dengan id " + mhs.getId() + " tidak ditemukan.");
            }
        } catch (SQLException e) {
            System.err.println("Error updating mahasiswa: " + e.getMessage());
        }
    }

    public void delete(int id) { 
        String sql = "DELETE FROM mahasiswa WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(sql)) {
            ps.setInt(1, id);
            int affectedRows = ps.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Berhasil delete mahasiswa dengan id: " + id);
            } else {
                System.out.println("Gagal delete, mahasiswa dengan id " + id + " tidak ditemukan.");
            }
        } catch (SQLException e) {
            System.err.println("Error deleting mahasiswa: " + e.getMessage());
        }
    }

    public Mahasiswa getById(int id) { 
        String sql = "SELECT * FROM mahasiswa WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return makeMhsObject(rs);
            }
        } catch (SQLException e) {
            System.err.println("Error getting mahasiswa by id: " + e.getMessage());
        }
        return null;
    }

    public List<Mahasiswa> getAll() { 
        List<Mahasiswa> listMhs = new ArrayList<>();
        String sql = "SELECT * FROM mahasiswa";
        try (Statement stmt = koneksi.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                listMhs.add(makeMhsObject(rs));
            }
        } catch (SQLException e) {
            System.err.println("Error getting all mahasiswa: " + e.getMessage());
        }
        return listMhs;
    }

    public void indexReset() { 
        System.out.println("Fungsi indexReset() perlu implementasi spesifik database.");
    }

    public boolean isEmpty() { 
        String sql = "SELECT COUNT(*) FROM mahasiswa";
        try (Statement stmt = koneksi.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) {
                return rs.getInt(1) == 0;
            }
        } catch (SQLException e) {
            System.err.println("Error checking if table is empty: " + e.getMessage());
        }
        return true;
    }

    public void closeConnection() { 
        MysqlUtility.closeConnection();
    }
}
