public class Order_agnostic {
    public static void main(String[] args) {
//        int[] arr = {2,3,6,10,11,14,15,18};
        int[] arr= {18,15,14,11,10,6,3,2};
        System.out.println(OrderAgnosticBS(arr,15));
    }
    static int OrderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start]<arr[end];
        while(start<=end){
            int mid = start +(end-start)/2;

            if(arr[mid]==target)
                return mid;

            if (isAsc){
                if (target<arr[mid])
                    end = mid-1;
                else if (target>arr[mid])
                    start = mid+1;
            }else {
                if (target<arr[mid])
                    start = mid+1;
                else if (target>arr[mid])
                    end = mid-1;
            }
        }
        return -1;
    }
}
