package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {
    @Test
    void testKonstruktora() {
        Artikl a = new Artikl("Jogurt",2,"JOG");
        assertEquals("Jogurt",a.getNaziv());
        assertEquals(2,a.getCijena());
        assertEquals("JOG",a.getKod());
    }

    @Test
    void testKonstruktora2() {
        Artikl a = new Artikl("Banana",27,"BAN");
        assertEquals("Banana",a.getNaziv());
        assertEquals(27,a.getCijena());
        assertEquals("BAN",a.getKod());
    }

    @Test
    void testKonstruktora3() {
        Artikl a = new Artikl("Faris",5,"Far");
        assertAll("Testiranje konstruktora",
                () -> assertEquals("Faris",a.getNaziv()),
                () -> assertEquals(5,a.getCijena()),
                () -> assertEquals("Far",a.getKod()));
    }


}