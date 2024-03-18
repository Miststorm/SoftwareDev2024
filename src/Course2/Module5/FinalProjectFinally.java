package Course2.Module5;

import java.io.IOException;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javafx.geometry.Insets;
import javafx.scene.paint.Color;


public class FinalProjectFinally {

    

    public static int windowcount = 0;
    Random rand = new Random();
    boolean x = true;
    
    public static void main(String[] args) {
            String[] items = {"███████", "██████\n██", "████\n████", "████\n████", "██\n██████"};

            String[][] board = generateBoard();
            
            for (int l=0; l < board.length; l++) {
                for (int m=0; m < board[l].length; m++) {
                    System.out.print(board[l][m]);             
                }
                System.out.print("\n");
                
            }

            System.out.print("\u001B[33m");
            System.out.print("\033[4;2H");
            System.out.print(items[3]);
            System.out.print("\033[100;100H");
            
            

            //String board[][] = generateBoard();
            
    /*
            int location = rand.nextInt(15);
            int item = rand.nextInt(5);
            for (int i = 0; i < items[item].length; i++) {
                if (items[item][i] == "█") {
                    board[location] = "█";
                    location += 1;
                } else if (items[item][i] == "down") {
                    location -= 1;
                    location -= 10;
                } else if (items[item][i] == "back") {
                    location -= 2;
                }
            }
    */

    }
    
    public static String[][] generateBoard() {
        int boardWidth = 15;
        int boardHeight = 15;
        String[][] board=new String[boardHeight][boardWidth];
        for (int i = 0; i < boardHeight; i++ ) {
            for (int j = 0; j < boardWidth; j++) {
                board[i][j] = "██";
            }
        }
        return board;
    }
}
