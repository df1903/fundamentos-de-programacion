/** 1) Class with attributes, constructor, getters and methods. */

public class Rectangle {

    // attributes
    private double width;
    private double height;

    // constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // getters and setters
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // methods
    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(4, 6);
        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());
        r.setWidth(10);
        System.out.println("New area: " + r.area());
    }
}
