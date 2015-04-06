import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        
        System.out.print("Input an integer over 0: ");
        
        int num = checkNum(q);
        
        int[] x = new int[num];
        
        System.out.println("Enter " + num + " integers to fill the array: ");
        
        for (int i = 0; i < num; i++) {
            x[i] = checkNum(q);
        }
        
        System.out.print("The array is: ");
        
        for(int i = 0; i < num; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }
    
    public static int checkNum(Scanner q) {
        boolean check = true;
        int num = 0;
        while(check) {
            if (q.hasNextInt()) {
                num = q.nextInt();
                if (num > 0) {
                    check = false;
                }
                else {
                    System.out.print("Input an integer OVER 0: ");
                }
            }
            else {
                System.out.print("Input an INTEGER: ");
                q.next();
            }
        }
        return num;
    }
}