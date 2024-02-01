package Examples;

import java.io.IOException;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import com.googlecode.lanterna.gui2.GridLayout;

import javafx.scene.text.Font;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Frame;
import java.util.Random;

import layout.TableLayout;

public class Windoww {

    String[][] items = {{"█", "█", "█", "█"}, {"█", "█", "█", "down", "█"}, {"█", "█", "down", "█", "█"}, {"█", "█", "down", "back", "█", "█"}, {"█", "down", "back", "█", "█", "█"} };

    public static int windowcount = 0;
    Random rand = new Random();
    boolean x = true;
    
    public Windoww() {
    
            JFrame frame = new JFrame();
            frame.setBounds(100,100,300,300);
            double sizeVar[][] = {{0.25, 0.25, 0.25, 0.25}, {50, TableLayout.FILL, 40, 40, 40}};
        
            String[][] board = generateBoard();
            
            
            frame.setLayout(new TableLayout(sizeVar));
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


            for (int l=0; l < board.length; l++) {
                JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, -2, 0));
                for (int m=0; m < board[l].length; m++) {
                    
                    JLabel label = new JLabel(board[l][m]);
                    label.setForeground(Color.GRAY);
                    label.setBorder(new EmptyBorder(new Insets(0, 0, 0, 0)));
                    panel.add(label);
                }
                String stringl = Integer.toString(l);
                frame.add(panel, "0, " + stringl);
            }

            
            
            
            frame.setVisible(true);

            float size = 28;

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
    public static void main(String[] args) throws IOException {
        JavaW.run("Windoww");
        new Windoww();
    }

    public static String[][] generateBoard() {
        int boardWidth = 15;
        int boardHeight = 15;
        String[][] board=new String[boardHeight][boardWidth];
        for (int i = 0; i < boardHeight; i++ ) {
            for (int j = 0; j < boardWidth; j++) {
                board[i][j] = "█";
            }
        }
        return board;
    }
}
