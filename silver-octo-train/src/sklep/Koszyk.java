package sklep;

import java.util.ArrayList;
import java.util.List;
import java.math.*;

public class Koszyk {
    private List <Produkt> lista = new ArrayList();
    public void dodaj(Produkt p) {
        lista.add(p);
    }
    public BigDecimal doZaplaty() {
        BigDecimal kwota= new BigDecimal("0");
        for(Produkt p: lista)
            kwota = kwota.add(p.getCena());
        return kwota;
    }
    public String toString() {
        StringBuilder s = new StringBuilder();
        for(Produkt p: lista){
             s.append(p.getNazwa());
             s.append(", cena: ");
             s.append(p.getCena());
             s.append("\n");
        }
        return s.toString();
    }
}
