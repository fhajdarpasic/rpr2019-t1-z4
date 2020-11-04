package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void testKonstruktora() {
        Supermarket k = new Supermarket();
        Assertions.assertEquals(0,k.getArtikli().length);
    }

    @Test
    void testGetArtikli() {
        Supermarket k = new Supermarket();
        for(int i =0;i<26;i++) {
            k.dodajArtikl(new Artikl("Hljeb", 4, "HLJ"));
        }
        Assertions.assertEquals(26,k.getArtikli().length);
    }

    void testDodajArtikl() {
        Supermarket k = new Supermarket();
        k.dodajArtikl(new Artikl("Hljeb",4,"HLJ"));
        Assertions.assertTrue(k.dodajArtikl(new Artikl("Hljeb",4,"HLJ")));
    }

    @Test
    void testKapacitetaListe() {
        Supermarket k = new Supermarket();
        for(int i =0;i<1000;i++) {
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

    @Test
    void testIzbaciArtikl() {
        Korpa k = new Korpa();
        for(int i =0;i<10;i++) {
            k.dodajArtikl(new Artikl("Hljeb", 4, "HLJ" + i));
        }
        Artikl izbacen = k.izbaciArtiklSaKodom("HLJ5");
        /* Provjera izbacenog sa istim takvim */
        Artikl dodatni = new Artikl("Hljeb",4,"HLJ5");
        assertEquals(izbacen.getNaziv(),dodatni.getNaziv());
        assertEquals(izbacen.getCijena(),izbacen.getCijena());
        assertEquals(izbacen.getKod(),izbacen.getKod());
    }



}