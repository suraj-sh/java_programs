// 13.3 Create an interface with both default and static methods and implement it in a class.

public class InterfaceExample {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        // Call the abstract method
        myClass.abstractMethod();

        // Call the default method
        myClass.defaultMethod();

        // Call the static method using the interface name
        MyInterface.staticMethod();
    }
}

// Define an interface with a default method and a static method
interface MyInterface {
    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Abstract method
    void abstractMethod();

    // Default method
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }
}

// Create a class that implements the interface
class MyClass implements MyInterface {
    @Override
    public void abstractMethod() {
        System.out.println("This is the implementation of the abstract method.");
    }
}