/* Nama File    : Pegawai.java
 * Deskripsi    : berisi atrbit dan metode dalam class dosen
 * Pembuat      : Vern Dharmawan / 24060123130057
 * Tanggal      : 13 Maret 2025
 */
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DosenTetap extends Pegawai {
    private String NIDN;
    private LocalDate BUP;
    private double tunjangan;
    private String fakultas;

    public DosenTetap(String NIDN, String NIP, String Nama, LocalDate tanggal_lahir, LocalDate mulai, double gaji_pokok, String fakultas){
        super(NIP,Nama,tanggal_lahir,mulai,gaji_pokok);
        this.NIDN = NIDN;
        this.BUP = tanggal_lahir.plusYears(65);
        this.tunjangan = hitungTunjangan();
        this.fakultas = fakultas;
    }

    private double hitungTunjangan() {
        long masaKerja = ChronoUnit.YEARS.between(getMulai(), LocalDate.now());
        return 0.02 * getGaji_Pokok() * masaKerja;
    }
    
    public String getNIDN() {
        return NIDN;
    }

    public void setNIDN(String NIDN) {
        this.NIDN = NIDN;
    }
    public LocalDate getBUP() {
        return BUP;
    }

    public double getTunjangan() {
        return tunjangan;
    }
    public String getFakultas(){
        return fakultas;
    }

    public void setFalkutas(String fakultas){
        this.fakultas = fakultas;
    }

    public void printPegawai() {
        System.out.println("NIP\t\t: " + getNIP());
        System.out.println("NIDN\t\t: " + NIDN);
        System.out.println("Nama\t\t: " + getNama());
        System.out.println("Tanggal Lahir\t: " + getTanggal_Lahir().getDayOfMonth() + " " + getTanggal_Lahir().getMonth() + " " + getTanggal_Lahir().getYear());
        System.out.println("TMT\t\t: " + getMulai().getDayOfMonth() + " " + getMulai().getMonth() + " " + getMulai().getYear());
        System.out.println("Jabatan\t\t: Dosen Tetap");
        System.out.println("Fakultas\t: " + fakultas);
        long masaKerjaTahun = ChronoUnit.YEARS.between(getMulai(), LocalDate.now());
        long masaKerjaBulan = ChronoUnit.MONTHS.between(getMulai(), LocalDate.now()) % 12;
        System.out.println("Masa Kerja\t: " + masaKerjaTahun + " tahun " + masaKerjaBulan + " bulan");
        System.out.println("BUP\t\t: " + BUP.getDayOfMonth() + " " + BUP.getMonth() + " " + BUP.getYear());
        System.out.println("Gaji Pokok\t: Rp " + String.format("%,.2f", getGaji_Pokok()));
        System.out.println("Tunjangan\t: 2% x " + masaKerjaTahun + " x Rp " + String.format("%,.2f", getGaji_Pokok()) + " = Rp " + String.format("%,.2f", tunjangan));
    }
}
