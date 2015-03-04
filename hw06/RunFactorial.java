/*Miles Necker
*HW06
*Calculates a factorial
*/

import java.util.Scanner;

public class RunFactorial {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        
        int num = 0, fact = 1;
        double input = 0;
        
        System.out.println("Please enter an integer between 9 and 16:");
        
        while (input < 9 || input > 16) {
            if (q.hasNextDouble()) {
                input = q.nextDouble();
                if (input >= 9 && input <= 16) {
                    if (input == (int)input) {
                        System.out.println("Input accepted!");
                        num = (int)input;
                    }
                    else {
                        System.out.println("Invalid Input");
                        input = 0;
                    }
                }
                else {
                    System.out.println("Invalid Input");
                    input = 0;
                }
            }
            else {
                System.out.println("Invalid Input");
                q.nextLine();
            }
        }
        
        while (num > 0) {
            fact *= num;
            num--;
        }
        
        System.out.println((int)input + "! is = " + fact);
    }
}