import java.util.Scanner; 

public class DungeonGame {
    public static void main(String[] args) {
       Spider spiderHint1 = new Spider(15, 2, 2);
       Spider spiderHint2 = new Spider(20, 2, 2);
       Guard guardDoor = new Guard(40, 5, 3);
       Guard guardRiddle = new Guard(25, 3, 1);
      
      String userAnswer; 
        Scanner input = new Scanner(System.in);     
         
        
        do{
            userAnswer  = input.nextLine(); 
            switch (userAnswer) {
                
                    System.out.println("Type 'help' if you need a refresher on how to speak english.");

            }
        } while()

    } //end of main


    public static void doorGo() {
        
    }
    public static void hallwayGo() {

    }
    public static void innerChamberGo() {
        
    }
}
