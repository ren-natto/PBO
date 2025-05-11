package Pertemuan9;

/**
 *
 * @author Vern
 */
class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public String gerak() {
        return nama + "bergerak dengan terbang!" ;
    }

    @Override
    public String bersuara() {
        return nama + " bersuara: Cuit cuit!";
    }
}
