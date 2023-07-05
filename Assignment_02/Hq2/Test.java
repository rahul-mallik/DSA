package Hq2;

import java.util.Scanner;
class Book {
    String BName;
    int BEditton;
    double BPrice;

    Book(String BName, int BEdition,double BPrice) {

        this.BName =BName;
        this.BEditton = BEdition;
        this.BPrice = BPrice;
    }
    void display(){
        System.out.println(BName+" \t "+BEditton+" \t "+BPrice);
    }
    public double getPrice( ) {
        return this.BPrice;
    }
    void displaymax(){
            System. out. println(BName+" Book having price "+BPrice+"has maximum price.");
    }

}
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Book[] pustak = new Book[5];
        pustak[0] = new Book("JAVA DSA",2,120.50);
        pustak[1] = new Book("Fifty Shades of grey",1,320.50);
        pustak[2] = new Book("Fifty Shades darker",1,251);
        pustak[3] = new Book("365 days",5,451);
        pustak[4] = new Book("Twisted Love",3,344.50);
        Book max = pustak[0];
        System.out.println("Book name \t Book Edition \t Book Price");
        for (int i = 0; i < pustak.length; i++) {
            pustak[i].display();
            if(pustak[i].getPrice()> max.getPrice())
                max = pustak[i];
        }
        max.displaymax();
    }
}

/*
    OutPut
    Book name 	        Book Edition 	 Book Price
    JAVA DSA 	             2 	           120.5
    Fifty Shades of grey 	 1 	           320.5
    Fifty Shades darker 	 1 	           251.0
    365 days 	             5             451.0
    Twisted Love        	 3 	           344.5
    365 days Book having price 451.0has maximum price.

 */
