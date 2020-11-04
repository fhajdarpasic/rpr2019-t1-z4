package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void testKonstruktora() {
        Korpa k = new Korpa();
        Assertions.assertEquals(0,k.getArtikli().length);
    }

    @Test
    void testGetArtikli() {
        Korpa k = new Korpa();
        for(int i =0;i<26;i++) {
            k.dodajArtikl(new Artikl("Hljeb", 4, "HLJ"));
        }
        Assertions.assertEquals(26,k.getArtikli().length);
    }

    void testDodajArtikl() {
        Korpa k = new Korpa();
        k.dodajArtikl(new Artikl("Hljeb",4,"HLJ"));
        Assertions.assertTrue(k.dodajArtikl(new Artikl("Hljeb",4,"HLJ")));
    }

    @Test
    void testKapacitetaListe() {
        Korpa k = new Korpa();
        for(int i =0;i<50;i++) {
            k.dodajArtikl(new Artikl("Hljeb", 4, "HLJ"));
        }
        Assertions.assertFalse(k.dodajArtikl(new Artikl("Hljeb", 4, "HLJ")));
    }

    @Test
    void testUkupneCijene() {
        Korpa k = new Korpa();
        for(int i =0;i<50;i++) {
            k.dodajArtikl(new Artikl("Hljeb", 4, "HLJ"));
        }
        Assertions.assertEquals(200,k.dajUkupnuCijenuArtikala());
    }



}