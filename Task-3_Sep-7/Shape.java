/*  Task 3: Circle and Rectangle
    Create Java classes Circle and Rectangle to represent geometric shapes. 
    Include attributes like radius/width/height and implement methods 
    to calculate area and perimeter for each shape. */

// Circle class
class Circle{

    private float radius;

    // Constructor
    public Circle(float radius){
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public float calculateArea(){
        return (float) (3.14 * radius * radius);
    }

    // Method to calculate the circumference (perimeter) of the circle
    public float calculatePerimeter(){
        return (float) (2 * 3.14 * radius);
    }
}

// Rectangle class
class Rectangle{

    private float width;
    private float height;

    // Constructor
    public Rectangle(float width, float height){

        this.width = width;
        this.height = height;
    }

    // Method to calculate the area of the rectangle
    public float calculateArea(){
        return width * height;
    }

    // Method to calculate the perimeter of the rectangle
    public float calculatePerimeter(){
        return 2 * (width + height);
    }
}

public class Shape{

    public static void main(String[] args){
        
        // Create a circle with a radius of 5 units
        Circle circle = new Circle(5.0f);

        // Calculate and display the area and perimeter of the circle
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        // Create a rectangle with a width of 4 units and a height of 6 units
        Rectangle rectangle = new Rectangle(4.0f, 6.0f);

        // Calculate and display the area and perimeter of the rectangle
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
    }
}
