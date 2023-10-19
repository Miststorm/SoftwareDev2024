package src.Course2.Module4;

import java.util.Scanner;

public class Methods_RealWorld {
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
