import java.util.Scanner;

public class Question {
    public static void main (String[] args) {
        Scanner course = new Scanner(System.in);
        System.out.print ("What is your favourite course at school? ");
        String answer_course = course.nextLine();
        
        System.out.print ("What is your favourite show? ");
        String answer_show = course.nextLine();
        
        System.out.print ("How many hours do you spend studying each day? ");
        Integer answer_study = course.nextInt();
        
        System.out.print ("How many hours do you spend watching shows each day? ");
        Integer answer_watch = course.nextInt();
    
        Integer sum = answer_watch + answer_study;
        
        System.out.println ("");
        System.out.println ("Summary: ");
        System.out.println ("Your favourite course at school is " + answer_course + ".");
        System.out.println ("Your favourite show is " + answer_show + ".");
        System.out.println ("You spend " + answer_study + " hours studying each day.");
        System.out.println ("You spend " + answer_watch + " hours watching shows each day.");
        System.out.println ("In total, you spend " + sum + " hours studying and watching shows each day.");
        
        course.close();

    }
}
