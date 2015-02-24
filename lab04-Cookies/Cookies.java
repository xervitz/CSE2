/*
*Miles Necker
*Lab 04 - Cookies
*2/13/15
*gets an input of number of cookies and lets the user know if they need more cookies
*or if they have the right amount or if they have enough but not everyone will get an
*equal number of cookies. Basically practice with If and else statments.
*/
import java.util.Scanner; //import scanner

public class Cookies { //class
    public static void main(String[] args) { //method
        
        Scanner q = new Scanner(System.in); //make scanner
        
        System.out.print("Enter the number of People: "); //prompt
        
        if (q.hasNextInt()) { //check for int
           int peeps = q.nextInt(); //assign int
           if(peeps < 0) { //check for posative
               System.out.println("You didn't enter a number over 0"); //yell at them
           }
           else { 
               System.out.print("Enter the number of cookies you have: "); //prompt
               if (q.hasNextInt()) { //check for int
                   int cookies = q.nextInt(); //assign int
                   if (cookies < 0) { //check posaitve
                       System.out.println("You didn't enter a number over 0"); //yell at them
                   }
                   else {
                       System.out.print("Enter how many cookeis you want each person to get: "); //prompt
                       if (q.hasNextInt()) { //check for int
                           int divide = q.nextInt(); //assign int
                           if(divide < 0) { //check for posative
                               System.out.println("You didn't enter a number over 0"); //yell at them
                           }
                           else {
                               if (peeps * divide > cookies) { //Check if they got enough cookies
                                   int need = (peeps*divide) - cookies; //find out how mant more they need
                                   System.out.println("You do not have enough cookies. You need at least " + need + " more cookies."); //Output
                               }
                               else if (cookies%(peeps) != 0) { //check if the number of cookies devides into the number of people
                                   System.out.println("You have enough cookies but they won't divide equaly"); //output
                               }
                               
                               
                               else { //if neither of the above are true they must have enough cookies that devide equally
                                   System.out.println("You have enough cookies for each person and the amount will divide evenly"); //tell them that
                               }
                           }
                       }
                       else {
                           System.out.println("You didn't enter an integer"); //yell at them
                       }
                   }
               }
               else {
                   System.out.println("You didn't enter and intger"); //yell at them
               }
           }
        } 
        else {
            System.out.println("You didn't enter an integer"); //yell at them
        }
        
        
    }
}