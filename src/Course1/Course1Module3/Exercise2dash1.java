package Course1.Course1Module3;

import java.util.Scanner;

public class Exercise2dash1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double inputvar;

        System.out.print("\nEnter a degree in Celsius: ");
        inputvar = input.nextDouble();
        double convert = (9.0/5) * inputvar + 32;
        System.out.printf("%4.1f Celsius is %4.1f Fahrenheit\n\n", inputvar, convert);
        input.close();
    }

    
}
