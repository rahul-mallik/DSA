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
        for (int Element: arr) {
            if (maxEle<Element)
                maxEle = Element;
            else if (minEle>Element)
                minEle = Element;
        }

        int maxOcc = 0, minOcc = 0, max1stPos = 0, minLastPos = 0,position=1;
        for (int ele : arr){
            if (maxEle==ele) {
                maxOcc++;
                if (max1stPos==0)
                    max1stPos = position;
            }
            if(minEle==ele) {
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
