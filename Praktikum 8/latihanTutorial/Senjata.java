package latihanTutorial;

/**
 *
 * @author Vern
 */
public class Senjata {

    private String bunyi;
    private boolean menusuk;
    
    public Senjata(String bunyi){
        this.bunyi = bunyi;
        this.menusuk = false;
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public void setMenusuk(boolean menusuk) {
        this.menusuk = menusuk;
    }

    public String getBunyi() {
        return bunyi;
    }

    public boolean isMenusuk() {
        return menusuk;
    }

    public void menembak(int jumlah){
        for (int i = 0; i < jumlah; i++) {
            System.out.print(getBunyi() + " ");
        }
        System.out.println("");
    }
    
    public void pasangBayonet() {
        setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
    
    public String menusuk() {
        if (isMenusuk()){
            return "Jleb! ";
        } else {
            return "Gagal, belum pasang bayonet";
        }
    }
}
