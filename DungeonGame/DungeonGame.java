public class DungeonGame {
    public static void main(String[] args) {
        Guard dave = new Guard(25, 4, 3);
        System.out.printf("damage is %d%n", dave.attack());
    }
}
