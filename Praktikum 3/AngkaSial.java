/* Nama File    : AngkaSial.java
 * Deskripsi    : Program penggunaan exception buatan sendiri, pengenalan klausa 'throw' dan 'thhrows'
 * Pembuat      : Vern Dharmawan / 24060123130057
 * Tanggal      : 6 Maret 2025
  
 * tidak baris 12 tidak akan tersekusi karena eksekusi akan berhenti setelah terjadi eksepsi
 * iya akan dieksekusi karena saat mengeksekusi bari 20 akan terjadi eksepsi sehingga masuk ke dalam catch 
 
 */

public class AngkaSial{
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            System.out.println(ase.getMessage());
            System.out.println("hati - hati memasukkan angka!!!");
        }
    }
}