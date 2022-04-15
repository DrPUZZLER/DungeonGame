import java.util.Random;
public class Boss {

    /*
    attack patterns
    -Scyth Swipe? Basically a powerful version of swipe
    -Powerful Punch? Baiscally a powerful version of punch
    -Great Leap? Jumps away, requires for player to navigate in order to attack
    -Horn Ram? headbutt player
    -Super Shield? Nullifies player damage
    -Rumbleing Roar? Stuns player, allows for extra attack
    */


    //fields

    int[] bossStats = new int[3];

    Random rand = new Random();
    
    //constructors
    public Boss(int health, int strength, int speed) {
        this.bossStats[0] = health;
        this.bossStats[1] = health;
        this.bossStats[2] = health;
    }

    //attack method

    //attack patterns
    private int scythSwipe() {
        int damage = rand.nextInt(3) + 5; //3 levels of damage (5,8,9)
        damage = damage * bossStats[1];
        return damage;
    }
    private int powerfulPunch() {
        return bossStats[1];
    }
    private void greatLeap() {
        
    }
    private int hornRam() {
        return bossStats[1]+bossStats[3];
    }
    private int superShield() {
        return 0;
    }
    private int rumblingRoar() {
        return scythSwipe() + powerfulPunch();
    }
}
