/* Nama File    : Asersi1.java
 * Deskripsi    : Program untuk menunjukkan asersil
 * Pembuat      : Vern Dharmawan / 24060123130057
 * Tanggal      : 6 Maret 2025
 */

public class Asersi1{
    public static void main(String[] args) {
        int x = 0;
        if (x > 0) {
            System.out.println("x bilangan postiif");
        } else {
            assert(x > 0):"ada kesalahan kode" ;
            System.out.println("x bilangan negatif");
        }
    }
}

