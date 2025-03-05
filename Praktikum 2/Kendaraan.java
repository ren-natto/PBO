/* Nama File    : Kendaraan.java
 * Deskripsi    : berisi atribut dan method dalam class Kendaraan
 * Pembuat      : Vern Dharmawan
 * Tanggal      : 27 Februari 2025 / 24060123130057
 */

public class Kendaraan{
    private String noPlat;
    private String jenis;

    public Kendaraan(String x, String y){
        this.noPlat = x;
        this.jenis = y;
    }

    public Kendaraan(){
        this("---","---");
    }

    public String getNoPlat(){
        return this.noPlat;
    }

    public String getJenis() {
        return this.jenis;
    }

    public void setNoPlat(String x) {
        this.noPlat = x;
    }

    public void setJenis(String x) {
        this.jenis = x;
    }
}

