/*
*Miles Necker
*Hw03 Root.java
*
*Gets a number and guesses the cube root
*/
import java.util.Scanner; //import scanner

public class Root { //main class
    
    public static void main(String[] args) { //main meathod
        
        Scanner q; //create scanner
        q = new Scanner(System.in); //initilize
        
        double I, g, r; //create variabes for input, guess, and final check 
        
        System.out.print("Input a number to find the cube root of: "); //ask for a number
        I = q.nextDouble(); //get it
        
        g = I/3; //guess
        g = (2*g*g*g+I)/(g*g*3); //refine
        g = (2*g*g*g+I)/(g*g*3);
        g = (2*g*g*g+I)/(g*g*3);
        g = (2*g*g*g+I)/(g*g*3);
        g = (2*g*g*g+I)/(g*g*3);
        
        r = g * g * g; //check
        
        System.out.println("The cube root of " + I + " is about " + g + "."); //output
        System.out.println(g + " cubed is " + r + ".");
    }
}