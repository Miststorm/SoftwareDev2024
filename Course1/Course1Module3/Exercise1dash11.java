package Course1.Course1Module3;
import java.text.NumberFormat;
import java.util.Locale;
public class Exercise1dash11 {
    public static void main(String[] args) {
        //rate is: 1 person every 7 seconds. -1 person every 13 seconds. 1 person every 45 seconds
        NumberFormat format = NumberFormat.getInstance(Locale.US);
        
        int currentPopulation = 312032486;
        int secondsInYear = 31536000;

        int yearlyImmigrants = secondsInYear/45;
        int yearlyBirths = secondsInYear/7;
        int yearlyDeaths = -1 * (secondsInYear/13);

        int change = yearlyBirths + yearlyDeaths + yearlyImmigrants;
        
        System.out.println("Current Population: "  + format.format(currentPopulation));
        
        for (int i  = 1; i < 6; i++) {
            System.out.println("The population after year " + i + ": " + (format.format(currentPopulation + (change * i))));
        }

    }
    
}
