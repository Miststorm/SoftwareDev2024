package src.Course2.Module2;
import java.util.Scanner;
public class Exercise4_10_plan {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Is your birthday in SetX?\n");
            System.out.print("setX");
            System.out.print("\nEnter n for No and y for Yes: ");
            char StringAns = input.next().charAt(1);
            if (StringAns == 'n' || StringAns == 'N') {
                int answer = 0;
            } else if (StringAns == 'y' || StringAns == 'Y') {
                int answer = 1;
            }


    }     
}
