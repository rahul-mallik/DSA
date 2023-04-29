package Q06;

import java.util.Scanner;

public class Triangle extends Shape{
    @Override
    void area() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the height length of Triangle: ");
        double height = in.nextDouble();
        System.out.print("Enter the base length of Triangle: ");
        double base = in.nextDouble();
        System.out.println("Area of Square: "+(0.5*height*base));
    }
}
