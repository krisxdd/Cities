package shop2018;

public class Shop2018 {

    public static void main(String[] args) {
        Koszyk k = new Koszyk();
        Produkt chleb = new Produkt("chleb", 2.2);
        Produkt maslo = new Produkt("maslo", 4.72);
        Produkt maka = new Produkt("maka", 1.5);
        k.dodaj(chleb);
        k.dodaj(maslo);
        k.dodaj(maka);
        System.out.println(k.doZaplaty());
    }
    
}
