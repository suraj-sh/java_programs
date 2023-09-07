/*  Task 9: Zoo Simulation
    Create Java classes to simulate a zoo. Implement classes like Animal, Mammal, Bird, etc. with appropriate methods. 
    Demonstrate polymorphism by creating an array of animals and calling methods on them. */

// Animal class (base class)
class Animal{

    private String name;

    public Animal(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

// Mammal class (subclass of Animal)
class Mammal extends Animal{

    public Mammal(String name){
        super(name);
    }

    public void run(){
        System.out.println(getName() + " is a mammal and can run.");
    }

    public void giveBirth(){
        System.out.println(getName() + " gives birth to live young.");
    }
}

// Bird class (subclass of Animal)
class Bird extends Animal{

    public Bird(String name){
        super(name);
    }

    public void fly(){
        System.out.println(getName() + " is a bird and can fly.");
    }

    public void layEggs(){
        System.out.println(getName() + " lays eggs.");
    }
}

public class ZooSimulation{

    public static void main(String[] args){

        // Create an array of animals (polymorphism in action)
        Animal[] animals = new Animal[3];
        animals[0] = new Mammal("Lion");
        animals[1] = new Bird("Eagle");
        animals[2] = new Mammal("Giraffe");

        // Iterate through the array and classify each animal
        for(Animal animal : animals){

            System.out.println("---------------");
            if(animal instanceof Mammal){

                ((Mammal) animal).giveBirth();
                ((Mammal) animal).run();
            } 
            else if(animal instanceof Bird){
                ((Bird) animal).layEggs();
                ((Bird) animal).fly();
            }
        }
    }
}

