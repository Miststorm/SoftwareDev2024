package Course1Module1;
public class CatchingErrors {
    //Some test code
    public static void main (String[] args) {
        int credits = 49;
        double gpa = 2.0;
        System.out.println((credits < 30) || ((credits <= 60) && (gpa < 2.0)));
    }
}

/*
1.  (age < 6) || (age > 60)

2. (grade == 'A') || (grade == 'B')


3. (40 <= speed) && (speed <=70)


4. (speed >= 40) && (speed <= 70)


5. !(age > 12) && !(age < 20)

6. (credits >= 90) && (grade == 'A' || grade == 'B')


7. (credits < 30) || ((credits <= 60) && (gpa < 2.0))





Next Section:

1. (((year % 4 == 0) && !(year % 100 == 0)) || ((year % 400 == 0) && !(year % 3200 == 0)))

2. ((A + B) > C) && ((A + C) > B) && ((B + C) > A)

3. (A == B) && (B == C)

4. (((A * A) + (B * B)) == (C * C)) || (((A * A) + (C * C)) == (B * B)) || (((B * B) + (C * C)) == (A * A))

5. (A == B) || (B == C) || (A == C)

6. (A != B) && (B != C) && (A != C)
 */