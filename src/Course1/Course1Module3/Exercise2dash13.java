package Course1.Course1Module3;
import java.util.Scanner;
public class Exercise2dash13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double amount;
        double rate = .05/12;
        int months = 6;

        System.out.print("Enter monthy saving amount: $");
        amount = input.nextDouble();

        double previous = 0;
        double amountChanged = 0;
        for (int i = 0; i < months; i++) {
            amountChanged = ((amount + previous) * (1 + rate));
            previous = amountChanged;
        }
        
        System.out.printf("After %d months, the account value is $%f", months, amountChanged);

        input.close();

    }
    
}
