public class Navigation {
    //this is the variable that handles the players current location. valid values are found in the enum Location.java
    public static Location currentLocation = Location.START;

    public static void enemyHint1() {
        
    }
    public static void enemyHint2() {
        
    }
    public static void enemyRiddle() {
        
    }
    public static void hint1() {
        currentLocation = Location.HINT1;
        System.out.printf("You walked into hint 1");
    }
    public static void hint2() {
        currentLocation = Location.HINT2;
        System.out.printf("You walked into hint 2");
    }
    public static void riddle() {
        currentLocation = Location.RIDDLE;
        System.out.printf("You have seen Riddle")
    }
    public static void door() {
        currentLocation = Location.DOOR;
        DungeonGame.doorGo();
        System.out.printf("You have walked unto door";)
    }
    
}
