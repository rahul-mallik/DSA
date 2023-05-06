package Q05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Principal, Time and Rate: ");
        Deposit person = new Deposit(in.nextLong(),in.nextInt(),in.nextDouble());
        person.calc_amt();
        System.out.println("Deposit details: ");
        person.display();
    }
}
