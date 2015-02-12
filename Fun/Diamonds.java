public class Diamonds {
    
    public static void main(String[] args) { 
        
        for (int i = 1; i < 6; i++){
            for (int k = 5;k > i; k--){
                System.out.print(" ");
            }
            System.out.print("/");
            for (int j = 1; j < 2*i; j++) {
                System.out.print("o");
            }
            System.out.print("\\");
            System.out.print("\n");
            
        }
        
        for (int i = 1; i < 6; i++) {
            for (int k = 1;k < i; k++){
                System.out.print(" ");
            }
            System.out.print("\\");
            for (int j = 11; j > 2*i; j--) {
                System.out.print("o");
            }
            System.out.print("/");
            System.out.print("\n");
        }
        
        
        
    }
    
}