
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Driver
{
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");
        int tries = 0;
        int user = -1;
        int num = (int) (Math.random()*100) + 1;
        
        while (user != num) {
            System.out.print("Your guess: ");
            user = input.nextInt();
            
            if (user > num) {
                System.out.println ("Nope, that guess is too high.");
            } else if (user < num) {
                System.out.println ("Nope, that guess is too low.");
            } 
            tries++;
        }
        
        System.out.print("You guessed it! It took you " + tries + " tries.");
    }
}
