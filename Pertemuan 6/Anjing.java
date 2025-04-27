/* Nama File    : Anjing.java
 * Deskripsi    : berisi atrbit dan metode dalam class Anjing
 * Pembuat      : Vern Dharmawan / 24060123130057
 * Tanggal      : 24 April 2025
 */

class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Guk-guk!");
    }
}