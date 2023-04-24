package Assignment_01;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the weight of the person kg: ");
        double w = in.nextDouble();
        System.out.print("Enter the height of the person meter: ");
        double h = in.nextDouble();

        double bmi = w/(h*h);

        if(bmi<=18.5)
            System.out.println("Underweight");
        else if(bmi>=18.5 && bmi<=24.9)
            System.out.println("Normal Weight");
        else if (bmi>25 && bmi<=29.9)
            System.out.println("Overweight");
        else if(bmi>=30.0)
            System.out.println("Obese");
    }
}
/*
    OUTPUT
    Enter the weight of the person kg: 150
    Enter the height of the person meter: 1.5
    Obese

*/
