/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_fugvennyel_221004;

import java.util.ArrayList;

public class Lista_fugvennyel_221004 {

    static void Lista_kiir(ArrayList<String> lista)
    {
        int elemszam = lista.size();
        System.out.println("A lista elemszáma: " + elemszam);
        for(String elem: lista)
        {
            System.out.println(elem);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Lista létrehozása
        ArrayList<String> nevek = new ArrayList<>();
        
        //Elemek hozzáadása (mindig a végére kerül)
        nevek.add("István");
        nevek.add("Imre");
        nevek.add("László");
        nevek.add("Kálmán");
        
        //Lista kiírása fügvénnyel
        Lista_kiir(nevek);
        System.out.println("");
        
        //Hozzáadás a lista tetszőleges helyére
        nevek.add(2, "Vaddisznó");
        Lista_kiir(nevek);
        System.out.println("");
        
        //elem törlése
        nevek.remove(1);
        nevek.remove(1);
        Lista_kiir(nevek);
        System.out.println("");
        
        //adott elem módosítása
        nevek.set(0, "Szent István");
        Lista_kiir(nevek);
        System.out.println("");
        
        //listaelem sorszámának lekérdezése
        int hanyadik = nevek.indexOf("Szent István");
        System.out.println((hanyadik+1) + ". " + nevek.get(hanyadik));
    }
    
}
