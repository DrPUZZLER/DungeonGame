public class DungeonGame {
    public static void main(String[] args) {
        Guard dave = new Guard(20, 5, 2);
        System.out.printf("damage is %d%n", dave.attack());
    }
}
