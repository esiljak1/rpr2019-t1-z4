package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli = new Artikl[50];
    private int trenutno = 0;
    public boolean dodajArtikl(Artikl a){
        if(trenutno == 50) return false;
        artikli[trenutno] = a;
        trenutno = trenutno + 1;
        return true;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public void setArtikli(Artikl[] artikli) {
        this.artikli = artikli;
    }

    public int getTrenutno() {
        return trenutno;
    }

    public void setTrenutno(int trenutno) {
        this.trenutno = trenutno;
    }
    public Artikl izbaciArtiklSaKodom(String kod){
        Artikl ret = null;
        for(int i=0; i<trenutno; i++){
            if(artikli[i].getKod().equals(kod)){
                ret = artikli[i];
                artikli[i] = null;
                for(int j=i; j<trenutno-1; j++){
                    artikli[j] = artikli[j+1];
                }break;
            }
        }trenutno = trenutno - 1;
        return ret;
    }
    public int dajUkupnuCijenuArtikala(){
        int suma = 0;
        for(int i=0; i<trenutno; i++) suma = suma + artikli[i].getCijena();
        return suma;
    }
}
