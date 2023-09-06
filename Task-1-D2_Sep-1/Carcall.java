// 2.2 Create an object of the "Car" class and call its methods.

public class Carcall{
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
        Carcall myCar = new Carcall();
        myCar.make = "Tata";
        myCar.model = "Nexon";
        myCar.year = 2018;
        myCar.color = "Blue";

        // Perform actions on the car
        myCar.start();
        myCar.accelerate();
        myCar.brake();

        // Display car information
        myCar.displayInfo();
    }
}

