package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Korpa {
    private ArrayList<Artikl> artikli = new ArrayList<>();

    public Artikl[] getArtikli() {
        Artikl[] artikls = new Artikl[artikli.size()];   // ili ovdje = new Artikl[artikli.size()]; pa dole onda artikls stavis
        artikls = artikli.toArray(artikls); // sadrzaj iz arraylist artikli prebacimo u niz artikls
        return artikls;
    }

    public boolean dodajArtikl(Artikl artikl) {
        if(artikli.size()==50) return false;
        else artikli.add(artikl);
        return true;
    }

    public int dajUkupnuCijenuArtikala() {
        int suma=0;
        for(Artikl artikl:artikli) {
            suma=suma+artikl.getCijena();
        }
        return suma;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl trazeniArtikl = null;
        int indekstrazenogArtikla=-1;
        for(int i =0;i<artikli.size();i++) {
            if(artikli.get(i).getNaziv().equals(kod)) {
                indekstrazenogArtikla = i;
                break;
            }
        }
        if(indekstrazenogArtikla!=-1) {
            trazeniArtikl = artikli.get(indekstrazenogArtikla);
        }
        return trazeniArtikl;
    }
}
