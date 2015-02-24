import java.lang.Math; //import math class

public class Space {
    
    public static void main(String[] args) {
        
        int year = (int)(Math.random() *11) + 2000; //create random number
        
        System.out.println("Here is a timeline of all space exploration events between 2000 and " + year); //First print
        
        switch (year) { //take year and dependent on year output various things.
            case 2010:
                System.out.println("2010: SpaceX sucessfully sends spacecraft to orbit and back.");
            case 2009:
            case 2008:
                System.out.println("2008: Kepler launched to study deep space.");
            case 2007:
            case 2006:
                System.out.println("2006: Spacecraft returns with collections from a comet.");
            case 2005:
                System.out.println("2005: Spacecraft collies with comet.");
            case 2004:
            case 2003:
                System.out.println("2003: Largest infrared telescope released.");
            case 2002:
            case 2001:
                System.out.println("2001: First spacecraft lands on asteroid.");
            case 2000:
                System.out.println("2000: First spacecraft orbits an asteroid.");
                break;
            default:
                System.out.println("I have no idea how you've managed to see this...."); //obligitory default code.
        }
        
    }
}