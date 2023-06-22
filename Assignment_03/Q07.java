import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ch = 0;
        do {
            System.out.println("__________________________________");
            System.out.println("Operations: " +
                    "\n1. Factorial" +
                    "\n2. Determine X to the power N" +
                    "\n3. GCD" +
                    "\n4. Binary Equivalent" +
                    "\n5. Product" +
                    "\n0. Exit" +
                    "\n__________________________________");
            System.out.print("Enter your choice(0-5): ");
            ch = in.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter the number for its factorial: ");
                    int num = in.nextInt();
                    System.out.println("Factorial of the " + num + " is " + fact(num, 1));
                    break;
                case 2:
                    System.out.println("Enter the base and power: ");
                    int x = in.nextInt(), n = in.nextInt();
                    System.out.println("Ans: " + power(x, n, 1));
                    break;
                case 4:
                    System.out.println("Enter the Decimal No.: ");
                    int num1 = in.nextInt();
                    System.out.println("Binary Equivalent: " + BinaryEquivalent(num1, ""));
                    break;
                case 5:
                    System.out.print("Enter the Product: ");
                    int p = in.nextInt(), p2 = in.nextInt();
                    System.out.println("Product of " + p + " and " + p2 + " is: " + product(p, p2, 0));
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid Input!!");
                    break;
            }
        }while (ch!=0);
    }

    static int product(int num1,int num2,int ans){
        if(num2==0)
            return ans;

        return product(num1,num2-1,ans+num1);
    }


    static String BinaryEquivalent(int decimal,String Bn){
        if(decimal == 0)
            return Bn;

        return BinaryEquivalent(decimal/2,decimal%2+Bn);
    }


    static int fact(int n, int f){
        if(n==0)
            return f;

        return fact(n-1,f*n);
    }

    static int power(int x,int n,int ans){
        if(n == 0)
            return ans;

        return power(x,n-1,ans*x);
    }


}
