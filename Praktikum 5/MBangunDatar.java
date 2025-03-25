/* Nama File    : MBangunDatar.java
 * Deskripsi    : berisi atrbit dan metode dalam class BangunDatar
 * Pembuat      : Vern Dharmawan / 24060123130057
 * Tanggal      : 20 Maret 2025
 */

/* Pertama class abstarct tidak bisa instantiasi
   Kedua, object L1 tidak bisa didefined 2x */

/* Memastikan subclass (Persegi, Lingkaran, dll.) mengimplementasikan getLuas() dan getKeliling().
Tidak perlu memberikan implementasi default yang tidak relevan.
Mempermudah desain kode dengan konsep pewarisan */
/* method zoomIn() dan zoomOut() dapat dipanggil dengan objek Persegi dan Lingkaran karena mereka mengimplementasi IResize */
/*Interface dapat diterapkan pada kelas yang tidak memiliki hubungan pewarisan dengan BangunDatar (misalnya Garis, Bangun3D).
Memisahkan konsep pewarisan dari perilaku, sehingga lebih fleksibel dalam desain.*/


public class MBangunDatar{
    public static void main(String[] args) {
    //BangunDatar B1 = new BangunDatar();
    BangunDatar P1 = new Persegi(10,"Biru","Hitam");
    Persegi P2 = new Persegi(5,"Hitam", "Hijau");
    BangunDatar L1 = new Lingkaran(7,"Merah","Ungu");
    //Lingkaran L1 = new Lingkaran (14,"Kuning","Abu2");
    Persegi B = new Persegi(5,"Biru","Hitam");
    if (P2.isEqualLuas(B)){
        System.out.println("True");
    } else {
        System.out.println("False");
    }
    B.printInfo();
    B.zoomIn();
    B.printInfo();
    }
}