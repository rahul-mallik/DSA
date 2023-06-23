import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        System.out.println("Enter a String ");
        String s = in.next();
        System.out.println("Its reverse: "+strRev(s,"",s.length()-1));
    }
    static String strRev(String s,String ans,int length){
        if(length<0)
            return ans;

        return strRev(s,ans+s.charAt(length),length-1);

    }
}
