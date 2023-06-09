package Assignment_01;

import java.util.Scanner;

public class HQ04 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the size of the two square matrices: ");
        int size = in.nextInt();

        double[][] matrix1 = new double[size][size];
        setValues(matrix1);
        double[][] matrix2 = new double[size][size];
        setValues(matrix2);
        
        System.out.println("The sum of two Matrices are:");
        double [][] sumOfMatices = addMatrix(matrix1,matrix2);
        display(sumOfMatices);
    }

    public static void setValues(double[][] arr){
        System.out.println("Enter the values according to "+arr.length+"X"+arr.length+" matrix: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = in.nextDouble();
            }
        }
    }
    public static void display(double[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static double[][] addMatrix(double[][] a, double[][] b){
        double[][] tempArr = new double[a.length][a.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                tempArr[i][j]=a[i][j]+b[i][j];
            }
        }

        return tempArr;
    }
}
/*
    OUTPUT
    Enter the size of the two square matrices: 3
    Enter the values according to 3X3 matrix: 
    1 2 3
    1 2 3
    1 2 3
    Enter the values according to 3X3 matrix: 
    1 1 1
    2 2 2
    3 3 3
    The sum of two Matrices are:
    2.0 3.0 4.0 
    3.0 4.0 5.0 
    4.0 5.0 6.0
*/
