package src.Course2.Module3;
import java.util.Scanner;
public class WhileLoopsRealWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String usrInput;
        double floatedInput;
        double AddedNums = 0;
        int x = 0;
        while (true) {
            System.out.print("Enter a number. To stop entering numbers, press n: ");
            usrInput = input.nextLine();

            if (!(usrInput.equals("n"))) {
                floatedInput = Float.parseFloat(usrInput);
                if (floatedInput == 0) {
                    System.out.println("ignored");
                    continue;
                }
                System.out.println("Added\n");
            } else if (x > 0) {
                System.out.println("\nOkay, Stopping.\n");
                break;
            } else {
                System.out.println("Please enter at least one number");
                continue;
            }
            AddedNums += floatedInput;
            x += 1;
        }
        double average = AddedNums / x;
        System.out.printf("The average was %.2f", average);
        input.close();
    }
}
