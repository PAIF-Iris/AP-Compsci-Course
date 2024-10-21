
/**
 * Write a description of class Triangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Triangle
{
    public static void t () {
        StdDraw.setPenRadius(0.005);
        StdDraw.setScale(0, 1);
        StdDraw.point(0, 1);
        StdDraw.point(1, 1);
        StdDraw.point(0.5, 0);
        
        OrderedPair pairT = new OrderedPair ();
        OrderedPair pairC = new OrderedPair (0.5, 0.5);
        StdDraw.point(0.5, 0.5);
        int num;
        for (int z = 0; z < 10000; z++) {
            num = (int) (Math.random()*3) + 1;
            if (num == 1) {
                pairT.changeY (1);
                pairT.changeX (0);
                pairC = Formulas.findMidpoint(pairT, pairC);
                StdDraw.point(pairC.getX(), pairC.getY());
            } else if (num == 2) {
                pairT.changeY (1);
                pairT.changeX (1);
                pairC = Formulas.findMidpoint(pairT, pairC);
                StdDraw.point(pairC.getX(), pairC.getY());
            } else if (num ==3) {
                pairT.changeY (0);
                pairT.changeX (0.5);
                pairC = Formulas.findMidpoint(pairT, pairC);
                StdDraw.point(pairC.getX(), pairC.getY());            
            }
        }
    }
}
