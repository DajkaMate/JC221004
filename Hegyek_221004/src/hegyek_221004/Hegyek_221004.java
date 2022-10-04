/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hegyek_221004;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
/**
 *
 * @author user09
 */
public class Hegyek_221004 {

    public static int  elemszam(String filenev)throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader(filenev));
        int lines = 0;
        while(reader.readLine() !=null)
        {
            lines++;
        }
        reader.close();
        return(lines);
        
    }
    public static void main(String[] args) {
        String[] hegynev = null;
        int[] magassag =  null;
        int esz = 0;
        try
        {
            System.setProperty("file.encoding", "UTF8");
            FileReader fr = new FileReader("hegy.txt");
            BufferedReader br = new BufferedReader(fr);
            esz = elemszam("hegy.txt");
            hegynev = new String[esz];
            magassag = new int[esz];
            String sor = null;
            int db = 0;
            int j = 0;
            while ((sor = br.readLine()) !=null)
            {
                String[] tomb = sor.split(";");
                hegynev[j]=tomb[0];
                magassag[j]=Integer.parseInt(tomb[1]);
                j++;
            }
            br.close();
        }        
        
        catch (IOException | NumberFormatException hiba)
        {
            System.out.println("Nincs meg a fájl!: " + hiba);
        }
        int max = magassag[0];                     
        int maxindex = 0;
        for (int i = 1; i < magassag.length; i++) 
        {
            if (magassag[i] > max) 
            {
                max = magassag[i];
                maxindex = i;
            }
        }
        System.out.println("A legmagasabb hegy: " + hegynev[maxindex] + " a magassága: " + magassag[maxindex] + "m");
        
        int osszesen = 0;
        for (int i = 0; i < magassag.length; i++) 
        {
            osszesen+=magassag[i];
            
        }
        float atlag=(float)osszesen/magassag.length;
        System.out.println("Az atlag magasság: " + atlag);
        int dbnye=0;
        for (int i = 0; i < magassag.length; i++) 
        {
            if (magassag[i]>8000) 
            {
                dbnye++;
            }
        }
        System.out.println(dbnye + " db hegy van ami magasabb 8000m-nél");
        int magastemp = 0;
        for (int i = 0; i < magassag.length-1; i++) 
        {
            for (int j = i+1; j < magassag.length; j++) 
            {
                if (magassag[i] < magassag[j]) 
                {
                    magastemp = magassag[i];
                    magassag[i] = magassag[j];
                    magassag[j] = magastemp;
                }
            }
        }
        for (int i = 0; i < magassag.length; i++) 
        {
            System.out.println(magassag[i]);
        }
    }
    
}
