import java.util.Scanner;
import java.util.Random;

public class CSE2Linear {
    public static void main(String[] args) {
        int[] scores = new int[15];
        int search;
        
        System.out.println("Please input 15 student scores in acending order: ");
        scores = input(scores.length);
        
        System.out.print("The scores, in sorted order, are: ");
        printArray(scores);
        
        System.out.print("Input a grade to search for: ");
        search = getNum();
        
        binaryS(search, scores);
        
        scores = Scramble(scores);
        
        System.out.print("The grades scrambled are: ");
        printArray(scores);
        
        System.out.print("Input a grade to search for: ");
        search = getNum();
        
        linear(scores, search);
    }
    
    public static int[] input(int size) {
        Scanner q = new Scanner(System.in);
        int[] scores = new int[size];
        
        for(int i = 0; i < size; i++) {
            while(true) {
                if (q.hasNextInt()) {
                    scores[i] = q.nextInt();
                    if(scores[i] > 0 && scores[i] < 101) {
                        if (i == 0) {
                            break;
                        }
                        else if(i > 0 && scores[i] > scores[i-1]) {
                            break;
                        }
                        else {
                            System.out.print("You must input values in ascending order: ");
                        }
                    }
                    else {
                        System.out.print("Please input only values over 0 or under 100: ");
                    }
                }
                else {
                    System.out.print("Please input an integer value: ");
                    q.next();
                }
            }
        }
        return scores;
    }
    
    public static void printArray(int[] scores) {
        System.out.print(scores[0]);
        
        for(int i = 1; i < scores.length; i++) {
            System.out.print(", " + scores[i]);
        }
        System.out.println();
    }
    
    public static void binaryS(int num, int[] scores) {
        int top = scores.length - 1;
        int bot = 0;
        int pos = (top+bot)/2;
        int old = 0, count = 0;
        
        while (true) {
            count++;
            if (scores[pos] == num) {
                System.out.println(num + " was found in the array at position " + pos);
                break;
            }
            else {
                if(scores[pos] > num) {
                    top = pos - 1;
                }
                else {
                    bot = pos + 1;
                }
                old = pos;
                pos = (top+bot)/2;
                if(old == pos) {
                    System.out.println(num + " was found in the array after " + count + " iterations");
                    break;
                }
            }
        }
    }
    
    public static int[] Scramble(int[] scores) {
        Random r = new Random();
        int[] newScores = new int[scores.length];
        int count = 0, num;
        num = r.nextInt(15);
        
        for(int i = 0; i < 15; i++) {
            newScores[i] = -1;
        }
        
        while (count < 15 ) {
            if(newScores[num] == -1) {
                newScores[num] = scores[count];
                count++;
            }
            else {
                num = r.nextInt(15);
            }
        }
        return newScores;
    }
    
    public static void linear(int[] scores, int num) {
        int i = 0;
        
        while (i < 15) {
            if (scores[i] == num) {
                break;
            }
            i++;
        }
        i++;
        if (i != 16) {
            System.out.println(num + " was found after " + i + " iterations.");
        }
        else {
            System.out.println(num + " was not found after searching the whole array.");
        }
    }
    
    public static int getNum() {
        Scanner q = new Scanner(System.in);
        
        while (true) {
            if(q.hasNextInt()) {
                int num = q.nextInt();
                return num;
            }
            else {
                System.out.print("Please enter an integer value: ");
                q.next();
            }
        }
    }
    
}