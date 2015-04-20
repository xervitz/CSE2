import java.util.Scanner;
import java.util.Random;

public class Arrays {
    public static void main(String[] args) {
        increasingMatrix();
    }
    
    public static int[][] increasingMatrix() {
        Scanner q = new Scanner(System.in);
        int width = getNum();
        int height = getNum();
        boolean ask = false;
        int num = 0;
        
        while (true) {
            if(q.hasNextBoolean()) {
                ask = q.nextBoolean();
                break;
            }
            else {
                System.out.print("Please enter either true or false: ");
            }
        }
        
        if (ask) {
            int[][] array = new int[height][];
            for (int i = 0; i<height; i++) {
                array[i] = new int[width];
            }
            
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {
                    array[i][j] = num;
                    num++;
                }
            }
        }
        else {
            int[][] array = new int[height][];
            for (int i = 0; i<height; i++) {
                array[i] = new int[width];
            }
            
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    array[i][j] = num;
                    num++;
                }
            }
        }
        
        return array[][];
        
    }
    
    public static int getNum() { //gets their input
        Scanner q = new Scanner(System.in); //creates a scanner
        
        while (true) { //infinite loop
            if(q.hasNextInt()) { //if they enter a number
                int num = q.nextInt(); //sotre it
                return num; //return it
            } 
            else { //if not
                System.out.print("Please enter an integer value: "); //yell at them
                q.next();
            }
        }
    }
}