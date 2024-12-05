
/**
 * Write a description of class TTT here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TTT
{
    public static void printBoard(String[][] grid){
        for (int row = 0; row < grid.length; row++){
            for (int col = 0; col < grid[0].length; col++){
                System.out.print("[" + grid[row][col] + "]");
            }
            System.out.println();
        }
    }
    
}
