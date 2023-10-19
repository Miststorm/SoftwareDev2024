package src.Course2.Module1;
import java.util.Random;
import java.util.Scanner;

public class IfStatements_RealWorld {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);


        int coinflip = rand.nextInt(2);

        System.out.print("\nThe computer is flipping a coin. Pick either 0 or 1: ");
        int userguess = scanner.nextInt();

        if (coinflip == userguess) {
            System.out.printf("You guessed correctly! You guessed %d and the computer guessed %d", userguess, coinflip);
        } else {
            System.out.printf("You were incorrect! You guessed %d and the computer guessed %d", userguess, coinflip);
        }

        scanner.close();
    }
}