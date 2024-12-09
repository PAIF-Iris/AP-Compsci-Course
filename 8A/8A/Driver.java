
import java.util.Scanner;
public class Driver
{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        boolean win = false;
        boolean continues = true;
        int round = 1;
        int player = 0;
    
        while (continues){
            String[][] grid = TTT.initializeBoard();
            while(!win){
                TTT.printBoard(grid, round, player, win);
                String user = input.nextLine();
                System.out.println("");
                int[] RowColumn = TTT.stringToInt(user);
                if (TTT.check(RowColumn, grid)){
                    grid = TTT.update(player, RowColumn, grid);
                    if (TTT.checkWin(grid) == 1){
                        win = true;
                        System.out.println("You Won");
                        TTT.printBoard(grid, round, player, win);
                        System.out.println("");
                    } else if (TTT.checkWin(grid) == 2){
                        win = true;
                        System.out.println("Tie!");
                        TTT.printBoard(grid, round, player, win);
                        System.out.println("");
                    }
                    round++;
                    player++;
                } else {
                    System.out.println("Invalid move, try again");
                    System.out.println("");
                }
            }
            System.out.println("Play again? Y/N");
            String user = input.nextLine();
            System.out.println("");
            if (user.equals("N")){
                continues = false;
            } else {
                win = false;
                round = 1;
                player = 0;
            }
        }
        System.out.println("Thank you for playing");
    }
}
