package Hq3;
class Distance {
    int meters;
    int centimeters;
    Distance( int meters, int centimeters) {
        if (centimeters >= 100){
            meters += centimeters /100;
            centimeters = centimeters % 100;
        }
        this.meters = meters;
        this.centimeters = centimeters;
    }
    public void display( ){
        System.out.println(meters + " m " + centimeters + " cm ");
    }
    Distance sum(Distance dl, Distance d2) {
        int me = dl.meters + d2.meters;
        int cm = dl.centimeters + d2.centimeters;
        return new Distance(me, cm);
    }
}

public class Test {
    public static void main(String[] args) {
        Distance d1 = new Distance(5, 70);
        Distance d2 = new Distance(3, 30);
        System.out.print("Two distances are: ");
        Distance d3 = d1.sum(d1, d2);
        d1. display();
        d2.display();
        System.out.print("The sum is : ");
        d3.display();
    }
}

/*
    Two distances are :
    5 m 70 cm
    3 m 30 cm
    The sum is: 9 m 0 cm
 */