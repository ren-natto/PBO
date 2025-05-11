package Pertemuan9;

/**
 *
 * @author Vern
 */
public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("keliling lingkaran : " +bdg.hitungKeliling());
        System.out.println("tipe generic : " +bdg.get().getClass().getName());
        
        Persegi k = new Persegi(5);
        BangunDatarGeneric<Persegi> persegi = new BangunDatarGeneric<Persegi>();
        persegi.set(k);
        System.out.println("PERSEGI");
        System.out.println("Luas: " + persegi.hitungLuas());
        System.out.println("Keliling: " + persegi.hitungKeliling());
        System.out.println();

        BangunDatarGeneric<PersegiPanjang> persegipanjang = new BangunDatarGeneric<>();
        persegipanjang.set(new PersegiPanjang(5, 3));
        System.out.println("PERSEGI PANJANG");
        System.out.println("Luas: " + persegipanjang.hitungLuas());
        System.out.println("Keliling: " + persegipanjang.hitungKeliling());
        System.out.println();

        BangunDatarGeneric<Segitiga> segitiga = new BangunDatarGeneric<>();
        segitiga.set(new Segitiga(3, 4, 5));
        System.out.println("SEGITIGA");
        System.out.println("Luas: " + segitiga.hitungLuas());
        System.out.println("Keliling: " + segitiga.hitungKeliling());
        System.out.println();

       
    }
}

/* T tidak berpengaruh mau diganti T1 ataupun T2 karena hanya sebagai simbol */
