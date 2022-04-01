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
            } else if (guardStats[2] == 2) {
                //does random again, half half chance
                attack = rand.nextInt(2);
                if (attack == 1) {
                    damage = swipe();
                } else {
                    heasitate();
                }
            } else if (guardStats[2] == 3) {
                //does random again, 1/3 chance of heasitating
                attack = rand.nextInt(3);
                if (attack == 1) {
                    damage = swipe();
                } else {
                    heasitate();
                }
            }
        }
        return damage;
    }

    public void death() {
        
    }

    // methods for diffrent attacks/defenses
    private int swipe() {
        int damage = rand.nextInt(3); //3 levels of damage
        damage = damage * guardStats[1];
        return damage;
    }

    public int block() {
        //block blocks attack. chance of damage to be done
        int blockAmount = rand.nextInt(4);
        if (blockAmount == 0) {
            blockAmount = 100;
        } else if (blockAmount == 1) {
          blockAmount = 3;  
        } else if (blockAmount == 2) {
            blockAmount = 5;
        } else if (blockAmount == 3) {
            blockAmount = 10;
        }
        return blockAmount;

    }

    public int parry() {
        //parry blocks attack while doing damage
        int damageAmount = rand.nextInt(3) + 1;

        if (damageAmount == 1) {
            damageAmount = 3;  
        } else if (damageAmount == 2) {
            damageAmount = 5;
        } else if (damageAmount == 3) {
            damageAmount = 7;
        }
        return damageAmount;
    }

    private int punch() {
        int damage = rand.nextInt(5) + 5; //max of 5 damage for punch
        return damage;
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
