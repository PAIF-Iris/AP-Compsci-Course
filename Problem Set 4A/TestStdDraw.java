
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
       
       public static void curve() {
           StdDraw.setScale(0, 500);
           
           for (int x = 0; x < 500; x += 20) {
               StdDraw.line(0, x, x, 500);
               StdDraw.line(x, 0, 500, x);
           }

       }
       
       public static void circle() {
           StdDraw.setScale(0, 500);
           int y = 0;

           for (int x = 500; x >= 0; x -= 10 ){
               StdDraw.circle(250, 250, x);
               if (y%2 == 0){
                   StdDraw.filledCircle(250, 250, x);
               } else {
                   StdDraw.setPenColor(StdDraw.WHITE);
                   StdDraw.filledCircle(250, 250, x);
                   StdDraw.setPenColor(StdDraw.BLACK);
               }
               y++;
            
           }
           
       }
   }
