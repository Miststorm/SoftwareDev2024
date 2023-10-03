/*
I will need 4 variables. An integer variable for the number, and integer for the width,
a string variable of the number converted to a string, and a string variable for the value returned by the function.

I'm displaying 3 variables to the user. The integer number, because they pick it, the integer width, for the same reason, 
and the final formatted string at the end.

I will need to do very little math. All i'll need to do is repeat the code for the width minus the length of the number as a string.

As mentioned before, I will need to repeat the code for how many zeroes I need to add to the front of the number.

Though none of the code really *needs* to be in a method, I'm putting most of the actual code logic in it,
such as the for loop for adding zeroes, to simplify things.

This one seemed simple enough so I ended up just writing the whole thing instead of planning.
*/





package Course2.Module4;
import java.util.Scanner;

public class Exercise6_37planning {
    public static String format(int number, int width) {
        
        String stringNum = String.valueOf(number);
        String finalString = "";

        if (width > stringNum.length()){
            for(int i=0; i < (width - stringNum.length()); i++) {
                finalString += "0";
            }
            finalString += stringNum;
            return finalString;
        } else {
            return stringNum;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.print("Enter an integer for the width: ");
        int width = input.nextInt();
        System.out.printf("Your number is %s", format(number, width));

        input.close();
    }
}
