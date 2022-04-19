import java.util.Scanner;
public class DungeonGame {
        public static void main(String[] args) {
        // instantiate constructors for enemies
        Spider spiderHint1 = new Spider(15, 2, 2);
        Spider spiderHint2 = new Spider(20, 2, 2);
        Guard guardDoor = new Guard(40, 5, 3);
        Guard guardRiddle = new Guard(25, 3, 1);
        Player thePlayer = new Player(100, 2, 2);

        //create scanner and input var
        String userAnswer; 
        Scanner input = new Scanner(System.in);
        int switchRun = 0;
        //call help a first time
        help();
        //the do-while loop % switch statement for user input
        do{
            //prompt user and start switch statment
            System.out.printf("What woulds't thou do?%n");
            userAnswer  = input.nextLine(); 
            switch (userAnswer.toUpperCase()) {

                case "GO HINT 1":
                if (spiderHint1.getHealth() <= 0) {
                    Navigation.hint1();
                } else {
                    Navigation.enemyHint1();
                }
                break;

                case "GO HINT 2":

                if (spiderHint2.getHealth() <= 0) {
                    Navigation.hint2();
                } else {
                    Navigation.enemyHint2();
                }
                break;
                
                case "GO RIDDLE":
                if (guardRiddle.getHealth() <= 0) {
                    Navigation.riddle();
                } else {
                        Navigation.enemyRiddle();               
                }
                break;

                case "GO DOOR":
                if (guardDoor.getHealth() <= 0) {
                    Navigation.door();
                } else {
                        Navigation.enemyDoor();
                }
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
                Look.hint();
                break;

                case "LOOK HINT 1":
                if (Navigation.currentLocation == Location.HINT1) {
                    
                } else {
                    Look.hint1Far();
                }
                break;

                case "LOOK HINT1":
                if (Navigation.currentLocation == Location.HINT2) {

                } else {
                    Look.hint2Far();
                }
                break;

                case "LOOK HINT 2":
                if (Navigation.currentLocation == Location.HINT1) {
                         

                } else {
                    Look.hint1Far();
                }
                break;

                case "LOOK HINT2":
                if (Navigation.currentLocation == Location.HINT2) {

                } else {
                    Look.hint2Far();
                }
                break; 

                case "ATTACK SWIPE":
                if (inCombat == true) {
                    if (Navigation.currentLocation == Location.ENEMY_DOOR) {
                        guardDoor.setHealth(thePlayer.swipe());
                        System.out.printf("The guard has %d health.%n", guardDoor.getHealth());
                        guardDoor.attack();
                        if (guardDoor.getHealth() <= 0) {
                            System.out.printf("You defeat the guard.%n");
                            inCombat = false;
                            Navigation.door();
                        }
                    } else if (Navigation.currentLocation == Location.ENEMY_RIDDLE) {
                        guardRiddle.setHealth(thePlayer.swipe());
                        System.out.printf("The guard has %d health.%n", guardRiddle.getHealth());
                        guardRiddle.attack();
                        if (guardRiddle.getHealth() <= 0) {
                            System.out.printf("You defeat the guard.%n");
                            inCombat = false;
                            Navigation.riddle();
                        }
                    } else if (Navigation.currentLocation == Location.ENEMY_HINT1) {
                        spiderHint1.setHealth(thePlayer.swipe());
                        System.out.printf("The spider has %d health.%n", spiderHint1.getHealth());
                        spiderHint1.attack();
                        if (spiderHint1.getHealth() <= 0) {
                            System.out.printf("You defeat the spider.%n");
                            inCombat = false;
                            Navigation.hint1();
                        }
                    } else if (Navigation.currentLocation == Location.ENEMY_HINT2) {
                        spiderHint2.setHealth(thePlayer.swipe());
                        System.out.printf("The spider has %d health.%n", spiderHint2.getHealth());
                        spiderHint2.attack();
                        if (spiderHint2.getHealth() <= 0) {
                            System.out.printf("You defeat the spider.%n");
                            inCombat = false;
                            Navigation.hint2();
                        }
                    } else {
                        System.out.printf("Hmm, there must be a problem. You are in combat, but not in a combat zone.%n");
                    }
                } else {
                    System.out.printf("Currently not in combat.%n");
                }
                break;
                
                case "ATTACK PUNCH":
                if (inCombat == true) {
                    if (Navigation.currentLocation == Location.ENEMY_DOOR) {
                        guardDoor.setHealth(thePlayer.punch());
                        System.out.printf("The guard has %d health.%n", guardDoor.getHealth());
                        guardDoor.attack();
                        if (guardDoor.getHealth() <= 0) {
                            System.out.printf("You defeat the guard.%n");
                            inCombat = false;
                            Navigation.door();
                        }
                    } else if (Navigation.currentLocation == Location.ENEMY_RIDDLE) {
                        guardRiddle.setHealth(thePlayer.punch());
                        System.out.printf("The guard has %d health.%n", guardRiddle.getHealth());
                        guardRiddle.attack();
                        if (guardRiddle.getHealth() <= 0) {
                            System.out.printf("You defeat the guard.%n");
                            inCombat = false;
                            Navigation.riddle();
                        }
                    } else if (Navigation.currentLocation == Location.ENEMY_HINT1) {
                        spiderHint1.setHealth(thePlayer.punch());
                        System.out.printf("The spider has %d health.%n", spiderHint1.getHealth());
                        spiderHint1.attack();
                        if (spiderHint1.getHealth() <= 0) {
                            System.out.printf("You defeat the spider.%n");
                            inCombat = false;
                            Navigation.hint1();
                        }
                    } else if (Navigation.currentLocation == Location.ENEMY_HINT2) {
                        spiderHint2.setHealth(thePlayer.punch());
                        System.out.printf("The spider has %d health.%n", spiderHint2.getHealth());
                        spiderHint2.attack();
                        if (spiderHint2.getHealth() <= 0) {
                            System.out.printf("You defeat the spider.%n");
                            inCombat = false;
                            Navigation.hint2();
                        }
                    } else {
                        System.out.printf("Hmm, there must be a problem. You are in combat, but not in a combat zone.%n");
                    }
                } else {
                    System.out.printf("Currently not in combat.%n");
                }
                break;

                case "RIDDLE CANDLE":
                if (Navigation.currentLocation == Location.RIDDLE) {
                    Riddle.key();
                }
                break;

                case "QUIT":
                System.out.printf("Quitting the game.%n");
                switchRun = 1;
                break;
                
                default:
                System.out.printf("Type 'help' if you need a refresher on how to speak english.%n");
                break;

            }

        } while(switchRun == 0);


    } //end of main

    //this is the method for the help text
    public static void help() {
        System.out.printf("In this game, you will be solving puzzles, navigating the dungeon, and fighting monsters.%n");
        System.out.printf("*To look at somthing, use command 'look' preceeding all requests.%n");
        System.out.printf("*To go to a place, use command 'go' preceeding all requests.%n");
        System.out.printf("*When fighting a monster, use command 'attack' preceeding all requests.%n");
        System.out.printf("*When solving riddle, use command 'riddle' preceeding all requests.%n");
        System.out.printf("Valid attacks are:%n*Swipe%n*Punch%n");
        System.out.printf("To quit the game, type 'quit'%n");
    }

    //navigation methods
    public static void doorGo() {
        
    }
    //combat stuff

    public static boolean inCombat = false;

    public static void cannotMove() {
        System.out.printf("You cannot leave, you are in combat!%n");
    }
   
    
}
