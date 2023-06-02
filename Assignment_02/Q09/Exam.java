package Q09;

import java.util.Scanner;

public class Exam extends Student{
    int marks1,marks2,marks3;
    void input_Marks(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the marks1, marks2 and marks3: ");
        marks1 = in.nextInt();
        marks2 = in.nextInt();
        marks3 = in.nextInt();
    }

    void display_Result(){
        System.out.println("Marks1 :"+marks1);
        System.out.println("Marks2 :"+marks2);
        System.out.println("Marks3 :"+marks3);
    }
}
