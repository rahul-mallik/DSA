package Q01;

import java.util.Scanner;

public class Phone {
    int area_code,exchange,number;

    void input(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the area code: ");
        area_code = in.nextInt();
        System.out.print("Enter the exchange number: ");
        exchange = in.nextInt();
        System.out.print("Enter the number: ");
        number = in.nextInt();
    }

    String display(){
        return ("("+area_code+") "+exchange+"-"+number);
    }
}
