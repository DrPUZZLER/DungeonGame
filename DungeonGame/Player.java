
import java.util.Random;
public class Player{


Random rand = new Random();
    //fields
private int[] playerStats= new int[4];
public  Player(int health, int strength, int speed, int score) {
  this.playerStats[0] = health;
  this.playerStats[1] = strength;
  this.playerStats[2] = speed;
  this.playerStats[3] = score;
}

public int swipe() {
    int damage = rand.nextInt(3) + 1; //3 levels of damage
    damage = damage * playerStats[1];
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
public int getScore(){

    return playerStats[3];
}
}