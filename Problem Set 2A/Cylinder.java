
/**
 * Iris Guo
 * Sept. 23, 2024
 * Problem set 2A
 */
public class Cylinder
{
    // instance variables: height of cylinder, base circle object
    double height;
    Circle base;

    //default constructor: sets height to 1 and base object with radius 1
    public Cylinder()
    {
        height = 1;
        base = new Circle ();
    }

    //constructor using two double parameters, height h and radius r
    public Cylinder(double h, double r)
    {
        height = h;
        base = new Circle (r);
    }

    //returns a String that describes the cylinder
    public String toString()
    {
        return "Hello, I am a circle with a radius of " + base.getRadius() + " and height of " + height;
    }
    
    //returns the value of the base's radius
    public double getRadius()
    {
        return base.getRadius();
    }
    
    //returns the height
    public double getHeight() 
    {
        return height;
    }
    
    //returns the cylinder's surface area
    public double surfaceArea()
    {
        double cArea = base.area();
        double cCircumference = base.circumference();
        return cArea*2 + cCircumference*height;
    }
    
    //returns the cylinder's volume
    public double volume()
    {
        double cArea = base.area();
        return cArea*height;
    }
}
