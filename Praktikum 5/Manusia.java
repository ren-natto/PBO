/* Nama File    : MBangunDatar.java
 * Deskripsi    : berisi atrbit dan metode dalam class Manusia
 * Pembuat      : Vern Dharmawan / 24060123130057
 * Tanggal      : 20 Maret 2025
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Manusia {
    protected String nama;
    protected LocalDate mulaikerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counter = 0;

    public Manusia(String nama, String mulaikerja, String alamat, double pendapatan){
        this.nama = nama;
        this.mulaikerja = LocalDate.parse(mulaikerja);
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counter++;
    }
    public String getNama(){
        return this.nama;
    }

    public LocalDate getMulaiKerja(){
        return this.mulaikerja;
    }

    public String getAlamat(){
        return this.alamat;
    }

    public double getPendapatan() {
        return this.pendapatan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setMulaiKerja (LocalDate mulaikerja) {
        this.mulaikerja = mulaikerja;
    }

    public void setPendapatan (double pendapatan) {
        this.pendapatan = pendapatan;
    }

    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(mulaikerja, LocalDate.now());
    }

    public static int getCounterMns() {
        return counter;
    }

    public void cetakInfo() {
        System.out.println("Nama\t: " + nama);
        System.out.println("Alamat\t: " + alamat);
        System.out.println("Masa Kerja\t: " + hitungMasaKerja() + " tahun");
        System.out.println("Pendapatan\t: Rp " + pendapatan);
    }

}



