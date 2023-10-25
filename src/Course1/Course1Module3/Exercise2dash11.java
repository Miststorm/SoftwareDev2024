package Course1.Course1Module3;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class Exercise2dash11 {
    public static void main(String[] args) {
        //rate is: 1 person every 7 seconds. -1 person every 13 seconds. 1 person every 45 seconds
        NumberFormat format = NumberFormat.getInstance(Locale.US);
        Scanner input = new Scanner(System.in);
        int currentPopulation = 312032486;
        int secondsInYear = 31536000;

        int yearlyImmigrants = secondsInYear/45;
        int yearlyBirths = secondsInYear/7;
        int yearlyDeaths = -1 * (secondsInYear/13);

        int change = yearlyBirths + yearlyDeaths + yearlyImmigrants;

        System.out.print("\nEnter the number of years for population growth: ");
        int i = input.nextInt();

        System.out.println("\nCurrent Population: "  + format.format(currentPopulation));
        System.out.println("The population after year " + i + ": " + (format.format(currentPopulation + (change * i))) + "\n");

        input.close();
    }
    
}
