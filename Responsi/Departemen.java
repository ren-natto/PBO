/* Nama File    : Ruang.java
 * Deskripsi    : Berisi method dan atribut objek departemen
 * Pembuat      : Vern Dharmawan / 24060123130057
 * Tanggal      : 27 Maret 2025
 */

public class Departemen {
    private String nama;
    private String ketuaDepartemen;
    private double tarifKebersihan;

    public Departemen(String nama, String ketuaDepartemen, double tarifKebersihan) {
        this.nama = nama;
        this.ketuaDepartemen = ketuaDepartemen;
        this.tarifKebersihan = tarifKebersihan;
    }

    public String getNama() {
        return nama;
    }

    public String getKetuaDepartemen() {
        return ketuaDepartemen;
    }

    public double getTarifKebersihan() {
        return tarifKebersihan;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setKetuaDepartemen(String ketuaDepartemen){
        this.ketuaDepartemen = ketuaDepartemen;
    }

    public void setTarifKebersihan(double tarifKebersihan){
        this.tarifKebersihan = tarifKebersihan;
    }
}