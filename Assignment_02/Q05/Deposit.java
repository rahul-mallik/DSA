package Q05;

import java.util.Scanner;

public class Deposit {
    long Principal;
    int Time;
    double rate;
    double Total_amt;
    static Scanner in = new Scanner(System.in);
    Deposit (){}

    Deposit (long Principal,int Time, double rate){
        this(Principal,Time);
        this.rate = rate;
    }

    Deposit (long Principal,int Time){
        this.Principal = Principal;
        this.Time=Time;
    }

    Deposit (long Principal, double rate){
        this.Principal = Principal;
        this.rate = rate;
    }

    void display(){
        System.out.println("Principal: "+Principal);
        System.out.println("Time: "+Time);
        System.out.println("Rate: "+rate);
        System.out.println("Total: "+Total_amt);
    }
    void calc_amt(){
        Total_amt = Principal + (Principal*rate*Time)/100;
    }

}
