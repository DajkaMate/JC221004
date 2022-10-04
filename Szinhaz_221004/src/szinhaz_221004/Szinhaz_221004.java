/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szinhaz_221004;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

class Keves_bejegyzes extends Exception
{
    private int Szam;
    Keves_bejegyzes(int szam)
    {
        
        Szam = szam;
    }
    public String toString()
    {
        return "Kevés a bejegyzések száma, csak: " + Szam;
    }
}

public class Szinhaz_221004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        int[] jegyeladas = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        boolean ok = false;
        float bevetel = 0;
        try
        {
            System.setProperty("file.encoding", "UTF8");
            FileReader fr = new FileReader("szinhaz.txt");
            BufferedReader br = new BufferedReader(fr);
            String sor = null;
            int j = 0;
            while ((sor = br.readLine()) !=null) 
            {                
                jegyeladas[j] = Integer.valueOf(sor); 
                //jegyeladas[j] = Integer.parseInt(sor);
                bevetel = bevetel+(jegyeladas[j]*4000);
                if(jegyeladas[j]>200)
                {
                    ok = true;
                }
                j++;
            }
            br.close();
            if (j < 14)
            {
                throw new Keves_bejegyzes(j);
            }
            else
            {
                System.out.println("A bejegyzés rendben: ");
            }
            
            System.out.println("A bevétel: " + bevetel + " van-e " + ok);
        }
        catch (IOException | NumberFormatException hiba)
        {
            System.out.println("Nincs meg a fájl!: " + hiba);
        }
    }
    
}
