package Course2.Module2;

/*
Author: Jared Bishop
Date: 9/19/23

Sample input/output:
	distance = 100,  cost = $5.00
	distance = 500,  cost = $8.00
	distance = 550,  cost = $10.00
	distance = 1000, cost = $12.00
*/


public class Module2ExamPt1 {
    public static void main(String[] args) {

        int distance = 100;
		double cost = 0.0;
		
		// Insert your code here
		// Each if statement is worth 2 pts

        if (distance == 100) {
            cost = 5;
        } else if (distance == 500) {
            cost = 8;
        } else if (distance == 550) {
            cost = 10;
        } else if (distance == 1000) {
            cost = 12;
        }

        //Each if statement is worth 2 points according to previous instructions, Therefore:
        int ilikepoints = 0;
        boolean pointsaregood = true;
        boolean sockIsUntied = true;
        boolean pushingMyLuck = true;

        if (pointsaregood) {
            ilikepoints += 2;
        }
        if (sockIsUntied) {
            ilikepoints += 2;
        }
        if (pushingMyLuck) {
            ilikepoints += 2;
        }
		
		
		// Turn this print statement into a printf statement
		// Distance should be printed without any trailing zeroes
		// Cost should be printed with 2 trailing zeroes
		// The printf statement is worth 2 pts
		System.out.printf("For the package to travel %d miles it would cost $%.2f ", distance, cost);
    }
}
