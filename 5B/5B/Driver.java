
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Driver
{
    public static void main (String [] args){
        //problem 1
        Fraction MILU = new Fraction( 355, 113 );
        final double EPSILON = Math.abs( Math.PI - MILU.toDouble() );
        while (Math.abs( Math.PI - MILU.toDouble()) >= EPSILON){
            if (Math.PI - MILU.toDouble() < 0){
                MILU.setDen(MILU.getDen()+1);
            } else{
                MILU.setNum(MILU.getNum()+1);
            }
        }
        
        System.out.println(MILU.toString());
        
        //problem 2
        //fix negative
        boolean contin = true;
        Fraction ratio = new Fraction (0, 1);
        System.out.println("Let the Fraction Quiz Begin. Answers should be in lowest terms. Good luck!");
        System.out.println("");
        while (contin){
            Fraction one = Fraction.randomFraction();
            Fraction two = Fraction.randomFraction();
            if (one.toDouble() < two.toDouble()){
                Fraction three = one;
                one = two;
                two = three;
            }
            char operation = Fraction.randomOperation();
            System.out.print (one.toString() + " " + operation + " " + two.toString() + " = ");
            Scanner input = new Scanner (System.in);
            String user = input.nextLine();
            
            String answer = Fraction.evaluate(one, two, operation);
            if (answer.equals(user)){
                System.out.println("Correct!");
                ratio.setNum(ratio.getNum()+1);
                ratio.setDen(ratio.getDen()+1);
            } else if (user.equals("quit")){
                ratio.setDen(ratio.getDen()-1);
                int r = (int)(ratio.toDouble()*100);
                System.out.println("Your win/loss ratio was " + ratio + ", for a score of " + r + " percent!");
                contin = false;
            } else {
                System.out.println("Wrong, the answer was " + answer);
                ratio.setDen(ratio.getDen()+1);
            }
            System.out.println("");
        }

    }
}
