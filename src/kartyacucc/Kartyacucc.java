 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kartyacucc;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author AmmerMárkDániel(SZF_
 */
public class Kartyacucc {

    /**
     * @param args the command line arguments
     */
    static String[] pakli = new String[22];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        feltolt();
        
        //System.out.println(Arrays.toString(pakli));
        
        for (int i = 0; i < 3; i++) {
            kirak(); //1 tömb
            int kiv = melyik(); //scanner
            kever(kiv); //
                    
        }
        kirak();
        ezVolt();

                
    }
    
    private static void feltolt() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};
        int db = 0;
        for (String szin : szinek) {
            for (String ertek : ertekek) {
                String lap = szin + "_" + ertek;
                if(db < 21){
                    pakli[++db] = lap;
                }
            }
        }
    }

    private static void kirak() {
        String szoveg = "";

        for (int i = 1; i < 22; ++i) {
            szoveg += String.format("%-8s", pakli[i]);

            if (i % 3 == 0) {
                szoveg += "\n";
            }
        }

        System.out.println(szoveg);
    }

    private static int melyik() {
        System.out.println("melyik oszlop? (1-3)");
        
        int number;
        number = scanner.nextInt();
        
        if(number < 1 || number > 3){
        
            while(number < 1 || number > 3) {
                System.out.print("1-től  3-ig: ");
                number = scanner.nextInt();
            }
        }
        return number;
    }

    private static void kever(int oszlop) {
            String[] uj = new String[22];

            switch (oszlop) {
            case 2:
                for (int sor = 1; sor <= 7; sor++) {
                    uj[sor] = pakli[19 - (sor - 1) * 3];
                    uj[sor+7] = pakli[20 - (sor - 1) * 3];
                    uj[sor+14] = pakli[21 - (sor - 1) * 3];
                }
                break;
                
            case 1:
                for (int sor = 1; sor <= 7; sor++) {
                    uj[sor] = pakli[20 - (sor - 1) * 3];
                    uj[sor+7] = pakli[19 - (sor - 1) * 3];
                    uj[sor+14] = pakli[21 - (sor - 1) * 3];
                }
                break;
            case 3:
                for (int sor = 1; sor <= 7; sor++) {
                    uj[sor] = pakli[20 - (sor - 1) * 3];
                    uj[sor+7] = pakli[21 - (sor - 1) * 3];
                    uj[sor+14] = pakli[19 - (sor - 1) * 3];
                }
                break;
            default:
                throw new AssertionError();
            }
            

            pakli = uj;
    }
    

    private static void ezVolt() {
        System.out.println(pakli[11]);
    }

    
}
    

