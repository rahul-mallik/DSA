package Q03;

import java.util.Scanner;

public class Student {
    private int Roll;
    private String Name;
    double DSA_Marks;

    void getdata(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Student's Name: ");
        Name = in.nextLine();
        System.out.print("Enter Student's Roll No.: ");
        Roll = in.nextInt();
        System.out.print("Enter Student's DSA Marks: ");
        DSA_Marks = in.nextDouble();
    }

    void showdata(){
        System.out.println("Student's Name is "+Name);
        System.out.println("Student's Roll No. is "+Roll);
        System.out.println("Student's DSA Marks is "+DSA_Marks);
    }

}
