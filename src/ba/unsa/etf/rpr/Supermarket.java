package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Supermarket {
    private ArrayList<Artikl> artikli = new ArrayList<>();

    public Artikl[] getArtikli() {
        Artikl[] artikls = new Artikl[1000]; // prvo napravimo niz velicine ovog arraylist-a
        artikls = artikli.toArray(artikls); // sadrzaj iz arraylist artikli prebacimo u niz artikls
        return artikls;
    }

    public boolean dodajArtikl(Artikl artikl) {
        return artikli.add(artikl);
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
