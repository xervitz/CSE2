/*
*Miles Necker
*HW03 FourDigits
*
*gets a double and finds the four digits after the decimal
*/
import java.util.Scanner; //import scanner

public class FourDigits { //main class
    
    public static void main(String[] args) { //main meathod
        
        Scanner q; //create scanner
        q = new Scanner(System.in); //initilize scanner
        
        double d; //the double
        int num; //the final number
        
        System.out.print("Input a double with at least 4 numbers after the decimal: "); //ask nicely
        d = q.nextDouble(); //get the number
        
        d *= 10000; //multiply by 10000
        num = (int) d; //convert to int to get rid of any extra decimal places
        num %= 10000; //find the remainder after you divide by 10000 again
        
        System.out.println("The four digits after the decimal are " + num); //output
        
    }
}