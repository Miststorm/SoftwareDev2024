package src.Course2.Module2;

/*
Author: Jared Bishop
Date: 9/19/23

Sample input/output:
	pckType = "env",   aCost = $0.00
	pckType = "sBox",  aCost = $3.00
	pckType = "mBox",  aCost = $10.00
	pckType = "lBox",  aCost = $15.00
*/

public class Module2ExamPt2v1 {
    public static void main(String[] args) {
        String pckType = "sBox" ; //semicolon fix
		double aCost = 0.0;
		
		//Fixed the switch statement. The cases should have had breaks.
		switch(pckType) {
			// The first case is optional
			case "env":
				aCost = 0;
				break;
			case "sBox":
				aCost = 3;
				break;
			case "mBox":
				aCost = 10;
				break;
			case "lBox":
				aCost = 15;
				break;
        } //switch fix. Statement not closed.
		System.out.printf("The package type %s costs an additional $%.2f.",pckType, aCost); //fixed printf formatting
    }
}
