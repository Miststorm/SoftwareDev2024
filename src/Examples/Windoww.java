package Examples;

import java.io.IOException;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import javafx.scene.text.Font;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Insets;

public class Windoww extends JFrame{

    
    public static int windowcount = 0;
        public Windoww() {
        super("Tetris!");
        setBackground(Color.BLACK);
        getContentPane().setBackground(Color.BLACK);
        setLocation(50, 50);
        setSize(325, 600);
        setVisible(true);



        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, -5, -5));
        

        float size = 28;
        String board[] = generateBoard();
        
        for (int l=0; l < board.length; l++) {
            JLabel label = new JLabel(board[l]);
            label.setFont(label.getFont().deriveFont(size));
            label.setForeground(Color.GRAY);
            label.setBorder(new EmptyBorder(new Insets(-5, -5, -5, -5)));
            panel.add(label);
            
        }
        add(panel);
        
        

    }
    
    public static void main(String[] args) throws IOException {
        JavaW.run("Windoww");
        new Windoww();
    }

    public static String[] generateBoard() {
        int boardWidth = 10;
        int boardHeight = 15;
        String[] board=new String[boardHeight];
        for (int i = 0; i < boardHeight; i++ ) {
            board[i] = "";
            for (int j = 0; j < boardWidth; j++) {
                board[i] += "█";
            }
        }
        return board;
    }
}
