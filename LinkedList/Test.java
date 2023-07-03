package LinkedList;

import java.util.Scanner;

class Node{
    int regdNo;
    float marks;
    Node next;
}

class LinkedList{
    Node start;
    Scanner in = new Scanner(System.in);

    void create(){
        Node p = new Node();
        System.out.println("Enter regd no. and marks: ");
        p.regdNo = in.nextInt();
        p.marks = in.nextFloat();
        p.next = null;
        start = p;

        System.out.println("Do u want to enter more nodes(0/1): ");
        int ch = in.nextInt();
        while (ch!=0){
            Node q = p;
            p = new Node();
            System.out.println("Enter regd no. and marks: ");
            p.regdNo = in.nextInt();
            p.marks = in.nextFloat();
            p.next = null;

            q.next = p;
            System.out.println("Do u want to enter more nodes(0/1): ");
            ch = in.nextInt();
        }
    }

    void display(){
        System.out.println("The Linked List is: ");
        System.out.println("Start= "+start);
        System.out.println("Regd No. \t Marks \t Next Reference");
        Node p = start;
        while(p!=null){
            System.out.println(p.regdNo+"\t"+p.marks+"\t"+p.next);
            p = p.next;
        }
    }

    int count(){
        int c = 0;
        Node p = start;
        while(p!=null){
            p = p.next;
            c++;
        }
        return c;
    }

    Node search(int reg){
        Node p = start;

        while (p!=null){
            if(p.regdNo == reg)
                return p;
            p=p.next;
        }
        return null;
    }
    void insBeg(){
        System.out.println("Enter Regd. No. and Marks: ");
        Node p = new Node();
        p.regdNo = in.nextInt();
        p.marks = in.nextFloat();
        p.next = start;

        start = p;
    }

    void insEnd(){
        System.out.println("Enter regd. no. and marks: ");
        Node p = new Node();
        p.regdNo = in.nextInt();
        p.marks = in.nextFloat();
        p.next = null;

        if(start == null)
            start = p;
        else{
            Node q = start;
            while (q.next != null)
                q = q.next;

            q.next = p;
        }
    }

    void insAny(){
        System.out.println("Enter the node no.: ");
        int loc = in.nextInt();
        int c = count();

        if(loc<1 || loc>c+1) {
            System.out.println("Invalid node to insert");
//            return;
        }
        else if (loc == 1)
            insBeg();
        else if(loc == c+1)
            insEnd();
        else{
            System.out.println("Enter regd. no. and marks: ");
            Node p = new Node();
            p.regdNo = in.nextInt();
            p.marks = in.nextFloat();

            int i = 1;
            Node q = start;
            while(i < loc-1) {
                q = q.next;
                i++;
            }
            p.next = q.next;
            q.next = p;
        }
    }

    void delBeg(){
        if(start == null)
            System.out.println("UnderFlow");
        else{
            Node p = start;
            start = start.next;
        }
    }

    void delEnd(){
        if(start == null)
            System.out.println("UnderFlow");
        else if (start.next == null)
            start = null;
        else{
            Node p = start;
            while(p.next.next != null)
                p = p.next;

            p.next = null;
        }
    }

    void delAny(){
        System.out.println("Enter the Node no.: ");
        int loc = in.nextInt();
        int c = count();

        if(start == null)
            System.out.println("UnderFlow");
        else if (loc<1 || loc>c)
            System.out.println("Invalid node no. to delete");
        else if (loc==1)
            delBeg();
        else if (loc == c)
            delEnd();
        else {
            Node q = start;
            int i = 1;
            while(i < loc-1) {
                q = q.next;
                i++;
            }

            q.next = q.next.next;
        }
    }

    void revese(){
        Node p = start,q = start.next,r = start.next.next;
        p.next = null;
        q.next = p;
        while(r!=null){
            p=q;
            q=r;
            r = r.next;
            q.next = p;
        }
        start =p;
    }

    void sort(){
        Node i,j;
        for (i = start;i.next!=null;i=i.next){
            for (j = start; j.next!=null ; j=j.next){
                if (j.marks > j.next.marks){
                    float t1 = j.marks;
                    j.marks = j.next.marks;
                    j.next.marks = t1;

                    int t2 = j.regdNo;
                    j.regdNo = j.next.regdNo;
                    j.next.regdNo = t2;
                }
            }
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList sl = new LinkedList();
        sl.display();
        sl.create();

        while (true){
            System.out.println("Options:" +
                    "\n0: Exit" +
                    "\n1: Display" +
                    "\n2: insBeg" +
                    "\n3: insEnd" +
                    "\n4: insAny" +
                    "\n5: delBeg" +
                    "\n6: delEnd" +
                    "\n7: delAny" +
                    "\n8: count" +
                    "\n9: search" +
                    "\n10: reverse" +
                    "\n11: sort");
            System.out.println("Enter your choice: ");
            int ch = in.nextInt();

            switch (ch){
                case 0: return;
                case 1:
                    sl.display();
                    break;
                case 2:
                    sl.insBeg();
                    break;
                case 3:
                    sl.insEnd();
                    break;
                case 4:
                    sl.insAny();
                    break;
                case 5:
                    sl.delBeg();
                    break;
                case 6:
                    sl.delEnd();
                    break;
                case 7:
                    sl.delAny();
                    break;
                case 8:
                    System.out.println("No. nodes in the linked list: "+sl.count());
                    break;
                case 9:
                    System.out.println("Enter regd no. and marks: ");
                    int reg = in.nextInt();
                    Node search = sl.search(reg);
                    System.out.println("Regd No. = "+search.regdNo+"\nMarks = "+search.marks);
                    break;
                case 10:
                    sl.revese();
                    break;
                case 11:
                    sl.sort();
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}
