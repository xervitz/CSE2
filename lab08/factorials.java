import java.util.Scanner;

public class factorials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a number to find the super factorial of: ");
        if (scan.hasNextInt()) {
            int sup = scan.nextInt();
            if (sup > 0) {
                int sum = 0;
                for(int i = 1; i <= sup; i++){
                  sum += factorial(i);
                }
                print(sum, sup);
            }
            else {
                System.out.println("INVALID");
            }
        }
        else {
            System.out.println("Your input wasn't viable");
        }
  }
    public static int factorial(int key){
        int mul = 1;
        for (int i = 1; i <= key; i++){
            mul *= i;
        }
        return mul;
    }
    public static void print(int num, int star){
        System.out.println("The super factorial of " + star + " is equal to " + num);
    }
}
