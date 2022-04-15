import java.util.Scanner; 

public class DungeonGame {
    public static void main(String[] args) {
       
        String userAnswer; 
        Scanner input = new Scanner(System.in);      
        
        do{
            userAnswer  = input.nextLine(); 
            switch (userAnswer) {
                case 0:
                    System.out.println("Candle");
                    break;
                case 1:
                    System.out.println("candle");
                    break;
                default: 
                    System.out.println("Try Agian...");

            }

        }
    }
}
