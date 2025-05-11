package Pertemuan9;
import java.util.ArrayList;
/**
 *
 * @author Vern
 */
public class KoleksiAnabul<T> {
    private ArrayList<T> wadah = new ArrayList<>();

    public void add(T item) {
        wadah.add(item);
    }

    public void showAll() {
        for (T item : wadah) {
            if (item instanceof Anabul) {
                ((Anabul) item).tampilkanInfo();
            } else {
                System.out.println(item.toString());
            }
        }
    }
}
