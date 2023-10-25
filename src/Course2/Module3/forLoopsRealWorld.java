package Course2.Module3;
import java.util.Scanner;
public class forLoopsRealWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double amount;
        double rate;
        int months;

        System.out.print("Enter an annual interest rate (in percent): ");
        rate = (input.nextDouble() * .01)/12;
        System.out.print("Enter an amount of months: ");
        months = input.nextInt();
        System.out.print("Enter monthly saving amount: $");
        amount = input.nextDouble();

        double previous = 0;
        double amountChanged = 0;
        for (int i = 0; i < months; i++) {
            amountChanged = ((amount + previous) * (1 + rate));
            previous = amountChanged;
        }
        
        System.out.printf("After %d months, the account value is $%.2f", months, amountChanged);

        input.close();
    }
}
