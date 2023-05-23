package Assignment_01;

import java.util.Scanner;

public class Q07 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter number of elements of Array: ");
        int size = in.nextInt();
        int[] arr = new int[size];

        input(arr);
        MaxFirst_MinLast_Occurrence(arr);
    }

    static void input(int[] arr){
        System.out.print("Enter the elements : ");
        for (int i = 0; i < arr.length ; i++) {
            arr[i]= in.nextInt();
        }
    }

    static void MaxFirst_MinLast_Occurrence(int[] arr){
        int maxEle = 0 , minEle = arr[0];
        for (int i = 0; i<arr.length ; i++) {
            if (maxEle<arr[i])
                maxEle = arr[i];
            else if (minEle>arr[i])
                minEle = arr[i];
        }

        int maxOcc = 0, minOcc = 0, max1stPos = 0, minLastPos = 0,position=1;
        for (int i = 0 ; i<arr.length; i++){
            if (maxEle==arr[i]) {
                maxOcc++;
                if (maxOcc==1)
                    max1stPos = position;
            }
            if(minEle==arr[i]) {
                minOcc++;
                minLastPos = position;
            }
            position++;
        }

        System.out.println("Maximum element of Array is "+maxEle+" and occurs "+maxOcc+" times.");
        System.out.println("Minimum element of Array is "+minEle+" and occurs "+minOcc+" times.");

        System.out.println("First occurrence of maximum element is at position "+max1stPos);
        System.out.println("Last occurrence of minimum element is at position "+minLastPos);
    }
}
/*
    OUTPUT
    Enter number of elements of Array: 5
    Enter the elements : 12 14 12 14 13
    Maximum element of Array is 14 and occurs 2 times.
    Minimum element of Array is 12 and occurs 2 times.
    First occurrence of maximum element is at position 2
    Last occurrence of minimum element is at position 3
*/
