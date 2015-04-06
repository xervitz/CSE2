/*
*Miles Necker
*Hw 10 first two methods written by chen. The rest is commented
*
*/
import java.util.Scanner;
import java.util.Random;

public class RemoveElements{
    public static void main(String [] arg){
	    Scanner scan=new Scanner(System.in);
        int num[]=new int[10];
        int newArray1[];
        int newArray2[];
        int index,target;
	    String answer="";
	    do{
  	        System.out.print("Random input 10 ints [0-9]");
  	        num = randomInput();
  	        String out = "The original array is:";
  	        out += listArray(num);
  	        System.out.println(out);
 
  	        System.out.print("Enter the index ");
  	        index = scan.nextInt();
  	        newArray1 = delete(num,index);
  	        String out1="The output array is ";
  	        out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	        System.out.println(out1);
 
            System.out.print("Enter the target value ");
  	        target = scan.nextInt();
  	        newArray2 = remove(num,target);
  	        String out2="The output array is ";
  	        out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	        System.out.println(out2);
  	 
  	        System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	        answer=scan.next();
	    } while(answer.equals("Y") || answer.equals("y"));
    }
 
    public static String listArray(int num[]){
	    String out="{";
	    
	    for(int j=0;j<num.length;j++){
  	    if(j>0){
    	    out+=", ";
  	    }
  	    
  	    out+=num[j];
  	    
	    }
	    
    	out+="} ";
	    return out;
    }
    
    public static int[] randomInput() { //create array method with no inputs
        Random rand = new Random(); //creates a new random object   
        int[] nums = new int[10]; //creates new array of 10
        
        for (int i = 0; i < 10; i++) { //for each spot 0 - 9
            nums[i] = rand.nextInt(10); //put in a random number
        }
        return nums; //returns the array
    }
    
    public static int[] delete(int[] nums, int ind) { //create array method with an input array and index value
        
        if (ind >= 0 && ind < 10) { //if the index value is within the bounds of the array
            int[] newNums = new int[9]; //creates a new array that is one smaller then the original
            for(int i = 0; i < 10; i++) { //from 1 - 10
                if(i < ind) { //when the arrays match up
                    newNums[i] = nums[i];
                }
                else if(i == ind) { //don't do anything for when you hit the index value
                    
                }
                else {
                    newNums[i-1] = nums[i];//after copy all values to the spot before them (to make up for lost space)
                }
            }
            return newNums; //return new array
        }
        else {
            System.out.println("Index was out of bounds."); //if they didn't enter a correct value
            return nums; //yell at them and return the original array
        }
    }
    
    public static int[] remove(int[] num, int x) { //array method with input array and value
        int count = 0; //create a counter
        for(int i = 0; i < 10; i++) { //searches the original array for their input
            if(num[i] == x) { //if it matches up
                count++; //add one to the counter
            }
        }
        
        if(count == 0) { //if there was no equivilent
            System.out.print("Found 0 of element " + x + " in the array."); //let them know
        }
        else {
            System.out.print("Found " + count + " of element " + x + " in the array. Removing..."); //tel them how many
        }
        
        int[] newNum = new int[10-count]; //create an array that is variably smaller depending on how many matches we got
        int z = 0; //create another counter
        
        for(int i = 0; i < 10; i++) { //run through the original array
            if (num[i] != x) { //if the value of the original array isn't equal to the input
                newNum[i-z] = num[i]; //copy it over
            }
            else {
                z++; //if it is, then add one to the counter
            }
        }
        return newNum; //return the new array
    }
}
