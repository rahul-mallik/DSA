package Assignment_01;

import java.util.Scanner;

public class Q08 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter number of Row and Columns of 2D-Array: ");
        int row = in.nextInt(), column = in.nextInt();
        int[][] arr = new int[row][column];

        input(arr);
        display(arr);
    }

    static void input(int[][] arr){
        System.out.println("Enter the element of the 2D Array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
    }

    static void display(int[][] arr){
        int sum = 0 ;
        System.out.println("The elements of 2D array are: ");
        for (int i = 0; i<arr.length ; i++) {
            for (int j = 0; j<arr[i].length ; j++){
                sum+=arr[i][j];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The sum of elements of the 2D-Array is "+sum);
    }
}
/*
    OUTPUT
    Enter number of Row and Columns of 2D-Array: 2 3
    Enter the element of the 2D Array: 
    1 2 3
    1 2 3
    The elements of 2D array are: 
    1 2 3 
    1 2 3 
    The sum of elements of the 2D-Array is 12
*/
