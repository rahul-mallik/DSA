import java.util.Scanner;

class Student{
    private String name;
    private double marks;

    Student(String name, double marks){
        this.name = name;
        this.marks = marks;
    }

    void display(){
        System.out.println(this.name+" has got "+this.marks);
    }
}

class MarksOutOfBoundException extends Exception{
    MarksOutOfBoundException(String msg){
        super(msg);
    }
}

public class Q03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student sc;
        try{
            System.out.print("Enter a name");
            String name = in.nextLine();
            System.out.print("Enter marks");
            int n = in.nextInt();

            if (n>100)
                throw new MarksOutOfBoundException("Mark can't be greater than 100");
            else {
                sc = new Student(name, n);
                sc.display();
            }
        } catch (MarksOutOfBoundException e) {
            System.out.println(e);
        }
    }
}
