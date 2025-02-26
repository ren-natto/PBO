/* Nama File    : MTitik.java
 * Deskripsi    : berisi atrbit dan metode dalam class Titik
 * Pembuat      : Vern Dharmawan / 24060123130057
 * Tanggal      : 20 Februari 2025
 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3,4);
        T1.printTitik();
        Titik T2 = new Titik(3,4);

        System.out.println("Jumlah objek Titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah objek Titik = " + T2.getCounterTitik());
        System.out.println("T2 di kuadran = " + T2.getKuadran());
        System.out.println("Jarak T2 dari pusat adalah = " + T2.getJarakPusat());
        System.out.println("Jarak T2 dari 1,3 adalah = " + T2.getJarak(1,3));

        T2.printTitik();
        T2.refleksiX();
        T2.printTitik();
        T2.refleksiY();
        T2.printTitik();

        T2.getRefleksiX();
        System.out.println("Refleksi T2 terhadap X adalah = " + T2.getRefleksiX());
        System.out.println("Refleksi T2 terhadap Y adalah = " + T2.getRefleksiY());


    }
}