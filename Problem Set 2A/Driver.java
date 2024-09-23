
/**
 * Iris Guo
 * Sept. 23, 2024
 * Problem set 2A
 */
public class Driver
{
    public static void main (String[] args) {
        
        //instantiate Circle objects c with default constructor
        Circle c = new Circle();
        
        //instantiate Circle objects c2 with radius 5
        Circle c2 = new Circle (5);
        
        //output of c object
        System.out.println ("Creating a circle with the default constructor!");
        System.out.println (c.toString());
        System.out.println ("getRadius() --> " + c.getRadius() + " units");
        System.out.println ("circumference() --> " + c.circumference() + " units");
        System.out.println ("area() --> " + c.area() + " units");
        
        System.out.println ();
        
        //output of c2 object
        System.out.println ("Creating a circle with a parameterized constructor!");
        System.out.println (c2.toString());
        System.out.println ("getRadius() --> " + c2.getRadius() + " units");
        System.out.println ("circumference() --> " + c2.circumference() + " units");
        System.out.println ("area() --> " + c2.area() + " units");
        
        System.out.println ();
        
        //instantiate Cylinder objects cy with default constructor
        Cylinder cy = new Cylinder();
        
        //instantiate Cylinder objects cy2 with height 5 and radius for base circle 6
        Cylinder cy2 = new Cylinder (5, 6);
        
        //output of cy object
        System.out.println ("Creating a cylinder with the default constructor!");
        System.out.println (cy.toString());
        System.out.println ("getRadius() --> " + cy.getRadius() + " units");
        System.out.println ("getHeight() --> " + cy.getHeight() + " units");
        System.out.println ("surfaceArea() --> " + cy.surfaceArea() + " units");
        System.out.println ("volume() --> " + cy.volume() + " units");
        
        System.out.println ();
        
        //output of cy2 object
        System.out.println ("Creating a circle with a parameterized constructor!");
        System.out.println (cy2.toString());
        System.out.println ("getRadius() --> " + cy2.getRadius() + " units");
        System.out.println ("getHeight() --> " + cy2.getHeight() + " units");
        System.out.println ("surfaceArea() --> " + cy2.surfaceArea() + " units");
        System.out.println ("volume() --> " + cy2.volume() + " units");
    }
}
