import java.util.Scanner;
public class DungeonGame {
        public static int switchRun = 0;
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
                
                case "GO OLD MAN":
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
                    Riddle.hint();
                } else {
                    Look.hint1Far();
                }
                break;

                case "LOOK HINT1":
                if (Navigation.currentLocation == Location.HINT2) {
                    Riddle.hint();
                } else {
                    Look.hint2Far();
                }
                break;

                case "LOOK HINT 2":
                if (Navigation.currentLocation == Location.HINT1) {
                         Riddle.anotherHint();
                } else {
                    Look.hint1Far();
                }
                break;

                case "LOOK HINT2":
                if (Navigation.currentLocation == Location.HINT2) {
                    Riddle.anotherHint();
                } else {
                    Look.hint2Far();
                }
                break; 

                case "ATTACK SWIPE":
                if (inCombat == true) {
                    if (Navigation.currentLocation == Location.ENEMY_DOOR) {
                        guardDoor.setHealth(thePlayer.swipe());
                        System.out.printf("The guard has %d health.%n", guardDoor.getHealth());
                        if (guardDoor.getHealth() <= 0) {
                            System.out.printf("You defeat the guard.%n");
                            inCombat = false;
                            Navigation.door();
                        } else {
                            thePlayer.setHealth(thePlayer.getHealth() - guardDoor.attack());
                            System.out.printf("You have %d health.%n", thePlayer.getHealth());
                            if (thePlayer.getHealth() <= 0) {
                                playerDeath();
                            }
                        }
                    } else if (Navigation.currentLocation == Location.ENEMY_RIDDLE) {
                        guardRiddle.setHealth(thePlayer.swipe());
                        System.out.printf("The guard has %d health.%n", guardRiddle.getHealth());
                        if (guardRiddle.getHealth() <= 0) {
                            System.out.printf("You defeat the guard.%n");
                            inCombat = false;
                            Navigation.riddle();
                        } else {
                            thePlayer.setHealth(thePlayer.getHealth() - guardRiddle.attack());
                            System.out.printf("You have %d health.%n", thePlayer.getHealth());
                            if (thePlayer.getHealth() <= 0) {
                                playerDeath();
                            }
                        }
                    } else if (Navigation.currentLocation == Location.ENEMY_HINT1) {
                        spiderHint1.setHealth(thePlayer.swipe());
                        System.out.printf("The spider has %d health.%n", spiderHint1.getHealth());
                        if (spiderHint1.getHealth() <= 0) {
                            System.out.printf("You defeat the spider.%n");
                            inCombat = false;
                            Navigation.hint1();
                        } else {
                            thePlayer.setHealth(thePlayer.getHealth() - spiderHint1.attack());
                            System.out.printf("You have %d health.%n", thePlayer.getHealth());
                            if (thePlayer.getHealth() <= 0) {
                                playerDeath();
                            }
                        }
                    } else if (Navigation.currentLocation == Location.ENEMY_HINT2) {
                        spiderHint2.setHealth(thePlayer.swipe());
                        System.out.printf("The spider has %d health.%n", spiderHint2.getHealth());
                        if (spiderHint2.getHealth() <= 0) {
                            System.out.printf("You defeat the spider.%n");
                            inCombat = false;
                            Navigation.hint2();
                        } else {
                            thePlayer.setHealth(thePlayer.getHealth() - spiderHint2.attack());
                            System.out.printf("You have %d health.%n", thePlayer.getHealth());
                            if (thePlayer.getHealth() <= 0) {
                                playerDeath();
                            }
                        }
                    } else {
                        System.out.printf("Hmm, there must be a problem. You are in combat, but not in a combat zone.%n");
                    }
                } else {
                    System.out.printf("You swipe your sword through the air. Good job, dummy.%n");
                }
                break;
                
                case "ATTACK PUNCH":
                if (inCombat == true) {
                    if (Navigation.currentLocation == Location.ENEMY_DOOR) {
                        guardDoor.setHealth(thePlayer.punch());
                        System.out.printf("The guard has %d health.%n", guardDoor.getHealth());
                        if (guardDoor.getHealth() <= 0) {
                            System.out.printf("You defeat the guard.%n");
                            inCombat = false;
                            Navigation.door();
                        } else {
                            thePlayer.setHealth(thePlayer.getHealth() - guardDoor.attack());
                            System.out.printf("You have %d health.%n", thePlayer.getHealth());
                            if (thePlayer.getHealth() <= 0) {
                                playerDeath();
                            }
                        }
                    } else if (Navigation.currentLocation == Location.ENEMY_RIDDLE) {
                        guardRiddle.setHealth(thePlayer.punch());
                        System.out.printf("The guard has %d health.%n", guardRiddle.getHealth());
                        if (guardRiddle.getHealth() <= 0) {
                            System.out.printf("You defeat the guard.%n");
                            inCombat = false;
                            Navigation.riddle();
                        } else {
                            thePlayer.setHealth(thePlayer.getHealth() - guardRiddle.attack());
                            System.out.printf("You have %d health.%n", thePlayer.getHealth());
                            if (thePlayer.getHealth() <= 0) {
                                playerDeath();
                            }
                        }
                    } else if (Navigation.currentLocation == Location.ENEMY_HINT1) {
                        spiderHint1.setHealth(thePlayer.punch());
                        System.out.printf("The spider has %d health.%n", spiderHint1.getHealth());
                        if (spiderHint1.getHealth() <= 0) {
                            System.out.printf("You defeat the spider.%n");
                            inCombat = false;
                            Navigation.hint1();
                        } else {
                            thePlayer.setHealth(thePlayer.getHealth() - spiderHint1.attack());
                            System.out.printf("You have %d health.%n", thePlayer.getHealth());
                            if (thePlayer.getHealth() <= 0) {
                                playerDeath();
                            }
                        }
                    } else if (Navigation.currentLocation == Location.ENEMY_HINT2) {
                        spiderHint2.setHealth(thePlayer.punch());
                        System.out.printf("The spider has %d health.%n", spiderHint2.getHealth());
                        if (spiderHint2.getHealth() <= 0) {
                            System.out.printf("You defeat the spider.%n");
                            inCombat = false;
                            Navigation.hint2();
                        } else {
                            thePlayer.setHealth(thePlayer.getHealth() - spiderHint2 .attack());
                            System.out.printf("You have %d health.%n", thePlayer.getHealth());
                            if (thePlayer.getHealth() <= 0) {
                                playerDeath();
                            }
                        }
                    } else {
                        System.out.printf("Hmm, there must be a problem. You are in combat, but not in a combat zone.%n");
                    }
                } else {
                    System.out.printf("You punch nothing. You look like an idiot.%n");
                }
                break;

                case "RIDDLE CANDLE":
                if (Navigation.currentLocation == Location.RIDDLE) {
                    Riddle.key();
                } else {
                    System.out.printf("Why are you giving the answer to the air? What's wrong with you, stupido!");
                }
                break;

                case "USE KEY":
                if (Navigation.currentLocation == Location.DOOR) {
                    System.out.printf("You use the key and open the door.%nCongratulations! You have escaped the dungeon! I- *sniff* I'm so proud of you!");
                    switchRun = 1;
                } else {
                    System.out.printf("There is nowhere to use the key at this location. Idiot.");
                }
                break;

                case "QUIT":
                System.out.printf("haha, quitter.%n");
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
        System.out.printf("*When solving riddle, use command 'riddle' preceeding all requests.%n");
        System.out.printf("When using an item, use command 'use' preceeding al requests%n");
        System.out.printf("*When fighting a monster, use command 'attack' preceeding all requests.%n");
        System.out.printf("Valid attacks are:%n*Swipe- Swipe is the basic attack, and does a fair amount of damage.%n");
        System.out.println("*Punch- Punch is typically weaker than swipe, but has a 5% chance to one-hit any monster.");
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
    public static void playerDeath() {
        System.out.printf("you died lol. start again noob%n");
        switchRun = 1;
    }
   
    
}
