/*Miles Necker
*HW 06
*Gets integers with loop. Adds them
*/

import java.util.Scanner;

public class GetIntegers {
    public static void main(String args[]) {
        Scanner q = new Scanner(System.in); //create scanner
        
        int num, tot = 0; //create variables for input and addition
        System.out.println("Input 5 integers:"); //prompt
        
        for (int i = 0;i<5;i++) { //run the loop 5 times 
        if (q.hasNextInt()) { //if they entered a number
                num = q.nextInt(); //assign it to the input variable
                if (num < 0) { //check if it's valid
                    System.out.println("Invalid Input"); //yell at them if not
                    i--; //reduce the counter by one
                }
                else { //if they did everything right
                    tot += num; //add their number to the sum
                }
            }
            else { //if they entered letters like an idiot
                System.out.println("Invalid Input"); //yell at them
                i--; //reduce counter by one
                q.nextLine(); //clear the scanner do it doesn't infinite loop
            }
        }
        System.out.println("The total is " + tot); //output
    }
}