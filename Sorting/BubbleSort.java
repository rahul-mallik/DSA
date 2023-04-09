package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubblesort(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {swapped  = false;
            for (int j = 1; j < arr.length-i; j++) {
                // if the previous element is greater than the current then it will be swapped
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]=temp;

                    swapped = true;
                }
            }
            /* if in any of pass the values are not swapped then swapped=false that means
            if there is no swapping being done then we can say the array is sorted and no
            more comparisons are to be made, so we will break the loop
             */

            if (!swapped)
                break;

            /* this can also be written as if(swapper == false)
            when the elements are not swapped !swapped is !false == true, if part will be executed
            when the elements are swapped !swapped is !true == false, if part will not be executed
             */
        }
    }
}
