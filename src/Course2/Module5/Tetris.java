package Course2.Module5;
import java.lang.Thread;
import java.io.IOException;
import java.util.Arrays;

import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.gui2.*;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.swing.AWTTerminal;
import com.googlecode.lanterna.terminal.swing.AWTTerminalFontConfiguration;
import com.googlecode.lanterna.terminal.swing.SwingTerminal;
import com.googlecode.lanterna.terminal.swing.SwingTerminalFontConfiguration;

import javafx.scene.text.Font;

public class Tetris {
    public static int[][] gameboard = new int[20][15];
    
    public static void main(String[] args) throws IOException {
        //gameboard[20][12] = "%d219";
        // Setup terminal and screen layers
                    
        SwingTerminalFontConfiguration myConfiguration = SwingTerminalFontConfiguration.getDefaultOfSize(20);
        
        Terminal terminal = new DefaultTerminalFactory().setTerminalEmulatorFontConfiguration(myConfiguration).setInitialTerminalSize(new TerminalSize(30, 25)).setTerminalEmulatorTitle("Tetris!").createTerminal();
        
        
        TerminalScreen screen = new TerminalScreen(terminal);
        screen.startScreen();

        

        
        // Create panel to hold components
        Panel panel = new Panel();
        panel.setLayoutManager(new GridLayout(10));

        panel.addComponent(new Label(printNormal(gameboard)));
        
        
        // Create window to hold the panel
        BasicWindow window = new BasicWindow();
        window.setComponent(panel);
        // Create gui and start gui
        MultiWindowTextGUI gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.BLUE));
        gui.addWindowAndWait(window);


    } 

    //Print the Board
    
    public static String printNormal(int[][] board) {
        String result = "";
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                result += board[i][j];
            }
            result += "\n";
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
