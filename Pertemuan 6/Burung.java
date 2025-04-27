/* Nama File    : Burung.java
 * Deskripsi    : berisi atrbit dan metode dalam class Burung
 * Pembuat      : Vern Dharmawan / 24060123130057
 * Tanggal      : 24 April 2025
 */

class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan terbang.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Cuit cuit!");
    }
}