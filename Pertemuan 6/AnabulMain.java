/* Nama File    : AnabulMain.java
 * Deskripsi    : berisi atrbit dan metode dalam class AnabulMain
 * Pembuat      : Vern Dharmawan / 24060123130057
 * Tanggal      : 24 April 2025
 */

public class AnabulMain {
    public static void main(String[] args) {
        Anabul[] hewanPeliharaan = {
            new Kucing("Cat"),
            new Anjing("Dog"),
            new Burung("Bird")
        };

        for (Anabul hewan : hewanPeliharaan) {
            hewan.gerak();
            hewan.bersuara();
            System.out.println();
        }
    }
}