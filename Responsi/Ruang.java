/* Nama File    : Ruang.java
 * Deskripsi    : Berisi method dan atribut objek ruang
 * Pembuat      : Vern Dharmawan / 24060123130057
 * Tanggal      : 27 Maret 2025
 */

public abstract class Ruang {
    private String kode;
    private double panjang;
    private double lebar;
    private double tinggi;
    private int kapasitas;

    public Ruang(String kode, double panjang, double lebar, double tinggi, int kapasitas) {
        this.kode = kode;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.kapasitas = kapasitas;
    }

    public abstract double hitungBiayaKebersihan();
    public abstract void tampilkanDetail();

    public String getKode() {
        return this.kode;
    }

    public double getPanjang() {
        return this.panjang;
    }

    public double getLebar() {
        return this.lebar;
    }

    public double getTinggi() {
        return this.tinggi;
    }

    public int getKapasitas() {
        return this.kapasitas;
    }

    public void setKode(String kode){
        this.kode = kode;
    }

    public void setPanjang(double panjang){
        this.panjang = panjang;
    }

    public void setLebar(double lebar){
        this.lebar = lebar;
    }

    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    public void setKapasitas(int kapasitas){
        this.kapasitas = kapasitas;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }
}
