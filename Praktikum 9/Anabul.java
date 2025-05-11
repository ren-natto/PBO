package Pertemuan9;

/**
 *
 * @author Vern
 */
public abstract class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public abstract String gerak();
    public abstract String bersuara();

    public String getNama() {
        return nama;
    }

    public String toString() {
        return "Nama: " + nama + "\nBersuara: " + bersuara() + "\nBergerak dengan: " + gerak();
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama: " + getNama());
        bersuara();
        gerak();
        System.out.println();
    }
    
    
}
