package src.Course2.Module5;

public class FinalProjectTetris {
    public static int[][] gameboard = new int[10][15];
    public static void main(String[] args) {
        
        boolean x = true;
        print(printNormal(gameboard));
        gameboard[0][0] = 1;
        while (true) {
            /*
            if (x) {
                
                x = false;
            } else if (!x) {
                gameboard[0][1] = 0;
                x = true;
            }
            */
            print(replacePrint(gameboard));
            try {
                Thread.sleep(5000);
              } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
              }
        
        }
        
        
    }

    //Print the Board
    public static String printNormal(int[][] board) {
        String result = "";
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                result += board[i][i];
            }
            result += "\n";
        }
        return result;
    }

    public static String replacePrint(int[][] board) {
        String result = "";
        
        for (int i = 0; i < board.length; i++) {
            result += "\r";
            for (int j = 0; j < board[i].length; j++) {
                result += board[i][i];
            }
        }
        return result;
    }

    //Syntax Simplification
    static void print(String text) {
        System.out.print(text);
    }

    //clear the screen
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
}
