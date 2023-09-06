// 2.13 Define an interface "Shape" with a method to calculate area. Implement it in classes like "Circle" and "Rectangle."

// Define the Shape interface
interface Shape {
    double calculateArea();
}

// Implement the Shape interface in the Circle class
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        // Calculate the area of a circle (pi * r * r)
        return Math.PI * radius * radius;
    }
}

// Implement the Shape interface in the Rectangle class
class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        // Calculate the area of a rectangle (length * width)
        return length * width;
    }
}

public class Interface {
    public static void main(String[] args) {
        // Create a Circle and calculate its area
        Circle circle = new Circle(5.0);
        double circleArea = circle.calculateArea();
        System.out.println("Area of the Circle: " + circleArea);

        // Create a Rectangle and calculate its area
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        double rectangleArea = rectangle.calculateArea();
        System.out.println("Area of the Rectangle: " + rectangleArea);
    }
}
