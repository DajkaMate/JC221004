/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palyazat_221004;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author user09
 */
public class Palyazat_221004 {

    /**
     * @param args the command line arguments
     */
    public static  void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int elemszam = 0;
        String[] cegek = null;
        int[] fo = null;
        try
        {
            System.out.println("Adja meg a cégek számát! ");
            elemszam=Integer.parseInt(br.readLine());
            cegek = new String[elemszam];
            fo = new int[elemszam];
            for (int i = 0; i < elemszam; i++) 
            {
                System.out.println("Adja meg a cég nevét: ");
                String tempnev = br.readLine();
                cegek[i] = tempnev;
                System.out.println("Adja meg a foglalkoztatottak számát: ");
                int tempfo = Integer.parseInt(br.readLine());
                fo[i] = tempfo;
            }
            br.close();
        }   
        catch (Exception hiba)
        {
            System.out.println(hiba.toString());
        }
         
        int maxindex=0;
        int maxletszam=0;
        for (int i = 0; i < fo.length; i++) 
        {
            if (maxletszam < fo[i]) 
            {
                maxindex = i;
                maxletszam = fo[i];
            }
        }
        System.out.println("A cég: " + cegek[maxindex]+ ", ennyi fővel: " + maxindex);
        int osszesen = 0;
        for (int i = 0; i < fo.length; i++) 
        {
            osszesen = osszesen + fo[i];
        }
        float atlag =  (float) osszesen/fo.length;
        int db = 0;
        for (int i = 0; i < fo.length; i++) 
        {
            if (fo[i] < atlag) 
            {
                db++;
            }
        }
        System.out.println("Ennyi cégnél dolgoznak az átlag alatt: " + db);
    }   
    
}
