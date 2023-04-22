package Assignment_01;

import java.util.Scanner;

public class Q09 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        double[][] arr =  new double[4][4];
        input(arr);
        System.out.println("Sum of the elements in the major diagonal is "+sumMajorDiagonal(arr));
    }
    static void input(double[][] arr){
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextDouble();
            }
        }
    }

    static double sumMajorDiagonal(double[][] m){
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum+=m[i][i];
        }
        return sum;
    }
}
