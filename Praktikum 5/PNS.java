/* Nama File    : MBangunDatar.java
 * Deskripsi    : berisi atrbit dan metode dalam class PNS
 * Pembuat      : Vern Dharmawan / 24060123130057
 * Tanggal      : 20 Maret 2025
 */

class PNS extends Manusia implements Pajak {
    private String NIP;
    private static int counterPNS = 0;

    public PNS(String nama, String mulaikerja, String alamat, double pendapatan, String NIP) {
        super(nama, mulaikerja, alamat, pendapatan);
        this.NIP = NIP;
        counterPNS++;
    }

    public String getNIP(){
        return this.NIP;
    } 

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }
 
    @Override
    public double hitungPajak() {
        return 0.10 * pendapatan;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Pajak\t: " + hitungPajak());
    }

}