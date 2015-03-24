/*
*Miles Necker
*Hw 08
*Game thing. Mostly work on methods. Twas fun :) Didn't comment up the stuff Chen gave us.
*/
import java.util.Scanner; //input scanner class and Math class
import java.lang.Math;

public class HW8 {
    public static void main(String[] args) { //main method, given by teacher
        
        char option;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        
        System.out.println("Hero! Have a good day!");
    }
    
     public static void giant() { //pictures also given by teacher
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }

    public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
    
    public static void box(){
       System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }
    
    public static String getInput(Scanner q, String str) { //Method to get basic input
        String let = q.next();
        if (!let.equalsIgnoreCase("C")) { //if they don't enter c or C then end the game
            System.out.println("Yea right LOSER!");
            System.exit(0);
        }
        return str;
    }
    
    public static String getInput(Scanner q, String str, int num) { //second method to do the giant fight
        String let = ""; //make all the variables
        int rand = 0;
        int health = 10; //giant's heath
        int escape = 0;
        
        while (health > 0) { //while the giant still has HP
            let = q.next(); //check what they enetered
            if(let.equalsIgnoreCase("A")){ //if it's an A
                rand = random(); //generate a radom number from 1-100
                if (rand < 50) { //if it's under 50
                    System.out.println("Gosh! How can you miss it!"); //register miss
                }
                else { //if over 50 or equal
                    System.out.println("CRITICAL HIT!"); //register hit
                    health--; //drop the giant's HP by one
                    System.out.println("Giant Health: " + health); //display current giant HP
                }
            }
            else if (let.equalsIgnoreCase("E")) { //if they try to escape
                rand = random(); //generate random number from 1-100
                if (rand > 90) { //if it's over 90 (10% chance)
                    System.out.println("You escaped Successfully!"); //register successful escape
                    System.exit(0); //exit program
                }
                else {
                    System.out.println("You have failed to escape."); //otherwise tell them they failed
                }
            }
            else {
                System.out.println("Executed by the GIANT! Game Over!"); //if they enter anything else kill them
                System.exit(0); //and exit the game
            }
            if(health > 0) { //as long as the giant still has HP
                System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD"); //prompt them again
            }
        }
        return str; //go back
    }
    
    public static String getInput(Scanner q) { //treasure chest method
        String str = ""; //create input string
        if (q.hasNextInt()) { //make sure they entered an int
            int num = q.nextInt(); //assign int
            switch (num) { // check against num
                case 1: System.out.println("You got a iron sword! That should help on your next adventure!"); //various prizes for chest 1
                    break;
                case 2: System.out.println("You found an IOU For a cake! To bad it could be a lie."); //chest 2
                    break;
                case 3: System.out.println("You have found a Penguin! Enojy!"); //chest three
                    break;
                default:
                    System.out.println("You failed to pick a chest. You get nothing"); //and if they don't pick a chest
            }
        }
        else {
            System.out.println("You failed to pick a chest. You get nothing"); //if they didn't enter a num they also fail
        }
        return str;
    }
    
    public static int random() { //simple random number generator
        int num = (int)(Math.random() * 99) + 1; //generates random number from 1-100

        return num; //returns that number
    }

}