/* Nama File    : Asersi2.java
 * Deskripsi    : Program untuk demo asersi, yang akan menolak input jari - jari lingkaran yang bernilai 0;
 * Pembuat      : Vern Dharmawan / 24060123130057
 * Tanggal      : 6 Maret 2025
 */

/* Objek tetap terbuat meskipun gagal, Meskipun ada asersi, jika tidak diaktifkan, program tetap akan membuat objek Lingkaran dengan jariJari = 0. 
 Seharusnya asersi dilakukan dalam konstruktor Lingkaran, bukan hanya mengandalkan assert di dalam main. */

class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling() {
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

public class Asersi2{
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari>0):"jari jari tidak boleh 0" ;
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

