package Assignment_05.StackArray;

import Assignment_05.StackArray.Stack;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack stack1 = new Stack();
        while (true){
            System.out.println("0: Exit" +
                    "\n1: Display" +
                    "\n2: Push" +
                    "\n3: Pop" );

            System.out.println("Enter your choice: ");
            int ch = in.nextInt();

            switch (ch){
                case 0:
                    return;
                case 1:
                    stack1.display();
                    break;
                case 2:
                    System.out.println("Enter an element to push into stack: ");
                    int ele = in.nextInt();
                    stack1.push(ele);
                    break;
                case 3:
                    stack1.pop();
                default:
                    System.out.println("Invalid input...");
            }
        }
    }
}
