

/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Vern Dharmawan
 * Tanggal      : 20 Februari 2025 / 24060123130057
 */

public class Garis{
    // Atribut //
    Titik awal;
    Titik akhir;
    static int counterGaris;

    // Konstruktor //
    Garis (double A, double B, double C, double D){
        this.awal = new Titik();
        this.akhir = new Titik();
        this.awal.absis = A;
        this.awal.ordinat = B;
        this.akhir.absis = C;  // pastikan menggunakan C untuk titik akhir
        this.akhir.ordinat = D;  // pastikan menggunakan D untuk titik akhir
        counterGaris++;
}

    // Konstruktor //
    Garis() {
        this(0,0,1,1);
    }

    // Mendapatkan absis awal //
    double getAbsisAwal(){
        return awal.absis;
    }

    // Mendapatkan ordinat awal //
    double getOrdinatAwal(){
        return awal.ordinat;
    }

    // Mendapatkan absis akhir //
    double getAbsisAkhir(){
        return akhir.absis;
    }

    // Mendapatkan ordinat akhir //
    double getOrdinatAkhir(){
        return akhir.ordinat;
    }

    // Mendapatkan countergaris //
    static int getcounterGaris(){
        return counterGaris;
    }

    // Mengubah absis awal //
    void setAbsisAwal(double A){
        awal.absis = A;
    }

    // Mengubah ordinat awal //
    void setOrdinatAwal(double A){
        awal.ordinat = A;
    }
    
    // Mengubah absis akhir //
    void setAbsisAkhir(double A){
        akhir.absis = A;
    }

    // Mengubah ordinat akhir //
    void setOrdinatAkhir(double A){
        akhir.ordinat = A;
    }

    // Print Garis //
    void printGaris() {
        System.out.println("Garis = ( " + awal.absis + "," + awal.ordinat + "),(" + akhir.absis + "," + akhir.ordinat + ")");
    }

    double getPanjangGaris() {
        return Math.sqrt((akhir.absis-awal.absis)*(akhir.absis-awal.absis)+(akhir.ordinat-awal.ordinat)*(akhir.ordinat-awal.ordinat));
    }

    double getGradien() {
        return (double) (akhir.ordinat-awal.ordinat)/(akhir.absis-awal.absis);
    }

    Titik getTitikTengah() {
        return new Titik((awal.absis+akhir.absis)/2,(awal.ordinat+akhir.ordinat)/2);
    }

    boolean isSejajar(Garis J){
        return this.getGradien() == J.getGradien();
    }

    // Cek isSejajar //
    void cekis(Garis J){
        if (this.isSejajar(J)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    void equation(){
        double J = this.getGradien();
        System.out.println("y = " + J + "x + " + akhir.ordinat);
    }


}
