/*Miles Necker
*HW06
*Generates random number and prints stuff
*/

import java.lang.Math;

public class MakeSymbols {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 99) + 1;
        
        String out = "";
        
        if (num%2 == 0) {
            out = "*";
        }
        else {
            out = "&";
        }
        
        System.out.println("The number generated was " + num);
        System.out.print("Output: ");
        
        for (int i = 0; i < num; i ++) {
            System.out.print(out);
        }
    }
}