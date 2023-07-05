package Assignment_06.QueueLinkedList;

import java.util.Scanner;

class Node{
    int info;
    Node next;
}

class Queue{
    Node front,rear;

    void insert(int ele){
        Node p = new Node();
        p.info = ele;
        p.next = null;

        if(front == null && rear == null)
            front = rear = p;
        else {
            rear.next = p;
            rear = p;
        }
    }

    void delete(){
        if (front == null && rear == null)
            System.out.println("UnderFlow");
        else if(front == rear)
            front = rear = null;
        else
            front = front.next;


    }


    void display(){
        Node p = front;
        System.out.println("Queue is: ");
        System.out.println("Front = "+front+"\nRear = "+rear);
        while(p!=null){
            System.out.println(p.info+" "+p.next);
            p = p.next;
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Queue qu = new Queue();

        while (true){
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
