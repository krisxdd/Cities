package sklep;

import java.util.*;
import java.math.*;

public class Koszyk {
    private Map<Produkt, Integer> lista = new HashMap();
    public void dodaj(Produkt p) {
        if(lista.containsKey(p)) {
        int integ = lista.get(p);
        lista.put(p, integ+1);
        }
        else
        lista.put(p, 1);
    }
    public BigDecimal doZaplaty() {
        BigDecimal kwota= new BigDecimal("0");
        for(Produkt p: lista.keySet()){
            int integ = lista.get(p);
            kwota = kwota.add(p.getCena().multiply(BigDecimal.valueOf(integ)));
        }
        return kwota;
    }
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for(Produkt p: lista.keySet()){
            int integ = lista.get(p);
             s.append(p.getNazwa());
             s.append(", cena: ");
             s.append(p.getCena());
             s.append(" x ");
             s.append(integ);
             s.append(" = ");
             s.append(p.getCena().multiply(BigDecimal.valueOf(integ)));
             s.append("\n");
        }
        s.append(doZaplaty());
        return s.toString();
    }
}
