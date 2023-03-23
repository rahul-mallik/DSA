package BinarySearch;

public class InfiniteSizeArray {
    // basically not using .length cuz its infinite array
    public static void main(String[] args) {

        int[] arr = {10,12,14,15,20,30,45};
        System.out.println(ans(arr,15));
    }

    static int ans(int[] arr,int target){
        int start =0;
        int end = 1;

        while(target>arr[end]){
            int newstart=end+1;
            end= end+(end-start+1)*2;
            start = newstart;
        }
        return BinarySearch(arr,target,start,end);
    }

    static int BinarySearch(int[] arr, int target,int start,int end){

        while(start<=end){
            int mid = start+(end-start)/2;

            if(target<arr[mid])
                end = mid-1;
            else if(target>arr[mid])
                start = mid+1;
            else
                return mid;
        }

        return -1;

    }
}
