import java.lang.reflect.Method;
import java.util.Random;
public class Guard {
    //calls random
    Random rand = new Random();
    //fields
    private int[] guardStats = new int[3];

    //constructors
    public Guard(int health, int strength, int speed) {
        /*
        Health can be from 20-50
        Strength can be from 1-5
        Speed can be from 1-3
        */


        guardStats[0] = health;
        guardStats[1] = strength;
        guardStats[2] = speed;
    }

    //methods
    public void attack() {
        /*
        Random key:
        0 = swipe
        1 = punch
        2 = hesitate (does nothing)
        */
        int attack = rand.nextInt(3);
        if (attack == 0) {
            swipe();
        } else if (attack == 1) {
            punch();
        } else if (attack == 2) {
            if (guardStats[2] == 1) {
                //does nothing
                heasitate();
            } else if (guardStats[2] == 2) {
                //does random again, half half chance
                attack = rand.nextInt(2);
                if (attack == 1) {
                    swipe();
                } else {
                    heasitate();
                }
            } else if (guardStats[2] == 3) {
                //does random again, 1/3 chance of heasitating
                attack = rand.nextInt(3);
                if (attack == 1) {
                    swipe();
                } else {
                    heasitate();
                }
            }
        }
    }

    public void death() {
        
    }

    // methods for diffrent attacks/defenses
    private int swipe() {
        int damage = 0;
        return damage;
    }

    private void block() {
        
    }

    private void parry() {
        
    }

    private void punch() {
        
    }
    private void heasitate() {

    }
    //get and set health
    public void setHealth(int newHealth) {
        guardStats[0] = newHealth;
    }

    public int getHealth(int health) {
        health = guardStats[0];
        return health;
    }
}
