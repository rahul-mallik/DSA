package Assignment_01;

import java.util.Scanner;

public class HQ01 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the value of a , b and c: ");
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();

        if(a+b==c)
            System.out.println("a+b=c");
        else if (a==b-c)
            System.out.println("a=b-c");
        else if (a*b==c)
            System.out.println("a.b=c");
    }
}
