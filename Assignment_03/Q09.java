import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter one number: ");
        int num = in.nextInt();
        System.out.println("Fibonacci number at position "+num+" is "+Fibonacci(1,1,num-2));
    }

    static int Fibonacci(int a,int b, int counter){
        if(counter == 0)
            return b;

        return Fibonacci(b,a+b,counter-1);
    }
}
