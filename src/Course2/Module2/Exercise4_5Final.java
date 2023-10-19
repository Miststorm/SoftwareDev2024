package src.Course2.Module2;
import java.util.Scanner;
import java.lang.Math;
public class Exercise4_5Final {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the prompted information for a regular polygon.");
        System.out.print("Enter the number of sides: ");
        int sides = input.nextInt();
        System.out.print("Enter the length of the sides: ");
        double sidelength = input.nextDouble();

        double area = ((sides * (sidelength * sidelength))/( 4 * Math.tan(Math.PI/sides)));
        System.out.println("The area of the regular polygon is: " + area);

        input.close();
    }

}