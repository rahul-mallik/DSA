import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        System.out.println("Reverse of "+num+" is "+Reverse(num,""));
    }

    static String Reverse(int n, String revNum){
        if(n==0)
            return revNum;

        return Reverse(n/10,revNum+n%10);
    }
}
