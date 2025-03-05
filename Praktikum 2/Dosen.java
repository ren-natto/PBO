/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * Pembuat      : Vern Dharmawan
 * Tanggal      : 27 Februari 2025 / 24060123130057
 */


public class Dosen {
    private String nip;
    private String nama;
    private String prodi;

    public Dosen(String x,String y,String z){
        this.nip = x;
        this.nama = y;
        this.prodi = z;
    }

    public Dosen() {
        this("---","---","---");
    }

    public String getNip() {
        return this.nip;
    }

    public String getNama() {
        return this.nama;
    }

    public String getProdi() {
        return this.prodi;
    }

    public void setNip(String x) {
        this.nip = x;
    }

    public void setNama(String x) {
        this.nama = x;
    }

    public void setProdi(String x) {
        this.prodi = x;
    }


}