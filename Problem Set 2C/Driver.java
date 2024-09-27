
/**
 * Iris Guo
 * Sept. 25, 2024
 * problem set 2B
 */

import java.util.Scanner;
public class Driver
{
    public static void main (String [] args){
        OrderedPair op1 = new OrderedPair ();
        OrderedPair op2 = new OrderedPair (1, 2);
        Scanner input = new Scanner(System.in);
        
        System.out.println (op1.toString());
        System.out.println (op2.toString());
        
        System.out.println (op1.getX());
        System.out.println (op1.getY());
        System.out.println (op2.getX());
        System.out.println (op2.getY());
        
        System.out.println ("QUADRATIC FORMULA: Find the roots of ax^2 + bx + c. Enter a, b and c: ");
        System.out.print ("a: ");
        double a = input.nextDouble(); 
        System.out.print ("b: ");
        double b = input.nextDouble(); 
        System.out.print ("c: ");
        double c = input.nextDouble(); 
        System.out.println ("The solutions for " + a + "x^2 + " + b + "x + " + c + " are " + Formulas.findQuadraticRoots(a, b, c));
        System.out.println ("");
        
        System.out.println ("SLOPE FORMULA: Find the slope between points (x1,y1) and (x2,y2)");
        System.out.print ("x1: ");
        double x1 = input.nextDouble(); 
        System.out.print ("y1: ");
        double y1 = input.nextDouble(); 
        System.out.print ("x2: ");
        double x2 = input.nextDouble(); 
        System.out.print ("y2: ");
        double y2 = input.nextDouble(); 
        OrderedPair slope1 = new OrderedPair (x1, y1);
        OrderedPair slope2 = new OrderedPair (x2, y2);
        System.out.println ("A line between " + slope1 + " and " + slope2 + " has a slope of " + Formulas.findSlope(slope1, slope2));
        System.out.println ("");
        
        System.out.println ("MIDPOINT FORMULA: Find the midpoint between (x1,y1) and (x2,y2)");
        System.out.print ("x1: ");
        double x11 = input.nextDouble(); 
        System.out.print ("y1: ");
        double y11 = input.nextDouble(); 
        System.out.print ("x2: ");
        double x22 = input.nextDouble(); 
        System.out.print ("y2: ");
        double y22 = input.nextDouble(); 
        OrderedPair slope11 = new OrderedPair (x11, y11);
        OrderedPair slope22 = new OrderedPair (x22, y22);
        System.out.println ("The midpoint between " + slope11 + " and " + slope22 + " is " + Formulas.findMidpoint(slope11, slope22));
        System.out.println ("");
        
        System.out.println ("SUM OF AN ARITHMETIC SERIES");
        System.out.print ("Number of terms: ");
        int terms = input.nextInt(); 
        System.out.print ("Starts with: ");
        double begin = input.nextDouble(); 
        System.out.print ("Increases by: ");
        double increment = input.nextDouble(); 
        System.out.print ("The sum of the first " + terms + " terms of an arithmetic series that starts with " + begin + " and increases by " + increment + " is " + Formulas.findArithmeticSeriesSum(begin, increment, terms));
    }
}
