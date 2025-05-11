package latihanVeryEasy.latihanMedium;

/**
 *
 * @author Vern
 */
public class KontrolSenjata {
    private Senjata senjata;
    
    public KontrolSenjata(Senjata senjata){
        this.senjata = senjata;
    }
    
    public boolean isAdaPeluru(){
        return senjata.getPeluru() > 0;
    }
    
    public void isiPeluru(int peluru) {
        this.senjata.setPeluru(this.senjata.getPeluru()+peluru);
        System.out.println(">> Peluru berhasil ditambah: " + peluru);
    }
    
    public void menembak(int jumlah) {
        int jml = this.senjata.getPeluru();
        System.out.println(">> Siap menembak " + jumlah + " kali");
        
        if (this.senjata.getPeluru()<=0){
            System.out.println("Peluru habis");
        } else {
            for (int i = 0; i < jumlah; i++){
                if (jml > 0){
                    System.out.println("TAR");
                } else {
                    System.out.println("Gagal tembak, Peluru Habis");
                }
                jml -= 1;
            }
            if (jml < 0) {
                jml = 0;
            }
            System.out.println(">> Peluru sisa: " + jml);
        }
    }
    
    public String menusuk() {
        if (this.senjata.isMenusuk()){
            return "Jleb! ";
        } else {
            return "Gagal, belum pasang bayonet";
        }
    }
    
    public void pasangBayonet() {
        this.senjata.setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
}