package Course2.Module1;
import java.util.Scanner;
public class tests {
    public static void main(String[] args) {
        boolean var1;
        boolean var2;
        for (int i = -1000000000; i < 1000000000; i++) {
            var1 = ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0));
            var2 = ( i % 4 == 0 && i % 100 != 0 || i % 400 == 0);
        
            if (var1 != var2) {
                System.out.println("The two are different when the year is " + i);
            }
        }
        
    }
}
