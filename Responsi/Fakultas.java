/* Nama File    : Ruang.java
 * Deskripsi    : Berisi method dan atribut objek fakuktas
 * Pembuat      : Vern Dharmawan / 24060123130057
 * Tanggal      : 27 Maret 2025
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fakultas {
    private String nama;
    private String dekan;
    private double tarifKebersihan;
    private List<Ruang> daftarRuang = new ArrayList<>();

    public Fakultas(String nama, String dekan, double tarifKebersihan) {
        this.nama = nama;
        this.dekan = dekan;
        this.tarifKebersihan = tarifKebersihan;
    }

    public void tambahRuang(Ruang ruang) {
        daftarRuang.add(ruang);
    }

    public String getNama() {
        return nama;
    }

    public String getDekan() {
        return dekan;
    }

    public double getTarifKebersihan() {
        return tarifKebersihan;
    }

    public List<Ruang> getDaftarRuang() {
        return Collections.unmodifiableList(daftarRuang);
    }

    public void setTarifKebersihan(double tarifBaru) {
        this.tarifKebersihan = tarifBaru;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setDekan(String dekan) {
        this.dekan = dekan;
    }

    public void setDaftarRuang(List<Ruang> daftarRuang) {
        this.daftarRuang = daftarRuang;
    }

    
}