package Course2.Module5;

import java.util.Scanner;

/*
Author: Jared Bishop 
Date: 10/13/23
*/

public class mod5Exam {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int user = 0;
		
		while (user != 1 && user != 2) {
			System.out.println("Which action would you like to perform?");
			System.out.println("\t1) Print Exam Grades");
			System.out.println("\t2) Track Attendance");
			System.out.print("Choose a menu item: ");

			user = input.nextInt();
		}
		
		if (user == 1) {
			printExam();
		}
		else {
			trackAtt();
		}
	}
	
	
	/*
	 * Accepts 25 scores and prints the average score and the number of A, B, C, D, and F.
	 *
	 * Example:
	 *     Input: 70.11 46.33 50.54 94.66 74.40 64.12 84.07 63.50 91.12 44.74 74.88 41.83 84.62 67.08 57.53 92.01 66.11 88.10 69.75 66.54 83.57 49.31 69.71 45.15 53.57
	 *
	 *     Output: 
	 *         Average score: 67.73%
	 *         Number of A's: 3
	 *  	   Number of B's: 4
	 *         Number of C's: 3
	 * 		   Number of D's: 7
	 *         Number of F's: 8
	 */
	public static void printExam() {
		
	}
	
	/*
	 * Display the number of days absent for the seating chart of a 5x5 classroom. 
	 * (Hint: Your array should reflect the classroom layout to be given points.)
	 *
	 * Example:
	 *     Input: 
	 *	       2 days
	 *	       0 0 1 0 0
	 *	       0 1 1 0 0
	 *	       0 0 0 0 0
	 *	       1 0 0 1 0
	 *	       0 0 0 0 0
	 *
	 *	       0 0 0 0 0
	 *	       0 1 0 0 0
	 *	       0 0 0 1 0
	 *	       1 0 0 0 0
	 *	       0 0 1 0 0 
	 *     Output: 
	 *         0 0 1 0 0
	 *         0 2 1 0 0
	 *  	   0 0 0 1 0
	 *         2 0 0 1 0
	 * 		   0 0 1 0 0
	 */
	public static void trackAtt() {
		Scanner input  = new Scanner(System.in);
		int att[][] = new int[5][5];
		int days = 0;
		
		// Ask how many days they would like to take attendance for
		System.out.print("\nHow many days would you like to enter? ");
		days = input.nextInt();
		
		System.out.println("This is the diagram of your seating chart. Enter attendance to match this chart.\n");
		System.out.println("	   Front of Room");
		System.out.println("|--------------------------------|");
		System.out.println("|  [ 1]  [ 2]  [ 3]  [ 4]  [ 5]  |");
		System.out.println("|  [ 6]  [ 7]  [ 8]  [ 9]  [10]  |");
		System.out.println("|  [11]  [12]  [13]  [14]  [15]  |");
		System.out.println("|  [16]  [17]  [18]  [19]  [20]  |");
		System.out.println("|  [21]  [22]  [23]  [24]  [25]  |");
		System.out.println("|________________________________|");
		
		//Enter in attendance for d days making sure the students' attendance is added into their location in the seating chart
		for (int d = 0; d < days; d++) {
            System.out.println("\nDay " + (d+1));
			for (int r = 0; r < att.length; r++) {
                System.out.print("Enter 5 numbers for row " + (r+1) + " (1 = absent, 0 = present): ");
                Scanner sysin  = new Scanner(System.in);
                String outVarString = sysin.nextLine();
                String [] outVarList = outVarString.split("");
                for (int i = 0; i < outVarString.length(); i++) {
                    att[r][i] = Integer.valueOf(outVarList[i]);
                }

			}

            System.out.println("\nDay " + (d+1) + " Attendance: ");
            System.out.println("|--------------------------------|");
            for (int j = 0; j < att.length; j++) {
                System.out.print("|  ");
                for (int g=0; g<att[j].length; g++) {
                    System.out.print("[ " + (att[j][g]) + "]  ");
                }
                System.out.println("|");
            }
            System.out.println("|________________________________|");
            
            System.out.println("\n\n");
		}
        		
	}
}