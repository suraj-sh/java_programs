// 2.11 Explain the usage of the super keyword with an example in the context of method overriding.

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

    void animal_type(){

        System.out.println("Domestic animal");  
        super.animal_type();   // invokes immediate parent class method 
    }
 
    void display(){

        System.out.println(colour);     // prints Black    
        // 'super' keyword refers to the immediate parent class instance variable
        System.out.println(super.colour);   // prints White
    }
}

public class Super{
    
    public static void main(String[] args){

        Dog d = new Dog();
        d.display();
        d.animal_type();
    }
}
