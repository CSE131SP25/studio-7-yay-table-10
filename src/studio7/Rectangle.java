package studio7;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public boolean isSquare() {
        return length == width;
    }

    public boolean isSmallerThan(Rectangle other) {
        return this.getArea() < other.getArea();
    }

    public String toString() {
        return "Rectangle[length=" + length + ", width=" + width + "]";
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(7, 7);

        System.out.println(r1);
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());
        System.out.println("Is Square? " + r1.isSquare());
        System.out.println("Is r1 smaller than r2? " + r1.isSmallerThan(r2));

        System.out.println(r2);
        System.out.println("Area: " + r2.getArea());
        System.out.println("Perimeter: " + r2.getPerimeter());
        System.out.println("Is Square? " + r2.isSquare());
    }
}
