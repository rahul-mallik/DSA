package Hq1;

import java.util.Scanner;

public class Test {
    public static void main (String []args){
    Scanner obj = new Scanner(System.in);
    System.out.print( "Enter the sale: ");
    double sale = obj .nextDouble( );
    Commission com = new Commission(sale);
    double com_amt = com.getCommission( );
    if (com_amt > 0)
            System.out.println( "The commission is Rs "+ com_amt);
    }
}
/*
    OUTPUT
    Enter the sale: 5400
    The commission is Rs 432.0
 */