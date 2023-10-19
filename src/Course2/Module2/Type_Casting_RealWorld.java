package src.Course2.Module2;

public class Type_Casting_RealWorld {
    public static void main(String[] args) {
        double jane = 12.5;
        System.out.printf("Jane has lived in Cedar city for %.2f years", jane);
        double mark = 10.333333333;
        System.out.printf("\nMark has lived in Cedar City for %.2f years", mark);

        int intJane = (int) jane;
        int intMark = (int) mark;
        int both = intJane + intMark;

        System.out.printf("\nAdded, they've lived there for %d years", both);
    }
}
