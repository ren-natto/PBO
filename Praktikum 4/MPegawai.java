
import java.time.LocalDate;

public class MPegawai{
    public static void main(String[] args) {
        DosenTetap A = new DosenTetap("12344321","879","Agus Keren",LocalDate.of(1990, 5, 5),LocalDate.of(2000,05,05),700000,"Informatika");
        DosenTamu B = new DosenTamu("167958","567847","Tomas Wow", LocalDate.of(1880,8,8), LocalDate.of(2005,9,9), 9000000, LocalDate.of(2020,9,9),"Informatika");
        System.out.println("--------------------------------------------------------------");
        A.printPegawai();
        System.out.println("--------------------------------------------------------------");
        B.printPegawai();

    }
}