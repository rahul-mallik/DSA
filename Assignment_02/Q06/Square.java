package Q06;

import java.util.Scanner;

public class Square extends Shape{

    @Override
    void area() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side length of square: ");
        double side = in.nextDouble();
        System.out.println("Area of Square: "+(side*side));
    }
}
