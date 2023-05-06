package Q08;

public class Person implements DetailInfo{
    static int maxcount;
    String name;
    Person (String name){
        this.name = name;
    }

    public void display() {
        System.out.println("Name of the person : "+name
                            +"\nNo of characters in it: "+maxcount);
    }

    public void count() {
        maxcount = name.length();
    }
}
