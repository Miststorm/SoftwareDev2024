package src.Course2.Module5;
import java.util.Scanner;


public class Exercise8_9 {

    public static String[][] syncBoards(String gameBoard[][], int virtualBoard[][], int row, int column, int playerVal) {
        String strVal = "   ";
        
        if (column == 0) {
            column = 1;
        } else if (column == 1) {
            column = 3;
        } else if (column == 2) {
            column = 5;
        }

        if (row == 0) {
            row = 1;
        } else if (row == 1) {
            row = 3;
        } else if (row == 2) {
            row = 5;
        }


        if (playerVal == 1) {
            strVal = " O ";
        } else if (playerVal == 2) {
            strVal = " X ";
        }
        gameBoard[row][column] = strVal;

        return gameBoard;
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    public static void printBoard(String[][] gameBoard) {
        for (int i=0; i<gameBoard.length; i++) {
            System.out.print("\n");
            for (int j=0; j<gameBoard[i].length; j++){
                System.out.print(gameBoard[i][j]);
            }
        }
        System.out.print("\n");
        
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
        Scanner input = new Scanner(System.in);

        String[][] gameBoard = {{"-------------"}, {"|", "   ", "|", "   ", "|", "   ", "|"}, {"-------------"}, {"|", "   ", "|", "   ", "|", "   ", "|"}, {"-------------"}, {"|", "   ", "|", "   ", "|", "   ", "|"}, {"-------------"}};
        int[][] virtualBoard = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        
        boolean player1 = true;
        boolean player2 = false;

        printBoard(gameBoard);

        while (checkBoard(virtualBoard)) {
            if (player1) {
                while (true) {
                    int row = 4;
                    while (true) {
                        System.out.print("Player 1, enter row (0, 1, or 2) for O: ");
                        row = input.nextInt();
                        if (row <= 2 && row >= 0) {
                            break;
                        } else {
                            System.out.println("Not a valid Row, try again");
                        }
                    }
                    int column = 4;
                    while (true) {
                        System.out.print("Player 1, enter Column (0, 1, or 2) for O: ");
                        column = input.nextInt();
                        if (column <= 2 && column >= 0) {
                            break;
                        } else {
                            System.out.println("Not a valid Column, try again");
                        }
                    }
                
                if (virtualBoard[column][row] != 0) {
                    System.out.println("Board is Occupied in this spot, Try again.");
                    continue;
                }
                player1 = false;
                player2 = true;
                virtualBoard[column][row] = 1;
                gameBoard = syncBoards(gameBoard, virtualBoard, row, column, 1);
                break;
                }
            } else if (player2) {
                while (true) {
                    int row = 4;
                    while (true) {
                        System.out.print("Player 2, enter row (0, 1, or 2) for X: ");
                        row = input.nextInt();
                        if (row <= 2 && row >= 0) {
                            break;
                        } else {
                            System.out.println("Not a valid Row, try again");
                        }
                    }
                    int column = 4;
                    while (true) {
                        System.out.print("Player 2, enter Column (0, 1, or 2) for X: ");
                        column = input.nextInt();
                        if (column <= 2 && column >= 0) {
                            break;
                        } else {
                            System.out.println("Not a valid Column, try again");
                        }
                    }
                
                if (virtualBoard[column][row] != 0) {
                    System.out.println("Board is Occupied in this spot, Try again.");
                    continue;
                }
                player1 = true;
                player2 = false;
                virtualBoard[column][row] = 2;
                gameBoard = syncBoards(gameBoard, virtualBoard, row, column, 2);
                break;
                }
            }
        
            clearScreen();
            printBoard(gameBoard);
        }
        System.out.println("Game Over! Board is Full");
        


    }
}
