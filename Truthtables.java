public class Truthtables {
    public static void main(String[] args) {
        boolean A = false;
        boolean B = true;
        System.out.println(A ^ B);
    }
    /*
            A truth table is designed to give someone an understanding of how exactly a logical operation can work. This is especially useful with long logical equations. In order to use one, give each variable used in the operation, and make a row for every permutation of true and false values between said variable. Then make another column for the result, with the operation a the first row of the column, and the results of the operation for each row.





            1.


            A	!A

            T
                F

            F
                T


            2.

            A
                B
                A && B

            T	T
                T

            F	F
                F

            T
                F
                F

            F
                T
                F





            3.





            A	B	A || B
            T	T	T
            F	F	F
            T	F	T

            F	T	T





            4.




            A	B	A ^ B
            T	T	F

            F	F	F
            T	F	T

            F	T	T

     */
}
