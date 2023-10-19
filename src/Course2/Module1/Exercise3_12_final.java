package src.Course2.Module1;
import java.util.Scanner;

public class Exercise3_12_final {

  
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter a 3 digit number: ");
            int number;
            number = input.nextInt();            

            if (number > 999) {
                System.out.println("\nThis isn't a 3 digit number. Try again\n");
                continue;
            }
            if (number < 100) {
                System.out.println("\nThis isn't a 3 digit number. Try again\n");
                continue;
            }

            String stringedNum=Integer.toString(number);

            String firstDigit = stringedNum.substring(0,1);
            String lastDigit = stringedNum.substring(2,3);
            
            int intdigit = Integer.parseInt(firstDigit);
            int secondintdigit = Integer.parseInt(lastDigit);

            input.close();
            if (intdigit == secondintdigit) {
                System.out.printf("%s is a palindrome", stringedNum);
                break;
            } else {
                System.out.printf("%s is not a palindrome", stringedNum);
                break;
            }
            
            

            

        }
    }
}
