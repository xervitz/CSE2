import java.util.Scanner;

public class WhichNumber {
    
    public static void main(String[] args) {
        Scanner q  = new Scanner(System.in);
        String ans = "";
        
        System.out.println("Think of a number between 1 and 10");
        
        System.out.println("For each question, enter y for yes or n for no");
        
        System.out.print("Is the number even? ");
        ans = q.next();
        
        if (ans.equalsIgnoreCase("y")) {
            System.out.print("Is the number devisible by 3? ");
            ans = q.next();
            if (ans.equalsIgnoreCase("y")) {
                System.out.println("Your number was 6");
            }
            else {
                System.out.print("Is the number devisible by 4? ");
                ans = q.next();
                if (ans.equalsIgnoreCase("y")) {
                    System.out.print("If you devide that number by 4 is it greater than 1? ");
                    ans = q.next();
                    if (ans.equalsIgnoreCase("y")) {
                        System.out.println("Your number is 8");
                    }
                    else {
                        System.out.println("Your number is 4");
                    }
                }
                else {
                    System.out.print("Is your number devisible by 5? ");
                    ans = q.next();
                    if(ans.equalsIgnoreCase("y")) {
                        System.out.println("Your number was 10");
                    }
                    else {
                        System.out.println("Your number was 2");
                    }
                }
                
            }
        }
        else {
            System.out.print("Is the number devisible by 3? ");
            ans = q.next();
            if (ans.equalsIgnoreCase("y")) {
                System.out.print("If you devide your number by 3 is the result greater than 1? ");
                ans = q.next();
                if (ans.equalsIgnoreCase("y")) {
                    System.out.println("Your number was 9");
                }
                else {
                    System.out.println("Your number was 3");
                }
            }
            else {
                System.out.print("Is your number greater than 6? ");
                ans = q.next();
                if(ans.equalsIgnoreCase("y")) {
                    System.out.println("Your number was 7");
                }
                else {
                    System.out.print("Is it less than 3? ");
                    ans = q.next();
                    if (ans.equalsIgnoreCase("y")) {
                        System.out.println("Your number was 1");
                    }
                    else {
                        System.out.println("Your number was 5");
                    }
                }
            }
                
        }
        
        
    }
}