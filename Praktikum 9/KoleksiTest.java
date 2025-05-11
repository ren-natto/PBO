package Pertemuan9;

/**
 *
 * @author Vern
 */
public class KoleksiTest {
    public static void main(String[] args) {
        Koleksi<Character> koleksiChar = new Koleksi<>();

        for (char c = 'A'; c < 'A' + 10; c++) {
            koleksiChar.add(c);
        }

        koleksiChar.showAll();
    }
}
