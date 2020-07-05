package Allocaur;
import java.util.Scanner;

public class Allocaur {
    public static void main(String[] args) {
        String name;
        Scanner s = new Scanner(System.in); 
        System.out.println("Welcome to the world of Allocaur.");
        System.out.println("A new adventure awaits you.");
        System.out.print("Enter you name: ");
        name = s.nextLine();
        System.out.println("so your names " + name + " huh?");
        System.out.println("Well, i dont really care about that. i might use it in the future,"); 
        System.out.println("just to get your attention.");
        System.out.println();
        
        System.out.println("wow this is getting pretty hairy, lets freshen up this story a little bit huh? how does that sound?");
        
        s.close();
    }
}