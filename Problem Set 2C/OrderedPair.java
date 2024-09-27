
/**
 * Iris Guo
 * Sept. 25, 2024
 * problem set 2B
 */

public class OrderedPair
{
    // instance variables
    double x, y;

    //default constructor
    public OrderedPair()
    {
        x = 0;
        y = 0;
    }
    
    //constructor with two parameters
    public OrderedPair (double n, double z)
    {
        x = n;
        y = z;
    }

    //methods
    public String toString()
    {
        return "("+x + ", " + y + ")";
    }
    
    public double getX()
    {
        return x;
    }
    
    public double getY()
    {
        return y;
    }
}
