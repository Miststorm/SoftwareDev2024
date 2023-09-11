package Course2.Module2;
import java.util.Scanner;

public class TypeCastingAssignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a float: ");
        double floatvar = input.nextDouble();
        int converted =  (int)floatvar;
        System.out.println("Converted Variable: " + converted);

    }
}
