import java.util.Random;
public class Guard {
    //calls random
    Random rand = new Random();
    //fields
    private int[] guardStats = new int[3];

    //constructors
    public Guard(int health, int strength, int speed) {
        /*
        Health can be from 20-40
        Strength can be from 1-5
        Speed can be from 1-3
        */

        guardStats[0] = health;
        guardStats[1] = strength;
        guardStats[2] = speed;
    }

    //methods
    public int attack() {
        /*
        Random key:
        0 = swipe
        1 = punch
        2 = hesitate (does nothing)
        */


        int attack = rand.nextInt(3);
        int damage = 0;
        if (attack == 0) {
            damage = swipe();
        } else if (attack == 1) {
            damage = punch();
        } else if (attack == 2) {
            if (guardStats[2] == 1) {
                //does nothing
                heasitate();
                damage = 0;
            } else if (guardStats[2] == 2) {
                //does random again, half half chance
                attack = rand.nextInt(2);
                if (attack == 1) {
                    damage = swipe();
                } else {
                    heasitate();
                    damage = 0;
                }
            } else if (guardStats[2] == 3) {
                //does random again, 1/3 chance of heasitating
                attack = rand.nextInt(3);
                if (attack == 1) {
                    damage = swipe();
                } else {
                    heasitate();
                    damage = 0;
                }
            }
        }
        return damage;
    }

    public void death(Guard guardToKill) {
        guardToKill = null;
    }

    // methods for diffrent attacks/defenses
    private int swipe() {
        int damage = rand.nextInt(3) + 3; //3 levels of damage (3,4,5)
        damage = damage * guardStats[1];
        System.out.printf("The guard swipes thier sword. They do %f damage.%n", damage);
        return damage;
    }

    private int punch() {
        System.out.printf("The guard punches you. They do %f damage.%n", guardStats[1]);
        return guardStats[1];
    }
    private void heasitate() {
        System.out.printf("The Guard hesitates.%n");
    }
    //get and set health
    public void setHealth(int newHealth) {
        guardStats[0] = newHealth;
    }

    public int getHealth() {
        int health = guardStats[0];
        return health;
    }
}
