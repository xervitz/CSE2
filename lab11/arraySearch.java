import java.util.Scanner;
import java.util.Random;

public class arraySearch {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner q = new Scanner(System.in);
        
        int[] array1 = new int[50];
        int[] array2 = new int[50];
        
        for (int i = 0; i < 50; i++) {
            array1[i] = rand.nextInt(101);
            if (i == 0) {
                array2[i] = rand.nextInt(101);
            }
            else {
                array2[i] = array2[i-1] + rand.nextInt(101);
            }
        }
        
        int min = array1[0], max = array1[0];
        
        for (int i = 1; i < 50; i++) {
            if (array1[i] < min) {
                min = array1[i];
            }
            if (array1[i] > max) {
                max = array1[i];
            }
        }
        
        System.out.println("The minimum for array1 is " + min + " and the maximum is " + max + ".");
        
        min = array2[0];
        max = array2[49];
        
        System.out.println("The minimum for array2 is " + min + " and the maximum is " + max + ".");
        
        System.out.print("Enter an integer >= 0: ");
        
        if (q.hasNextInt()) {
            int num = q.nextInt();
            if (num >= 0) {
                
                int top = 49;
                int bot = 0;
                int pos = (top+bot)/2;
                boolean dis = true;
                
                while (dis) {
                    
                    if (array2[pos] == num) {
                        System.out.println(num + " was found in the array at position " + pos);
                        break;
                    }
                    else if(array2[pos] > num && array2[pos-1] < num) {
                        System.out.println("Your number was not found. The integers around it were: " + array2[pos] + " and " + array2[pos - 1]);
                        break;
                    }
                    else if(array2[pos] < num && array2[pos + 1] > num) {
                        System.out.println("Your number was not found. The integers around it were: " + array2[pos] + " and " + array2[pos + 1]);
                        break;
                    }
                    else {
                        if(array2[pos] > num) {
                            top = pos - 1;
                        }
                        else {
                            bot = pos + 1;
                        }
                        pos = (top+bot)/2;
                    }
                }
                
            }
        }
    }
}