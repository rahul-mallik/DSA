package Q10.student;

import java.util.Scanner;

public class Student {
    String name;
    int roll;

    void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name and roll number: ");
        name =  in.nextLine();
        roll = in.nextInt();
    }

    void output(){
        System.out.println("Student details:");

    }
}
