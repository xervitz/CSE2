import java.util.Scanner;

public class BetterHex {
    
    public static void main(String[] args) {
        
        int dec, r, g, b;
        String hex = "#";
        
        System.out.print("Input the R value: ");
        dec = decimal();
        
        if (dec == -1) {
            return;
        }
        r = dec;
        hex = hex + hexd(dec);
        
        System.out.print("Input the G value: ");
        dec = decimal();
        
        if (dec == -1) {
            return;
        }
        g = dec;
        hex = hex + hexd(dec);
        
        System.out.print("Input the B value: ");
        dec = decimal();
        
        if (dec == -1) {
            return;
        }
        b = dec;
        hex = hex + hexd(dec);
        
        System.out.println("The hex value for R=" + r + " G="+ g +" B="+ b +" is " + hex);
    }
    
    public static int decimal() {
        Scanner q = new Scanner(System.in);
        int dec;
        
        if(q.hasNextInt()) {
            dec = q.nextInt();
            if(dec > 255) {
                System.out.println("Values can not exceed 255");
                return -1;
            }
            else {
                return dec;
            }
        }
        else {
            System.out.println("You didn't input an integer");
            return -1;
        }
        
    }
    
    public static String hexd(int dec) {
        int trans;
        String hex = "";
        
        for (int i = 1; i<3; i++){
            if (i == 1){
                trans = dec/16;
            }
            else {
                trans = dec%16;
            }
            
             switch (trans) {
            case 10:
                hex = hex + "A";
                break;
            case 11:
                hex = hex + "B";
                break;
            case 12:
                hex = hex + "C";
                break;
            case 13:
                hex = hex + "D";
                break;
            case 14:
                hex = hex + "E";
                break;
            case 15:
                hex = hex + "F";
                break;
            default:
                hex = hex + trans;
        }
        }
        
        return hex;
    }
}