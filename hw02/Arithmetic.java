/*Miles Necker
*Hw02
*/

import java.text.*; //I know this isn't how he wanted us to do it but I couldn't get the int to work so I looked this up

public class Arithmetic { //main class
    
    public static void main(String[] args) { //main method
    
    DecimalFormat df = new DecimalFormat("#.##"); //Yeah looked this up. Way easier then the int thing
    
    int socks = 3,
        glasses = 6,
        envelopes = 1; //Numer of items
    
    double sockC = 2.58,
        glassesC = 2.29, //Price of items and tax amount
        envelopeC = 3.25,
        taxPerc = .06;
        
    double sockCT = socks*sockC,
        glassesCT = glasses*glassesC, //total prices for each item
        envelopeCT = envelopes*envelopeC;
        
    double costBT = sockCT + glassesCT + envelopeCT; //total cost before tax
    double tax = costBT * taxPerc; //tax
   
    double cost = costBT + tax; //cost after tax
    
    System.out.println("I bought " + socks + " socks at $" + sockC + " per sock.");
    System.out.println("I bought " + glasses + " glasses at $" + glassesC + " per pair of glasses.");
    System.out.println("I bought " + envelopes + " envelope at $" + envelopeC + " per envelope.");
    
    System.out.println("I spent $" + sockCT + " on socks, $" + glassesCT + " on glasses, and $" + envelopeCT + " on envelopes."); //Output everything
    
    System.out.println("Total I spent $" + costBT + " before tax.");
    System.out.println("There was $" + df.format(tax) + " in tax on my total purchase.");
    System.out.println("My final cost was $" + df.format(cost) + ".");
    
    } //end method
    
} //end class