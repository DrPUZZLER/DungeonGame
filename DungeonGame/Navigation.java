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
    }
    public static void hint2() {
        currentLocation = Location.HINT2;
    }
    public static void riddle() {
        currentLocation = Location.RIDDLE;
    }
    public static void door() {
        currentLocation = Location.DOOR;
        DungeonGame.doorGo();
    }
    public static void hallway() {
        currentLocation = Location.HALLWAY;
        DungeonGame.hallwayGo();
    }
    public static void monster() {
        
    }
}
