/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_egeszszamok_221004;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Lista_egeszszamok_221004 {

    static void Lista_feltolt_0_100(int elemszam, ArrayList<Integer> lista)
    {
    Random r = new Random();
    for(int i = 1; i <= elemszam; i++)
        {
        lista.add(r.nextInt(100));
        }
    }
    
    static int Lista_sum(ArrayList<Integer> lista)
    {
    int osszeg = 0;
    for(int x: lista)
    {
        osszeg += x;
    }
    return osszeg;
    }
    
    static void Lista_kiir(ArrayList<Integer> lista)
    {
    int elemszam = lista.size();
    System.out.println("A lista elemszáma: " + elemszam);
    for(Integer elem: lista)
    {
        System.out.println(elem);
    }
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> szamok = new ArrayList<>();

        System.out.println("Hány számot szeretne? ");
        Scanner konzol = new Scanner(System.in);
        int db = konzol.nextInt();
        Lista_feltolt_0_100(db, szamok);

        Lista_kiir(szamok);

        System.out.println("\nA lista tartalma rendezve: ");
        szamok.sort(null);
        Lista_kiir(szamok);

        System.out.println(" számok  összege: " + Lista_sum(szamok));
    }
}
