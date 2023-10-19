package src.Course2.Module5;

import java.util.Arrays;

public class multiDimensionalArrays_real_world {
    public static double[][] addMatrix(double[][] a, double [][] b) {
        double[][] c = {{0,0,0},{0,0,0},{0,0,0}};
        for (int i=0; i < a.length; i++) {
            for (int j=0; j < a[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }
    public static void main(String[] args) {
        double[][] a = {{0,2,0},{2,1,59},{4,2,5}};
        double[][] b = {{1,5,6},{7,684,2},{9,1,7}};
        System.out.println(Arrays.deepToString(addMatrix(a, b)));
    }
}
