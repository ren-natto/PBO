/* Nama File    : Ruang.java
 * Deskripsi    : Berisi method dan atribut objek ruang dosen
 * Pembuat      : Vern Dharmawan / 24060123130057
 * Tanggal      : 27 Maret 2025
 */

public class RuangDosen extends Ruang {
    private Departemen departemen;
    private String namaDosen;
    private int jumlahKursi;
    private int jumlahMeja;

    public RuangDosen(String kode, double panjang, double lebar, double tinggi, int kapasitas, Departemen departemen, String namaDosen, int jumlahKursi, int jumlahMeja) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.departemen = departemen;
        this.namaDosen = namaDosen;
        this.jumlahKursi = jumlahKursi;
        this.jumlahMeja = jumlahMeja;
    }

    public Departemen getDepartemen() {
        return departemen;
    }

    public String getNamaDosen() {
        return namaDosen;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public int getJumlahMeja() {
        return jumlahMeja;
    }

    public void setDepartemen(Departemen departemen) {
        this.departemen = departemen;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }

    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }

    public void setJumlahMeja(int jumlahMeja) {
        this.jumlahMeja = jumlahMeja;
    }

    @Override
    public double hitungBiayaKebersihan() {
        return hitungLuas() * departemen.getTarifKebersihan();
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("=== Ruang Dosen ===");
        System.out.println("Kode: " + getKode());
        System.out.println("Departemen: " + departemen.getNama());
        System.out.println("Nama Dosen: " + namaDosen);
        System.out.println("Ukuran: " + getPanjang() + "m x " + getLebar() + "m x " + getTinggi() + "m");
        System.out.println("Kapasitas: " + getKapasitas());
        System.out.println("Jumlah Kursi: " + jumlahKursi);
        System.out.println("Jumlah Meja: " + jumlahMeja);
        System.out.println("Biaya Kebersihan: Rp" + hitungBiayaKebersihan());
    }

    
}