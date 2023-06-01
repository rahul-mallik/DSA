import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer[] integerArray = new Integer[5];
        Double[] doubleArray = new Double[5];

        System.out.println("Enter array elements");
        for (int i = 0; i < integerArray.length; i++) {
            integerArray[i] = in.nextInt();
        }
        System.out.println("Integer Array contains :");
        printArray(integerArray);

        System.out.println("\nEnter array elements");
        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = in.nextDouble();
        }
        System.out.println("Double Array contains :");
        printArray(doubleArray);
    }

    public static <E> void printArray(E[] inputArray){
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i]+ " ");
        }
    }
}
