package Assignment_05.StackLinkedList;

public class Stack {
    Node top;

    void push(int ele){
        Node p = new Node();
        p.info = ele;
        p.next = top;
        top=p;
    }

    void pop(){
        if(top==null)
            System.out.println("UnderFlow");
        else
            top = top.next;
    }

    void display(){
        System.out.println("The Stack is");
        System.out.println("Top = "+top);
        Node p =top;
        while(p!=null){
            System.out.println(p.info+" "+p.next);
            p = p.next;
        }
    }

}
