import java.util.ArrayList;

/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Driver
{
    public static void main (String [] args){
        Math i = new Math();
        ArrayList<Integer> z = i.Eratosthenes(100);
        System.out.println(z);
        String n = i.GoldbachConjecture(46);
        System.out.print(n);
        ArrayList<Integer> a = new ArrayList();
        ArrayList<Integer> b = new ArrayList();
        a.add(9);
        a.add(9);
        a.add(9);
        a.add(9);
        a.add(8);
        
        b.add(8);
        b.add(8);
        b.add(8);
    }
}
