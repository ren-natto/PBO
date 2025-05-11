package Pertemuan9;

/**
 *
 * @author Vern
 */
public class Kucing extends Anabul{
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public String gerak() {
        return nama + " bergerak dengan melata.";
    }

    @Override
    public String bersuara() {
        return nama + " bersuara: Meong!";
    }
}

