import java.util.ArrayList;

/* Nama File    : Mahasiswa.java
 * Deskripsi    : berisi atribut dan method dalam class Mahasiswa
 * Pembuat      : Vern Dharmawan
 * Tanggal      : 27 Februari 2025 / 24060123130057
 */


public class Mahasiswa {

    /* Atribut */
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    public Mahasiswa(String x,String y, String z){
        this.nim = x;
        this.nama = y;
        this.prodi = z;
        this.listMatKul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }
    public Mahasiswa(){
        this("---","---","---");
    }

    public String getNama(){
        return this.nama;
    }

    public String getNim() {
        return this.nim;
    }

    public String getProdi() {
        return this.prodi;
    }

    public ArrayList getListMatKul(){
        return this.listMatKul;
    }

    public Dosen getDosenWali(){
        return this.dosenWali;
    }

    public Kendaraan getKendaraan(){
        return this.kendaraan;
    }

    public void setNim(String x){
        this.nim = x;
    }

    public void setNama(String x){
        this.nama = x;
    }

    public void setProdi(String x){
        this.prodi = x;
    }

    public void setDosenWali (Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void setKendaraan (Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    public void addMatkul(MataKuliah matkul) {
            listMatKul.add(matkul);
    }

    public int getJumlahSKS() {
        int totalSKS = 0;
        for (MataKuliah mk : listMatKul) {
            totalSKS += mk.getSks();
        }
        return totalSKS;
    }

    public int getJumlahMatKul() {
        return listMatKul.size();
    }

    public void printMhs() {
        System.out.println("Mahasiswa: " + nama + " (NIM: " + nim + "), Prodi: " + prodi);
    }

    public void printDetailMhs() {
        printMhs();
        System.out.println("Mata Kuliah yang diambil:");
        for (MataKuliah mk : listMatKul) {
            System.out.println("  - " + mk.getidMatKul() + " - " + " (" + mk.getSks() + " SKS)");
        }
        System.out.println("Total SKS: " + getJumlahSKS());

        if (dosenWali != null) {
            System.out.println("Dosen Wali: " + dosenWali.getNama() + " (NIP: " + dosenWali.getNip() + "), Prodi: " + dosenWali.getProdi());
        }

        if (kendaraan != null) {
            System.out.println("Kendaraan: " + kendaraan.getJenis() + " (Plat: " + kendaraan.getNoPlat() + ")");
        }
    }

    
}