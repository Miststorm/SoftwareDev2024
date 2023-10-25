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



public class Tetris {
    public static int[][] gameboard = new int[10][15];
    public static void main(String[] args) throws IOException {

        // Setup terminal and screen layers
        Terminal terminal = new DefaultTerminalFactory().createTerminal();
        Screen screen = new TerminalScreen(terminal);
        screen.startScreen();

        // Create panel to hold components
        Panel panel = new Panel();
        panel.setLayoutManager(new GridLayout(2));

        panel.addComponent(new Label("Forename"));
        panel.addComponent(new TextBox());

        panel.addComponent(new Label("Surname"));
        panel.addComponent(new TextBox());

        panel.addComponent(new EmptySpace(new TerminalSize(0,0))); // Empty space underneath labels
        panel.addComponent(new Button("Submit"));

        // Create window to hold the panel
        BasicWindow window = new BasicWindow();
        window.setComponent(panel);

        // Create gui and start gui
        MultiWindowTextGUI gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.BLUE));
        gui.addWindowAndWait(window);

    } 

    //Print the Board
    /*
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
*/
}
