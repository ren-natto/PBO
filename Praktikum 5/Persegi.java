/* Nama File    : Persegi.java
 * Deskripsi    : Berisi method dan atrbiut persegi
 * Pembuat      : Vern Dharmawan / 24060123130057
 * Tanggal      : 20 Maret 2025
 */

/* Konstruktor persegi dibawah dapat direalisasikan karena sifat atribut dari parent merupakan protected yang bisa diwariskan */

public class Persegi extends BangunDatar implements IResize{
    private double sisi;

    public Persegi(double sisi, String warna, String border){
        this.jmlSisi = 4;
        this.warna = warna;
        this.border = border;
        this.sisi = sisi;
    }

    public double getSisi(){
        return sisi;
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    @Override
    public void printInfo() {
        System.out.println("Jumlah sisi: " + getJmlSisi());
        System.out.println("Warna: " + getWarna());
        System.out.println("Border: " + getBorder());
        System.out.println("Sisi " + sisi);
    }

    @Override
    public double getLuas(){
        return this.sisi * this.sisi;
    }
    @Override
    public double getKeliling(){
        return 4 * this.sisi;
    }

    @Override
    public void zoomIn() {
        sisi = sisi * 1.1;
    }

    @Override
    public void zoomOut() {
        sisi = sisi * 0.9;
    }

    @Override
    public void zoom(int percent){
        sisi  = sisi * percent/100;
    }

}