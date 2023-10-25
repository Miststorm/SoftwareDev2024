package Course1.Course1Module3;

import java.util.Scanner;

public class Exercise2dash23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the driving distance: ");
        double dist = input.nextFloat();

        System.out.print("Enter the miles per gallon: ");
        double miles = input.nextFloat();

        System.out.print("Enter the price per gallon: ");
        double price = input.nextFloat();

        double cost = ((dist/miles) * price);
        System.out.printf("The cost of driving is $%.2f", cost);



        input.close();
    }
}
