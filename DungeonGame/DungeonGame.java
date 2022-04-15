import java.util.Scanner; 

public class DungeonGame {
    public static void main(String[] args) {
        // instantiate constructors for enemies
        Spider spiderHint1 = new Spider(15, 2, 2);
        Spider spiderHint2 = new Spider(20, 2, 2);
        Guard guardDoor = new Guard(40, 5, 3);
        Guard guardRiddle = new Guard(25, 3, 1);

        //this is the variable that handles the players current location. valid values are found in the enum Location.java
        Location currentLocation = Location.START;

        //create scanner and input var
        String userAnswer; 
        Scanner input = new Scanner(System.in);     

        //call help a first time
        help();

        //the do-while loop % switch statement for user input
        do{
            //prompt user and start switch statment
            System.out.printf("What woulds't thou do?%n");
            userAnswer  = input.nextLine(); 
            switch (userAnswer.toUpperCase()) {

                case "GO HINT 1":
                if (spiderHint1.getHealth() != 0) {

                } else {

                }
                break;

                case "GO HINT 2":
                System.out.printf("");
                break;
                
                case "GO RIDDLE":
                System.out.printf("");
                break;

                case "GO DOOR":
                System.out.printf("");
                break;

                case "GO HALLWAY":
                System.out.printf("");
                break;

                case "GO CHAMBER":
                System.out.printf("");
                break;

                case "HELP":
                help();
                break;

                case "LOOK ROOM":
                Look.lookRoom();
                break;

                case "LOOK DUNGEON":
                Look.lookRoom();
                break;

                case "LOOK HINT":
                System.out.printf("Which hint? There are 2 of them!%n");
                break;

                case "LOOK HINT 1":
                if (currentLocation == Location.HINT1) {

                } else {
                    Look.hint1Far();
                }
                break;

                case "LOOK HINT1":
                if (currentLocation == Location.HINT2) {

                } else {
                    Look.hint2Far();
                }
                break;

                case "LOOK HINT 2":
                break;

                case "LOOK HINT2":
                break;
                
                default:
                System.out.printf("Type 'help' if you need a refresher on how to speak english.");
                break;

            }
        } while(userAnswer == "hi");

    } //end of main

    //this is the method for the help text
    public static void help() {
        System.out.printf("In this game, you will be solving puzzles, navigating the dungeon, and fighting monsters.%n");
        System.out.printf("*To look at somthing, use command 'look' preceeding all requests.%n");
        System.out.printf("*To go to a place, use command 'go' preceeding all requests.%n");
        System.out.printf("*When fighting a monster, use command 'attack' preceeding all requests.%n");
        System.out.printf("Valid attacks are:%n*Swipe%n*Punch%n*Block%n*Parry%n");
    }

    //navigation methods
    public static void doorGo() {
        
    }
    public static void hallwayGo() {

    }
    public static void innerChamberGo() {
        
    }
}
