package Course2.Module2;

import java.util.Scanner;

public class Printf_RealWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] boxes = {"flat", "small", "medium", "large"};
        double[] costs = {1, 2, 3.5, 6};

        System.out.println("Pick a box size by selecting 0, 1, 2, 3. (Flat, small, medium, and large respectively.)");

        System.out.print("Pick a size: ");
        int indexSize = input.nextInt();

        System.out.printf("You picked the %s box, which costs $%.2f", boxes[indexSize], costs[indexSize]);

        input.close();

    }
}
