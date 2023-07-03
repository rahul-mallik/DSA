package Assignment_05.StackLinkedList;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack stk = new Stack();
        while (true){
            System.out.println("0: Exit" +
                    "\n1: Display" +
                    "\n2: Push" +
                    "\n3: Pop");
            System.out.println("Enter your choice: ");
            int ch = in.nextInt();

            switch (ch){
                case 0:
                    return;
                case 1:
                    stk.display();
                    break;
                case 2:
                    System.out.println("Enter an element to push: ");
                    int ele = in.nextInt();
                    stk.push(ele);
                    break;
                case 3:
                    stk.pop();
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}
