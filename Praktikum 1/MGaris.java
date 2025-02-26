/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Vern Dharmawan
 * Tanggal      : 20 Februari 2025 / 24060123130057
 */

public class MGaris {
    public static void main(String[] args) {
        Garis S = new Garis();
        S.printGaris();
        S.setAbsisAkhir(6);
        S.setOrdinatAkhir(7);
        S.setAbsisAwal(1);
        S.printGaris();
        System.out.println("Panjang garis adalah = " + S.getPanjangGaris());
        System.out.println("Gradiennya adalah = " + S.getGradien());
        Titik J = new Titik();
        J = S.getTitikTengah();
        System.out.println("Titik tengahnya adalah = "); J.printTitik();
        Garis X = new Garis(0,4,4,4);
        Garis Y = new Garis(0,2,4,2);
        Garis Z = new Garis(0,5,7,8);
        X.cekis(Y);
        X.cekis(Z);
        S.equation();
    }  
}