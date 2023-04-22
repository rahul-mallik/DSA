package Assignment_01;

import java.util.Scanner;

public class Q03 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the value of N: ");
        int N = in.nextInt();

        if (Spy(N))
            System.out.println(N+" is a spy number.");
    }

    static boolean Spy(int n){
        int sum = 0, product = 1;

        while(n>0){
            int r = n%10;
            n/=10;
            sum += r;
            product *= r;
        }

        return (sum==product);
    }
}
