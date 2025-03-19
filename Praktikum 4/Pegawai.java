/* Nama File    : Pegawai.java
 * Deskripsi    : berisi atrbit dan metode dalam class Pegawai
 * Pembuat      : Vern Dharmawan / 24060123130057
 * Tanggal      : 13 Maret 2025
 */
import java.time.*;

public class Pegawai {
    private String NIP;
    private String nama;
    private LocalDate tanggal_lahir;
    private LocalDate mulai;
    private double gaji_pokok;

    public Pegawai(){

    }

    public Pegawai(String NIP, String nama, LocalDate tanggal_lahir, LocalDate mulai, double gaji_pokok){
        this.NIP = NIP;
        this.nama = nama;
        this.tanggal_lahir = tanggal_lahir;
        this.mulai = mulai;
        this.gaji_pokok = gaji_pokok;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public LocalDate getTanggal_Lahir() {
        return tanggal_lahir;
    }

    public void setTanggal_Lahir(LocalDate tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    public LocalDate getMulai() {
        return mulai;
    }

    public void setMulai(LocalDate mulai) {
        this.mulai = mulai;
    }

    public double getGaji_Pokok(){
        return gaji_pokok;
    }

    public void setGaji_Pokok (int gaji_pokok) {
        this.gaji_pokok = gaji_pokok;
    }

    public String hitungMasaKerja(LocalDate currentDate) {
        Period masaKerja = Period.between(mulai, currentDate);
        return masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan";
    }



    public void printPegawai() {
        System.out.println("NIP\t\t:" + getNIP());
        System.out.println("Nama\t\t:" + getNama());
        System.out.println("Tanggal Lahir\t:" + getTanggal_Lahir());
        System.out.println("TMT\t\t:" + getMulai());
        System.out.println("Gaji Pokok\t:" + getGaji_Pokok());
    }
}