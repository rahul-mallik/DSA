package Q02;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Enter the Value for 1st Complex Number.");
        Complex complexObj1 = new Complex();
        complexObj1.setData();
        System.out.println("Enter the Value for 2nd Complex Number.");
        Complex complexObj2 = new Complex();
        complexObj2.setData();

        Complex complexObj3 = complexObj1.add(complexObj2);
        System.out.print("Sum of these 2 complex number is ");
        complexObj3.display();
    }
}
