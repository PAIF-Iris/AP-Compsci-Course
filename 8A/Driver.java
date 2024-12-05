
import java.util.Scanner;
public class Driver
{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        boolean win = false;
        boolean continues = true;
        int round = 1;
        String[][] grid = new String[3][3];
        
        for (int row = 0; row < grid.length; row++){
            for (int col = 0; col < grid[0].length; col++){
                grid[row][col] = " ";
            }
        }
        /**
        while (continues){
            while(!win){
                TTT.printBoard(grid);
                String user = input.nextLine();
                int[] RowColumn = TTT.stringToInt(user);
                if (TTT.check()){
                    if (TTT.checkWin()){
                        win = true;
                    }
                } else {
                    System.out.println("Invalid move, try again");
                }

            }
            //print the board
            //player input the move
            //turn input into a number
            //check if the input is valid
            //evaluate if win?
            //display board
            
        }*/
    }
}
