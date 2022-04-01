import javax.sql.StatementEvent;

public class DungeonGame {
    public static void main(String[] args) {
        Skeleton steve = new Skeleton(25, 4, 1);
        System.out.printf("damage is %d%n", steve.attack());
    }
}
