public class Simple_binarySearch_algo {
    public static void main(String[] args) {
        int[] arr = {2,3,6,10,11,14,15,18};
        System.out.println(BinarySearch(arr,15));
    }

    static int BinarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

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
