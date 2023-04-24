package Assignment_01;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = in.nextInt();

        System.out.println(n+" is Odd: "+isOdd(n));
    }

    static boolean isOdd(int n){
        return ((1&n) == 1);
    }
}
/*
    OUTPUT
    Enter a number : 57
    57 is Odd: true

*/
