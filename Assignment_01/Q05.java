package Assignment_01;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();

        System.out.println("Sum of digits of "+n+" until the number is a single digit is "+Sum_Of_Digits(n));

    }

    static int Sum_Of_Digits(int n){
        int sum=0;
        while(n>0){
            int digit = n%10;
            n/=10;
            sum += digit;
            if (n==0 && sum/10 !=0 ) {
                n = sum;
                sum = 0;
            }
        }

        return sum;
    }
}
