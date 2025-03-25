/* Nama File    : BangunDatar.java
 * Deskripsi    : Berisi method dan atrbiut bangun datar
 * Pembuat      : Vern Dharmawan / 24060123130057
 * Tanggal      : 13 Maret 2025
 */

/* Jika BangunDatar dibuat final , maka tidak akan diwariskan kepada persegi dan lingkaran karena jika sebuah class dibuat final maka mereka tidak akan bisa menjadi parent 
   Jika method printInfo dikasih final, maka method tersebut tidak akn bisa di override di persehi atau lingkaran */

/* isEqualLuas/Keliling bisa dibuatt di class BangunDatar karena hanay membandingkan bukan mengimplementasi */

public abstract class BangunDatar {
    protected int jmlSisi;
    protected String warna;
    protected  String border;
    protected static int counterBangunDatar = 0;

    public BangunDatar() {
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }

    public int getJmlSisi(){
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    public abstract double getLuas();
    public abstract double getKeliling();

    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X) {
        return this.getKeliling() == X.getKeliling();
    }
}