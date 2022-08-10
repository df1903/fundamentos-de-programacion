/** 4) Inheritance and polymorphism: Circle and Square extend Shape. */

public abstract class Shape {

    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    // every shape calculates its area in its own way
    public abstract double area();

    public void show() {
        System.out.printf("%s - area: %.2f%n", name, area());
    }

    static class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            super("Circle");
            this.radius = radius;
        }

        @Override
        public double area() {
            return Math.PI * radius * radius;
        }
    }

    static class Square extends Shape {
        private double side;

        public Square(double side) {
            super("Square");
            this.side = side;
        }

        @Override
        public double area() {
            return side * side;
        }
    }

    public static void main(String[] args) {
        Shape[] shapes = {new Circle(3), new Square(4), new Circle(1.5)};
        for (Shape shape : shapes) {
            shape.show();
        }
    }
}
