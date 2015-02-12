import java.util.Scanner;
import java.lang.Math;
import java.text.*;


public class Banking {
    
    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("#.##");
        Scanner q = new Scanner(System.in);
        
        double amount = 1000 + ((double)Math.random() * 4000);
        double depW = 0;
        int ans;
        
        System.out.print("Enter 1 to deposit money, 2 to withdraw money, or 3 to view your balance: ");
        ans = q.nextInt();
        
        switch (ans) {
            case 1:
                System.out.print("How much would you like to deposit? ");
                depW = q.nextDouble();
                if (depW >= 0) {
                    amount += depW;
                    System.out.println("You have deposited $" + df.format(depW) + ". Your new account balance is $" + df.format(amount) + ".");
                }
                else {
                    System.out.println("You can't deposit a negative amount.");
                }
                break;
            
            case 2:
                System.out.print("Your current account balance is " + df.format(amount) + ", how much would you like to withdraw? ");
                depW = q.nextDouble();
                if (depW <= amount) {
                    amount -= depW;
                    System.out.println("You have withdrawn $" + df.format(depW) + ". Your new account balance is $" + df.format(amount) + ".");
                }
                else {
                    System.out.println("You can not withdraw that amount.");
                }
                break;
            
            case 3:
                System.out.println("You have $" + df.format(amount) + " in your bank account."); 
                break;
            
            default:
                System.out.println("Invalid input.");
        }
        
        
    }
}