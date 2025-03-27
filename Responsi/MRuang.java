import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MRuang {
    public static void main(String[] args) {
        /* Fakulras */
        Fakultas fakultasMIPA = new Fakultas("FMIPA", "Prof. Dr. Ahmad", 5000);
        Fakultas fakultasTeknik = new Fakultas("FT", "Prof. Dr. Budi", 5500);
        
        Departemen informatika = new Departemen("Informatika", "Dr. Citra", 7000);
        Departemen fisika = new Departemen("Fisika", "Dr. Dian", 6000);
        Departemen kimia = new Departemen("Kimia", "Dr. Eka", 6500);

        /* Ruang Kelas*/
        Ruang kelasA1 = new RuangKelas("A101", 10, 8, 3, 40, 40, 2, fakultasMIPA);
        Ruang kelasB2 = new RuangKelas("B201", 12, 9, 3, 50, 48, 3, fakultasTeknik);
        
        /* Lab Komp */
        Ruang labKomputer1 = new LabKomputer("LK01", 12, 10, 3, 30, 
                                           "Lab Komputasi Dasar", 1000000, 30, fakultasMIPA);
        Ruang labKomputer2 = new LabKomputer("LK02", 15, 12, 3, 40, 
                                           "Lab Jaringan", 1500000, 35, fakultasTeknik);
        
        /* Lab Non-Komp */
        List<String> mkFisika = new ArrayList<>(Arrays.asList("Fisika Dasar", "Fisika Modern"));
        Ruang labFisika = new LabNonKomp("LF01", 15, 12, 3, 25, 
                                       "Lab Fisika Dasar", 800000, mkFisika, fakultasMIPA);
        
        List<String> mkKimia = new ArrayList<>(Arrays.asList("Kimia Dasar", "Kimia Organik"));
        Ruang labKimia = new LabNonKomp("LKIM01", 18, 15, 3, 30, 
                                      "Lab Kimia Dasar", 1200000, mkKimia, fakultasMIPA);
        
        /* Departemen */
        Ruang ruangInformatika = new RuangDepartemen("DI01", 8, 6, 3, 15, 
                                                   informatika, 5, 10, 3);
        Ruang ruangFisika = new RuangDepartemen("DF01", 10, 8, 3, 20, 
                                              fisika, 6, 12, 4);
        
        /* Ruang dosen */
        Ruang ruangDosen1 = new RuangDosen("DB01", 6, 5, 3, 5, 
                                         informatika, "Dr. Citra", 2, 1);
        Ruang ruangDosen2 = new RuangDosen("DF01", 7, 6, 3, 6, 
                                         fisika, "Dr. Dian", 3, 2);

        /* tambah ruang */
        fakultasMIPA.tambahRuang(kelasA1);
        fakultasMIPA.tambahRuang(labKomputer1);
        fakultasMIPA.tambahRuang(labFisika);
        fakultasMIPA.tambahRuang(labKimia);
        
        fakultasTeknik.tambahRuang(kelasB2);
        fakultasTeknik.tambahRuang(labKomputer2);

        /* print */
        System.out.println("===== DETAIL SEMUA RUANG =====");
        tampilkanDetailRuang(kelasA1);
        tampilkanDetailRuang(kelasB2);
        tampilkanDetailRuang(labKomputer1);
        tampilkanDetailRuang(labKomputer2);
        tampilkanDetailRuang(labFisika);
        tampilkanDetailRuang(labKimia);
        tampilkanDetailRuang(ruangInformatika);
        tampilkanDetailRuang(ruangFisika);
        tampilkanDetailRuang(ruangDosen1);
        tampilkanDetailRuang(ruangDosen2);

        /* add matkul */
        System.out.println("\n===== MENAMBAH MATA KULIAH BARU =====");
        ((LabNonKomp)labFisika).addDaftarMataKuliah("Termodinamika");
        ((LabNonKomp)labKimia).addDaftarMataKuliah("Kimia Analitik");
        
        /* print */
        System.out.println("\n===== DETAIL SETELAH PERUBAHAN =====");
        tampilkanDetailRuang(labFisika);
        tampilkanDetailRuang(labKimia);

        /* biaya */
        System.out.println("\n===== TOTAL BIAYA KEBERSIHAN =====");
        List<Ruang> semuaRuang = new ArrayList<>(Arrays.asList(
            kelasA1, kelasB2, labKomputer1, labKomputer2, labFisika, 
            labKimia, ruangInformatika, ruangFisika, ruangDosen1, ruangDosen2
        ));
        
        double totalBiaya = hitungTotalBiayaKebersihan(semuaRuang);
        System.out.println("Total Biaya Kebersihan Semua Ruang: Rp" + totalBiaya);
    }

    private static void tampilkanDetailRuang(Ruang ruang) {
        ruang.tampilkanDetail();
        System.out.println(); // Spasi antar ruang
    }

    private static double hitungTotalBiayaKebersihan(List<Ruang> daftarRuang) {
        double total = 0;
        for (Ruang ruang : daftarRuang) {
            total += ruang.hitungBiayaKebersihan();
        }
        return total;
    }
}