package Q04;

public class Product {
    private int pid;
    private int price;
    static int tot_price;
    Product (int pid,int price){
        this.pid = pid;
        this.price = price;
        tot_price+=price;
    }

    void display(){
        System.out.println("Product ID: "+pid);
        System.out.println("Product Price: "+price);
    }

}
