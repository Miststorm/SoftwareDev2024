package src.Course1.Course1Module3;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;

public class Exercise1dash14 {

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDateTime now = LocalDateTime.now();

        String name = "Jared Bishop";
        String date = dtf.format(now);
        String course = "CSCI 1162 - Development Fundamentals";
        
        System.out.println("");
        System.out.println("Name: " + name);
        System.out.println("Date: " + date);
        System.out.println("Course: " + course);
        System.out.println("");
        
    }   
}