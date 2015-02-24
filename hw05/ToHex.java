/*
*Miles Necker
*HW05
*
*Takes input decimal RGB values and outputs the hex value
*/
import java.util.Scanner; //import scanner class

public class ToHex {
    public static void main(String[] args) {
        
        Scanner q  = new Scanner(System.in); //create scanner
        
        int dec = 0,r,g,b; //create all input variables
        int trans; //conversion variable
        String hex = "#"; //output string
        
        System.out.print("Input the R value: "); //ask
         
        if(q.hasNextInt()) { //check if they put an int
            dec = q.nextInt(); //assign
            if (dec > 255) { //check if the number is within range
                System.out.println("You can only use a value under 255"); //yell at them
            }
            else { //if they did everything right
                
                trans = dec/16; //get first hex digit
                switch (trans) {
                    case 10:
                        hex = hex + "A";
                        break;
                    case 11:
                        hex = hex + "B";
                        break;
                    case 12:
                        hex = hex + "C";
                        break;
                    case 13:
                        hex = hex + "D";
                        break;
                    case 14:
                        hex = hex + "E";
                        break;
                    case 15:
                        hex = hex + "F";
                        break;
                    default:
                        hex = hex + trans;
                }
                
                 trans = dec%16; //get second hex digit
                switch (trans) {
                    case 10:
                        hex = hex + "A";
                        break;
                    case 11:
                        hex = hex + "B";
                        break;
                    case 12:
                        hex = hex + "C";
                        break;
                    case 13:
                        hex = hex + "D";
                        break;
                    case 14:
                        hex = hex + "E";
                        break;
                    case 15:
                        hex = hex + "F";
                        break;
                    default:
                        hex = hex + trans;
                }
                r = dec; //save whatever value they input
                System.out.print("Input the G value: "); //Now just rinse and repeat (same code as above)
                
                if(q.hasNextInt()) {
                    dec = q.nextInt();
                    if(dec > 255) {
                        System.out.println("You can only use a value under 255");
                    }
                    else {
                       
                       trans = dec/16;
                switch (trans) {
                    case 10:
                        hex = hex + "A";
                        break;
                    case 11:
                        hex = hex + "B";
                        break;
                    case 12:
                        hex = hex + "C";
                        break;
                    case 13:
                        hex = hex + "D";
                        break;
                    case 14:
                        hex = hex + "E";
                        break;
                    case 15:
                        hex = hex + "F";
                        break;
                    default:
                        hex = hex + trans;
                }
                
                 trans = dec%16;
                switch (trans) {
                    case 10:
                        hex = hex + "A";
                        break;
                    case 11:
                        hex = hex + "B";
                        break;
                    case 12:
                        hex = hex + "C";
                        break;
                    case 13:
                        hex = hex + "D";
                        break;
                    case 14:
                        hex = hex + "E";
                        break;
                    case 15:
                        hex = hex + "F";
                        break;
                    default:
                        hex = hex + trans;
                }
                      g = dec; 
                       
                       System.out.print("Input the B value: ");
                       if(q.hasNextInt()) {
                           dec = q.nextInt();
                           if(dec > 255) {
                               System.out.println("You can only input a value under 255");
                           }
                           else {
                               
                               trans = dec/16;
                switch (trans) {
                    case 10:
                        hex = hex + "A";
                        break;
                    case 11:
                        hex = hex + "B";
                        break;
                    case 12:
                        hex = hex + "C";
                        break;
                    case 13:
                        hex = hex + "D";
                        break;
                    case 14:
                        hex = hex + "E";
                        break;
                    case 15:
                        hex = hex + "F";
                        break;
                    default:
                        hex = hex + trans;
                }
                
                 trans = dec%16;
                switch (trans) {
                    case 10:
                        hex = hex + "A";
                        break;
                    case 11:
                        hex = hex + "B";
                        break;
                    case 12:
                        hex = hex + "C";
                        break;
                    case 13:
                        hex = hex + "D";
                        break;
                    case 14:
                        hex = hex + "E";
                        break;
                    case 15:
                        hex = hex + "F";
                        break;
                    default:
                        hex = hex + trans;
                }
                               b = dec;
                               System.out.println("The hex value for R=" + r + " G="+ g +" B="+ b +" is " + hex); //finally output
                           }
                       }
                       else {
                           System.out.println("You must input an integer"); //Each of these is error for not entering an int
                       }
                    }
                }
                else {
                    System.out.println("You must input an integer");
                }
            }
        }
        else {
            System.out.println("You must input an integer");
        }
        
    }
}