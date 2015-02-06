import java.util.Scanner;

public class BigMac {
    
    public static void main(String[] args) {
        
        Scanner q;
        q = new Scanner(System.in);
        int numM;
        double cost, taxP, total;
        
        System.out.print("Input the numer of Big Macs: ");
        numM = q.nextInt();
        
        System.out.print("Input the cost per Big Mac: ");
        cost = q.nextDouble();
        
        System.out.print("Input your % tax (ex. enter 6 for PA): ");
        taxP = q.nextDouble();
        
        taxP /= 100;
        
        total = (cost * numM) * (1 + taxP);
        
        System.out.println("The total cost is $" + total + ".");
        
    }
    
}