import java.util.Scanner;

public class Hq02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter "+size+" numbers of elements in ascending order");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }

        System.out.println("Enter the element to search");
        int toSearch = in.nextInt();
        int index = BinarySearch(arr,0, arr.length-1,toSearch);
        if(index!=-1)
            System.out.println("The element "+toSearch+" is present at index "+index);
        else
            System.out.println("The element "+toSearch+" is not present in the array");
    }

    static int BinarySearch(int[] arr,int start,int end, int target){
        int mid = (start+end)/2;
        if(arr[mid] == target)
            return mid;
        else if (target<arr[mid] && target>arr[start])
            return BinarySearch(arr,start,mid-1,target);
        else if(target>arr[mid] && target<arr[end])
            return BinarySearch(arr,mid+1,end,target);

        return -1;

    }
}
