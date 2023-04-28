package Q02;

import java.util.Scanner;

public class Complex {
    private int real,imag;

    void setData(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the real number: ");
        real = in.nextInt();
        System.out.print("Enter the imaginary number: ");
        imag = in.nextInt();
    }

    void display(){
        System.out.println(real+"+"+imag+"i");
    }

    Complex add(Complex obj){
        Complex obj1 = new Complex();
        obj1.imag = imag + obj.imag;
        obj1.real = real + obj.real;
        return obj1;
    }
}
