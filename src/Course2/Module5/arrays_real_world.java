package Course2.Module5;

import java.util.Scanner;

public class arrays_real_world {
    public static double min(double[] array) {
        int lowest = 0;
        for (int i=0; i < array.length; i++) {
            if (array[i] < array[lowest]) {
                lowest = i;
            }
        }
        return array[lowest];     
    }
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 Numbers");
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d: ", i + 1);
            array[i] = input.nextDouble();
        }
        System.out.printf("The minimum value is %.2f", min(array));
        
    }    
}
