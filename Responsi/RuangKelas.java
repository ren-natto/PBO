/* Nama File    : Ruang.java
 * Deskripsi    : Berisi method dan atribut objek ruang kelas
 * Pembuat      : Vern Dharmawan / 24060123130057
 * Tanggal      : 27 Maret 2025
 */

class RuangKelas extends Ruang {
    private int KursiTersedia;
    private int KursiRusak;
    private Fakultas fakultas;

    public RuangKelas(String kode, double panjang, double lebar, double tinggi, int kapasitas, int KursiTersedia, int KursiRusak, Fakultas fakultas) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.KursiTersedia = KursiTersedia;
        this.KursiRusak = KursiRusak;
        this.fakultas = fakultas;
    }

    public int getKursiTersedia() {
        return this.KursiTersedia;
    }

    public int getKursiRusak() {
        return this.KursiRusak;
    }

    public void setKursiTersedia(int KursiTersedia){
        this.KursiTersedia = KursiTersedia;
    }

    public void setKursiRusak(int KursiRusak){
        this.KursiRusak = KursiRusak;
    }

    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }

    public Fakultas getFakultas() {
        return fakultas;
    }

    @Override
    public double hitungBiayaKebersihan() {
        return hitungLuas() * fakultas.getTarifKebersihan();
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("=== Ruang Kelas ===");
        System.out.println("Kode: " + getKode());
        System.out.println("Ukuran: " + getPanjang() + "m x " + getLebar() + "m x " + getTinggi() + "m");
        System.out.println("Kapasitas: " + getKapasitas());
        System.out.println("Kursi Tersedia: " + this.KursiTersedia);
        System.out.println("Kursi Rusak: " + this.KursiRusak);
        System.out.println("Biaya Kebersihan: Rp" + hitungBiayaKebersihan());
    }

    
}