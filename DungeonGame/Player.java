
import java.util.Random;
public class Player{

Random rand = new Random();

    //fields
    private int[] playerStats = new int[4];
//constructor
public  Player(int health, int strength, int speed) {
  this.playerStats[0] = health;
  this.playerStats[1] = strength;
  this.playerStats[2] = speed;
}

public int swipe() {
    int damage = rand.nextInt(3) + 3; //3 levels of damage (3,4,5)
    damage = damage * playerStats[1];
    return damage;
}

public int punch() {
    int damage = rand.nextInt(5) + 1; //max of 5 damage for punch
    return damage;
}

//get and set health
public void setHealth(int newHealth) {
    playerStats[0] = newHealth;
}

public int getHealth() {
    return playerStats[0];
}



public int getStrength(){
    return playerStats[1];

}
public int getSpeed(){
    return playerStats[2];

}
}