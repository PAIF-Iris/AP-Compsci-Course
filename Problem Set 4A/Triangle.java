
/**
 * Write a description of class Triangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Triangle
{
    public static void t () {
        StdDraw.setScale(0, 1);
        StdDraw.point(0, 1);
        StdDraw.point(1, 1);
        StdDraw.point(0.5, 0);
        OrderedPair pairT = new OrderedPair ();
        OrderedPair pairC = new OrderedPair ();
        int num;
        double x, y;
        
        for (int z = 0; z < 10000; z++) {
            num = (int) Math.random()*3 + 1;
            if (num == 1) {
                pairT.changeY (1);
                pairC.changeX (0);
                x = (int) Math.random()*3 + 1;
            } else if (num == 2) {
                pairT.changeY (1);
                pairC.changeX (1);
            } else {
                pairT.changeY (0.5);
                pairC.changeX (0);
            }
        }
    }
}
