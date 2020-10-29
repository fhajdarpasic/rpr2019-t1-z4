package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Supermarket {
    private ArrayList<Artikl> artikli = new ArrayList<>();

    public Artikl[] getArtikli() {
        Artikl[] artikls = new Artikl[artikli.size()];   // ili ispod new Artikl[artikli.size()]
        artikls = artikli.toArray(artikls); // sadrzaj iz arraylist artikli prebacimo u niz artikls
        return artikls;
    }

    public boolean dodajArtikl(Artikl artikl) {
        if(artikli.size()==1000) return false;
        else artikli.add(artikl);
        return true;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl trazeniArtikl = null;
        int indekstrazenogArtikla=-1;
        for(int i =0;i<artikli.size();i++) {
            if(artikli.get(i).getKod().equals(kod)) {
                indekstrazenogArtikla = i;
                break;
            }
        }
        if(indekstrazenogArtikla!=-1) {
            trazeniArtikl = artikli.get(indekstrazenogArtikla);
            artikli.remove(trazeniArtikl);
        }
        return trazeniArtikl;
    }
}
