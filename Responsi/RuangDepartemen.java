/* Nama File    : Ruang.java
 * Deskripsi    : Berisi method dan atribut objek ruang departemen
 * Pembuat      : Vern Dharmawan / 24060123130057
 * Tanggal      : 27 Maret 2025
 */

public class RuangDepartemen extends Ruang {
    private Departemen departemen;
    private int jumlahMeja;
    private int jumlahKursi;
    private int jumlahLemari;

    public RuangDepartemen(String kode, double panjang, double lebar, double tinggi, int kapasitas, Departemen departemen, int jumlahMeja, int jumlahKursi, int jumlahLemari) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.departemen = departemen;
        this.jumlahMeja = jumlahMeja;
        this.jumlahKursi = jumlahKursi;
        this.jumlahLemari = jumlahLemari;
    }

    public Departemen getDepartemen() {
        return departemen;
    }

    public int getJumlahMeja() {
        return jumlahMeja;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public int getJumlahLemari() {
        return jumlahLemari;
    }

    public void setDepartemen(Departemen departemen){
        this.departemen = departemen;
    }

    public void setJumlahMeja(int jumlahMeja){
        this.jumlahMeja = jumlahMeja;
    }

    public void setJumlahKursi(int jumlahKursi){
        this.jumlahKursi = jumlahKursi;
    }

    public void setJumlahLemari(int jumlahLemari){
        this.jumlahLemari = jumlahLemari;
    }

    @Override
    public double hitungBiayaKebersihan() {
        return hitungLuas() * departemen.getTarifKebersihan();
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("=== Ruang Departemen ===");
        System.out.println("Kode: " + getKode());
        System.out.println("Departemen: " + departemen.getNama());
        System.out.println("Ketua Departemen: " + departemen.getKetuaDepartemen());
        System.out.println("Ukuran: " + getPanjang() + "m x " + getLebar() + "m x " + getTinggi() + "m");
        System.out.println("Kapasitas: " + getKapasitas());
        System.out.println("Jumlah Meja: " + jumlahMeja);
        System.out.println("Jumlah Kursi: " + jumlahKursi);
        System.out.println("Jumlah Lemari: " + jumlahLemari);
        System.out.println("Biaya Kebersihan: Rp" + hitungBiayaKebersihan());
    }

    
}