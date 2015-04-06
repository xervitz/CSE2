import java.util.Random;
import java.util.Scanner;

public class Story {
    public static void main(String[] args) {
        String yes = "y";
        Scanner q = new Scanner(System.in);
        
        while (yes.equalsIgnoreCase("y")) {
            System.out.println("The " + adj(ran()) + " " + adj(ran()) + " " + noun(ran()) + " " +
                verb(ran()) + " the " + adj(ran()) + " " + obj(ran()) + ".");
            
            System.out.println("If you want to generate a new scentence enter y: ");
            yes = q.next();
        }
    }
    public static String noun(int num) {
        String ret = "";
        switch (num) {
            case 0: ret = "bulb";
                break;
            case 1: ret = "database";
                break;
            case 2: ret = "dust";
                break;
            case 3: ret = "feather";
                break;
            case 4: ret = "kale";
                break;
            case 5: ret = "riddle";
                break;
            case 6: ret = "batman";
                break;
            case 7: ret = "flash";
                break;
            case 8: ret = "line";
                break;
            case 9: ret = "square";
                break;
        }
        return ret;
    }
    public static String adj(int num) {
        String ret = "";
        switch (num) {
            case 0: ret = "glamerous";
                break;
            case 1: ret = "annoying";
                break;
            case 2: ret = "scared";
                break;
            case 3: ret = "shrill";
                break;
            case 4: ret = "flaky";
                break;
            case 5: ret = "cruel";
                break;
            case 6: ret = "fabulous";
                break;
            case 7: ret = "spiky";
                break;
            case 8: ret = "smiling";
                break;
            case 9: ret = "alcoholic";
                break;
        }
        return ret;
    }
    public static String verb(int num) {
        String ret = "";
        switch (num) {
            case 0: ret = "terminated";
                break;
            case 1: ret = "zipped";
                break;
            case 2: ret = "showed";
                break;
            case 3: ret = "synthesized";
                break;
            case 4: ret = "marketed";
                break;
            case 5: ret = "overviewed";
                break;
            case 6: ret = "strengthened";
                break;
            case 7: ret = "ensured";
                break;
            case 8: ret = "perfected";
                break;
            case 9: ret = "retreved";
                break;
        }
        return ret;
    }
    public static String obj(int num) {
        String ret = "";
        switch (num) {
            case 0: ret = "gold";
                break;
            case 1: ret = "dubt";
                break;
            case 2: ret = "day";
                break;
            case 3: ret = "song";
                break;
            case 4: ret = "wax";
                break;
            case 5: ret = "thing";
                break;
            case 6: ret = "year";
                break;
            case 7: ret = "sister";
                break;
            case 8: ret = "mother";
                break;
            case 9: ret = "cough";
                break;
        }
        return ret;
    }
    public static int ran() {
        Random rand = new Random();
        int num = rand.nextInt(10);
        return num;
    }
}