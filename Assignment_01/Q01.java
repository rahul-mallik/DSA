package Assignment_01;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an positive Integer: ");
        int num = in.nextInt(),counter = 0;

        while (num/2>=2){
            counter++;
            num/=2;
        }
        System.out.println("The number of times one must repeatedly divide this number by 2 \n" +
                "before getting a value less than 2 is "+counter);
    }
}

/*
    OUTPUT
    Enter an positive Integer: 12
    The number of times one must repeatedly divide this number by 2 
    before getting a value less than 2 is 2
*/
