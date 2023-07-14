package Assignment_06.QueueArray;

import java.util.Scanner;

class Queue{
    final int max = 5;
    int front,rear;
    int[] queue;

    public Queue() {
        queue = new int[max];
        front = rear = -1;
    }

    void insert(int ele){
        if(rear == max-1)
            System.out.println("Overflow");
        else if (front == -1 && rear == -1)
            front = rear = 0;
        else
            rear++;
        queue[rear] = ele;
    }

    void delete(){
        if(front == -1 && rear == -1)
            System.out.println("Underflow");
        else if (front == rear)
            front = rear = -1;
        else
            front++;

    }

    void display(){
        System.out.println("Queue is: ");
        for (int i = front; i <= rear ; i++)
            System.out.print(queue[i]+" ");
        System.out.println("\nfront= "+front+"\nrear= "+rear);
    }
}

public class Test {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Queue qu = new Queue();

        while(true){
            System.out.println("0: exit" +
                    "\n1: display" +
                    "\n2: insert" +
                    "\n3: delete");
            System.out.println("Enter your choice: ");
            int ch = in.nextInt();

            switch (ch){
                case 0:
                    return;
                case 1:
                    qu.display();
                    break;
                case 2:
                    System.out.println("Enter an element to insert: ");
                    int ele = in.nextInt();
                    qu.insert(ele);
                    break;
                case 3:
                    qu.delete();
                    break;
                default:
                    System.out.println("Invalid Input");

            }
        }
    }
}
