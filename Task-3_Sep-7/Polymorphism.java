/*  Task 7: Polymorphism
    Create an interface Shape with methods for calculating area and perimeter. 
    Implement classes Triangle, Square, and Circle that implement the Shape interface and provide appropriate implementations for the methods. */

interface Shape{

    double calculateArea();
    double calculatePerimeter();
}

class Triangle implements Shape{

    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3){

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea(){

        // Calculate area using Heron's formula
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double calculatePerimeter(){
        return side1 + side2 + side3;
    }
}

class Square implements Shape{

    private double side;

    public Square(double side){
        this.side = side;
    }

    @Override
    public double calculateArea(){
        return side * side;
    }

    @Override
    public double calculatePerimeter(){
        return 4 * side;
    }
}

class Circle implements Shape{

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }
}

public class Polymorphism{

    public static void main(String[] args){

        // Create instances of different shapes
        Triangle triangle = new Triangle(3, 4, 5);
        Square square = new Square(6);
        Circle circle = new Circle(2);

        // Calculate and display the area and perimeter of each shape
        System.out.println("Area of Triangle : " + triangle.calculateArea());
        System.out.println("Perimeter of Triangle : " + triangle.calculatePerimeter());
        System.out.println("Area of Square : " + square.calculateArea());
        System.out.println("Perimeter of Square : " + square.calculatePerimeter());
        System.out.println("Area of Circle : " + circle.calculateArea());
        System.out.println("Perimeter of Circle : " + circle.calculatePerimeter());
    }
}
