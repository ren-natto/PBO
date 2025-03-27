/* Nama File    : Ruang.java
 * Deskripsi    : Berisi method dan atribut objek lab non komputer
 * Pembuat      : Vern Dharmawan / 24060123130057
 * Tanggal      : 27 Maret 2025
 */

import java.util.ArrayList;
import java.util.List;

public class LabNonKomp extends Laboratorium {
    private List<String> daftarMataKuliah;

    public LabNonKomp(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLaboratorium, double hargaSewa, List<String> daftarMataKuliah, Fakultas fakultas) {
        super(kode, panjang, lebar, tinggi, kapasitas, namaLaboratorium, hargaSewa, fakultas);
        this.daftarMataKuliah = new ArrayList<>(daftarMataKuliah);
    }

    public List<String> getDaftarMataKuliah() {
        return new ArrayList<>(this.daftarMataKuliah);
    }

    public void setDaftarMataKuliah(List<String> daftarMataKuliah) {
        this.daftarMataKuliah = daftarMataKuliah;
    }

    public void addDaftarMataKuliah(String MatKul){
        this.daftarMataKuliah.add(MatKul);
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("=== Laboratorium Non-Komputer ===");
        System.out.println("Kode: " + getKode());
        System.out.println("Nama: " + getNamaLaboratorium());
        System.out.println("Fakultas: " + getFakultas().getNama()); 
        System.out.println("Ukuran: " + getPanjang() + "m x " + getLebar() + "m x " + getTinggi() + "m");
        System.out.println("Kapasitas: " + getKapasitas());
        System.out.println("Harga Sewa: Rp" + getHargaSewa());
        System.out.println("Mata Kuliah yang Dihandle:");
        for (String mk : daftarMataKuliah) {
            System.out.println("- " + mk);
        }
        System.out.println("Biaya Kebersihan: Rp" + hitungBiayaKebersihan());
    }


    
}