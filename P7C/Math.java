import java.util.ArrayList;

/**
 * Write a description of class Math here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Math
{
    public ArrayList<Integer> Eratosthenes(int n)
    {
        ArrayList<Integer> lst = new ArrayList();
        int p = 0;
        for (int x = 2; x <= n; x++){
            lst.add(x);
        }
        System.out.println (lst);
        for (int x = 0; x < lst.size(); x++){
            p = lst.get(x);
            for (int y = x+1; y < lst.size(); y++){
                if (lst.get(y)%p == 0){
                    lst.remove(y);
                    y++;
                }
            }
            
        }
        System.out.println (lst);
        return lst;
    }
}
