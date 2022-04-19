
public class Riddle {

    public static boolean key = false; 

    public static void askRiddle(){

        System.out.println("I'm tall when I am young, and I'm short when I'm old. ");
        System.out.println("What am I?");
    
    }
    public static void hint(){
            System.out.println("I am a non-living object...");
        }
    public static void anotherHint(){
            System.out.println("I can create light...");
        }
    public static void key(){
        System.out.println("You have recieved a key!");
        key = true; 
    }

}
