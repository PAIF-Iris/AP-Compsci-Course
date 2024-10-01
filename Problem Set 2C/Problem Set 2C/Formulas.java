
/**
 * Iris Guo
 * Sept. 25, 2024
 * problem set 2B
 */
public class Formulas
{
    //method: finding the roots of a quadratic
    public static OrderedPair findQuadraticRoots (double a, double b, double c)
    {
        double squareRoot = Math.sqrt(b*b-4*a*c);
        double root1 = (squareRoot-b)/2/a;
        double root2 = (-b-squareRoot)/2/a;
        return new OrderedPair(root1, root2);
    }
    
    //method: finding the slope between two ordered pairs
    public static double findSlope (OrderedPair A, OrderedPair B)
    {
        return (B.getY() - A.getY())/(B.getX() - A.getX());
    }
    
    //method: findng the midpoint between two ordered pairs
    public static OrderedPair findMidpoint (OrderedPair A, OrderedPair B)
    {
        double xPoint = (B.getX() + A.getX() )/2;
        double yPoint = (B.getY() + A.getY())/2;
        return new OrderedPair(xPoint, yPoint);
    }
    
    //method: finding the sum of an arithmetic series
    public static double findArithmeticSeriesSum (double a, double d, int k)
    {
        return k/2.0*(2*a + d*(k-1));
    }
    
    //method: finding the sum of a geometric series
    public static double findGeometricSeriesSum (double a, double r, int k) 
    {
        return a * ((1-Math.pow(r, k))/(1-r));
    }
    
    //method: rolling a random number between 1 and a given integer
    public static int rollDie (int sides)
    {
        return (int) (Math.random()*sides) + 1;
    }

}
