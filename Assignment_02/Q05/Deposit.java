package Q05;

import java.util.Scanner;

public class Deposit {
    long Principal;
    int Time;
    double rate;
    double Total_amt;
    static Scanner in = new Scanner(System.in);
    Deposit (){
        System.out.print("Enter Principal: ");
        Principal = in.nextLong();
        System.out.print("Enter Time: ");
    }
}
