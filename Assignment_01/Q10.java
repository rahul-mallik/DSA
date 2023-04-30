package Assignment_01;

import java.util.Scanner;

public class Q10 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        double[][] arr =  new double[3][4];
        input(arr);
        for (int i = 0; i < arr[0].length; i++) {
            System.out.println("Sum of the elements at column "+i+" is "+sumColumn(arr,i));
        }

    }

    public static void input(double[][] arr){
        System.out.println("Enter a 3-by-4 matrix row by row:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=in.nextDouble();
            }
        }
    }

    public static double sumColumn(double[][] m, int columnIndex){
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum+=m[i][columnIndex];
        }
        return sum;
        //hello
    }
}
/*
    OUTPUT
    Enter a 3-by-4 matrix row by row:
    1 2 3 4
    1 2 3 4
    1 2 3 4
    Sum of the elements at column 0 is 3.0
    Sum of the elements at column 1 is 6.0
    Sum of the elements at column 2 is 9.0
    Sum of the elements at column 3 is 12.0
*/
