import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            System.out.println("Enter your lucky number");
            int num = in.nextInt();
            if(num<0)
                throw new NumberFormatException("Negative number");
            else
                System.out.println("Your lucky number is "+num);
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
