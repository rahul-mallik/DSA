import java.util.Scanner;

class Node{
    protected int regd_no;
    protected float mark;
    protected Node next;
}

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Node start = new Node();

        while(true){
            System.out.println("Options:" +
                    "\n0. Exit" +
                    "\n1. Create" +
                    "\n2. Display" +
                    "\n3. Insert Beginning"+
                    "\n4. Insert Any" +
                    "\n5. Insert End" +
                    "\n6. Delete Beginning" +
                    "\n7. Delete Any" +
                    "\n8. Delete End" +
                    "\n9. Count" +
                    "\n10. Sort" +
                    "\n11. Reverse" +
                    "\n12. Search");
            System.out.println("Enter Your choice: ");
            int ch = in.nextInt();
            switch (ch){
                case 0:
                    return;
                case 1:
                    create(start);
                    break;
                case 2:
                    display(start);
                    break;
                case 3:
                    start = insBeg(start);
                    break;
                case 4:
                    start = insAny(start);
                    break;
                case 5:
                    start = insEnd(start);
                    break;
                case 6:
                    start = delBeg(start);
                    break;
                case 7:
                    start = delAny(start);
                    break;
                case 8:
                    start = delEnd(start);
                    break;
                case 9:
                    System.out.println("Number of nodes in the Linkedlist is: "+count(start));
                    break;
                case 10:
                    start = sort(start);
                    break;
                case 11:
                    // will be uploaded soon
                case 12:
                    start = search(start);
                    // will be uploaded soon
                default:
                    System.out.println("Invalid Input choose between(0-12).....");

            }
        }


    }


    static void create(Node start) {
        System.out.println("Input Regd. No. and Marks: ");
        start.regd_no = in.nextInt();
        start.mark = in.nextFloat();
        start.next = null;
        Node p = start;

        System.out.print("Do you want to enter more Nodes(0/1): ");
        int ch = in.nextInt();
        while (ch != 0) {
            Node q = p;
            p = new Node();
            System.out.println("Input Regd. No. and Marks: ");
            p.regd_no = in.nextInt();
            p.mark = in.nextFloat();
            p.next = null;

            q.next = p;
            System.out.print("Do you want to enter more Nodes(0/1): ");
            ch = in.nextInt();
        }
    }


    static void display(Node start) {
        System.out.println("The linked list is: ");
        System.out.println("start = " + start);
        Node p = start;
        System.out.println("Regd No.    Marks    Reference ");
        while (p != null) {
            System.out.println("\t" + p.regd_no + "\t\t" + p.mark + "\t\t" + p.next);
            p = p.next;
        }
    }

    static int count(Node start) {
        int c = 0;
        Node p = start;
        while (p != null) {
            c++;
            p = p.next;
        }
        return c;
    }

    static Node insBeg(Node start) {
        Node newNode = new Node();
        System.out.println("Enter Regd.NO. and marks: ");
        newNode.regd_no = in.nextInt();
        newNode.mark = in.nextFloat();
        newNode.next = null;
        System.out.println("Node Successfully Inserted....");
        if (start == null) {
            start = newNode;
            return start;
        } else {
            newNode.next = start;
            return newNode;
        }
    }

    public static Node insEnd(Node start){
        Node p = new Node();
        System.out.println("Enter Regd No. and marks:  ");
        p.regd_no = in.nextInt();
        p.mark = in.nextFloat();
        p.next = null;
        System.out.println("Node Successfully Inserted....");
        if(start == null){
            start = p;
            return start;
        }else{
            Node q = start;
            while(q.next !=null){
                q = q.next;
            }
            q.next = p;
            return start;
        }
    }

    static Node insAny(Node start) {
        System.out.println("Enter the node Position: ");
        int pos = in.nextInt();

        int size = count(start);

        if(pos<1 || pos>size) {
            System.out.println("Invalid Node position..");
            return start;
        } else if (pos == 1 || start == null) {
            return insBeg(start);
        } else if (pos == size) {
            return insEnd(start);
        }else{
            Node q = start;
            int currentPos = 1;
            while(currentPos<pos-1){
                q = q.next;
                currentPos++;
            }
            Node p = new Node();
            System.out.println("Enter the regd no. and marks: ");
            p.regd_no = in.nextInt();
            p.mark = in.nextFloat();

            p.next = q.next;
            q.next = p;
            System.out.println("Node Successfully Inserted....");
            return start;
        }
    }

    static Node delBeg(Node start){
        if(start == null){
            System.out.println("Underflow.. LinkedList is empty");
            return start;
        }else{
            System.out.println("Node deleted...");
            start = start.next;
            return start;
        }
    }

    static Node delEnd(Node start){
        if(start == null){
            System.out.println("Underflow.. LinkedList is empty");
            return start;
        } else if (start.next == null) {
            start = null;
            return start;
        } else{
            Node q = start;
            while(q.next.next != null){
                q = q.next;
            }
            q.next = null;
            return start;
        }
    }

    static Node delAny(Node start){
        if(start == null){
            System.out.println("Underflow..");
            return start;
        } else if (start.next == null) {
            start = null;
            return start;
        }else{
            System.out.println("Enter the node Position: ");
            int pos = in.nextInt();

            int size = count(start);

            if(pos<1 || pos>size) {
                System.out.println("Invalid Node position..");
                return start;
            } else if (pos == 1) {
                return delBeg(start);
            } else if (pos == size) {
                return delEnd(start);
            }else{
                Node q = start;
                int currentPos = 1;
                while(currentPos<pos-1){
                    q = q.next;
                    currentPos++;
                }
                q.next = q.next.next;
                System.out.println("Node Successfully Deleted....");
                return start;
            }
        }
    }

    static Node sort(Node start){
        Node p = start;
        while(p.next!= null){
            if (p.regd_no > p.next.regd_no){
                int tempRegd = p.regd_no;
                float tempMarks = p.mark;
                p.regd_no = p.next.regd_no;
                p.mark = p.next.mark;

                p.next.regd_no = tempRegd;
                p.next.mark = tempMarks;
            }
        }

        return start;
    }

    static Node  search(Node start){
        Node p = start;
        System.out.print("Enter Regd no your searching for: ");
        int regd = in.nextInt();
        while(p !=null){
            if (p.regd_no == regd)
                return p;
            p = p.next;
        }
        return null;
    }

}


//2:240