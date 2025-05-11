package latihanVeryEasy;

import java.util.logging.Logger;

/**
 *
 * @author Vern
 */
public class Senjata {
    
    private String bunyi;
    private int peluru;
    
    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.peluru = 0;
    }

    public String getBunyi() {
        return bunyi;
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public int getPeluru() {
        return peluru;
    }

    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }
    
    public void menembak() {
        if (getPeluru() != 0 ){
            System.out.println("TAR");
            System.out.println("Sisa Peluru: " + (getPeluru()-1));
        }
    }
    
}
