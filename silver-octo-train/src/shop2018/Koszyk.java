/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop2018;

import java.util.ArrayList;
import java.util.List;


public class Koszyk {
    private List<Produkt> lista = new ArrayList();
    
    public void dodaj(Produkt p)
    {
        lista.add(p);
    }
    
    public double doZaplaty()
    {
        double sum = 0;
        for(Produkt p : lista)
        {
            sum += p.getCena();
        }
        return sum;
    }
}
