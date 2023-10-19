package src.Course2.Module1;
import java.util.Random;
import java.util.Scanner;
public class Exercise3_17_final_withswitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("\nEnter a number. 0 is scissors, 1 is rock, and 2 is paper: ");
        int userinput = scanner.nextInt();

        int randomnum = rand.nextInt(3);


        switch(userinput) {
            case 0:
                if (randomnum == 0) {
                    System.out.println("Tie!");
                } else if (randomnum == 1) {
                    System.out.println("You lose!");
                } else if (randomnum == 2) {
                    System.out.println("You win!");
                }
                
                break;
            case 1:
                if (randomnum == 1) {
                    System.out.println("Tie!");
                } else if (randomnum == 0) {
                    System.out.println("You win!");
                } else if (randomnum == 2) {
                    System.out.println("You lose!");
                }

                break;
            case 2:
                if (randomnum == 2) {
                    System.out.println("Tie!");
                } else if (randomnum == 0) {
                    System.out.println("You lose!");
                } else if (randomnum == 1) {
                    System.out.println("You win!");
                }
                break;
        }

/* this seems to me to be a by far more efficient version....
        if (userinput < randomnum) {
            if (userinput == (randomnum - 1)) {
                System.out.println("you lose!");
            } else if (userinput == (randomnum - 2)) {
                System.out.println("you win!!");
            }
        }
        
        if (userinput > randomnum) {
            if (userinput == (randomnum + 1)) {
                System.out.println("you win!!");
            } else if (userinput == (randomnum + 2)) {
                System.out.println("you lose!");
            }
        }
*/
        System.out.println("Computer picked " + randomnum);
        scanner.close();

    }
}
