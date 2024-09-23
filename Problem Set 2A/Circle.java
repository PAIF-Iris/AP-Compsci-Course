
/**
 * Iris Guo
 * Sept. 23, 2024
 * Problem set 2A
 */
public class Circle
{
    // instance variable radius of circle
    double radius;

    //default constructor that assigns radius a value of 1.
    public Circle()
    {
        radius = 1;
    }
    
    //constructor that uses a double parameter to set the radius.
    public Circle(double x)
    {
        radius = x;
    }
    
    //returns a String that describes the circle
    public String toString()
    {
        return "Hello, I am a circle with a radius of " + radius;
    }
    
    //returns the value of the circle's radius
    public double getRadius()
    {
        return radius;
    }
    
    //returns the circle's circumference.
    public double circumference()
    {
        return radius*2*3.1415926;
    }
    
    //returns the circle's area.
    public double area()
    {
        return radius*radius*3.1415926;
    }
}
