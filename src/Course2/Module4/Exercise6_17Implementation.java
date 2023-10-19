package src.Course2.Module4;
import java.util.Random;
import java.util.Scanner;
public class Exercise6_17Implementation {
    public static void printMatrix(int n, Random rand) {
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++) {
                System.out.print(rand.nextInt(2) + "  ");
            }
            System.out.print("\n");
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter n: ");
        int n = input.nextInt();
        printMatrix(n, rand);
        input.close();

    }
}
