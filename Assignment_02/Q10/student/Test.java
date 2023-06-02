package Q10.student;

import Q10.student.Student;

import java.util.Scanner;

public class Test extends Student {
    public int marks1,marks2;
    public void input(){
        super.input();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Marks1 and Marks2: ");
        marks1 = in.nextInt();
        marks2 = in.nextInt();
    }

    public void output(){
        super.output();
        System.out.println("Enter Marks1: "+marks1);
        System.out.println("Enter Marks2: "+marks2);
    }
}