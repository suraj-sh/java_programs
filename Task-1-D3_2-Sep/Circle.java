// 2.9 Develop a class "Circle" with a static variable for the value of Pi and a static method to calculate the area.

public class Circle{

    // Static variable for the value of Pi
    static float pi = 3.14f;

    // Static method to calculate the area of a circle
    public static float calculateArea(float radius){

        return pi * radius * radius;
    }

    public static void main(String[] args){

        float radius = 5.0f;
        float area = Circle.calculateArea(radius);

        System.out.println("Radius: " + radius);
        System.out.println("Area of the circle: " + area);
    }
}
