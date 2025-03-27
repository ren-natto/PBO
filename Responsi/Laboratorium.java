/* Nama File    : Ruang.java
 * Deskripsi    : Berisi method dan atribut objek laboratorium
 * Pembuat      : Vern Dharmawan / 24060123130057
 * Tanggal      : 27 Maret 2025
 */

abstract class Laboratorium extends Ruang {
    private String namaLab;
    private double hargaSewa;
    private Fakultas fakultas;

    public Laboratorium(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLab, double hargaSewa, Fakultas fakultas) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaLab = namaLab;
        this.hargaSewa = hargaSewa;
        this.fakultas = fakultas;
    }

    public double getHargaSewa() {
        return this.hargaSewa;
    }

    public String getNamaLaboratorium() {
        return this.namaLab;
    }

    public void setNamaLab(String namaLab){
        this.namaLab = namaLab;
    }

    public void setHargaSewa(double hargaSewa){
        this.hargaSewa = hargaSewa;
    }

    public Fakultas getFakultas() {
        return fakultas;
    }

    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }

    public void daftarkanKeFakultas() {
    this.fakultas.tambahRuang(this);
    }

    @Override
    public double hitungBiayaKebersihan() {
        return hitungLuas() * fakultas.getTarifKebersihan();
    }

}