package Assignment_01;

import java.util.Scanner;

public class HQ02 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter the number of lines u want to have: ");
        int size = in.nextInt();
        in.nextLine();// to flush the enter or we can say the \n we put as input in the nextInt statement
        String[] lines = new String[size];
        standardInput(lines);
        standardOutput(lines);
    }

    static void standardOutput(String[] arr){
        System.out.println("Standard Output:");
        for (int i = arr.length-1; i >= 0 ; i--) {
            System.out.println(arr[i]);
        }
    }
    static void standardInput(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter your line: ");
            String k = in.nextLine();
            arr[i] = k;
        }
    }

}
/* 
    OUTPUT
    Enter the number of lines u want to have: 3
    Enter your line: Hello World
    Enter your line: AI will take over this world
    Enter your line: mera naam binod hai
    Standard Output:
    mera naam binod hai
    AI will take over this world
    Hello World
*/
