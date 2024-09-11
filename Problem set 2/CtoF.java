import java.util.Scanner;

public class CtoF{
    public static void main (String [] args) {
        //Celsius --> Fahrenheit
        Scanner input = new Scanner (System.in);
        System.out.print ("Enter a temperature in Celsius: ");
        double C = input.nextDouble ();
        double F = C*9/5 + 32;
        System.out.println (C + " Celsius = " + F + " Fahrenheit");
        
        //BMI Calculator
        System.out.print ("Enter a weight in kg: ");
        double w = input.nextDouble ();
        
        System.out.print ("Enter a height in m: ");
        double h = input.nextDouble ();
        
        double bmi = w/h/h;
        
        System.out.println ("A " + h + "m tall adult who weighs "+ w + "kg has a BMI of " + bmi);
        
        //Days --> Weeks and Days
        System.out.print ("Enter a number of days: ");
        int d = input.nextInt ();
        int we = d/7;
        int day = d%7;
        System.out.println (d + " days is equal to " + we + " weeks, " + day + " days");
        
        //Receipt Generator
        System.out.print ("Number of units you're buying: ");
        int u = input.nextInt ();
        System.out.print ("Price per unit: ");
        double p = input.nextDouble ();
        System.out.print ("Tax rate: ");
        double t = input.nextDouble ();
        
        double tax = t/100 + 1;
        double total = u*tax*p;
        
        System.out.println ("Purchasing " + u + " units at $" + p + " with " + t + "% tax will cost $" + total);
        
        //Sum of digits
        System.out.print ("Enter a positive, three-digit number: ");
        int number = input.nextInt ();
        int one = number/100;
        int three = number %100%10;
        int two = number%100/10;
        
        int sum = one + two + three;
        
        System.out.println ("The sum of the digits of "+ number + " is " + sum);
    }
}