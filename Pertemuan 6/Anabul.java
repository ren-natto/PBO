/* Nama File    : Anabul.java
 * Deskripsi    : berisi atrbit dan metode dalam class Anabul
 * Pembuat      : Vern Dharmawan / 24060123130057
 * Tanggal      : 24 April 2025
 */

abstract class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public abstract void gerak();
    public abstract void bersuara();

    public String getNama() {
        return nama;
    }
}
