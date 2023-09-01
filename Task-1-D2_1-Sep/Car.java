// 2.1 Define a class called "Car" with relevant attributes and methods

public class Car{
    // Car attributes
    String make;
    String model;
    int year;
    String color;

    // Method to start the car
    public void start(){
        System.out.println("The car is starting.");
    }

    // Method to accelerate the car
    public void accelerate(){
        System.out.println("The car is accelerating.");
    }

    // Method to brake the car
    public void brake(){
        System.out.println("The car is braking.");
    }

    // Method to display car information
    public void displayInfo(){
        System.out.println("Car Info:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
    }

    public static void main(String[] args){
        // Create a Car object
        Car myCar = new Car();
        myCar.make = "Tata";
        myCar.model = "Nexon";
        myCar.year = 2018;
        myCar.color = "Blue";
    }
}
