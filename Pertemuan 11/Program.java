/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.program;

import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

import java.util.List;
import java.util.ArrayList; // [cite: 38]

public class Program {
    static MysqlMahasiswaService service = new MysqlMahasiswaService(); // [cite: 38]

    public static void main(String[] args) {
        System.out.println(""); // [cite: 38]

        // Insert [cite: 38]
        System.out.println("=== insert ==="); // [cite: 38]
        Mahasiswa mhsAdd = new Mahasiswa(5, "Haryo"); // [cite: 38]
        service.add(mhsAdd); // [cite: 38]
        // System.out.println("berhasil insert: " + mhsAdd); // Already printed in service.add
        displayAll();

        // Update [cite: 38]
        System.out.println("=== update ==="); // [cite: 38]
        Mahasiswa mhsUpdate = service.getById(5); // [cite: 38]
        if (mhsUpdate != null) {
            System.out.println("Akan diupdate data lama: " + mhsUpdate); // [cite: 38]
            mhsUpdate.setNama("Dinaya"); // [cite: 38]
            System.out.println("dengan data baru: " + mhsUpdate); // [cite: 38]
            service.update(mhsUpdate); // [cite: 38]
        } else {
            System.out.println("Data dengan id 5 tidak ditemukan untuk diupdate.");
        }
        displayAll();

        // Delete [cite: 39]
        System.out.println("=== delete ==="); // [cite: 40]
        Mahasiswa mhsDelete = service.getById(5);
        if(mhsDelete != null) {
            System.out.println("akan di delete: " + mhsDelete); // [cite: 40]
        } else {
            System.out.println("Data dengan id 5 tidak ditemukan untuk dihapus.");
        }
        service.delete(5); // [cite: 40]
        displayAll();

        // Close connection when done
        service.closeConnection();
    }

    public static void displayAll() {
        System.out.println("--- displayAll ---");
        List<Mahasiswa> listMhs = service.getAll();
        if (listMhs.isEmpty()) {
            System.out.println("Tidak ada data mahasiswa.");
        } else {
            for (Mahasiswa mhs : listMhs) {
                System.out.println(mhs);
            }
        }
        System.out.println("------------------");
    }
}
