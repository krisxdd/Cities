package sklep;
import java.math.*;
public class Produkt {
    private String nazwa;
    private BigDecimal cena;
    public Produkt(String n, BigDecimal c) {
        nazwa = n;
        cena = c;
    }
    public String getNazwa () {
        return nazwa;
    }
    public BigDecimal getCena() {
        return cena;
    }
}
