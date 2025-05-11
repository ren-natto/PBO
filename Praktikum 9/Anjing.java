package Pertemuan9;

/**
 *
 * @author Vern
 */
class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public String gerak() {
        return nama + " bergerak dengan melata.";
    }

    @Override
    public String bersuara() {
        return nama + " bersuara: Guk-guk!";
    }
}
