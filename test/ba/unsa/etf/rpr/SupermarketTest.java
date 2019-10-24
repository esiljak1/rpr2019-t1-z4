package ba.unsa.etf.rpr;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @org.junit.jupiter.api.Test
    void izbaciArtiklSaKodom() {
        Supermarket s = new Supermarket();
        s.dodajArtikl(new Artikl("Lopta", 10, "1"));
        s.dodajArtikl(new Artikl("Lopta", 10, "2"));
        s.dodajArtikl(new Artikl("Lopta", 10, "3"));
        s.dodajArtikl(new Artikl("Lopta", 10, "4"));
        s.izbaciArtiklSaKodom("2");
        assertEquals("3", s.getArtikli()[1].getKod());
    }
}