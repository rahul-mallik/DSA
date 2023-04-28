package Q01;

public class MainClass {
    public static void main(String[] args) {
        Phone myNum = new Phone();
        myNum.area_code = 212;
        myNum.exchange = 767;
        myNum.number = 8900;

        Phone yourNum = new Phone();
        yourNum.input();

        System.out.println("My Number is "+myNum.display());
        System.out.println("Your Number is "+yourNum.display());
    }
}
