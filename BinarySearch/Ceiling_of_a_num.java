package BinarySearch;

public class Ceiling_of_a_num {
    public static void main(String[] args) {
        int[] arr = {2,3,6,10,14,16,17,18};
        System.out.println(CeilingOfANumber(arr,19));
    }
    static int CeilingOfANumber(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        if (target>arr[end]){
            return -1;
        }
        while(start<=end){
            int mid = start + (end-start)/2;

            if (target<arr[mid])
                end = mid-1;
            else if (target>arr[mid])
                start = mid+1;
            else
                return mid;
        }
        return start;
    }
}