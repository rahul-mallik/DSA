package Q06;

import java.util.Scanner;

public class Circle extends Shape{
    @Override
    void area() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radial length of Circle: ");
        double radius = in.nextDouble();
        System.out.println("Area of Square: "+(Math.PI*radius*radius));
    }
}
