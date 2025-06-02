import java.util.HashMap;
import java.util.Map;

public class DataMahasiswaLambda {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();

        mahasiswaMap.put("24060122120001", "Ani");
        mahasiswaMap.put("24060122120012", "Budi");
        mahasiswaMap.put("24060122120023", "Cici");
        mahasiswaMap.put("24060122120034", "Dodi");

        System.out.println("Data Mahasiswa (NIM = Nama):");
        mahasiswaMap.forEach((nim, nama) -> {
            System.out.println(nim + " = " + nama);
        });

        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}