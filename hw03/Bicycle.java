/*
*Miles Necker
*HW03 Bicycle
*
*gets inputs and calculates distance and average speed
*/
import java.util.Scanner; //import scanner

public class Bicycle { //main class
    
    public static void main(String[] args) { //main meathod
        
        Scanner q; //create scanner
        q = new Scanner(System.in); //initilize
        
        int secs, counts; //create input variables
        
        double wheel = 27.0, //set all constants for wheel, pi, feet per mile, inches per feet, and seconds per hour
            PI = 3.14159265358,
            fPM = 5280,
            iPF = 12,
            sPH = 3600;
            
        double distance, MPH; //create output variables
        
        System.out.print("Input how many seconds: "); //ask for seconds
        secs = q.nextInt(); //get
        
        System.out.print("Input the number of rotations: "); //ask for rotations
        counts = q.nextInt();//get
        
        distance = wheel*PI*counts; //calc distace in inches
        distance /= iPF*fPM; //convert to miles
        
        MPH = distance/(secs / sPH); //calculate miles perhour
        
        System.out.println("The total distance was " + distance + " miles."); //output
        System.out.println("The average speed was " + MPH + " MPH.");
        
        
    }
    
}