package Course2.Module3;

public class Exercise5_3Implementation {
    public static void main(String[] args) {
        double pounds;
        System.out.println("Kilograms      Pounds");
        for (int i = 1; i < 200; i++) {
            pounds = i * 2.2;
            System.out.printf("%d             %.1f\n", i, pounds);
        }
    }
}
