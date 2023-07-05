package Hq4;
class PointType {
    private double x;
    private double y;

    public PointType(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setCoordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void printCoordinates() {
        System.out.println("Coordinates: (" + x + ", " + y + ")");
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

class CircleType extends PointType {
    private double radius;

    public CircleType(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void printRadius() {
        System.out.println("Radius: " + radius);
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        CircleType circle = new CircleType(0, 0, 5);
        circle.printCoordinates(); // Prints the center coordinates
        circle.printRadius(); // Prints the radius
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());

        circle.setCoordinates(2, 3); // Set new center coordinates
        circle.setRadius(7); // Set new radius
        circle.printCoordinates();
        circle.printRadius();
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());
    }
}

