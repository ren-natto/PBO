package Pertemuan9;
import java.util.ArrayList;

/**
 *
 * @author Vern
 */
public class Koleksi<T> {
    private int nbelm;
    private ArrayList<T> wadah;
    
    public Koleksi() {
        wadah = new ArrayList<>();
        nbelm = 0;
    }

    public int getNbelm() {
        return nbelm;
    }

    public void setNbelm(int nbelm) {
        this.nbelm = nbelm;
    }

    public ArrayList getWadah() {
        return wadah;
    }

    public void setWadah(ArrayList wadah) {
        this.wadah = wadah;
    }
    
    public T getIsi(int index) {
        return wadah.get(index);
    }

    public void setIsi(int index, T value) {
        wadah.set(index, value);
    }

    public int getSize() {
        return nbelm;
    }

    public void setSize(int size) {
        this.nbelm = size;
    }

    public void add(T value) {
        wadah.add(value);
        nbelm++;
    }

    public void delete(int index) {
        if (index >= 0 && index < wadah.size()) {
            wadah.remove(index);
            nbelm--;
        }
    }

    public void showAll() {
        for (int i = 0; i < wadah.size(); i++) {
            System.out.println("Elemen " + i + ": " + wadah.get(i));
        }
    }
    
}
