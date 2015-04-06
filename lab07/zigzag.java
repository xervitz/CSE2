import java.util.Scanner;

public class zigzag {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int input = 0, yep = 0;
        String yn = "y";
        
        while (yn.equalsIgnoreCase("y")) {
            System.out.print("Enter a number between 3 and 33: ");
            while (yep == 0) {
                if (q.hasNextInt()) {
                    input = q.nextInt();
                    if (input > 2 && input < 34) {
                        yep = 1;
                    }
                    else {
                    System.out.print("Invalid input. Please try again: ");
                    }
                }
                else {
                    System.out.print("Incorrect input please try again: ");
                    q.next();
                }
            }
        line(input);
        System.out.println();
        cross(input);
        line(input);
        
        System.out.println();
        System.out.print("Enter y or Y to go again: ");
        yn = q.next();
        q.nextLine();
        yep = 0;
        }
    }
    
    public static void line(int x) {
        for (int i = 0; i < x; i++) {
            System.out.print("*");
        }
    }
    
    public static void cross(int x) {
        for (int i = 1; i < x-1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}