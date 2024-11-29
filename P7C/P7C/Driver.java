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
        System.out.println(n);
        ArrayList<Integer> a = new ArrayList();
        ArrayList<Integer> b = new ArrayList();
        a.add(2);
        a.add(3);
        a.add(4);
        
        
        //23456
        
        b.add(2);
        b.add(3);
        b.add(4);
        
        //234
        
        //23690
        
        ArrayList<Integer> list = i.Add(b, a);
        System.out.println(list);
    }
}
