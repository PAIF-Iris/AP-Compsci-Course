
/**
 * Iris Guo
 * Sept. 25, 2024
 * problem set 2B
 */

import java.util.Scanner;

public class Driver
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringTools sTools = new StringTools();
        
        System.out.println("lastLetter test cases:");
        System.out.println("Enter a sentence or word with at least one character: ");
        String answer1 = input.nextLine();
        System.out.println("The last letter is " + sTools.lastLetter(answer1));
        System.out.println("---------------------");

        System.out.println("formatPhoneNumber test cases:");
        System.out.println("Enter a 10-digit phone number");
        String answer2 = input.nextLine();
        System.out.println("The phone number is " + sTools.formatPhoneNumber(answer2));
        System.out.println("---------------------");
        
        System.out.println("middleThree test cases:");
        System.out.println("Enter word that is at least 3 characters long, and the length should be an odd number.");
        String answer3 = input.nextLine();
        System.out.println("The middle three letters are " + sTools.middleThree(answer3));
        System.out.println("---------------------");
        
        System.out.println("swapLastTwo test cases:");
        System.out.println("Enter a word that is at least 2 characters long");
        String answer4 = input.nextLine();
        System.out.println("The swapped word is " + sTools.swapLastTwo(answer4));
        System.out.println("---------------------");
        
        System.out.println("frontAgain test cases:");
        System.out.println("Enter a word:");
        String answer5 = input.nextLine();
        System.out.println("Enter a number that is at most as long as the word: ");
        int answer6 = input.nextInt();
        System.out.println("Are the first " + answer6 + " characters are the same as its last " + answer6 + " characters? " + sTools.frontAgain(answer5, answer6));
        System.out.println("---------------------");
    }
}
