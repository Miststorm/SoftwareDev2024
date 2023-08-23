package Course1Module1;
public class operators {
    public static void main(String[] args) {
        int num = 17 / 2 + 4;
        double var1 = 17 / 2 + 4;
        //int num1 = 17 / 2.0 + 4;
        double var2 = 17 / 2.0 + 4;
        int num2 = 11 % 6 / 2 - 1;
        double var3 = 11 % 6 / 2.0 - 1;
        int num3 = 3 - (5 + 10 / (2 * 2));
        double var4 = 3 - (5 + 10 / (2 * 3.0));

        //double var5 = 4.5 * (5 - 3);
        //int num4 = var5;

        int num5 = 15 / 2 % 3 - 1; 
        int num6 = 7 * 2 - 5 / 3;
        double var6 = num6;

        System.out.println("1. " + num);
        System.out.println("2. " + var1);
        System.out.println("3 fails");
        System.out.println("4. " + var2);
        System.out.println("5. " + num2);
        System.out.println("6. " + var3);
        System.out.println("7. " + num3);
        System.out.println("8. " + var4);
        System.out.println("9. fails");
        System.out.println("10. " + num5);
        System.out.println("11. " + var6);

        /* FINAL ASSIGNMENT:
            1. 12
            2. 12.0
            3. This fails because of a conversion error because there's a decimal in an int variable. The error is: "Type Mismatch: cannot convert from double to int".


            4. 12.5
            5. 1
            6. 1.5
            7. -4
            8. -3.666666666666667
            9. This fails because of another conversion error. You can't convert from an double to an int, because ints don't like the decimals. The error is: "Type Mismatch: cannot convert from double to int".


            10. 0
            11. 13.0
            */

    }
}