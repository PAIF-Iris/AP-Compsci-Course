
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Driver
{
    public static void main (String [] args){
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

    }
}
