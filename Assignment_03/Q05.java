import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer[] array = new Integer[5];

        System.out.println("Enter array elements ");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        System.out.println("Enter the element to search");
        Integer n = in.nextInt();

        System.out.println("Number of times "+n+" present in the array is "+count(array,n));
    }

    public static <T> int count(T[] array, T item){
        int counter=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==item)
                counter++;
        }
        return counter;
    }
}
