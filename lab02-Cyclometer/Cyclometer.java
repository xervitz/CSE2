/*
*Miles Necker
*Lab 02 Cyclometer
*/

public class Cyclometer{
    
  public static void main(String [] args){
      
	int secsTrip1 = 480;  // time of first trip
	int secsTrip2 = 3220;  // Time of second trip
	int countsTrip1 = 1561;  // wheel rotations first
	int countsTrip2 = 9037; // wheel rotations second
	double wheelDiameter = 27.0, //Wheel size
  	    PI = 3.14159265358, // value for pi
  	    feetPerMile = 5280,  // how many feet to a mile
  	    inchesPerFoot = 12,   // how many inces in a foot
  	    secondsPerMinute = 60;  // how many seconds in a minute
	double distanceTrip1, distanceTrip2, totalDistance; //final variables
 
	System.out.println("Trip 1 took " + (secsTrip1/secondsPerMinute) + " minutes and had " + countsTrip1 + " counts."); //Do calculation and output trip 1
	System.out.println("Trip 2 took " + (secsTrip2/secondsPerMinute) + " minutes and had " + countsTrip2 + " counts."); //Do calc and output trip 
       	
	distanceTrip1 = countsTrip1 * wheelDiameter * PI; //calc distance in inces
	distanceTrip1 /= inchesPerFoot * feetPerMile; // Converts to distance in miles
	distanceTrip2 = countsTrip2 * wheelDiameter * PI / inchesPerFoot / feetPerMile; //cal distence in inches then convert
	totalDistance = distanceTrip1 + distanceTrip2; //find total
	
	System.out.println("Trip 1 was " + distanceTrip1 + " miles"); //Output
	System.out.println("Trip 2 was " + distanceTrip2 + " miles"); //yeah
	System.out.println("The total distance was " + totalDistance + " miles"); //Pretty obvious
	
  }
  
}