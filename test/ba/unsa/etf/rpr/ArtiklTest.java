package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void getNaziv() {
        Artikl a = new Artikl("Adin", 5, "SP");
        assertEquals("Adin", a.getNaziv());
    }

    @Test
    void getCijena() {
        Artikl a = new Artikl("Adin", 5, "SP");
        assertEquals(5, a.getCijena());
    }

    @Test
    void getKod() {
        Artikl a = new Artikl("Adin", 5, "SP");
        assertEquals("SP", a.getKod());
    }
}