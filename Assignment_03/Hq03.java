import java.util.Scanner;

public class Hq03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String s = in.next();
        if(s.equals(revStr(s,"",s.length()-1)))
            System.out.println("It's a palindrome.");
        else
            System.out.println("It's not a palindrome.");

    }

    static String revStr(String s,String rev,int length){
        if(length<0)
            return rev;

        return revStr(s,rev+s.charAt(length),length-1);
    }
}
