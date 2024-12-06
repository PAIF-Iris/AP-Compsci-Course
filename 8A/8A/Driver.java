
import java.util.Scanner;
public class Driver
{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        boolean win = false;
        boolean continues = true;
        int round = 1;
        String[][] grid = new String[3][3];
        int player = 0;
        for (int row = 0; row < grid.length; row++){
            for (int col = 0; col < grid[0].length; col++){
                grid[row][col] = " ";
            }
        }
    
        while (continues){
            while(!win){
                TTT.printBoard(grid, round, player, win);
                String user = input.nextLine();
                int[] RowColumn = TTT.stringToInt(user);
                if (TTT.check(RowColumn, grid)){
                    grid = TTT.update(player, RowColumn, grid);
                    if (TTT.checkWin(grid)){
                        win = true;
                        System.out.println("You Won");
                        TTT.printBoard(grid, round, player, win);
                    }
                    round++;
                    player++;
                } else {
                    System.out.println("Invalid move, try again");
                }
            }
            System.out.println("Play again? Y/N");
            String user = input.nextLine();
            if (user.equals("N")){
                continues = false;
            }
        }
        System.out.println("Thank you for playing");
        
        //next time: next round if Y, spaces between rounds, clean code
    }
}
