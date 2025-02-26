/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Vern Dharmawan
 * Tanggal      : 20 Februari 2025 / 24060123130057
 */


public class Titik {
    /* Atribut */
    double absis;
    double ordinat;
    static int counterTitik = 0;


    /* Method*/
    // Konstruktor //
    Titik (double x, double y) {
        absis = x;
        ordinat = y;
        counterTitik++;
    }

    Titik (){
        this(0,0);
    }

    // Mengembalikan nilai counterTitik //
    static int getCounterTitik() {
        return counterTitik;
    }

    // Mengembalikan nilai absis //
    double getAbsis(){
        return absis;
    }

    // Mengembalikan nilai ordinat //
    double getOrdinat() {
        return ordinat;
    }

    // Mengeset nilai absis //
    void setAbsis(double x) {
        absis = x;
    }

    // Mengeset nilai ordinat //
    void setOrdinat(double y) {
        ordinat = y;
    }

    // Menggeser nilai absis dan ordinat //
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // Mencetak titik //
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat +")");
    }

    // Mencari kuadran //
    double getKuadran() {
        if (absis >=0 && ordinat >=0 ) {
            return 1;
        } else if (absis <0 && ordinat >=0) {
            return 2;
        } else if (absis <0 && ordinat <0) {
            return 3;
        } else if (absis >=0 && ordinat <0) {
            return 4;
        }
        return 0;
    }

    // Mencari jarak pusat //
    double getJarakPusat() {
        return Math.sqrt( (absis*absis) + (ordinat*ordinat));
    }

    // Mencari jarak //
    double getJarak(double x, double y) {
        return Math.sqrt((absis-x)*(absis-x) + (ordinat-y)*(ordinat-y));
    }

    // Merefleksikan X //
    void refleksiX() {
        ordinat = ordinat*-1;
    }

    void refleksiY() {
        absis = absis*-1;
    }

    Titik getRefleksiX() {
        return new Titik(getAbsis(),getOrdinat()*-1);
    }

    Titik getRefleksiY() {
        return new Titik(getAbsis()*-1,getOrdinat());
    }

    //Titik getRefleksiY() {
        
    //}


} // end class titik