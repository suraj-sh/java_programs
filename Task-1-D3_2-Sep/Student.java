// 2.5 Write a class named "Student" with a parameterized constructor to initialize name and age

public class Student{

    String s_name;
    int s_age;

    Student(String name, int age){

        s_name = name;
        s_age = age;
    }

    void display(){

        System.out.println(s_name);
        System.out.println(s_age);
    }

    public static void main(String[] args){

        Student stu = new Student("Suraj", 23);
        stu.display();
    }
}