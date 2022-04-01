import java.util.Random;
public class Skeleton {
    //calls random
    Random rand = new Random();
    //fields
    private int[] skeletonStats = new int[3];

    //constructors
    public Skeleton(int health, int strength, int speed) {
        /*
        Health can be from 20-50
        Strength can be from 1-5
        Speed can be from 1-3
        */


        skeletonStats[0] = health;
        skeletonStats[1] = strength;
        skeletonStats[2] = speed;
    }

    //methods
    public int attack() {
        /*
        Random key:
        0 = shoot
        1 = hesitate (does nothing)
        */
        int attack = rand.nextInt(2);
        int damage = 0;
        if (attack == 0) {
            damage = shoot();
        } else if (attack == 1) {
            if (skeletonStats[2] == 1) {
                //does nothing
                heasitate();
                damage = 0;
            } else if (skeletonStats[2] == 2) {
                //does random again, half half chance
                attack = rand.nextInt(2);
                if (attack == 1) {
                    damage = shoot();
                } else {
                    heasitate();
                    damage = 0;
                }
            } else if (skeletonStats[2] == 3) {
                //does random again, 1/3 chance of heasitating
                attack = rand.nextInt(3);
                if (attack == 1) {
                    damage = shoot();
                } else {
                    heasitate();
                    damage = 0;
                }
            }
        }
        return damage;
    }

    public void death() {
                
    }
    public void revive() {

    }

    // methods for diffrent attacks/defenses
    private int shoot() {
        int damage = rand.nextInt(3); //3 levels of damage
        damage = damage * skeletonStats[1];
        return damage;
    }

    private void heasitate() {
        System.out.println("The Skeleton hesitates");
    }
    //get and set health
    public void setHealth(int newHealth) {
        skeletonStats[0] = newHealth;
    }

    public int getHealth() {
        int health = skeletonStats[0];
        return health;
    }
}
