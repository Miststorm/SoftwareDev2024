package Course2.Module5;

public class Exercise8_9 {
    public static void printBoard(String[][] gameBoard) {
        for (int i=0; i<gameBoard.length; i++) {
            System.out.print("\n");
            for (int j=0; j<gameBoard[i].length; j++){
                System.out.print(gameBoard[i][j]);
            }
        }
        
    }

    public static boolean checkBoard(int[][] virtualBoard) {
        boolean x; 
        for (int i = 0; i < virtualBoard.length; i++) {
            for (int j = 0; j < virtualBoard[i].length; j++) {
                if (virtualBoard[i][j] == 0) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String[][] gameBoard = {{"-------------"}, {"|", "   ", "|", "   ", "|", "   ", "|"}, {"-------------"}, {"|", "   ", "|", "   ", "|", "   ", "|"}, {"-------------"}, {"|", "   ", "|", "   ", "|", "   ", "|"}, {"-------------"}};
        int[][] virtualBoard = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        
        while (checkBoard(virtualBoard)) {
            //ADD STUFF HERE!!
        }
    }
}
