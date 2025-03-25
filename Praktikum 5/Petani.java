/* Nama File    : MBangunDatar.java
 * Deskripsi    : berisi atrbit dan metode dalam class Petani
 * Pembuat      : Vern Dharmawan / 24060123130057
 * Tanggal      : 20 Maret 2025
 */

class Petani extends Manusia implements Pajak {
    private String daerah;
    private static int counterPetani = 0;

    public Petani(String nama, String tglMulaiKerja, String alamat, double pendapatan, String daerah) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.daerah = daerah;
        counterPetani++;
    }

    public String getDaerah(){
        return this.daerah;
    }

    public void setdaerah(String daerah){
        this.daerah = daerah;
    }

    @Override
    public double hitungPajak() {
        return 0; 
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Pajak\t: " + hitungPajak());
    }
}