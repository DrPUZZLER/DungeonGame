import java.util.Random;
public class Spider {
    //calls random
    Random rand = new Random();
    //fields
    private int[] spiderStats = new int[3];

    //constructors
    public Spider(int health, int strength, int speed) {
        /*
        Health can be from 15-30
        Strength can be from 1-5
        Speed can be from 1-3
        */


        spiderStats[0] = health;
        spiderStats[1] = strength;
        spiderStats[2] = speed;
    }

    //methods
    public int attack() {
        int damage = 0;
        int attack = rand.nextInt(2);
        /*
        Random key:
        0 = lunge
        1 = hesitate (does nothing)
        */
        if (attack == 0) {
            lunge();
        } else if (attack == 1) {
            if (spiderStats[2] == 1) {
                heasitate();
            } else if (spiderStats[2] == 2) {
                attack = rand.nextInt(2);
                if (attack == 0) {
                    lunge();
                } else {
                    heasitate();
                }
            } else if (spiderStats[2] == 3) {
                attack = rand.nextInt(3);
                if (attack == 0) {
                    lunge();
                } else {
                    heasitate();
                }
            }
        }

        return damage;
    }

    
    // methods for diffrent attacks/defenses
    private int lunge() {
        int damage = rand.nextInt(4) + 1; //4 levels of damage
        damage = damage * spiderStats[1];
        return damage;
    }

    private void heasitate() {
        System.out.println("The Spider hesitates");
    }
    //get and set health
    public void setHealth(int newHealth) {
        spiderStats[0] = getHealth() - newHealth;
    }

    public int getHealth() {
        int health = spiderStats[0];
        return health;
    }
}
