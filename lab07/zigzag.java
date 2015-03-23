import java.util.Scanner;

public class zigzag {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int input, yep = 0;
        
        System.out.print("Enter a number between 3 and 33: ");
        while (yep == 0) {
            System.out.print("3");
            if (q.hasNextInt() && q.nextInt() > 2 && q.nextInt() < 34) {
                System.out.print("*");
                input = q.nextInt();
                yep = 1;
                break;
            }
            else {
                System.out.print("Incorrect input please try again: ");
                yep = 0;
                q.next();
            }
            
        }
    }
}