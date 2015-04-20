/*
*Miles Necker
*HW11
*Creating and searching arrays and randomizing them
*/
import java.util.Scanner; //Import scanner and random classes.
import java.util.Random;

public class CSE2Linear {
    public static void main(String[] args) {
        int[] scores = new int[15]; //create array for the scores
        int search; //search value
        
        System.out.println("Please input 15 student scores in acending order: ");
        scores = input(scores.length); //run the input method
        
        System.out.print("The scores, in sorted order, are: ");
        printArray(scores); //run the print array
        
        System.out.print("Input a grade to search for: ");
        search = getNum(); //get an input value from them
        
        binaryS(search, scores); //run a binary search on the original array
        
        scores = Scramble(scores); //scramble the array
        
        System.out.print("The grades scrambled are: ");
        printArray(scores); //print the scrambled array
        
        System.out.print("Input a grade to search for: ");
        search = getNum(); //get a new search value
        
        linear(scores, search); //run a linear search on the randomized array
    }
    
    public static int[] input(int size) { 
        Scanner q = new Scanner(System.in); //create a scanner
        int[] scores = new int[size]; //create an input array
        
        for(int i = 0; i < size; i++) { //for loop to fill the array
            while(true) { //Scariest thing to type ever
                if (q.hasNextInt()) { //if there is an int
                    scores[i] = q.nextInt(); //put it in the array spot
                    if(scores[i] > 0 && scores[i] < 101) { //if it is within range
                        if (i == 0) { //if it's the first time through the loop
                            break; //they've entered a correct number, keep it and iterate the for loop
                        }
                        else if(i > 0 && scores[i] > scores[i-1]) { //if it's any other part of the loop
                            break; //and they entered a bigger number then the previous one keep it
                        }
                        else {
                            System.out.print("You must input values in ascending order: "); //if not yell at them about ascending order
                        }
                    }
                    else {
                        System.out.print("Please input only values over 0 or under 100: "); //or about value size
                    }
                }
                else {
                    System.out.print("Please input an integer value: "); //or just if they can't tell letters from numbers
                    q.next();
                }
            }
        }
        return scores; //return the array
    }
    
    public static void printArray(int[] scores) { //printing an array 101
        System.out.print(scores[0]); //print out the first value (gotta keep the formatting nice)
        
        for(int i = 1; i < scores.length; i++) { //run from spot 1 to 14
            System.out.print(", " + scores[i]); //print out the value preceeded by a comma
        }
        System.out.println(); //go next line (keep stuff looking nice)
    }
    
    public static void binaryS(int num, int[] scores) { //doing a binary search.
        int top = scores.length - 1; //get the top index value
        int bot = 0; //bottom is always 0
        int pos = (top+bot)/2; // find the middle of the array
        int old = 0, count = 0; //allow for old value and a counter
        
        while (true) { //oh god infinite loop
            count++; //add one to the counter
            if (scores[pos] == num) { //if the number found is equal to their input
                System.out.println(num + " was found in the array at position " + pos); //let them know
                break; //leave the loop
            }
            else { //if you didn't find the numer
                if(scores[pos] > num) { //and the found number was greater then their input
                    top = pos - 1; //lower the top to be below the current position
                }
                else {
                    bot = pos + 1; //or raise the bottom
                }
                old = pos; //save the old position
                pos = (top+bot)/2; //find the new position
                if(old == pos) { //if they are equal, we've done all the searching we can.
                    System.out.println(num + " was not found in the array after " + count + " iterations"); //let them know
                    break;//leave the loop
                } 
            }
        }
    }
    
    public static int[] Scramble(int[] scores) { //scramble an array
        Random r = new Random(); //create random object
        int[] newScores = new int[scores.length]; //a place for the new array
        int count = 0, num; //a counter and a place for the random numbers
        num = r.nextInt(15); //generate first number
        
        for(int i = 0; i < 15; i++) { //fill the new array with -1
            newScores[i] = -1;
        }
        
        while (count < 15 ) { //as long as the counter hasn't maxed out
            if(newScores[num] == -1) { //if the spot doesn't have a number in it yet
                newScores[num] = scores[count]; //move one number over from the old array
                count++; //iterate the counter
                num = r.nextInt(15); //generate a new number
            }
            else {
                num = r.nextInt(15); //generate a new number
            }
        }
        return newScores; //return the new array
    }
    
    public static void linear(int[] scores, int num) { //linear search of the array
        int i = 0; //make a counter
        
        while (i < 15) { //while the counter hasn't reached the end
            if (scores[i] == num) { //if you found the number
                break; //leave the loop
            }
            i++; //iterate counter
        }
        i++; //iterate counter
        if (i != 16) { //if we found the number before the loop ended
            System.out.println(num + " was found after " + i + " iterations."); //tell them where
        }
        else { //if not
            System.out.println(num + " was not found after searching the whole array."); //tell them we didn't find it
        }
    }
    
    public static int getNum() { //gets their input
        Scanner q = new Scanner(System.in); //creates a scanner
        
        while (true) { //infinite loop
            if(q.hasNextInt()) { //if they enter a number
                int num = q.nextInt(); //sotre it
                return num; //return it
            } 
            else { //if not
                System.out.print("Please enter an integer value: "); //yell at them
                q.next();
            }
        }
    }
    
}