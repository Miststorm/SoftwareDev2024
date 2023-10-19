package src.Course1.Course1Module1;
public class moreOperators {
    public static void main(String[] args) {
        int x = -2;
        int y = 5;
        int z = 0;
        int t = -4;

        System.out.println(x + y < z + 1);
        System.out.println(x - 2 * y + y < z * 2 / 3);
        System.out.println(3 * y / 4 < 8 && y >= 4);
        System.out.println(t > 5 || z < 2);
        System.out.println(x * y < 10 || y * z < 10);
        System.out.println((y + 2) / 3 > 3 && t < 0);
        System.out.println(x * 3 > 0 || y + 5 / t < 2);
        System.out.println(!(x > 0));
        System.out.println(!(x * t < 10) || y / x * 4 < y * 2);
        System.out.println(t > 5 || z < (y + 5) && y < 3);
        System.out.println(!(4 + 5 * y >= z - 4) && (z - 2 < 7));

        /*
        1. false
        2. true
        3. true
        4. true
        5. true
        6. false
        7. false
        8. true
        9. true
        10. false
        11. false

        Next Section:

        1. m < 100

        2. n > 0 && n > m

        3. m >= 5 && m <= 10

        4. k < 1 || k > 2

        5. j < 0 && k < 0

        6. i % 2 == 0

         */
    }
}
