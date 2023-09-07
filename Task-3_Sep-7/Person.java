/*  Task 1: Create a Class
    Create a Java class Person with attributes like name, age, and email. 
    Implement constructors, getter and setter methods, and a toString method to display the person's information. */

public class Person{

    // Attributes
    private String name;
    private int age;
    private String email;

    // Constructor
    Person(String name, int age, String email){

        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Getter method 
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getEmail(){
        return email;
    }

    // Setter method
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setEmail(String email){
        this.email = email;
    }

    // Display method
    public String toString(){

        String personInfo = ("Name: " + name + "\nAge: " + age + "\nEmail: " + email);
        return personInfo;
    }

    public static void main(String[] args){
        
        // Creating a Person object and displaying information
        Person person = new Person("Suraj Sharma", 23, "suraj.sharma@email.com");
        System.out.println(person); // This line uses the toString method

        // Accessing and modifying attributes using getters and setters
        person.setName("SS");
        person.setAge(32);
        person.setEmail("s.s@email.com");

        System.out.println("\nUpdated information:");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Email: " + person.getEmail());
    }
}