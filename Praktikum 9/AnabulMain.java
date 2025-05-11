package Pertemuan9;
import java.util.Random;

/**
 *
 * @author Vern
 */
public class AnabulMain {
    public static void main(String[] args) {
        Koleksi<Anabul> KoleksiAnabul = new Koleksi<>();
        Random rand = new Random();

        for (int i = 1; i <= 10; i++) {
            int jenis = rand.nextInt(3);
            switch (jenis) {
                case 0:
                    KoleksiAnabul.add(new Kucing("Kucing " + i));
                    break;
                case 1:
                    KoleksiAnabul.add(new Anjing("Anjing " + i));
                    break;
                case 2:
                    KoleksiAnabul.add(new Burung("Burung " + i));
                    break;
            }
        }

        System.out.println("=== KOLEKSI ANABUL ===");
        KoleksiAnabul.showAll();
    }
}
