/* Nama File    : Tendik.java
 * Deskripsi    : berisi atrbit dan metode dalam class Tendik
 * Pembuat      : Vern Dharmawan / 24060123130057
 * Tanggal      : 13 Maret 2025
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Tendik extends Pegawai {
    private String bidang;
    private LocalDate BUP;
    private double tunjangan;

    public Tendik(String NIP, String nama, LocalDate tanggal_lahir, LocalDate mulai, double gaji_pokok, String bidang) {
        super(NIP, nama, tanggal_lahir, mulai, gaji_pokok);
        this.bidang = bidang;
        this.BUP = tanggal_lahir.plusYears(55);
        this.tunjangan = hitungTunjangan();
    }

    private double hitungTunjangan() {
        long masaKerja = ChronoUnit.YEARS.between(getMulai(), LocalDate.now());
        return 0.01 * getGaji_Pokok() * masaKerja;
    }

    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    public LocalDate getBUP() {
        return BUP;
    }

    public void setBUP(LocalDate BUP) {
        this.BUP = BUP;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void printPegawai() {
        System.out.println("NIP		: " + getNIP());
        System.out.println("Nama		: " + getNama());
        System.out.println("Tanggal Lahir	: " + getTanggal_Lahir().getDayOfMonth() + " " + getTanggal_Lahir().getMonth() + " " + getTanggal_Lahir().getYear());
        System.out.println("TMT		: " + getMulai().getDayOfMonth() + " " + getMulai().getMonth() + " " + getMulai().getYear());
        System.out.println("Jabatan		: Tendik");
        System.out.println("Bidang		: " + getBidang());
        long masaKerjaTahun = ChronoUnit.YEARS.between(getMulai(), LocalDate.now());
        long masaKerjaBulan = ChronoUnit.MONTHS.between(getMulai(), LocalDate.now()) % 12;
        System.out.println("Masa Kerja	: " + masaKerjaTahun + " tahun " + masaKerjaBulan + " bulan");
        System.out.println("BUP		: " + getBUP().getDayOfMonth() + " " + getBUP().getMonth() + " " + getBUP().getYear());
        System.out.println("Gaji Pokok	: Rp " + String.format("%,.2f", getGaji_Pokok()));
        System.out.println("Tunjangan	: 1% x " + masaKerjaTahun + " x Rp " + String.format("%,.2f", getGaji_Pokok()) + " = Rp " + String.format("%,.2f", getTunjangan()));
    }
}