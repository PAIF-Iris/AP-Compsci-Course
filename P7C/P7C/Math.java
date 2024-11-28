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
        for (int x = 0; x < lst.size(); x++){
            p = lst.get(x);
            for (int y = x+1; y < lst.size(); y++){
                if (lst.get(y)%p == 0){
                    lst.remove(y);
                    y--;
                }
            }
            
        }
        return lst;
    }
    
    public String GoldbachConjecture (int i){
        ArrayList<Integer> prime = Eratosthenes(i);
        for (int x = 0; x < prime.size(); x++){
            for (int y = x+1; y < prime.size(); y++){
                if (prime.get(y) + prime.get(x) == i){
                    int one = prime.get(x);
                    int two = prime.get(y);
                    return one + " + " + two;
                }
            }
        }
        
        return "None works";
    }
    
    public ArrayList<Integer> Add(ArrayList<Integer> one, ArrayList<Integer> two){
        ArrayList<Integer> n = new ArrayList();
        int place = 0;
        for (int x = 1; x < one.size(); x++){
            if (one.size()-x ==0 || two.size()-x ==0){
                break;
            } else{
                if (one.get(one.size()-x) + two.get(one.size()-x) >= 10){
                    n.add(0, (one.get(one.size()-x) + two.get(one.size()-x))+place%10);
                    place = 1;
                } else {
                    n.add(0, one.get(one.size()-x) + two.get(one.size()-x)+place);
                    place = 0;
                }
            }
        }
        
        return n;
    }
}
