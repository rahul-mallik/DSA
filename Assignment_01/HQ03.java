package Assignment_01;

import java.util.Scanner;

public class HQ03 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the length of the array: ");
        int length = in.nextInt();
        int[] a = new int[length];
        int[] b = new int[length];
        int[] c = new int[length];
        System.out.println("Enter the values in Array a :");
        input(a);
        System.out.println("Enter the values in Array b :");
        input(b);
        dotProduct(a,b,c);

        System.out.println("The dot Product of Array a and b is: ");
        show(c);
    }

    static void input(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]= in.nextInt();
        }
    }


    static void dotProduct(int[] arr1,int[] arr2, int[] result){
        for (int i = 0; i < arr1.length; i++) {
            result[i]=arr1[i]*arr2[i];
        }
    }

    static void show(int[] arr){
        for (int ele : arr) {
            System.out.print(ele+" ");
        }
    }
}
/*
    OUTPUT
    Enter the length of the array: 5
    Enter the values in Array a :
    1 2 3 4 5
    Enter the values in Array b :
    1 2 3 4 5
    The dot Product of Array a and b is: 
    1 4 9 16 25 
*/
