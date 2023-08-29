package Course2.Module1;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercise3_12_final {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.println("Welcome to the palindrome checker!!\n");
            System.out.print("Please enter a 3 digit number: ");
            boolean x = false;

            try {
                int number = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("This isn't an integer. Enter your number with not letters, spaces, or special characters\n");
                x = true;
            }
            // if (x) {
            //     continue;
            // }
            
            if (number > 999) {
                System.out.println("This isn't a 3 digit number. Try again\n");
                continue;
            }
            if (number < 100) {
                System.out.println("This isn't a 3 digit number. Try again\n");
                continue;
            }

            System.out.println("Hi!!");

        }
    }
}
/*
 * while true:


     print("please enter a  3 digit number")

     int number = promptfornumber

     if number < 999:


          start loop over


     if number < 100:


          start loop over


     if number < 0:

          number = (number * -1)





     break loop

Convert int number to string


get first digit in number: String firstdigit = number.substring(0, 1)

get last digit in number: String lastdigit = number.substring(2,3)


if firstdigit == lastdigit:


  print("Is a palindrome")


else:


  print("is not a palindrome")


 */