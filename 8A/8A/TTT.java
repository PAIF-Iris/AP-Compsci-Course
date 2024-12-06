
/**
 * Write a description of class TTT here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TTT
{
    public static void printBoard(String[][] grid, int round, int player, boolean win){
        if (!win){
            System.out.println("Round " + round + ":");
            for (int row = 0; row < grid.length; row++){
                for (int col = 0; col < grid[0].length; col++){
                    System.out.print("[" + grid[row][col] + "]");
                }
                System.out.println();
            }
            if (player%2 == 0){
                System.out.print("X, make your move (row,col)");
            } else{
                System.out.print("O, make your move (row,col)");
            }
        } else{
            for (int row = 0; row < grid.length; row++){
                for (int col = 0; col < grid[0].length; col++){
                    System.out.print("[" + grid[row][col] + "]");
                }
                System.out.println();
            }
        }
    }

    public static int[] stringToInt(String input){
        int[] number = new int[2];
        number[0] = (int) Integer.parseInt(input.substring(0, input.indexOf(",")));
        number[1] = (int) Integer.parseInt(input.substring(input.indexOf(",") +1));
        return number;
    }

    public static boolean check(int[] number, String[][] board){
        if (number[0] < 0 || number[0] > 2 || number[1] < 0 || number[1] > 2){
            return false;
        } else if (board[number[0]][number[1]] != " "){
            return false;
        } else{
            return true;
        }
    }

    public static String[][] update(int player, int[] number, String[][] board){
        if (player%2 == 0){
            board[number[0]][number[1]] = "X";
        } else{
            board[number[0]][number[1]] = "O";
        }

        return board;
    }

    public static boolean checkWin(String[][] board){
        for (int x = 0; x < 3; x++){
            if (board[x][0] != " " && board[x][0] == board[x][1] && board[x][0] == board[x][2]){
                return true;
            }
        }

        for (int x = 0; x < 3; x++){
            if (board[0][x] != " " && board[0][x] == board[1][x] && board[0][x] == board[2][x]){
                return true;
            }
        }

        if (board[0][0] != " " && board[0][0] == board[1][1] && board[0][0] == board[2][2]){
            return true;
        }

        if (board[2][0] != " " && board[2][0] == board[1][1] && board[2][0] == board[0][2]){
            return true;
        }

        return false;
    }
}
