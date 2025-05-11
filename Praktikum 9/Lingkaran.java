package Pertemuan9;

/**
 *
 * @author Vern
 */
public class Lingkaran extends BangunDatar{
    private double jejari;
    
    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }

    public double getJejari() {
        return jejari;
    }

    public void setJejari(double jejari) {
        this.jejari = jejari;
    }
    
    public double hitungKeliling() {
        return 2*jejari*3.14;
    }
    
    public double hitungLuas() {
        return 3.14*jejari*jejari;
    }
}
