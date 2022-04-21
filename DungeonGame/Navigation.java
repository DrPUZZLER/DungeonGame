public class Navigation {
    //this is the variable that handles the players current location. valid values are found in the enum Location.java
    public static Location currentLocation = Location.START;

    public static void enemyDoor() {
        if (DungeonGame.inCombat != true) {
            DungeonGame.inCombat = true;
            currentLocation = Location.ENEMY_DOOR;
            System.out.printf("You go to the door, but it is blocked by a guard! You'll have to fight your way out of this one!%n");
        } else {
            DungeonGame.cannotMove();
        }
    }
    public static void enemyHint1() {
        if (DungeonGame.inCombat != true) {
        DungeonGame.inCombat = true;
        currentLocation = Location.ENEMY_HINT1;
        System.out.printf("You go to hint 1, but it is blocked by a spider! You'll have to fight your way out of this one!%n");
        } else {
            DungeonGame.cannotMove();
        }
    }
    public static void enemyHint2() {
        if (DungeonGame.inCombat != true) {
            DungeonGame.inCombat = true;
            currentLocation = Location.ENEMY_HINT2;
            System.out.printf("You go to hint 2, but it is blocked by a spider! You'll have to fight your way out of this one!%n");
            } else {
                DungeonGame.cannotMove();
            }
    }
    public static void enemyRiddle() {
        if (DungeonGame.inCombat != true) {
            DungeonGame.inCombat = true;
            currentLocation = Location.ENEMY_RIDDLE;
            System.out.printf("You go to the old man, but he is blocked by a guard! You'll have to fight your way out of this one!%n");
            } else {
                DungeonGame.cannotMove();
            }
    }
    public static void hint1() {
        if (DungeonGame.inCombat != true) {
        currentLocation = Location.HINT1;
        System.out.printf("You go to hint 1%n");
        } else {
            DungeonGame.cannotMove();
        }
    }
    public static void hint2() {
        if (DungeonGame.inCombat != true) {
        currentLocation = Location.HINT2;
        System.out.printf("You go to hint 2%n");
        } else {
            DungeonGame.cannotMove();
        }
    }
    public static void riddle() {
        if (DungeonGame.inCombat!= true) {
        currentLocation = Location.RIDDLE;
        System.out.printf("You go to the old man.%n");
        System.out.printf("\"%s\" the old man says.%n", Riddle.askRiddle());
        } else {
            DungeonGame.cannotMove();
        }
    }
    public static void door() {
        if (DungeonGame.inCombat != true) {
        currentLocation = Location.DOOR;
        DungeonGame.doorGo();
        System.out.printf("You go to the door. It is an ordinary door. You know, the kind with wood? And maybe a handle?%n");
        } else {
            DungeonGame.cannotMove();
        }
    }
}
