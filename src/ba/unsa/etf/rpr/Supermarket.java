package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artikli = new Artikl[1000];
    private int stanje = 0;
    public boolean dodajArtikl(Artikl a){
        if(stanje == 1000) return false;
        artikli[stanje] = a;
        stanje = stanje + 1;
        return true;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public void setArtikli(Artikl[] artikli) {
        this.artikli = artikli;
    }

    public int getStanje() {
        return stanje;
    }

    public void setStanje(int stanje) {
        this.stanje = stanje;
    }
    public Artikl izbaciArtiklSaKodom(String kod){
        Artikl ret = null;
        for(int i=0; i<stanje; i++){
            if(artikli[i].getKod().equals(kod)){
                ret = artikli[i];
                artikli[i] = null;
                for(int j=i; j<stanje-1; j++){
                    artikli[j] = artikli[j+1];
                }break;
            }
        }stanje = stanje - 1;
        return ret;
    }
}
