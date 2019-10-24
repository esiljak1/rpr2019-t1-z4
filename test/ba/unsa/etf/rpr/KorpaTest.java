package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void izbaciArtiklSaKodom() {
        Korpa k = new Korpa();

        k.dodajArtikl(new Artikl("Lopta", 10, "1"));
        k.dodajArtikl(new Artikl("Lopta", 10, "2"));
        k.dodajArtikl(new Artikl("Lopta", 10, "3"));
        k.dodajArtikl(new Artikl("Lopta", 10, "4"));
        k.izbaciArtiklSaKodom("3");
        assertEquals("4", k.getArtikli()[2].getKod());
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa k = new Korpa();

        k.dodajArtikl(new Artikl("Lopta", 10, "1"));
        k.dodajArtikl(new Artikl("Lopta", 11, "2"));
        k.dodajArtikl(new Artikl("Lopta", 12, "3"));
        k.dodajArtikl(new Artikl("Lopta", 13, "4"));
        k.dodajArtikl(new Artikl("Lopta", 10, "5"));
        assertEquals(56, k.dajUkupnuCijenuArtikala());
    }
}