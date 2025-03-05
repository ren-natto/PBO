/* Nama File    : MataKuliah.java
 * Deskripsi    : berisi atribut dan method dalam class MataKuliah
 * Pembuat      : Vern Dharmawan
 * Tanggal      : 27 Februari 2025 / 24060123130057
 */

public class MataKuliah{
    private String idMatKul;
    private String prodi;
    private int sks;

    public MataKuliah(String x, String y, int z ){
        this.idMatKul = x;
        this.prodi = y;
        this.sks = z;
    }

    public MataKuliah(){
        this("---","---",0);
    }

    public String getidMatKul(){
        return this.idMatKul;
    }

    public String getProdi(){
        return this.prodi;
    } 

    public int getSks() {
        return this.sks;
    }

    public void setIdMatKul(String x){
        this.idMatKul = x;
    }

    public void setProdi(String x){
        this.prodi = x;
    }

    public void setSks(int x){
        this.sks = x;
    }
}