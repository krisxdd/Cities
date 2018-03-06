package sklep;

import java.math.BigDecimal;

public class Sklep {

    public static void main(String[] args) {
        Koszyk k = new Koszyk();
        Produkt chleb = new Produkt("chleb", BigDecimal.valueOf(2.2));
        Produkt maslo = new Produkt("maslo", BigDecimal.valueOf(4.72));
        Produkt maka = new Produkt("maka", BigDecimal.valueOf(1.5));
        k.dodaj(chleb);
        k.dodaj(maslo);
        k.dodaj(maka);
        System.out.println(k.doZaplaty());
        System.out.println(k);
    }
    
}
