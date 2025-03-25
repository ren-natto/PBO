/* Nama File    : Lingkaran.java
 * Deskripsi    : Berisi method dan atribut lingkaran
 * Pembuat      : Vern Dharmawan / 24060123130057
 * Tanggal      : 20 Maret 2025
 */

public class Lingkaran extends BangunDatar implements IResize{
    private double jari;

    public Lingkaran() {
        this.jari = 0;
    }

    public Lingkaran(double diameter, String warna, String border) {
        this.jari = diameter / 2;
        this.warna = warna;
        this.border = border;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    @Override
    public double getLuas() {
        return Math.PI * jari * jari;
    }
    @Override
    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    public void printInfo() {
        System.out.println("Jumlah sisi: Tidak ada (Lingkaran)");
        System.out.println("Warna: " + getWarna());
        System.out.println("Border: " + getBorder());
        System.out.println("Jari-jari: " + jari);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }

    @Override
    public void zoomIn() {
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut() {
        jari = jari * 0.9;
    }

    @Override
    public void zoom(int percent){
        jari = jari * percent/100;
    }
}
