
public class Riddle {

    public static boolean key = false; 

    public static String askRiddle(){

        return "I'm tall when I am young, and I'm short when I'm old. What am I?";
    
    }
    public static void hint(){
            System.out.printf("I am a non-living object...%n");
        }
    public static void anotherHint(){
            System.out.printf("I can create light...%n");
        }
    public static void key(){
        System.out.printf("The old man smiles. 'Correct!', he says. He grabs a key, and gives it to you.%n");
        System.out.printf("You take it. It is sticky. Gross.");
        key = true; 
    }

}
