package src.Course2.Module3;

public class Exercise5_11Implementation {
    public static void main(String[] args) {

        int max =  200;
        int min = 100;

        System.out.printf("\nCounting from %d-%d\n", min, max);
        System.out.println("Divisible by 5 or 6, but not 5 and 6");
        System.out.println("-----------------------------------------------");

        int x = 0;
        for (int i = min; i < max; i++) {
            if ((i%5 == 0) ^ (i%6 == 0)) {
                System.out.print(" " + i);
                x ++;
                if (x >= 10){
                    x = 0;
                    System.out.print('\n');
                }
            }
            if (i >= (max - 1)) {
                System.out.print("\n\n");
            }
        }
    }
}