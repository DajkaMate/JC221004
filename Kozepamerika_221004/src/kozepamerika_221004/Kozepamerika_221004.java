/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kozepamerika_221004;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class Kozepamerika_221004 {

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
        String[] nevek = null;
        int[] terulet = null;
        int[] lakos = null;
        int esz = 0;
        
        try
        {
            FileReader fr = new FileReader("kozepamerika.txt");
            BufferedReader br = new BufferedReader(fr);
            esz = elemszam("kozepamerika.txt");
            nevek = new String[esz];
            terulet = new int[esz];
            lakos = new int[esz]; 
            String sor = null;
            int j = 0;
            while ((sor = br.readLine()) !=null)
            {
                String[] tomb = sor.split(";");
                nevek[j]=tomb[0];
                terulet[j]=Integer.parseInt(tomb[1]);
                lakos[j]=Integer.parseInt(tomb[2]);
                j++;
            }
            br.close();
        }
        catch (IOException hiba)
        {
            System.out.println("Nincs meg a fájl!: " + hiba);
        }
                
	int min = terulet[0];
        int minindex = 0;
	for(int i=0; i<terulet.length;i++)
        {
            if(terulet[i] < min)
            {
                min = terulet[i];
                minindex = i;
            }
        }
			
	System.out.println("Legkisebb ország: " + nevek[minindex]);
        int nepsuruseg = 0;
        for (int i = 0; i < nevek.length; i++) {
            System.out.println(nevek[i] + " népsürűsége " + (float)lakos[i]/terulet[i]);
        }        
    } 
}
