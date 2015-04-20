import java.util.Scanner; //import scanner and random classes
import java.util.Random;

public class Multiply {
    public static void main(String[] args) { 
        Scanner q = new Scanner(System.in); //create the scanner
        int x = -1; //create and assign base values for matrix size
        int y = -1;
        int[][] array1, array2, arrayFinal; //create all the matricis
        
        System.out.print("Input the width of the matrix: "); //ask
        while (true) { //infinite loop
            x = getInt(q); //get the integer and assign it
            if (x > 0) { //if it is of correct value
                break; //leave the loop
            } 
            else {
                System.out.print("Posative integers only: "); //otherwise yell at them and do it again
            }
        }
        
        System.out.print("Input the height of the matrix: ");
        while (true) { //same as above
            y = getInt(q);
            if (y > 0) {
                break;
            }
            else {
                System.out.print("Posative integers only: ");
            }
        }
        array1 = new int[x][y]; //initialize first array
        array1 = randomMatrix(x,y); //create randomized values
        array2 = new int[y][x]; //same with the second
        array2 = randomMatrix(y,x);
        
        arrayFinal = new int[x][y]; //initilize last array
        arrayFinal = matrixMultiply(array1,array2); //multiply the first two to get the third
        /*printMatrix(array1);
        System.out.println();  //if you want to check the original matrix without writing more code
        printMatrix(array2);
        System.out.println();*/
        printMatrix(arrayFinal); //output it.
    }
    
    public static int getInt(Scanner q) { //input method
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
    
    public static int[][] randomMatrix(int x, int y) { //fill the matricies
        Random z = new Random(); //create a random object
        
        int[][] array = new int[y][x]; //create the array
        
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                array[i][j] = z.nextInt(21) - 10; //fill it with random numbers between -10 and 10
            }
        }
       return array; // return it.
    }
    
    public static void printMatrix(int[][] array) { //print array
        for (int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t"); //prints every value in the row
            }
            System.out.println();//a space between rows
        }
    }
    
    public static int[][] matrixMultiply(int[][] array1, int[][] array2) { //multiply the matrix
        int[][] array = new int[array1[0].length][array1.length]; //initilize the matrix
        
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                array[i][j] = spotTimes(array1, array2, i, j); //for every spot, send both arrays, and the current location
            }
        }
        return array; //send the array back
    }
    
    public static int spotTimes(int[][] array1, int[][] array2, int x, int y) {
        int num = 0;
        
        for(int i = 0; i < array1[0].length; i++) {
            num += (array1[x][i] * array2[i][y]); //do the array multiplication for row * column.
        }
        return num; //return the number we got
    }
}