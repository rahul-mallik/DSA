class Box<T>{
    private T Value;

    public void setValue(T Value){
        this.Value = Value;
    }

    public T getValue() {
        return Value;
    }
}

public class Q06 {
    public static void main(String[] args) {

        //Exp with boxed String
        Box<String> stringBox = new Box<>();
        stringBox.setValue("ALL THE");

        Box<String> anotherStringBox = stringBox;
        System.out.println("Value in anotherStringBox: " + anotherStringBox.getValue()); // Output: ALL THE

        anotherStringBox.setValue("BEST");
        System.out.println("Value in stringBox: " + stringBox.getValue()); // Output: BEST

        //exp with boxed Integer
        Box<Integer> integerBox = new Box<>();
        integerBox.setValue(10);

        Box<Integer> anotherIntegerBox = integerBox;
        System.out.println("Value in anotherIntegerBox:" + anotherIntegerBox.getValue());// Output: 10

        anotherIntegerBox.setValue(20);
        System.out.println("Value in integerBox: "+integerBox.getValue());// Output: 20

        Box<Object> objectBox= new Box<>();

        objectBox.setValue("Hello"); // Putting a String in the box
        Box<Object> anotherObejctBox = objectBox;
        System.out.println("Value in anotherObjectBox: "+anotherObejctBox.getValue()); // Output: Hello

        anotherObejctBox.setValue("World");
        System.out.println("Value in objectBox: "+objectBox.getValue()); // World

        /*
            conclusion setting one of the boxed object to other make them mutual,
            i.e changes made in one of object will be reflected in the other
         */

    }

}
