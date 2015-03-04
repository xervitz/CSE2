import java.lang.Math;

public class LoopLab {
    public static void main(String[] args) {
        int j = 0;
        int max = (int)(Math.random()*100) + 1;
        for (int i = 0; i < 5;i++) {
            System.out.print(":)");
        }
        System.out.println("");
        
        while (j < 5) {
            System.out.print(":)");
            j++;
        }
        System.out.println("");
        j = 0;
        
        do {
            System.out.print(":)");
            j++;
        } while (j < 5);
        System.out.println("");
        
        for (int i = 0;i < max; i++) {
            System.out.print(":)");
        }
        System.out.println("");
        System.out.println("1.2.3.4.5.6.7.8.9.101112113141516171819202122324252627282930");
        for (int i = 1;i<max;i++) {
            System.out.print(":)");
            if (i%30 == 0 && i != 0) {
                System.out.println("");
            }
        }
        
    }
}