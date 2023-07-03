package Assignment_05.StackArray;

public class Stack {
    final int max = 5;
    int stack[];
    static int top;

    Stack() {
        stack = new int[max];
        top=-1;
    }

    void push(int ele){
        if(top==max-1)
            System.out.println("OverFlow");
        else {
            top++;
            stack[top] = ele;
        }
    }

    void pop(){
        if(top==-1)
            System.out.println("UnderFlow");
        else
            top--;
    }

    void display(){
        System.out.println("Stack is: ");
        for (int i = top; i >= 0 ; i--)
            System.out.print(stack[i]+" ");
        System.out.println("\nTop= "+top);
    }
}
