
/**
 * Write a description of class Drawing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestStdDraw {
       public static void grid() {
           StdDraw.setScale(0, 500);
           
           for (int x = 0; x < 500; x += 20) {
               StdDraw.line(x, 500, x, 0);
               StdDraw.line(0, x, 500, x);
           }
       }
       
       
   }
