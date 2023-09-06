// 2.10 Create a superclass "Animal" and a subclass "Dog" demonstrating method overriding.

// Parent class 
class Animal{

    String colour = "White";

    void animal_type(){

        System.out.println("Wild animal");       
    }
}
// Child class inhereting properties of Parent class
class Dog extends Animal{

    // using 'Method overriding' changed the value of string in child class  
    String colour = "Black";
 
    void display(){

        System.out.println(colour);     // prints Black
    }
}

public class MethodOverriding{
    
    public static void main(String[] args){

        Dog d = new Dog();
        d.display();
    }
}
