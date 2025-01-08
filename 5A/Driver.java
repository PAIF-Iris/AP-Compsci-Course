
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Driver
{
    public static void main (String [] args){
        Fraction one = new Fraction(1, 0);
        Fraction two = new Fraction(1, 2);
        Fraction three = new Fraction("10/2");
        System.out.print(three.toString());
    }
}
