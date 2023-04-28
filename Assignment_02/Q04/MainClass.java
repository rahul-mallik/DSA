package Q04;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Product[] pr = new Product[5];
        for (int i = 0; i < pr.length; i++) {
            System.out.print("Enter product id: ");
            int pid = in.nextInt();
            System.out.print("Enter product price: ");
            int price = in.nextInt();
            pr[i] =new Product(pid,price);
        }

        for (int i = 0; i < pr.length; i++) {
            pr[i].display();
        }

        System.out.println("Total price: "+Product.tot_price);
    }
}
