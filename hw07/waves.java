/*
*Miles Necker
*HW07
*Makes a wave of numbers using three types of loop. I hope it's ok I used methods
*I find them much easier then writing it all in a block.
*/
import java.util.Scanner; //import the scanner class

public class waves { //main class
    public static void main(String[] args) { //main method
        Scanner q = new Scanner(System.in); //create scanner
        
        int num; //create input int
        
        System.out.print("Input a number between 1 and 30: "); //ask them nicely
        if(q.hasNextInt()) { //all the basic chekcs (did they follor my directions)
            num = q.nextInt(); //assign their number
            if (num > 0 && num < 31) { //if they did a number within range
                loop(num); //the for loops
                whileLoop(num); //the while Loops
                dowhileLoop(num); //the do while loops
            }
            else { //if they didn't listen
                System.out.println("I said between 1 and 30");
            }
        }
        else { //yell at them
            System.out.println("I said a number");
        }
    }
    
    public static void loop(int num) { //a method receiving an int
        for (int i = 1; i <= num; i ++) { //the main counter
            if (i % 2 == 0){ //if i is devisible by 2
             for (int j = 1; j <= i; j++) { //count up and make more numbers
                  for (int k = 1; k <= j; k++) {
                     System.out.print(i); //print the number
                 }
                 System.out.println(); //skip to the next line
              }
            }
            else { //if it was an odd number
               for (int j = i; j >= 1; j--) { //do the same thing but down
                  for (int k = j; k >= 1; k--) {
                     System.out.print(i);
                 }
                 System.out.println();
              } 
            }
        }
    }
    
    public static void whileLoop(int num) { //same as above
        int i = 1; 
        while (i <= num) { // all same basic idea except now I declare the counter variables
            if (i % 2 ==0) {
                int j = 1;
                while (j <= i) {
                    int k = 1;
                    while (k <= j) {
                        System.out.print(i);
                        k++;
                    }
                    System.out.println();
                    j++;
                }
            }
            else {
                int j = i;
                while (j >= 1) {
                    int k = j;
                    while (k >= 1) {
                        System.out.print(i);
                        k--;
                    }
                    System.out.println();
                    j--;
                }
            }
            i++;
        }
    }
    public static void dowhileLoop(int num) { //same as above
        int i = 1;
        do { //Ok I'll be honest I just messed with it till it worked, I don't know why it's working now.
            if (i % 2 == 0) {
                int j = 1;
                do {
                    int k = 1;
                    do {
                        System.out.print(i);
                        k++;  
                    } while (k <= j);
                    System.out.println();
                    j++;
                } while (j <= i);
            }
            else {
                int j = i;
                do {
                    int k = j;
                    do {
                        System.out.print(i);
                        k--;  
                    } while (k >= 1);
                    System.out.println();
                    j--;
                } while (j >= 1);
            }
            i++;
        } while (i <= num);
    }
}