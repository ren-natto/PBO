package Pertemuan9;

/**
 *
 * @author Vern
 */
public class Segitiga extends BangunDatar{
    private double alas;
    private double tinggi;
    private double sisi;

    public Segitiga(double alas, double tinggi, double sisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = sisi;
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    public double hitungKeliling() {
        return alas+tinggi+sisi;
    }
    
    public double hitungLuas() {
        return alas*tinggi*0.5;
    }
}
