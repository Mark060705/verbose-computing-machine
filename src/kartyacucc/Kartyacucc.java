/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kartyacucc;

import java.util.Arrays;

/**
 *
 * @author AmmerMárkDániel(SZF_
 */
public class Kartyacucc {

    /**
     * @param args the command line arguments
     */
    static String[] pakli = new String[22];

    public static void main(String[] args) {
        
        feltolt();
        
        System.out.println(Arrays.toString(pakli));
        
        for (int i = 0; i < 10; i++) {
            kirak(); //1 tömb
            melyik(); //scanner
            kever(); //
                    
        }
        ezVolt();

                
    }
    
    static void feltolt(){
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};
        int index = 1;

        for (String szin : szinek) {
            for (String ertek : ertekek) {

                if (szin.equals("M") &&
                    !(ertek.equals("Ász") ||
                      ertek.equals("Kir") ||
                      ertek.equals("Fel"))) {
                    continue;
                }

                pakli[index] = szin + " " + ertek;
                index++;
            }
        }
    }

    
}
    

