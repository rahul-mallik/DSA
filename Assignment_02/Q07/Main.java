package Q07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Name, Age, Employee Id and Salary of the employee: ");
        Employee karmchaari = new Employee(in.nextLine(), in.nextInt(),in.nextInt(),in.nextDouble());
        karmchaari.empDisplay();
    }
}
/*
      OUTPUT
        Enter Name, Age, Employee Id and Salary of the employee:
        Hemesh Rashamiya
        32
        334521
        200000
        Employee Details:
         Name: Hemesh Rashamiya
         Age: 32
         Employee ID: 334521
         Salary: 200000.0
 */