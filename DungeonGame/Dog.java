import java.util.Random;
public class Dog {
    //calls random
    Random rand = new Random();
    //fields
    private int[] dogStats = new int[3];

    //constructors
    public Dog(int health, int strength, int speed) {
        /*
        Health can be from 10-25
        Strength can be from 1-5
        Speed can be from 1-3
        */


        dogStats[0] = health;
        dogStats[1] = strength;
        dogStats[2] = speed;
    }

    //methods
    public int attack() {
        int damage = 0;
        int attack = rand.nextInt(3);
        /*
        Random key:
        0 = bite
        1 = bark
        3 = hesitate (does nothing)
        */
        if (attack == 0) {
            bite();
        } else if (attack == 1) {
            attack = rand.nextInt(5);
            if (attack == 0) {
                bark();
            } else if (attack == 1 || attack == 2){
                bite();
            } else {
                heasitate();
            }
        } else if (attack == 2) {
            if (dogStats[2] == 1) {
                heasitate();
            } else if (dogStats[2] == 2) {
                attack = rand.nextInt(2);
                if (attack == 0) {
                    bite();
                } else {
                    heasitate();
                }
            } else if (dogStats[2] == 3) {
                attack = rand.nextInt(3);
                if (attack == 0) {
                    bite();
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
    private int bite() {
        int damage = rand.nextInt(3) + 1; //3 levels of damage
        damage = damage * dogStats[1];
        return damage;
    }
    private Dog bark() {
        return new Dog(rand.nextInt(15) + 10,rand.nextInt(5) + 1, rand.nextInt(3) + 1);
    }

    private void heasitate() {
        System.out.println("The Dog hesitates");
    }
    //get and set health
    public void setHealth(int newHealth) {
        dogStats[0] = newHealth;
    }

    public int getHealth() {
        int health = dogStats[0];
        return health;
    }
}
