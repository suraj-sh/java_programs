// 2.6 Implement method overloading in the "Student" class by creating multiple constructors.

public class Studentoverload{

    String s_name;
    int s_age;
    String s_studentID;

    // Parameterized constructor with name and age
    Studentoverload(String name, int age){

        s_name = name;
        s_age = age;
    }

    // Parameterized constructor with name, age, and studentID
    Studentoverload(String name, int age, String studentID){

        s_name = name;
        s_age = age;
        s_studentID = studentID;
    }

    void display(){

        System.out.println("Name: " + s_name);
        System.out.println("Age: " + s_age);
        if(s_studentID != null){

            System.out.println("Student ID: " + s_studentID);
        }
    }

    public static void main(String[] args){
        
        Studentoverload student1 = new Studentoverload("Suraj", 23);
        Studentoverload student2 = new Studentoverload("Sanchay", 23, "A12345");

        student1.display();
        student2.display();
    }
}

