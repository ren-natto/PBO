/* Nama File    : Pegawai.java
 * Deskripsi    : berisi atrbit dan metode dalam class dosen
 * Pembuat      : Vern Dharmawan / 24060123130057
 * Tanggal      : 13 Maret 2025
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DosenTamu extends Pegawai {
    private String NIDK;
    private LocalDate akhir;
    private double tunjangan;
    private String fakultas;

    public DosenTamu(String NIP, String NIDK, String nama, LocalDate tanggal_lahir, LocalDate mulai, double gaji_pokok, LocalDate akhir, String fakultas) {
        super(NIP, nama, tanggal_lahir, mulai, gaji_pokok);
        this.NIDK = NIDK;
        this.akhir = akhir;
        this.fakultas = fakultas;
        this.tunjangan = hitungTunjangan();
    }

    private double hitungTunjangan() {
        return 0.025 * getGaji_Pokok();
    }

    public String getNIDK() {
        return NIDK;
    }

    public void setNIDK(String NIDK) {
        this.NIDK = NIDK;
    }

    public LocalDate getAkhir() {
        return akhir;
    }

    public void setAkhir(LocalDate akhir) {
        this.akhir = akhir;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public void printPegawai() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");

        System.out.println("NIP\t\t: " + getNIP());
        System.out.println("NIDK\t\t: " + getNIDK());
        System.out.println("Nama\t\t: " + getNama());
        System.out.println("Tanggal Lahir\t: " + getTanggal_Lahir().format(formatter));
        System.out.println("TMT\t\t: " + getMulai().format(formatter));
        System.out.println("Jabatan\t\t: Dosen Tamu");
        System.out.println("Fakultas\t: " + getFakultas());

        if (akhir != null) { 
            long masaKerjaTahun = ChronoUnit.YEARS.between(getMulai(), akhir);
            long masaKerjaBulan = ChronoUnit.MONTHS.between(getMulai(), akhir) % 12;
            System.out.println("Masa Kontrak\t: " + masaKerjaTahun + " tahun " + masaKerjaBulan + " bulan");
            System.out.println("Akhir Kontrak\t: " + akhir.format(formatter));
        } else {
            System.out.println("Masa Kontrak\t: Data tidak tersedia");
            System.out.println("Akhir Kontrak\t: Data tidak tersedia");
        }

        System.out.println("Gaji Pokok\t: Rp " + String.format("%,.2f", getGaji_Pokok()));
        System.out.println("Tunjangan\t: 2.5% x Rp " + String.format("%,.2f", getGaji_Pokok()) + " = Rp " + String.format("%,.2f", getTunjangan()));
    }
}
