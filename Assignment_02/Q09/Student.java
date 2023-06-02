package Q09;

import java.util.Scanner;

public class Student {
    int roll_number;
    String name;

    void input_Student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Name and roll number: ");
        name = in.nextLine();
        roll_number = in.nextInt();
    }

    void display_Student(){
        System.out.println("Student Details: ");
        System.out.println("Name: "+name);
        System.out.println("Roll number: "+roll_number);
    }
}
