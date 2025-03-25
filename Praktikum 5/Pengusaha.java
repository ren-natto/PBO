/* Nama File    : MBangunDatar.java
 * Deskripsi    : berisi atrbit dan metode dalam class Pengusaha
 * Pembuat      : Vern Dharmawan / 24060123130057
 * Tanggal      : 20 Maret 2025
 */

class Pengusaha extends Manusia implements Pajak {
    private String NPWP;
    private static int counterPengusaha = 0;

    public Pengusaha(String nama, String mulaikerja, String alamat, double pendapatan, String NPWP){
        super(nama, mulaikerja, alamat, pendapatan);
        this.NPWP = NPWP;
        counterPengusaha++;
    }

    public String getNPWP() {
        return this.NPWP;
    }

    public void setNPWP(String NPWP) {
        this.NPWP = NPWP;
    }

    @Override
    public double hitungPajak(){
        return 0.15 * pendapatan;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Pajak\t: " + hitungPajak());
    }
} 