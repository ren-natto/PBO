/* Nama File    : Ruang.java
 * Deskripsi    : Berisi method dan atribut objek lab komputer
 * Pembuat      : Vern Dharmawan / 24060123130057
 * Tanggal      : 27 Maret 2025
 */

public class LabKomputer extends Laboratorium {
    private int Komputer;

    public LabKomputer(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLab, double hargaSewa, int Komputer, Fakultas fakultas) {
        super(kode, panjang, lebar, tinggi, kapasitas, namaLab, hargaSewa, fakultas);
        this.Komputer = Komputer;
    }

    public int getJumlahKomputer() {
        return this.Komputer;
    }

    public void setJumlahKomputer(int Komputer) {
        this.Komputer = Komputer;
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("=== Laboratorium Komputer ===");
        System.out.println("Kode: " + getKode());
        System.out.println("Nama: " + getNamaLaboratorium());
        System.out.println("Fakultas: " + getFakultas().getNama()); 
        System.out.println("Ukuran: " + getPanjang() + "m x " + getLebar() + "m x " + getTinggi() + "m");
        System.out.println("Kapasitas: " + getKapasitas());
        System.out.println("Jumlah Komputer: " + Komputer);
        System.out.println("Harga Sewa: Rp" + getHargaSewa());
        System.out.println("Biaya Kebersihan: Rp" + hitungBiayaKebersihan());
    }

    
}